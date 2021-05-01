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
    public static final Map<Item, ModelBattleArmor> armorModels = new HashMap<Item, ModelBattleArmor>();

    public static void register_renderers()
    {
        //Registering the custom armor model and attaching each armor item to it

        //Float value is the general size of the model
        ModelBattleArmor battleArmor = new ModelBattleArmor();
        ModelBattleArmor battleArmorLegs = new ModelBattleArmor();

        armorModels.put(Main.battleArmorBlack_chest, battleArmor);
        armorModels.put(Main.battleArmorBlack_leggings, battleArmorLegs);
        armorModels.put(Main.battleArmorBlack_boots, battleArmor);
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
