package DragonBlockAF.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelBattleArmor - By Paymon
 * Created using Tabula 4.1.1
 */
public class ModelBattleArmor extends ModelBiped
{
    public ModelRenderer rightleg;
    public ModelRenderer body;
    public ModelRenderer leftleg;

    public ModelBattleArmor() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.mirror = true;
        this.leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.05F);

        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.05F);

        this.body = new ModelRenderer(this, 16, 16);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.05F);

        this.bipedBody.addChild(body);
        this.bipedLeftLeg.addChild(leftleg);
        this.bipedRightLeg.addChild(rightleg);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.leftleg.render(f5);
        this.rightleg.render(f5);
        this.body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
