package com.example.removespeedcap;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RemoveSpeedCapMod implements ModInitializer {
    public static final String MOD_ID = "remove-speed-cap";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Remove Speed Cap mod initialized - Player speed limits removed!");
    }
}