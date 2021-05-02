package DragonBlockAF.objects.armor;

import DragonBlockAF.models.ModelBattleArmor;
import DragonBlockAF.proxy.ClientProxy;
import DragonBlockAF.util.reference;
import DragonBlockAF.util.resource;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorBase extends ItemArmor 
{

    public ArmorBase(ArmorMaterial material, int renderIndex, int type)
    {
        super(material, renderIndex, type);

        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", resource.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        //item.dbcaf:battleArmorBlack_chest
        return String.format("item.%s%s", resource.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        this.itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf('.') + 1));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel (EntityLivingBase entityLiving, ItemStack itemstack, int armorSlot)
    {
            ModelBiped armorModels = ClientProxy.armorModels.get(this);

        if(armorModels != null)
        {
            armorModels.bipedBody.showModel = armorSlot == 1 || armorSlot ==2;
            armorModels.bipedRightLeg.showModel = armorSlot  == 2 || armorSlot  == 3;
            armorModels.bipedLeftLeg.showModel = armorSlot  == 2 || armorSlot  == 3;

            armorModels.isSneak = entityLiving.isSneaking();
            armorModels.isRiding = entityLiving.isRiding();
            armorModels.isChild = entityLiving.isChild();

            armorModels.heldItemRight = 0;
            armorModels.aimedBow = false;

            EntityPlayer player = (EntityPlayer)entityLiving;

            ItemStack held_item = player.getEquipmentInSlot(0);

            if (held_item != null){
                armorModels.heldItemRight = 1;

                if (player.getItemInUseCount() > 0){

                    EnumAction enumaction = held_item.getItemUseAction();

                    if (enumaction == EnumAction.bow){
                        armorModels.aimedBow = true;
                    }else if (enumaction == EnumAction.block){
                        armorModels.heldItemRight = 3;
                    }
                }
            }
        }

        return armorModels;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
    {
        String name = this.getUnwrappedUnlocalizedName(super.getUnlocalizedName());
        name = name.substring(0, name.indexOf('_'));

        //MODID:textures/models/armor/..../.png
        //(IE) dbcaf:textures/models/armor/battleArmorBlack_layer_1.png
        return String.format("%s:textures/models/armor/%s_layer_%d.png", reference.MODID, name, slot == 2 ? 2 : 1);
    }

}