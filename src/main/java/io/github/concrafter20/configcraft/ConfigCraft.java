package io.github.concrafter20.configcraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class ConfigCraft implements ModInitializer {

	// Logger stuff
    public static final Logger LOGGER = LoggerFactory.getLogger("config-craft");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}