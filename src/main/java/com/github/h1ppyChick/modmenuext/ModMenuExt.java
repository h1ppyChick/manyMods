package com.github.h1ppyChick.modmenuext;

import com.github.h1ppyChick.modmenuext.util.Log;
import net.fabricmc.api.ModInitializer;
import net.minecraft.text.TranslatableText;
/**
 * 
 * @author H1ppyChick
 * @since 08/11/2020
 * 
 * See README.md
 */
public class ModMenuExt implements ModInitializer {
	/***************************************************
	 *              CONSTANTS
	 **************************************************/
	public static final String MOD_ID = "modmenuext";
	public static final String LOAD_JAR_DIR = "loadedJars/";
	public static final String CONFIG_DIR = "config/";
	public static final String MM_PARENT_KEY = "modmenu:parent";
	public static final TranslatableText TEXT_SUCCESS = new TranslatableText(MOD_ID + ".success");
	public static final TranslatableText TEXT_ERROR = new TranslatableText(MOD_ID + ".error");
	public static final TranslatableText TEXT_WARNING = new TranslatableText(MOD_ID + ".warning");
	public static final TranslatableText TEXT_RESTART = new TranslatableText(MOD_ID + ".restart");
	public static final TranslatableText TEXT_NOT_IMPL = new TranslatableText(MOD_ID + ".notimpl");
	/***************************************************
	 *              INSTANCE VARIABLES
	 **************************************************/
	private static Log LOG = new Log("ModMenuExt");
	@Override
	public void onInitialize() {
		LOG.enter("onInitialize");
		// No mod setup currently
		LOG.exit("onInitialize");
	}
}
