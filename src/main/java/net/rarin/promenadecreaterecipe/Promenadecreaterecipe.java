package net.rarin.promenadecreaterecipe;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Promenadecreaterecipe implements ModInitializer {
	public static final String MOD_ID = "promenadecreaterecipe";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}