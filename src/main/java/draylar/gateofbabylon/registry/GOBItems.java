package draylar.gateofbabylon.registry;

import draylar.gateofbabylon.GateOfBabylon;
import draylar.gateofbabylon.item.*;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/*
 * Wooden DPS: 6.4
 * Golden DPS: 6.4
 * Stone DPS: 8
 * Iron DPS: 9.6
 * Diamond DPS: 11.2
 * Netherite DPS: 12.8
 *
 * Damage: 1 + material damage + damage
 */
public class GOBItems {

    // Daggers are medium-speed weapons with medium damage.
    public static final DaggerItem WOODEN_DAGGER = register("wooden_dagger", new DaggerItem(ToolMaterials.WOOD, 3.5f, 2.1f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final DaggerItem STONE_DAGGER = register("stone_dagger", new DaggerItem(ToolMaterials.STONE, 4.5f, 2.1f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final DaggerItem IRON_DAGGER = register("iron_dagger", new DaggerItem(ToolMaterials.IRON, 5.5f, 2f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final DaggerItem GOLDEN_DAGGER = register("golden_dagger", new DaggerItem(ToolMaterials.GOLD,3.5f, 2.1f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final DaggerItem DIAMOND_DAGGER = register("diamond_dagger", new DaggerItem(ToolMaterials.DIAMOND, 6.5f, 2f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final DaggerItem NETHERITE_DAGGER = register("netherite_dagger", new DaggerItem(ToolMaterials.NETHERITE, 6.5f, 2.3f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final DaggerItem GOBBER_DAGGER = register("gobber_dagger", new DaggerItem(ToolMaterials.NETHERITE, 11f, 2.3f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final DaggerItem NETHER_GOBBER_DAGGER = register("nether_gobber_dagger", new DaggerItem(ToolMaterials.NETHERITE, 13f, 2.3f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final DaggerItem END_GOBBER_DAGGER = register("end_gobber_dagger", new DaggerItem(ToolMaterials.NETHERITE, 16f, 2.3f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final DaggerItem TERRA_DAGGER = register("terra_dagger", new DaggerItem(ToolMaterials.NETHERITE, 8f, 3f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));




    // Spears are ranged weapons, similar to Tridents.
    public static final SpearItem WOODEN_SPEAR = register("wooden_spear", new SpearItem(ToolMaterials.WOOD, 3.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem STONE_SPEAR = register("stone_spear", new SpearItem(ToolMaterials.STONE, 4.0f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem IRON_SPEAR = register("iron_spear", new SpearItem(ToolMaterials.IRON, 6.0f, 1.3f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem GOLDEN_SPEAR = register("golden_spear", new SpearItem(ToolMaterials.GOLD, 3.0f, 1.2f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem DIAMOND_SPEAR = register("diamond_spear", new SpearItem( ToolMaterials.DIAMOND, 7.0f, 1.1f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem NETHERITE_SPEAR = register("netherite_spear", new SpearItem(ToolMaterials.NETHERITE, 8.0f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final SpearItem GOBBER_SPEAR = register("gobber_spear", new SpearItem(ToolMaterials.NETHERITE, 13f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final SpearItem NETHER_GOBBER_SPEAR = register("nether_gobber_spear", new SpearItem(ToolMaterials.NETHERITE, 15f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final SpearItem END_GOBBER_SPEAR = register("end_gobber_spear", new SpearItem(ToolMaterials.NETHERITE, 18f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final SpearItem TERRA_SPEAR = register("terra_spear", new SpearItem(ToolMaterials.NETHERITE, 9.0f, 1.5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));


    public static final BroadswordItem WOODEN_BROADSWORD = register("wooden_broadsword", new BroadswordItem(ToolMaterials.WOOD, 6f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem STONE_BROADSWORD = register("stone_broadsword", new BroadswordItem(ToolMaterials.STONE, 8f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem IRON_BROADSWORD = register("iron_broadsword", new BroadswordItem(ToolMaterials.IRON, 10f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem GOLDEN_BROADSWORD = register("golden_broadsword", new BroadswordItem(ToolMaterials.GOLD,6f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem DIAMOND_BROADSWORD = register("diamond_broadsword", new BroadswordItem(ToolMaterials.DIAMOND, 12f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final BroadswordItem NETHERITE_BROADSWORD = register("netherite_broadsword", new BroadswordItem(ToolMaterials.NETHERITE, 14f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final BroadswordItem GOBBER_BROADSWORD = register("gobber_broadsword", new BroadswordItem(ToolMaterials.NETHERITE, 20f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final BroadswordItem NETHER_GOBBER_BROADSWORD = register("nether_gobber_broadsword", new BroadswordItem(ToolMaterials.NETHERITE, 22f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final BroadswordItem END_GOBBER_BROADSWORD = register("end_gobber_broadsword", new BroadswordItem(ToolMaterials.NETHERITE, 25f, 1.0f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final BroadswordItem TERRA_BROADSWORD = register("terra_broadsword", new BroadswordItem(ToolMaterials.NETHERITE, 15f, 1.5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));


    // Rapiers are close-range weapons with a very quick attack speed.
    public static final RapierItem WOODEN_RAPIER = register("wooden_rapier", new RapierItem(ToolMaterials.WOOD, 2f, 3f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final RapierItem STONE_RAPIER = register("stone_rapier", new RapierItem(ToolMaterials.STONE, 2f, 3.25f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final RapierItem IRON_RAPIER = register("iron_rapier", new RapierItem(ToolMaterials.IRON, 3f, 3f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final RapierItem GOLDEN_RAPIER = register("golden_rapier", new RapierItem(ToolMaterials.GOLD,2f, 3f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final RapierItem DIAMOND_RAPIER = register("diamond_rapier", new RapierItem(ToolMaterials.DIAMOND, 3f, 3.5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final RapierItem NETHERITE_RAPIER = register("netherite_rapier", new RapierItem(ToolMaterials.NETHERITE, 4f, 4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final RapierItem GOBBER_RAPIER = register("gobber_rapier", new RapierItem(ToolMaterials.NETHERITE, 8f, 4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final RapierItem GOBBER_RAPIER_NETHER = register("gobber_rapier_nether", new RapierItem(ToolMaterials.NETHERITE, 11f, 4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final RapierItem GOBBER_RAPIER_END = register("gobber_rapier_end", new RapierItem(ToolMaterials.NETHERITE, 14f, 4f, new Item.Settings().group(GateOfBabylon.GROUP).fireproof()));
    public static final RapierItem TERRA_RAPIER = register("terra_rapier", new RapierItem(ToolMaterials.NETHERITE, 7f, 5f, new Item.Settings().group(GateOfBabylon.GROUP)));
    public static final HaladieItem WOODEN_HALADIE = register("wooden_haladie", new HaladieItem(ToolMaterials.WOOD, 2f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final HaladieItem STONE_HALADIE = register("stone_haladie", new HaladieItem(ToolMaterials.STONE, 3f, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final HaladieItem IRON_HALADIE = register("iron_haladie", new HaladieItem(ToolMaterials.IRON, 4f, 1.3f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final HaladieItem GOLDEN_HALADIE = register("golden_haladie", new HaladieItem(ToolMaterials.GOLD,2f, 1.2f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final HaladieItem DIAMOND_HALADIE = register("diamond_haladie", new HaladieItem(ToolMaterials.DIAMOND, 5f, 1.2f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final HaladieItem GOBBER_HALADIE = register("gobber_haladie", new HaladieItem(ToolMaterials.NETHERITE, 6f, 1.2f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final HaladieItem NETHER_GOBBER_HALADIE = register("nether_gobber_haladie", new HaladieItem(ToolMaterials.NETHERITE, 13f, 1.2f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final HaladieItem END_GOBBER_HALADIE = register("end_gobber_haladie", new HaladieItem(ToolMaterials.NETHERITE, 16f, 1.2f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final HaladieItem TERRA_HALADIE = register("terra_haladie", new HaladieItem(ToolMaterials.NETHERITE, 7f, 2f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));


    public static final WaraxeItem WOODEN_WARAXE = register("wooden_waraxe", new WaraxeItem(ToolMaterials.WOOD, 6, .5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final WaraxeItem STONE_WARAXE = register("stone_waraxe", new WaraxeItem(ToolMaterials.STONE, 8, .5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final WaraxeItem IRON_WARAXE = register("iron_waraxe", new WaraxeItem(ToolMaterials.IRON, 11, .5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final WaraxeItem GOLDEN_WARAXE = register("golden_waraxe", new WaraxeItem(ToolMaterials.GOLD,6, .5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final WaraxeItem DIAMOND_WARAXE = register("diamond_waraxe", new WaraxeItem(ToolMaterials.DIAMOND, 13, .5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final WaraxeItem NETHERITE_WARAXE = register("netherite_waraxe", new WaraxeItem(ToolMaterials.NETHERITE, 15, .5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final WaraxeItem GOBBER_WARAXE = register("gobber_waraxe", new WaraxeItem(ToolMaterials.NETHERITE, 18, .5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final WaraxeItem GOBBER_WARAXE_NETHER = register("nether_gobber_waraxe", new WaraxeItem(ToolMaterials.NETHERITE, 20, .5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final WaraxeItem GOBBER_WARAXE_END = register("end_gobber_waraxe", new WaraxeItem(ToolMaterials.NETHERITE, 25, .5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final WaraxeItem TERRA_WARAXE = register("terra_waraxe", new WaraxeItem(ToolMaterials.NETHERITE, 14, .5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final KatanaItem WOODEN_KATANA = register("wooden_katana", new KatanaItem(ToolMaterials.WOOD, 5, 1.3f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem STONE_KATANA = register("stone_katana", new KatanaItem(ToolMaterials.STONE, 6, 1.3f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem IRON_KATANA = register("iron_katana", new KatanaItem(ToolMaterials.IRON, 8, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem GOLDEN_KATANA = register("golden_katana", new KatanaItem(ToolMaterials.GOLD,5, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem DIAMOND_KATANA = register("diamond_katana", new KatanaItem(ToolMaterials.DIAMOND, 8, 1.4f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem NETHERITE_KATANA = register("netherite_katana", new KatanaItem(ToolMaterials.NETHERITE, 9, 1.5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final KatanaItem GOBBER_KATANA = register("gobber_katana", new KatanaItem(ToolMaterials.NETHERITE, 15, 1.5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final KatanaItem NETHER_GOBBER_KATANA = register("nether_gobber_katana", new KatanaItem(ToolMaterials.NETHERITE, 17, 1.5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final KatanaItem END_GOBBER_KATANA = register("end_gobber_katana", new KatanaItem(ToolMaterials.NETHERITE, 18, 1.5f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).fireproof()));
    public static final KatanaItem TERRA_KATANA = register("terra_katana", new KatanaItem(ToolMaterials.NETHERITE, 14, 3f, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1)));
    public static final CustomBowItem STONE_BOW = register("stone_bow", new CustomBowItem(ToolMaterials.STONE, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).maxDamage(425), 30.0F, 1.0));
    public static final CustomBowItem IRON_BOW = register("iron_bow", new CustomBowItem(ToolMaterials.IRON, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).maxDamage(750), 25.0F, 1.1));
    public static final CustomBowItem GOLDEN_BOW = register("golden_bow", new CustomBowItem(ToolMaterials.GOLD, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).maxDamage(150), 10.0F, 1.0, new BlockStateParticleEffect(ParticleTypes.BLOCK, Blocks.GOLD_BLOCK.getDefaultState())));
    public static final CustomBowItem DIAMOND_BOW = register("diamond_bow", new CustomBowItem(ToolMaterials.DIAMOND, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).maxDamage(1561), 20.0F, 1.25, new BlockStateParticleEffect(ParticleTypes.BLOCK, Blocks.DIAMOND_BLOCK.getDefaultState())));
    public static final CustomBowItem NETHERITE_BOW = register("netherite_bow", new CustomBowItem(ToolMaterials.NETHERITE, new Item.Settings().group(GateOfBabylon.GROUP).maxCount(1).maxDamage(2031).fireproof(), 15.0F, 1.5, ParticleTypes.SOUL_FIRE_FLAME));

    public static final CustomShieldItem STONE_SHIELD = register("stone_shield", new CustomShieldItem(new Item.Settings().maxDamage(425).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem IRON_SHIELD = register("iron_shield", new CustomShieldItem(new Item.Settings().maxDamage(750).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem GOLDEN_SHIELD = register("golden_shield", new CustomShieldItem(new Item.Settings().maxDamage(150).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem DIAMOND_SHIELD = register("diamond_shield", new CustomShieldItem(new Item.Settings().maxDamage(1561).group(GateOfBabylon.GROUP)));
    public static final CustomShieldItem NETHERITE_SHIELD = register("netherite_shield", new CustomShieldItem(new Item.Settings().maxDamage(2031).fireproof().group(GateOfBabylon.GROUP)));

    // Yo-Yos are fun ranged weapons.
    // When the item is used, a projectile is released, which will follow the player's cursor position.
    // Depending on the Yo-Yo's stats and enchantments, the range, damage, and effects of the Yo-Yo will change.
    // When the item is used and a Yo-Yo is extended, it will be retracted.
    // A Yo-Yo loses durability when it hurts an entity.

    public static final Item EXTENDED_STICK = register("extended_stick", new Item(new Item.Settings().group(GateOfBabylon.GROUP)));

    public static final Item INFINITY_LOGO = register("infinity_logo", new Item(new Item.Settings().group(GateOfBabylon.GROUP)));

    private static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, GateOfBabylon.id(name), item);
    }

    public static void init() {
        // NO-OP
    }

    private GOBItems() {
        // NO-OP
    }
}
