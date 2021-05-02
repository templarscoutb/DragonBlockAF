package DragonBlockAF;


import DragonBlockAF.objects.armor.ArmorBase;
import DragonBlockAF.proxy.ClientProxy;
import DragonBlockAF.proxy.CommonProxy;
import DragonBlockAF.util.reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;


@Mod(modid = reference.MODID, name = reference.NAME, version = reference.VERSION)
public class Main
{
    @Mod.Instance
    public static Main instance = new Main();

    @SidedProxy(clientSide = reference.CLIENT, serverSide = reference.SERVER)
    public static CommonProxy proxyCommon;

    public static Item battleArmorBlack_chest;
    public static Item battleArmorBlack_leggings;
    public static Item battleArmorBlack_boots;



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Item/Block init
        //Config handling

        //Material for battle armor
        ItemArmor.ArmorMaterial battleArmor = EnumHelper.addArmorMaterial("battleArmor",27,new int[]{0,9,7,4}, 10 );

        battleArmorBlack_chest = new ArmorBase(battleArmor, 1, 1).setUnlocalizedName("battleArmorBlack_chest");
        battleArmorBlack_leggings = new ArmorBase(battleArmor, 1, 2).setUnlocalizedName("battleArmorBlack_leggings");
        battleArmorBlack_boots = new ArmorBase(battleArmor, 1, 3).setUnlocalizedName("battleArmorBlack_boots");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Proxy, TileEntity, entity, GUI, packet registering, and item and block registering

        GameRegistry.registerItem(battleArmorBlack_chest, "battleArmorBlack_chest");
        GameRegistry.registerItem(battleArmorBlack_leggings, "battleArmorBlack_leggings");
        GameRegistry.registerItem(battleArmorBlack_boots, "battleArmorBlack_boots");

        ClientProxy.register_renderers();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {


    }

}