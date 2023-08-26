package net.thep2wking.oedldoedlcuriosity.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlcore.util.ModReferences;
import net.thep2wking.oedldoedlcuriosity.OedldoedlCuriosity;
import net.thep2wking.oedldoedlcuriosity.config.categories.Content;
import net.thep2wking.oedldoedlcuriosity.config.categories.Properties;
import net.thep2wking.oedldoedlcuriosity.config.categories.Recipes;

@Config(modid = OedldoedlCuriosity.MODID, name = ModReferences.BASE_MODID + "/"
        + OedldoedlCuriosity.MODID, category = OedldoedlCuriosity.MODID)
public class CuriosityConfig {
    @Config.Name("content")
    public static final Content CONTENT = new Content();

    @Config.Name("properties")
    public static final Properties PROPERTIES = new Properties();

    @Config.Name("recipes")
    public static final Recipes RECIPES = new Recipes();
    
    @Mod.EventBusSubscriber
    public static class ConfigHolder {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(OedldoedlCuriosity.MODID)) {
                ConfigManager.sync(OedldoedlCuriosity.MODID, Config.Type.INSTANCE);
            }
        }
    }
}