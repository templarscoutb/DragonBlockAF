package DragonBlockAF.data;

import DragonBlockAF.Main;
import DragonBlockAF.models.ModelBattleArmor;
import DragonBlockAF.objects.armor.ArmorBase;
import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import java.util.Map;

public class armorData extends Main
{
    //Function for the pre-initialization of the custom battle armors
    public static void battleArmorPreInit(ItemArmor.ArmorMaterial battleArmor)
    {
        //Black Battle Armor
        battleArmorBlack_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlack_chest");
        battleArmorBlack_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlack_leggings");
        battleArmorBlack_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlack_boots");
        //Black Light Grey Armor
        battleArmorBlackLightGrey_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackLightGrey_chest");
        battleArmorBlackLightGrey_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackLightGrey_leggings");
        battleArmorBlackLightGrey_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackLightGrey_boots");
        //Black Grey armor
        battleArmorBlackGrey_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackGrey_chest");
        battleArmorBlackGrey_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackGrey_leggings");
        battleArmorBlackGrey_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackGrey_boots");
        //Black Black armor
        battleArmorBlackBlack_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackBlack_chest");
        battleArmorBlackBlack_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackBlack_leggings");
        battleArmorBlackBlack_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackBlack_boots");
        //Black Yellow armor
        battleArmorBlackYellow_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackYellow_chest");
        battleArmorBlackYellow_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackYellow_leggings");
        battleArmorBlackYellow_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackYellow_boots");
        //Black Orange Armor
        battleArmorBlackOrange_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackOrange_chest");
        battleArmorBlackOrange_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackOrange_leggings");
        battleArmorBlackOrange_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackOrange_boots");
        //Black Red armor
        battleArmorBlackRed_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackRed_chest");
        battleArmorBlackRed_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackRed_leggings");
        battleArmorBlackRed_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackRed_boots");
        //Black brown armor
        battleArmorBlackBrown_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackBrown_chest");
        battleArmorBlackBrown_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackBrown_leggings");
        battleArmorBlackBrown_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackBrown_boots");
        //Black lime armor
        battleArmorBlackLime_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackLime_chest");
        battleArmorBlackLime_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackLime_leggings");
        battleArmorBlackLime_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackLime_boots");
        //Black green armor
        battleArmorBlackGreen_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackGreen_chest");
        battleArmorBlackGreen_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackGreen_leggings");
        battleArmorBlackGreen_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackGreen_boots");
        //Black light blue armor
        battleArmorBlackLightBlue_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackLightBlue_chest");
        battleArmorBlackLightBlue_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackLightBlue_leggings");
        battleArmorBlackLightBlue_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackLightBlue_boots");
        //Black cyan armor
        battleArmorBlackCyan_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackCyan_chest");
        battleArmorBlackCyan_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackCyan_leggings");
        battleArmorBlackCyan_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackCyan_boots");
        //Black Blue armor
        battleArmorBlackBlue_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackBlue_chest");
        battleArmorBlackBlue_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackBlue_leggings");
        battleArmorBlackBlue_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackBlue_boots");
        //Black Pink armor
        battleArmorBlackPink_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackPink_chest");
        battleArmorBlackPink_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackPink_leggings");
        battleArmorBlackPink_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackPink_boots");
        //Black Magenta armor
        battleArmorBlackMagenta_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackMagenta_chest");
        battleArmorBlackMagenta_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackMagenta_leggings");
        battleArmorBlackMagenta_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackMagenta_boots");
        //Black Purple armor
        battleArmorBlackPurple_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlackPurple_chest");
        battleArmorBlackPurple_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlackPurple_leggings");
        battleArmorBlackPurple_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlackPurple_boots");

        //White Battle Armor
        battleArmorWhite_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhite_chest");
        battleArmorWhite_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhite_leggings");
        battleArmorWhite_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhite_boots");
        //White Light Grey Armor
        battleArmorWhiteLightGrey_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhiteLightGrey_chest");
        battleArmorWhiteLightGrey_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhiteLightGrey_leggings");
        battleArmorWhiteLightGrey_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhiteLightGrey_boots");
        //White  Grey armor
        battleArmorWhiteGrey_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhiteGrey_chest");
        battleArmorWhiteGrey_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhiteGrey_leggings");
        battleArmorWhiteGrey_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhiteGrey_boots");
        //White  Black armor
        battleArmorWhiteBlack_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhiteBlack_chest");
        battleArmorWhiteBlack_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhiteBlack_leggings");
        battleArmorWhiteBlack_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhiteBlack_boots");
        //White  Yellow armor
        battleArmorWhiteYellow_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhiteYellow_chest");
        battleArmorWhiteYellow_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhiteYellow_leggings");
        battleArmorWhiteYellow_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhiteYellow_boots");
        //White Orange Armor
        battleArmorWhiteOrange_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhiteOrange_chest");
        battleArmorWhiteOrange_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhiteOrange_leggings");
        battleArmorWhiteOrange_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhiteOrange_boots");
        //White Red armor
        battleArmorWhiteRed_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhiteRed_chest");
        battleArmorWhiteRed_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhiteRed_leggings");
        battleArmorWhiteRed_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhiteRed_boots");
        //White  brown armor
        battleArmorWhiteBrown_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhiteBrown_chest");
        battleArmorWhiteBrown_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhiteBrown_leggings");
        battleArmorWhiteBrown_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhiteBrown_boots");
        //White lime armor
        battleArmorWhiteLime_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhiteLime_chest");
        battleArmorWhiteLime_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhiteLime_leggings");
        battleArmorWhiteLime_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhiteLime_boots");
        //White  green armor
        battleArmorWhiteGreen_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhiteGreen_chest");
        battleArmorWhiteGreen_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhiteGreen_leggings");
        battleArmorWhiteGreen_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhiteGreen_boots");
        //White  light blue armor
        battleArmorWhiteLightBlue_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhiteLightBlue_chest");
        battleArmorWhiteLightBlue_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhiteLightBlue_leggings");
        battleArmorWhiteLightBlue_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhiteLightBlue_boots");
        //White  cyan armor
        battleArmorWhiteCyan_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhiteCyan_chest");
        battleArmorWhiteCyan_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhiteCyan_leggings");
        battleArmorWhiteCyan_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhiteCyan_boots");
        //White  Blue armor
        battleArmorWhiteBlue_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhiteBlue_chest");
        battleArmorWhiteBlue_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhiteBlue_leggings");
        battleArmorWhiteBlue_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhiteBlue_boots");
        //White  Pink armor
        battleArmorWhitePink_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhitePink_chest");
        battleArmorWhitePink_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhitePink_leggings");
        battleArmorWhitePink_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhitePink_boots");
        //White  Magenta armor
        battleArmorWhiteMagenta_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhiteMagenta_chest");
        battleArmorWhiteMagenta_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhiteMagenta_leggings");
        battleArmorWhiteMagenta_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhiteMagenta_boots");
        //White  Purple armor
        battleArmorWhitePurple_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorWhitePurple_chest");
        battleArmorWhitePurple_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorWhitePurple_leggings");
        battleArmorWhitePurple_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorWhitePurple_boots");
    }

