package DragonBlockAF.proxy;

import DragonBlockAF.Main;
import DragonBlockAF.data.armorData;
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
        //Client armor data
        armorData.battleArmorClientData(armorModels,battleArmor,battleArmorLegs);

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
