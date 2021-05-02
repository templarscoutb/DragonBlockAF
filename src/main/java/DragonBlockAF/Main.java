package DragonBlockAF;


import DragonBlockAF.objects.armor.ArmorBase;
import DragonBlockAF.proxy.ClientProxy;
import DragonBlockAF.proxy.CommonProxy;
import DragonBlockAF.util.reference;
import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
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
    public static Item battleArmorBlackLightGrey_chest;
    public static Item battleArmorBlackLightGrey_leggings;
    public static Item battleArmorBlackLightGrey_boots;
    public static Item battleArmorBlackGrey_chest;
    public static Item battleArmorBlackGrey_leggings;
    public static Item battleArmorBlackGrey_boots;
    public static Item battleArmorBlackBlack_chest;
    public static Item battleArmorBlackBlack_leggings;
    public static Item battleArmorBlackBlack_boots;
    public static Item battleArmorBlackYellow_chest;
    public static Item battleArmorBlackYellow_leggings;
    public static Item battleArmorBlackYellow_boots;
    public static Item battleArmorBlackOrange_chest;
    public static Item battleArmorBlackOrange_leggings;
    public static Item battleArmorBlackOrange_boots;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Item/Block init
        //Config handling

        //Material for battle armor
        ItemArmor.ArmorMaterial battleArmor = EnumHelper.addArmorMaterial("battleArmor",27,new int[]{0,9,7,4}, 10 );
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

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        //Proxy, TileEntity, entity, GUI, packet registering, and item and block registering

        //Registering Armor
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

        //Renderer for custom armor model
        ClientProxy.register_renderers();

        //Crafting Recipes for battle armor
        //"TopRow","MiddleRow","BottomRow"
        //ItemStack is used for getting dyes into the recipe. So it is ItemStack(Items.dye, stack size, dye ID)

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