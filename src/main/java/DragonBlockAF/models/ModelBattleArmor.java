package DragonBlockAF.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelBipedDBC - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class ModelBattleArmor extends ModelBiped
{
    public ModelRenderer rightleg;
    public ModelRenderer body;
    public ModelRenderer leftleg;

    public ModelBattleArmor(float expand) {
        super(expand, 0, 64, 64);

        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.mirror = true;
        this.leftleg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, expand);

        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, expand);

        this.body = new ModelRenderer(this, 16, 16);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, expand);

        this.bipedBody.addChild(body);
        this.bipedRightLeg.addChild(rightleg);
        this.bipedLeftLeg.addChild(leftleg);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        super.render(entity,f,f1,f2,f3,f4,f5);
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
