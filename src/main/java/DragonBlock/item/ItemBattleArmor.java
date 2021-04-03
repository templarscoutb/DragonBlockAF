package DragonBlock.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBattleArmor extends ItemArmor {

    public ItemBattleArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
    }
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(this.armorType == 2)
        {
            return "dbaf:textures/models/armor/black_battle_armor_layer_2.png";
        }
        return "dbaf:textures/models/armor/black_battle_armor_layer_1.png";
    }
}