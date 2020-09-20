package net.bones;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Bones implements ModInitializer {

    public static final Item BONE_PICKAXE = new Bone_Pickaxe(new Item.Settings().group(ItemGroup.TOOLS));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("bones", "bone_pickaxe"), BONE_PICKAXE);
    }
}
