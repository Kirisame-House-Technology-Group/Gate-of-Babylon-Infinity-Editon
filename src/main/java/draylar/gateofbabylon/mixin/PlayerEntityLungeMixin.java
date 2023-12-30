package draylar.gateofbabylon.mixin;

import draylar.gateofbabylon.api.LungeManipulator;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityLungeMixin extends LivingEntity implements LungeManipulator {

    @Unique
    private boolean gob_hasLunged = false;

    protected PlayerEntityLungeMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(
            method = "tick",
            at = @At("HEAD")
    )
    private void onTick(CallbackInfo ci) {
        if (gob_hasLunged && isOnGround()) {
            gob_hasLunged = false;
        }
    }

    @Override
    public void gate_of_babylon_1_18_2$setLunged() {
        gob_hasLunged = true;
    }

    @Override
    public boolean gate_of_babylon_1_18_2$canLunge() {
        return !gob_hasLunged;
    }
}
