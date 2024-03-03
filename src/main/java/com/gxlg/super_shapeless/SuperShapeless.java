package com.gxlg.super_shapeless;

import net.fabricmc.api.ClientModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SuperShapeless implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("super-shapeless");

	@Override
	public void onInitializeClient() {
		LOGGER.info("Hello World from Super Shapeless!");
	}
}