    //Function for the client data for the custom battle armors
    public static void battleArmorClientData(Map<Item, ModelBiped> armorModels, ModelBattleArmor battleArmor, ModelBattleArmor battleArmorLegs)
    {
        //Legs goes into battleArmorLegs the rest of the armor goes into battleArmor
        //Black Armor
        armorModels.put(Main.battleArmorBlack_chest, battleArmor);
        armorModels.put(Main.battleArmorBlack_leggings, battleArmorLegs);
        armorModels.put(Main.battleArmorBlack_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackLightGrey_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackLightGrey_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackLightGrey_boots,battleArmor);

        armorModels.put(Main.battleArmorBlackGrey_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackGrey_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackGrey_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackBlack_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackBlack_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackBlack_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackYellow_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackYellow_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackYellow_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackOrange_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackOrange_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackOrange_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackRed_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackRed_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackRed_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackBrown_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackBrown_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackBrown_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackLime_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackLime_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackLime_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackGreen_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackGreen_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackGreen_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackLightBlue_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackLightBlue_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackLightBlue_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackCyan_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackCyan_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackCyan_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackBlue_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackBlue_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackBlue_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackPink_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackPink_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackPink_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackMagenta_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackMagenta_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackMagenta_boots, battleArmor);

        armorModels.put(Main.battleArmorBlackPurple_chest,battleArmor);
        armorModels.put(Main.battleArmorBlackPurple_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorBlackPurple_boots, battleArmor);

        //White armor
        armorModels.put(Main.battleArmorWhite_chest, battleArmor);
        armorModels.put(Main.battleArmorWhite_leggings, battleArmorLegs);
        armorModels.put(Main.battleArmorWhite_boots, battleArmor);

        armorModels.put(Main.battleArmorWhiteLightGrey_chest,battleArmor);
        armorModels.put(Main.battleArmorWhiteLightGrey_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhiteLightGrey_boots,battleArmor);

        armorModels.put(Main.battleArmorWhiteGrey_chest,battleArmor);
        armorModels.put(Main.battleArmorWhiteGrey_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhiteGrey_boots, battleArmor);

        armorModels.put(Main.battleArmorWhiteBlack_chest,battleArmor);
        armorModels.put(Main.battleArmorWhiteBlack_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhiteBlack_boots, battleArmor);

        armorModels.put(Main.battleArmorWhiteYellow_chest,battleArmor);
        armorModels.put(Main.battleArmorWhiteYellow_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhiteYellow_boots, battleArmor);

        armorModels.put(Main.battleArmorWhiteOrange_chest,battleArmor);
        armorModels.put(Main.battleArmorWhiteOrange_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhiteOrange_boots, battleArmor);

        armorModels.put(Main.battleArmorWhiteRed_chest,battleArmor);
        armorModels.put(Main.battleArmorWhiteRed_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhiteRed_boots, battleArmor);

        armorModels.put(Main.battleArmorWhiteBrown_chest,battleArmor);
        armorModels.put(Main.battleArmorWhiteBrown_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhiteBrown_boots, battleArmor);

        armorModels.put(Main.battleArmorWhiteLime_chest,battleArmor);
        armorModels.put(Main.battleArmorWhiteLime_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhiteLime_boots, battleArmor);

        armorModels.put(Main.battleArmorWhiteGreen_chest,battleArmor);
        armorModels.put(Main.battleArmorWhiteGreen_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhiteGreen_boots, battleArmor);

        armorModels.put(Main.battleArmorWhiteLightBlue_chest,battleArmor);
        armorModels.put(Main.battleArmorWhiteLightBlue_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhiteLightBlue_boots, battleArmor);

        armorModels.put(Main.battleArmorWhiteCyan_chest,battleArmor);
        armorModels.put(Main.battleArmorWhiteCyan_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhiteCyan_boots, battleArmor);

        armorModels.put(Main.battleArmorWhiteBlue_chest,battleArmor);
        armorModels.put(Main.battleArmorWhiteBlue_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhiteBlue_boots, battleArmor);

        armorModels.put(Main.battleArmorWhitePink_chest,battleArmor);
        armorModels.put(Main.battleArmorWhitePink_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhitePink_boots, battleArmor);

        armorModels.put(Main.battleArmorWhiteMagenta_chest,battleArmor);
        armorModels.put(Main.battleArmorWhiteMagenta_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhiteMagenta_boots, battleArmor);

        armorModels.put(Main.battleArmorWhitePurple_chest,battleArmor);
        armorModels.put(Main.battleArmorWhitePurple_leggings,battleArmorLegs);
        armorModels.put(Main.battleArmorWhitePurple_boots, battleArmor);
    }

