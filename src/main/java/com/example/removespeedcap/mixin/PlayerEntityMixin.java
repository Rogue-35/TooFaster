package com.example.removespeedcap.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {

    @ModifyVariable(
            method = "travel",
            at = @At("HEAD"),
            argsOnly = true,
            ordinal = 0
    )
    private Vec3d modifyMovementInput(Vec3d original) {
        // Remove all speed restrictions by returning the original input unchanged
        return original;
    }
}