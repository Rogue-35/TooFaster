package com.example.removespeedcap.mixin;

import net.minecraft.server.network.ServerPlayNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerPlayNetworkHandler.class)
public class PlayerEntityMixin {

    @ModifyConstant(method = "*", constant = @Constant(floatValue = 100.0F), require = 0)
    private float getDefaultMaxPlayerSpeed(float speed) {
        return Float.MAX_VALUE;
    }

    @ModifyConstant(method = "*", constant = @Constant(floatValue = 300.0F), require = 0)
    private float getMaxPlayerElytraSpeed(float speed) {
        return Float.MAX_VALUE;
    }

    @ModifyConstant(method = "*", constant = @Constant(doubleValue = 100.0), require = 0)
    private double getMaxPlayerVehicleSpeed(double speed) {
        return Double.MAX_VALUE;
    }
}