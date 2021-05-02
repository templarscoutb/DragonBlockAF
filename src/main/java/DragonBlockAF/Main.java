package DragonBlockAF;


import DragonBlockAF.data.armorData;
import DragonBlockAF.proxy.ClientProxy;
import DragonBlockAF.proxy.CommonProxy;
import DragonBlockAF.util.reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;


@Mod(modid = reference.MODID, name = reference.NAME, version = reference.VERSION)
public class Main extends variableDeclaration
{
    @Mod.Instance
    public static Main instance = new Main();

    @SidedProxy(clientSide = reference.CLIENT, serverSide = reference.SERVER)
    public static CommonProxy proxyCommon;

    //Variable declaration if needed


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Item/Block init
        //Config handling

        //Material for battle armor
        ItemArmor.ArmorMaterial battleArmor = EnumHelper.addArmorMaterial("battleArmor",27,new int[]{0,9,7,4}, 10 );
        /*Function for the pre-initialization of the armor ie setting each piece of armor a armor type based on which piece of armor it is,
            setting its unlocalized name, and giving it an armor material by passing the armor material to the function*/
        armorData.battleArmorPreInit(battleArmor);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Proxy, TileEntity, entity, GUI, packet registering, and item and block registering

        //Registering Armor through function
        armorData.battleArmorInitGameRegistry();

        //Renderer for custom armor model
        ClientProxy.register_renderers();

        //Crafting recipe function for all custom battle armor
        armorData.battleArmorCraftingRecipes();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {


    }

    //Creative tab
    public static CreativeTabs tabDragonBlockAF = new CreativeTabs("tabDragonBlockAF")
    {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(battleArmorBlack_chest).getItem();
        }
    };
}