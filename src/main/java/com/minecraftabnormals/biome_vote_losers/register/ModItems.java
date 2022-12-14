package com.minecraftabnormals.biome_vote_losers.register;

import com.minecraftabnormals.biome_vote_losers.BiomeVoteLosers;
import com.minecraftabnormals.biome_vote_losers.world.level.item.VinegarBottleItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BiomeVoteLosers.MODID);

	public static final RegistryObject<Item> CACTUS_PAD = ITEMS.register("cactus_pad", () -> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> PRICKLY_PEAR = ITEMS.register("prickly_pear", () -> new Item((new Item.Properties()).food(ModFoods.PRICKLY_PEAR).tab(CreativeModeTab.TAB_FOOD)));
	public static final RegistryObject<Item> TUMBLEWEED_SEED = ITEMS.register("tumbleweed_seed", () -> new ItemNameBlockItem(ModBlocks.TUMBLEWEED.get(), new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

	public static final RegistryObject<ItemNameBlockItem> BAOBAB_FRUIT = ITEMS.register("baobab_fruit", () -> new ItemNameBlockItem(ModBlocks.BAOBAB_FRUIT.get(), new Item.Properties().food(ModFoods.BAOBAB_FRUIT).tab(CreativeModeTab.TAB_FOOD)));
	public static final RegistryObject<Item> RAW_OSTRICH = ITEMS.register("raw_ostrich", () -> new Item(new Item.Properties().food(ModFoods.RAW_OSTRICH).tab(CreativeModeTab.TAB_FOOD)));
	public static final RegistryObject<Item> COOKED_OSTRICH = ITEMS.register("cooked_ostrich", () -> new Item(new Item.Properties().food(ModFoods.COOKED_OSTRICH).tab(CreativeModeTab.TAB_FOOD)));

	public static final RegistryObject<Item> DATE = ITEMS.register("date", () -> new Item(new Item.Properties().food(ModFoods.DATE).tab(CreativeModeTab.TAB_FOOD)));
	// public static final RegistryObject<CoconutItem> COCONUT = ITEMS.register("coconut", () -> new CoconutItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> COCONUT_SHELL = ITEMS.register("coconut_shell", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> COCONUT_HALF = ITEMS.register("coconut_half", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).craftRemainder(ModItems.COCONUT_SHELL.get())));
	public static final RegistryObject<Item> COCONUT_CHUNK = ITEMS.register("coconut_chunk", () -> new Item(new Item.Properties().food(ModFoods.COCONUT_CHUNK).tab(CreativeModeTab.TAB_FOOD)));
	public static final RegistryObject<Item> DESICCATED_COCONUT = ITEMS.register("desiccated_coconut", () -> new Item(new Item.Properties().food(ModFoods.DESICCATED_COCONUT).tab(CreativeModeTab.TAB_FOOD)));
	public static final RegistryObject<VinegarBottleItem> VINEGAR_BOTTLE = ITEMS.register("vinegar_bottle", () -> new VinegarBottleItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> CALCITE_POWDER_BOTTLE = ITEMS.register("calcite_powder_bottle", () -> new Item((new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE).tab(CreativeModeTab.TAB_MISC)));

	// todo palm boat and chest boat

	public static final RegistryObject<Item> SUCCULENT_CUTTING = ITEMS.register("succulent_cutting", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));


	public static final RegistryObject<Item> MEERKAT_SPAWN_EGG = ITEMS.register("meerkat_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.MEERKAT, 0xBC895C, 0x302B31, new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> OSTRICH_SPAWN_EGG = ITEMS.register("ostrich_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.OSTRICH, 0xD5AA9A, 0x362A2A, new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	public static final RegistryObject<Item> VULTURE_SPAWN_EGG = ITEMS.register("vulture_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.VULTURE, 0x654225, 0xD49076, new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

}
