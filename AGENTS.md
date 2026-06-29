# AGENTS.md — Better Materials

## Project Overview

**Better Materials** is a Minecraft 1.20.1 mod that adds new tool, armor, and block tiers using bone, flint, copper, emerald, and amethyst. It supports both **Fabric** and **Forge** loaders via a multi-loader architecture with a shared `Common` module.

- **Mod ID:** `bettermaterials`
- **Version:** 1.0.6
- **Minecraft:** 1.20.1
- **Java:** 17
- **License:** MIT

## Multi-Loader Architecture

```
BetterMaterials/          ← Root Gradle project
├── Common/               ← Shared code (no loader dependency)
├── Fabric/               ← Fabric loader-specific code
└── Forge/                ← Forge loader-specific code
```

### How It Works

- **Common** contains all shared logic: item/block registration, tool tiers, armor materials, tags, and platform service interfaces.
- **Fabric** and **Forge** each contain loader-specific implementations of the service interfaces defined in Common.
- Both loader modules compile against Common via `compileOnly project(':Common')` and merge Common's source/resources into their own output at build time.
- The loader entry points call into `Common`'s `BetterMaterials.init()` and `BetterMaterials.initClient()`.

### ServiceLoader Pattern

Common defines three service interfaces in `darkorg.bettermaterials.common.platform.services`:

| Interface | Purpose |
|---|---|
| `IPlatformHelper` | Platform name, mod loaded check, config directory |
| `IRegistryHelper` | Register items, blocks, and creative tabs |
| `IEventHelper` | Register client/server event listeners |

Each loader provides implementations under `META-INF/services/`:
- `Fabric/src/main/resources/META-INF/services/` → Fabric implementations
- `Forge/src/main/resources/META-INF/services/` → Forge implementations

## Build System

- **Gradle 8.14.3** with wrapper
- Root `settings.gradle` includes: `Common`, `Fabric`, `Forge`
- Key properties in `gradle.properties`: Minecraft version, Forge version, Fabric API version, Parchment mappings, JEI version

### Key Build Files

| File | Purpose |
|---|---|
| `build.gradle` | Root: applies java plugin, configures processResources token expansion |
| `Common/build.gradle` | Uses `org.spongepowered.gradle.vanilla` plugin |
| `Fabric/build.gradle` | Uses `fabric-loom` plugin |
| `Forge/build.gradle` | Uses `net.minecraftforge.gradle` + `parchment` + `sponge mixin` plugins |

## Project Structure

### Common Module (`Common/`)

Source: `Common/src/main/java/darkorg/bettermaterials/common/`

```
BetterMaterials.java              ← Main mod class, called by both loaders
platform/
  Services.java                   ← ServiceLoader wrapper
  services/
    IEventHelper.java
    IPlatformHelper.java
    IRegistryHelper.java
registry/
  BetterMaterialsRegistries.java  ← Entry point: calls Blocks.init() + Items.init()
  BetterMaterialsBlocks.java      ← Registers FLINT_BLOCK, CHARCOAL_BLOCK
  BetterMaterialsItems.java       ← Registers 35+ items (tools, armor, horse armor, shears)
  BetterMaterialsArmorMaterials.java ← Enum: COPPER, EMERALD, AMETHYST
  BetterMaterialsTiers.java       ← Enum: BONE, FLINT, COPPER, EMERALD, AMETHYST
  BetterMaterialsTags.java        ← Block/Item tag keys
  ModReference.java               ← Convenience lists of items by type
mixin/                            ← Empty (no active mixins)
```

Resources: `Common/src/main/resources/`
- `bettermaterials.png` — mod icon
- `bettermaterials.accesswidener` — widens PickaxeItem, AxeItem, HoeItem constructors
- `bettermaterials.common.mixins.json` — empty mixin list
- `pack.mcmeta`
- `assets/bettermaterials/textures/` — all block, item, armor model, and horse armor textures

### Fabric Module (`Fabric/`)

Source: `Fabric/src/main/java/darkorg/bettermaterials/fabric/`

