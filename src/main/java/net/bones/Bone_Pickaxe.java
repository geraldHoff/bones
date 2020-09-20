package net.bones;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterials;

/**
 * class for bone pickaxe item, classified as a bone tool.
 * Should make a bone ToolMaterial class in future.
 */
public class Bone_Pickaxe extends PickaxeItem {

    public Bone_Pickaxe(Settings settings) {
        super(ToolMaterials.STONE, 2, 1, settings);
    }

}
