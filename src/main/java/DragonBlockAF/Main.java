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

    //Black Armors
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
    public static Item battleArmorBlackRed_chest;
    public static Item battleArmorBlackRed_leggings;
    public static Item battleArmorBlackRed_boots;
    public static Item battleArmorBlackBrown_chest;
    public static Item battleArmorBlackBrown_leggings;
    public static Item battleArmorBlackBrown_boots;
    public static Item battleArmorBlackLime_chest;
    public static Item battleArmorBlackLime_leggings;
    public static Item battleArmorBlackLime_boots;
    public static Item battleArmorBlackGreen_chest;
    public static Item battleArmorBlackGreen_leggings;
    public static Item battleArmorBlackGreen_boots;
    public static Item battleArmorBlackLightBlue_chest;
    public static Item battleArmorBlackLightBlue_leggings;
    public static Item battleArmorBlackLightBlue_boots;
    public static Item battleArmorBlackCyan_chest;
    public static Item battleArmorBlackCyan_leggings;
    public static Item battleArmorBlackCyan_boots;
    public static Item battleArmorBlackBlue_chest;
    public static Item battleArmorBlackBlue_leggings;
    public static Item battleArmorBlackBlue_boots;
    public static Item battleArmorBlackPink_chest;
    public static Item battleArmorBlackPink_leggings;
    public static Item battleArmorBlackPink_boots;
    public static Item battleArmorBlackMagenta_chest;
    public static Item battleArmorBlackMagenta_leggings;
    public static Item battleArmorBlackMagenta_boots;
    public static Item battleArmorBlackPurple_chest;
    public static Item battleArmorBlackPurple_leggings;
    public static Item battleArmorBlackPurple_boots;

    //White Armors

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