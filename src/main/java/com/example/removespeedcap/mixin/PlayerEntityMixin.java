package com.example.removespeedcap.mixin;

import net.minecraft.server.network.ServerPlayNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerPlayNetworkHandler.class)
public class PlayerEntityMixin {
    private static final float VERY_HIGH_SPEED = 1000000.0F;
    private static final double VERY_HIGH_SPEED_DOUBLE = 1000000.0;

    @ModifyConstant(method = "processPlayer", constant = @Constant(floatValue = 100.0F))
    private float removePlayerSpeedLimit(float original) {
        return VERY_HIGH_SPEED;
    }

    @ModifyConstant(method = "processPlayer", constant = @Constant(floatValue = 300.0F))
    private float removeElytraSpeedLimit(float original) {
        return VERY_HIGH_SPEED;
    }

    @ModifyConstant(method = "processVehicleMove", constant = @Constant(doubleValue = 100.0))
    private double removeVehicleSpeedLimit(double original) {
        return VERY_HIGH_SPEED_DOUBLE;
    }
}