```
BetterMaterialsFabric.java                ← ModInitializer entrypoint
BetterMaterialsFabricClient.java          ← ClientModInitializer
BetterMaterialsFabricServer.java          ← DedicatedServerModInitializer
BetterMaterialsFabricDataGenerator.java   ← DataGeneratorEntrypoint
platform/
  FabricPlatformHelper.java               ← IPlatformHelper impl
  FabricRegistryHelper.java               ← IRegistryHelper impl (Registry.register)
  FabricEventHelper.java                  ← IEventHelper impl
event/
  FabricClientEvents.java                 ← Creative tab population
datagen/
  client/
    ModLanguageProvider.java
    ModModelProvider.java
  server/
    ModRecipeProvider.java
    ModBlockTagProvider.java
    ModItemTagProvider.java
  loot/
    ModBlockLootTableProvider.java
mixin/                                    ← Empty
```

Entrypoints (from `fabric.mod.json`):
- `main` → `BetterMaterialsFabric`
- `client` → `BetterMaterialsFabricClient`
- `server` → `BetterMaterialsFabricServer`
- `fabric-datagen` → `BetterMaterialsFabricDataGenerator`

Generated resources: `Fabric/src/main/generated/`
- Language, blockstates, block/item models, recipes, tags, loot tables, advancements

### Forge Module (`Forge/`)

Source: `Forge/src/main/java/darkorg/bettermaterials/forge/`

```
BetterMaterialsForge.java          ← @Mod("bettermaterials") entrypoint
platform/
  ForgePlatformHelper.java         ← IPlatformHelper impl (FMLLoader)
  ForgeRegistryHelper.java         ← IRegistryHelper impl (DeferredRegister)
  ForgeEventHelper.java            ← IEventHelper impl
event/
  ForgeModClientEvents.java        ← @Mod.EventBusSubscriber, creative tab
mixin/                             ← Empty
```

Entrypoint: Constructor in `BetterMaterialsForge` receives `FMLJavaModLoadingContext`, calls `BetterMaterials.init()` and `BetterMaterials.initClient()`.

