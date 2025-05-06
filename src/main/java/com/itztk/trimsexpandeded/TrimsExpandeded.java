package com.itztk.trimsexpandeded;

import com.itztk.trimsexpandeded.item.ModItems;
import com.itztk.trimsexpandeded.item.TrimsExpandededGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrimsExpandeded implements ModInitializer {
	public static final String MOD_ID = "trimsexpandeded";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		TrimsExpandededGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}