    //Function for registering all the custom battle armor
    public static void battleArmorInitGameRegistry()
    {
        //Black Armor sets
        GameRegistry.registerItem(battleArmorBlack_chest, "battleArmorBlack_chest");
        GameRegistry.registerItem(battleArmorBlack_leggings, "battleArmorBlack_leggings");
        GameRegistry.registerItem(battleArmorBlack_boots, "battleArmorBlack_boots");

        GameRegistry.registerItem(battleArmorBlackLightGrey_chest,"battleArmorBlackLightGrey_chest");
        GameRegistry.registerItem(battleArmorBlackLightGrey_leggings,"battleArmorBlackLightGrey_leggings");
        GameRegistry.registerItem(battleArmorBlackLightGrey_boots,"battleArmorBlackLightGrey_boots");

        GameRegistry.registerItem(battleArmorBlackGrey_chest,"battleArmorBlackGrey_chest");
        GameRegistry.registerItem(battleArmorBlackGrey_leggings,"battleArmorBlackGrey_leggings");
        GameRegistry.registerItem(battleArmorBlackGrey_boots,"battleArmorBlackGrey_boots");

        GameRegistry.registerItem(battleArmorBlackBlack_chest,"battleArmorBlackBlack_chest");
        GameRegistry.registerItem(battleArmorBlackBlack_leggings,"battleArmorBlackBlack_leggings");
        GameRegistry.registerItem(battleArmorBlackBlack_boots,"battleArmorBlackBlack_boots");

        GameRegistry.registerItem(battleArmorBlackYellow_chest,"battleArmorBlackYellow_chest");
        GameRegistry.registerItem(battleArmorBlackYellow_leggings,"battleArmorBlackYellow_leggings");
        GameRegistry.registerItem(battleArmorBlackYellow_boots,"battleArmorBlackYellow_boots");

        GameRegistry.registerItem(battleArmorBlackOrange_chest,"battleArmorBlackOrange_chest");
        GameRegistry.registerItem(battleArmorBlackOrange_leggings,"battleArmorBlackOrange_leggings");
        GameRegistry.registerItem(battleArmorBlackOrange_boots,"battleArmorBlackOrange_boots");

        GameRegistry.registerItem(battleArmorBlackRed_chest,"battleArmorBlackRed_chest");
        GameRegistry.registerItem(battleArmorBlackRed_leggings,"battleArmorBlackRed_leggings");
        GameRegistry.registerItem(battleArmorBlackRed_boots,"battleArmorBlackRed_boots");

        GameRegistry.registerItem(battleArmorBlackBrown_chest,"battleArmorBlackBrown_chest");
        GameRegistry.registerItem(battleArmorBlackBrown_leggings,"battleArmorBlackBrown_leggings");
        GameRegistry.registerItem(battleArmorBlackBrown_boots,"battleArmorBlackBrown_boots");

        GameRegistry.registerItem(battleArmorBlackLime_chest,"battleArmorBlackLime_chest");
        GameRegistry.registerItem(battleArmorBlackLime_leggings,"battleArmorBlackLime_leggings");
        GameRegistry.registerItem(battleArmorBlackLime_boots,"battleArmorBlackLime_boots");

        GameRegistry.registerItem(battleArmorBlackGreen_chest,"battleArmorBlackGreen_chest");
        GameRegistry.registerItem(battleArmorBlackGreen_leggings,"battleArmorBlackGreen_leggings");
        GameRegistry.registerItem(battleArmorBlackGreen_boots,"battleArmorBlackGreen_boots");

        GameRegistry.registerItem(battleArmorBlackLightBlue_chest,"battleArmorBlackLightBlue_chest");
        GameRegistry.registerItem(battleArmorBlackLightBlue_leggings,"battleArmorBlackLightBlue_leggings");
        GameRegistry.registerItem(battleArmorBlackLightBlue_boots,"battleArmorBlackLightBlue_boots");

        GameRegistry.registerItem(battleArmorBlackCyan_chest,"battleArmorBlackCyan_chest");
        GameRegistry.registerItem(battleArmorBlackCyan_leggings,"battleArmorBlackCyan_leggings");
        GameRegistry.registerItem(battleArmorBlackCyan_boots,"battleArmorBlackCyan_boots");

        GameRegistry.registerItem(battleArmorBlackBlue_chest,"battleArmorBlackBlue_chest");
        GameRegistry.registerItem(battleArmorBlackBlue_leggings,"battleArmorBlackBlue_leggings");
        GameRegistry.registerItem(battleArmorBlackBlue_boots,"battleArmorBlackBlue_boots");

        GameRegistry.registerItem(battleArmorBlackPink_chest,"battleArmorBlackPink_chest");
        GameRegistry.registerItem(battleArmorBlackPink_leggings,"battleArmorBlackPink_leggings");
        GameRegistry.registerItem(battleArmorBlackPink_boots,"battleArmorBlackPink_boots");

        GameRegistry.registerItem(battleArmorBlackMagenta_chest,"battleArmorBlackMagenta_chest");
        GameRegistry.registerItem(battleArmorBlackMagenta_leggings,"battleArmorBlackMagenta_leggings");
        GameRegistry.registerItem(battleArmorBlackMagenta_boots,"battleArmorBlackMagenta_boots");

        GameRegistry.registerItem(battleArmorBlackPurple_chest,"battleArmorBlackPurple_chest");
        GameRegistry.registerItem(battleArmorBlackPurple_leggings,"battleArmorBlackPurple_leggings");
        GameRegistry.registerItem(battleArmorBlackPurple_boots,"battleArmorBlackPurple_boots");


        //White armor sets
        GameRegistry.registerItem(battleArmorWhite_chest, "battleArmorWhite_chest");
        GameRegistry.registerItem(battleArmorWhite_leggings, "battleArmorWhite_leggings");
        GameRegistry.registerItem(battleArmorWhite_boots, "battleArmorWhite_boots");

        GameRegistry.registerItem(battleArmorWhiteLightGrey_chest,"battleArmorWhiteLightGrey_chest");
        GameRegistry.registerItem(battleArmorWhiteLightGrey_leggings,"battleArmorWhiteLightGrey_leggings");
        GameRegistry.registerItem(battleArmorWhiteLightGrey_boots,"battleArmorWhiteLightGrey_boots");

        GameRegistry.registerItem(battleArmorWhiteGrey_chest,"battleArmorWhiteGrey_chest");
        GameRegistry.registerItem(battleArmorWhiteGrey_leggings,"battleArmorWhiteGrey_leggings");
        GameRegistry.registerItem(battleArmorWhiteGrey_boots,"battleArmorWhiteGrey_boots");

        GameRegistry.registerItem(battleArmorWhiteBlack_chest,"battleArmorWhiteBlack_chest");
        GameRegistry.registerItem(battleArmorWhiteBlack_leggings,"battleArmorWhiteBlack_leggings");
        GameRegistry.registerItem(battleArmorWhiteBlack_boots,"battleArmorWhiteBlack_boots");

        GameRegistry.registerItem(battleArmorWhiteYellow_chest,"battleArmorWhiteYellow_chest");
        GameRegistry.registerItem(battleArmorWhiteYellow_leggings,"battleArmorWhiteYellow_leggings");
        GameRegistry.registerItem(battleArmorWhiteYellow_boots,"battleArmorWhiteYellow_boots");

        GameRegistry.registerItem(battleArmorWhiteOrange_chest,"battleArmorWhiteOrange_chest");
        GameRegistry.registerItem(battleArmorWhiteOrange_leggings,"battleArmorWhiteOrange_leggings");
        GameRegistry.registerItem(battleArmorWhiteOrange_boots,"battleArmorWhiteOrange_boots");

        GameRegistry.registerItem(battleArmorWhiteRed_chest,"battleArmorWhiteRed_chest");
        GameRegistry.registerItem(battleArmorWhiteRed_leggings,"battleArmorWhiteRed_leggings");
        GameRegistry.registerItem(battleArmorWhiteRed_boots,"battleArmorWhiteRed_boots");

        GameRegistry.registerItem(battleArmorWhiteBrown_chest,"battleArmorWhiteBrown_chest");
        GameRegistry.registerItem(battleArmorWhiteBrown_leggings,"battleArmorWhiteBrown_leggings");
        GameRegistry.registerItem(battleArmorWhiteBrown_boots,"battleArmorWhiteBrown_boots");

        GameRegistry.registerItem(battleArmorWhiteLime_chest,"battleArmorWhiteLime_chest");
        GameRegistry.registerItem(battleArmorWhiteLime_leggings,"battleArmorWhiteLime_leggings");
        GameRegistry.registerItem(battleArmorWhiteLime_boots,"battleArmorWhiteLime_boots");

        GameRegistry.registerItem(battleArmorWhiteGreen_chest,"battleArmorWhiteGreen_chest");
        GameRegistry.registerItem(battleArmorWhiteGreen_leggings,"battleArmorWhiteGreen_leggings");
        GameRegistry.registerItem(battleArmorWhiteGreen_boots,"battleArmorWhiteGreen_boots");

        GameRegistry.registerItem(battleArmorWhiteLightBlue_chest,"battleArmorWhiteLightBlue_chest");
        GameRegistry.registerItem(battleArmorWhiteLightBlue_leggings,"battleArmorWhiteLightBlue_leggings");
        GameRegistry.registerItem(battleArmorWhiteLightBlue_boots,"battleArmorWhiteLightBlue_boots");

        GameRegistry.registerItem(battleArmorWhiteCyan_chest,"battleArmorWhiteCyan_chest");
        GameRegistry.registerItem(battleArmorWhiteCyan_leggings,"battleArmorWhiteCyan_leggings");
        GameRegistry.registerItem(battleArmorWhiteCyan_boots,"battleArmorWhiteCyan_boots");

        GameRegistry.registerItem(battleArmorWhiteBlue_chest,"battleArmorWhiteBlue_chest");
        GameRegistry.registerItem(battleArmorWhiteBlue_leggings,"battleArmorWhiteBlue_leggings");
        GameRegistry.registerItem(battleArmorWhiteBlue_boots,"battleArmorWhiteBlue_boots");

        GameRegistry.registerItem(battleArmorWhitePink_chest,"battleArmorWhitePink_chest");
        GameRegistry.registerItem(battleArmorWhitePink_leggings,"battleArmorWhitePink_leggings");
        GameRegistry.registerItem(battleArmorWhitePink_boots,"battleArmorWhitePink_boots");

        GameRegistry.registerItem(battleArmorWhiteMagenta_chest,"battleArmorWhiteMagenta_chest");
        GameRegistry.registerItem(battleArmorWhiteMagenta_leggings,"battleArmorWhiteMagenta_leggings");
        GameRegistry.registerItem(battleArmorWhiteMagenta_boots,"battleArmorWhiteMagenta_boots");

        GameRegistry.registerItem(battleArmorWhitePurple_chest,"battleArmorWhitePurple_chest");
        GameRegistry.registerItem(battleArmorWhitePurple_leggings,"battleArmorWhitePurple_leggings");
        GameRegistry.registerItem(battleArmorWhitePurple_boots,"battleArmorWhitePurple_boots");
    }