Generated resources: `Forge/src/generated/resources/` (mirrors Fabric's generated output)

## Registered Content

### Items (35+)

| Material | Tools | Armor | Horse Armor | Other |
|---|---|---|---|---|
| Bone | sword, shovel, pickaxe, axe, hoe | — | — | — |
| Flint | sword, shovel, pickaxe, axe, hoe | — | — | — |
| Copper | sword, shovel, pickaxe, axe, hoe | helmet, chestplate, leggings, boots | copper | shears |
| Emerald | sword, shovel, pickaxe, axe, hoe | helmet, chestplate, leggings, boots | emerald | shears |
| Amethyst | sword, shovel, pickaxe, axe, hoe | helmet, chestplate, leggings, boots | amethyst | — |

### Blocks (2)

- **Block of Flint** — strength 5.0, requires correct tool
- **Block of Charcoal** — strength 5.0, requires correct tool

### Tool Tiers (weakest → strongest)

| Tier | Level | Durability | Speed | Damage | Enchant | Repair Material |
|---|---|---|---|---|---|---|
| BONE | 0 | 59 | 2.0 | 0.0 | 15 | Bone |
| FLINT | 1 | 131 | 4.0 | 1.0 | 5 | Flint |
| COPPER | 1 | 191 | 5.0 | 1.5 | 12 | Copper Ingot |
| EMERALD | 2 | 521 | 7.0 | 2.5 | 8 | Emerald |
| AMETHYST | 2 | 781 | 9.0 | 2.5 | 15 | Amethyst Shard |

## Development Rules

### Adding New Items or Blocks

1. Define the item/block in `Common/src/main/java/darkorg/bettermaterials/common/registry/`
2. Register it via the appropriate service interface (`IRegistryHelper`) — do NOT use loader-specific registry APIs directly in Common
3. Add textures to `Common/src/main/resources/assets/bettermaterials/textures/`
4. Add models/recipes/tags — either via Fabric datagen (`Fabric/src/main/java/darkorg/bettermaterials/fabric/datagen/`) or manually in both generated resource folders
5. Add lang entries in the datagen language provider

### Adding New Tool Tiers or Armor Materials

1. Add enum constants to `BetterMaterialsTiers.java` or `BetterMaterialsArmorMaterials.java` in Common
2. No loader-specific changes needed — the enums are shared

### Adding Loader-Specific Features

1. Put the code in the appropriate loader module (`Fabric/` or `Forge/`)
2. If it needs to be called from Common, define a service interface in `Common/src/main/java/darkorg/bettermaterials/common/platform/services/`
3. Implement the interface in both `Fabric/platform/` and `Forge/platform/`
4. Add `META-INF/services/` entries in both loader modules

### Data Generation

Data gen runs through Fabric only:
```
./gradlew :Fabric:runData
```
Generated output in `Fabric/src/main/generated/` is then copied to or referenced by both modules.

### Building

```
./gradlew build
```

### Running the Client

```
./gradlew :Fabric:runClient
./gradlew :Forge:runClient
```

### Conventions

- All shared code goes in `Common/` — never put shared logic in `Fabric/` or `Forge/`
- Never use loader-specific imports (`net.fabricmc.*`, `net.minecraftforge.*`) in Common
- Use `Services` class to access platform-specific functionality from Common
- Follow existing code patterns when adding new items/blocks
- Textures and shared resources live in `Common/src/main/resources/`

## Known Issues & Lessons Learned

### Forge Creative Tab Event Bus

`BuildCreativeModeTabContentsEvent` implements `IModBusEvent`, which means it fires on the **MOD event bus** — not the FORGE game event bus.

`ForgeModClientEvents` must use `Bus.MOD`:
```java
@Mod.EventBusSubscriber(modid = BetterMaterials.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
```

**Do NOT change this to `Bus.FORGE`** — the handler will silently never fire.

### Forge `BuildCreativeModeTabContentsEvent.accept()` Overloads

The event has these `accept()` methods (confirmed from bytecode):
- `accept(ItemStack, TabVisibility)`
- `accept(ItemStack)` (default from `CreativeModeTab.Output`)
- `accept(ItemLike)` (convenience)
- `accept(Supplier<? extends ItemLike>, TabVisibility)`
- `accept(Supplier<? extends ItemLike>)` (convenience)

Passing `.get()` on a `Supplier<Block>` or `Supplier<Item>` directly to `accept()` is valid since it matches the `ItemLike` overload.

### Fabric Production Crash (Intrusive Holders)

If `compileOnly project(':Common')` is included in `Fabric/build.gradle`, the `processIncludeJars` task copies Common's vanilla-compiled classes (from `org.spongepowered.vanillagradle`) into the Fabric jar. This causes class loading conflicts where `Block.<init>` cannot create intrusive holders on Fabric's registry, resulting in `IllegalStateException: This registry can't create intrusive holders`.

**Fix:** Do NOT use `compileOnly project(':Common')` in Fabric. Common's source is already compiled by Loom via `source(project(":Common").sourceSets.main.allSource)` and resources are merged via `processResources { from(project(":Common").sourceSets.main.resources) }`.

### Forge Registry Pattern

Forge uses `DeferredRegister` which defers item/block creation until `RegistryEvent.Register<T>` fires. The registration order is:
1. `DeferredRegister.create(...)` — creates the register (static field init)
2. `DeferredRegister.register(name, supplier)` — queues entries in a pending list
3. `DeferredRegister.register(eventBus)` — subscribes to the MOD event bus
4. Forge fires `RegistryEvent.Register<T>` — entries are processed

Both steps 2 and 3 happen in the mod constructor, before registry events fire. There is no race condition.

### Forge Server `InaccessibleObjectException`

Forge 1.20.1's runtime may crash on server with `InaccessibleObjectException: java.base does not "opens java.lang.invoke" to unnamed module`. The `--add-opens` flags passed via Gradle run config or `org.gradle.jvmargs` may not reach the forked JDK 17 process. This is a known Forge/ForgeGradle issue. Workaround: add `--add-opens` flags to the launcher JVM arguments.
