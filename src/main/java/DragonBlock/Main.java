package DragonBlock;


import DragonBlock.item.ItemBattleArmor;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "dbaf", name = "Dragon Block AF", version = "0.0.2:")
public class Main {

    //Items
    public static Item itemRamen;
    public static Item itemNimbusAF;

    //Armor
    public static Item battleArmorChest;
    public static Item battleArmorLegs;
    public static Item battleArmorBoots;

    public static final ItemArmor.ArmorMaterial battleArmorMaterial = EnumHelper.addArmorMaterial("battleArmorMaterial", 2500, new int[]{3,8,7,4}, 30);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //Items
        itemRamen = new ItemFood(10, 0.8F, false).setUnlocalizedName("ItemRamen").setTextureName("dbaf:itemramen").setCreativeTab(tabDragonBlockAF);

        //Battle Armor
        battleArmorChest = new ItemBattleArmor(battleArmorMaterial, 0, 1).setUnlocalizedName("ItemBattleArmorChest").setTextureName("dbaf:itemblackbattlearmor").setCreativeTab(tabDragonBlockAF);
        battleArmorLegs = new ItemBattleArmor(battleArmorMaterial, 0, 2).setUnlocalizedName("ItemBattleArmorLegs").setTextureName("dbaf:itemblackbattlearmorleggings").setCreativeTab(tabDragonBlockAF);
        battleArmorBoots = new ItemBattleArmor(battleArmorMaterial, 0, 3).setUnlocalizedName("ItemBattleArmorBoots").setTextureName("dbaf:itemblackbattlearmorboots").setCreativeTab(tabDragonBlockAF);

        //Item and block Registering
        GameRegistry.registerItem(itemRamen, itemRamen.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(battleArmorChest, battleArmorChest.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(battleArmorLegs, battleArmorLegs.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(battleArmorBoots, battleArmorBoots.getUnlocalizedName().substring(5));
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //Proxy, TileEntity, entity, GUI and packet registering.
        //Ramen Recipe
        GameRegistry.addRecipe(new ItemStack(itemRamen, 2), new Object[]{"WP ",
                                                                      " B ",
                                                                      "   ", 'W' , Items.wheat, 'P', Items.cooked_porkchop, 'B', Items.bowl});
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
    //Creative tab
    public static CreativeTabs tabDragonBlockAF = new CreativeTabs("tabDragonBlockAF"){
        @Override
        public Item getTabIconItem(){
            return new ItemStack(itemRamen).getItem();
        }
    };

}