    //Function for all the custom battle armor crafting recipes
    public static void battleArmorCraftingRecipes()
    {
        /*Crafting Recipes for battle armor ||| "TopRow","MiddleRow","BottomRow" |||
          ItemStack is used for getting dyes into the recipe. So it is ItemStack(Items.dye, stack size, dye ID) */

        //Black Battle Armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlack_chest), new Object[]{"III","IAI","III", 'A', ItemsDBC.BattleArmorChest00, 'I', new ItemStack(Items.dye, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlack_leggings), new Object[]{"III","IAI","III", 'A', ItemsDBC.BattleArmorLegs00, 'I', new ItemStack(Items.dye, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlack_boots), new Object[]{"III","IAI","III", 'A', ItemsDBC.BattleArmorBoots00, 'I', new ItemStack(Items.dye, 1, 0)});
        //Black and Light Grey Armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackLightGrey_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 7)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackLightGrey_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 7)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackLightGrey_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 7)});
        //Black and grey armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackGrey_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 8)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackGrey_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 8)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackGrey_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 8)});
        //Black and black armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackBlack_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackBlack_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackBlack_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 0)});
        //Black Yellow armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackYellow_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 11)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackYellow_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 11)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackYellow_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 11)});
        //Black Orange armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackOrange_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 14)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackOrange_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 14)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackOrange_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 14)});
        //Black Red armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackRed_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackRed_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackRed_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 1)});
        //Black brown armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackBrown_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 3)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackBrown_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 3)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackBrown_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 3)});
        //Black lime armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackLime_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 10)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackLime_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 10)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackLime_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 10)});
        //Black green armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackGreen_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 2)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackGreen_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 2)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackGreen_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 2)});
        //Black light blue armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackLightBlue_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 12)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackLightBlue_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 12)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackLightBlue_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 12)});
        //Black cyan armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackCyan_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 6)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackCyan_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 6)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackCyan_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 6)});
        //Black Blue armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackBlue_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackBlue_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackBlue_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 4)});
        //Black Pink armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackPink_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 9)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackPink_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 9)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackPink_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 9)});
        //Black Magenta armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackMagenta_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 13)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackMagenta_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 13)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackMagenta_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 13)});
        //Black Purple Armor
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackPurple_chest), new Object[]{"III","IAI","III", 'A', battleArmorBlack_chest, 'I', new ItemStack(Items.dye, 1, 5)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackPurple_leggings), new Object[]{"III","IAI","III", 'A', battleArmorBlack_leggings, 'I', new ItemStack(Items.dye, 1, 5)});
        GameRegistry.addRecipe(new ItemStack(battleArmorBlackPurple_boots), new Object[]{"III","IAI","III", 'A', battleArmorBlack_boots, 'I', new ItemStack(Items.dye, 1, 5)});

        //White Battle Armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhite_chest), new Object[]{"III","IAI","III", 'A', ItemsDBC.BattleArmorChest00, 'I', new ItemStack(Items.dye, 1, 15)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhite_leggings), new Object[]{"III","IAI","III", 'A', ItemsDBC.BattleArmorLegs00, 'I', new ItemStack(Items.dye, 1, 15)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhite_boots), new Object[]{"III","IAI","III", 'A', ItemsDBC.BattleArmorBoots00, 'I', new ItemStack(Items.dye, 1, 15)});
        //White and Light Grey Armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteLightGrey_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 7)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteLightGrey_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 7)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteLightGrey_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 7)});
        //White and grey armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteGrey_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 8)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteGrey_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 8)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteGrey_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 8)});
        //White and black armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteBlack_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteBlack_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 0)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteBlack_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 0)});
        //White Yellow armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteYellow_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 11)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteYellow_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 11)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteYellow_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 11)});
        //White Orange armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteOrange_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 14)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteOrange_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 14)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteOrange_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 14)});
        //White Red armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteRed_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteRed_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteRed_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 1)});
        //White brown armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteBrown_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 3)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteBrown_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 3)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteBrown_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 3)});
        //White lime armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteLime_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 10)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteLime_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 10)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteLime_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 10)});
        //White green armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteGreen_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 2)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteGreen_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 2)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteGreen_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 2)});
        //White light blue armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteLightBlue_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 12)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteLightBlue_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 12)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteLightBlue_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 12)});
        //White cyan armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteCyan_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 6)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteCyan_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 6)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteCyan_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 6)});
        //White Blue armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteBlue_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteBlue_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteBlue_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 4)});
        //White Pink armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhitePink_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 9)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhitePink_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 9)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhitePink_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 9)});
        //White Magenta armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteMagenta_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 13)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteMagenta_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 13)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhiteMagenta_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 13)});
        //White Purple Armor
        GameRegistry.addRecipe(new ItemStack(battleArmorWhitePurple_chest), new Object[]{"III","IAI","III", 'A', battleArmorWhite_chest, 'I', new ItemStack(Items.dye, 1, 5)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhitePurple_leggings), new Object[]{"III","IAI","III", 'A', battleArmorWhite_leggings, 'I', new ItemStack(Items.dye, 1, 5)});
        GameRegistry.addRecipe(new ItemStack(battleArmorWhitePurple_boots), new Object[]{"III","IAI","III", 'A', battleArmorWhite_boots, 'I', new ItemStack(Items.dye, 1, 5)});
    }
}
