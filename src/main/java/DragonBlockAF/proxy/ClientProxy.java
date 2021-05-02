package DragonBlockAF.proxy;

import DragonBlockAF.Main;
import DragonBlockAF.models.ModelBattleArmor;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Map;

public class ClientProxy extends CommonProxy
{
    public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();

    public static void register_renderers()
    {
        //Registering the custom armor model and attaching each armor item to it

        //Float value is the general size of the model
        ModelBattleArmor battleArmor = new ModelBattleArmor(0.18f);
        ModelBattleArmor battleArmorLegs = new ModelBattleArmor(0.15f);
        //Legs goes into battleArmorLegs the rest of the armor goes into battleArmor
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
    }

    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
    }

    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}
