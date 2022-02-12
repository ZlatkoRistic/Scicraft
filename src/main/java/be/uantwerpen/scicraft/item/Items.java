package be.uantwerpen.scicraft.item;

import be.uantwerpen.scicraft.Scicraft;
import be.uantwerpen.scicraft.block.Blocks;
import be.uantwerpen.scicraft.entity.Entities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {
    // Items
    public static final Item ELECTRON = register(new ElectronItem(new Item.Settings().group(ItemGroup.MISC).maxCount(64)), "electron");
    public static final Item PROTON = register(new ProtonItem(new Item.Settings().group(ItemGroup.MISC).maxCount(64)), "proton");
    public static final Item NEUTRON = register(new NeutronItem(new Item.Settings().group(ItemGroup.MISC).maxCount(64)), "neutron");

    public static final Item ENTROPY_CREEPER_SPAWN_EGG = register(new SpawnEggItem(Entities.ENTROPY_CREEPER,
            0xbb64e1, 0x5d0486, new FabricItemSettings().group(ItemGroup.MISC)), "entropy_creeper_spawn_egg");

    // Items > Atoms
    public static final Item HYDROGEN_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 1, "H"), "hydrogen_atom");
    public static final Item HELIUM_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 2, "He"), "helium_atom");
    public static final Item LITHIUM_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 3, "Li"), "lithium_atom");
    public static final Item BERYLLIUM_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 4, "Be"), "beryllium_atom");
    public static final Item BORON_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 5, "B"), "boron_atom");
    public static final Item CARBON_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 6, "C"), "carbon_atom");
    public static final Item NITROGEN_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 7, "N"), "nitrogen_atom");
    public static final Item OXYGEN_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 8, "O"), "oxygen_atom");
    public static final Item FLUORINE_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 9, "F"), "fluorine_atom");
    public static final Item NEON_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 10, "Ne"), "neon_atom");

    public static final Item SODIUM_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 11, "Na"), "sodium_atom");
    public static final Item MAGNESIUM_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 12, "Mg"), "magnesium_atom");
    public static final Item ALUMINIUM_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 13, "Al"), "aluminium_atom");
    public static final Item SILICON_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 14, "Si"), "silicon_atom");
    public static final Item PHOSPHORUS_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 15, "P"), "phosphorus_atom");
    public static final Item SULFUR_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 16, "S"), "sulfur_atom");
    public static final Item CHLORINE_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 17, "Cl"), "chlorine_atom");
    public static final Item ARGON_ATOM = register(new AtomItem(new Item.Settings().group(ItemGroups.SCICRAFT), 18, "Ar"), "argon_atom");

    // BlockItems
    public static final Item PION_NUL = register(new BlockItem(Blocks.PION_NUL, new FabricItemSettings().group(ItemGroups.ELEMENTARY_PARTICLES)), "pion_nul");
    public static final Item PION_MINUS = register(new BlockItem(Blocks.PION_MINUS, new FabricItemSettings().group(ItemGroups.ELEMENTARY_PARTICLES)), "pion_minus");
    public static final Item PION_PLUS = register(new BlockItem(Blocks.PION_PLUS, new FabricItemSettings().group(ItemGroups.ELEMENTARY_PARTICLES)), "pion_plus");

    /**
     * Register an Item
     *
     * @param item:       Item Object to register
     * @param identifier: String name of the Item
     * @return {@link Item}
     */
    private static Item register(Item item, String identifier) {
        return Registry.register(Registry.ITEM, new Identifier(Scicraft.MOD_ID, identifier), item);
    }

    /**
     * Main class method
     * Registers all (Block)Items
     */
    public static void registerItems() {
        Scicraft.LOGGER.info("registering items");
    }
}
