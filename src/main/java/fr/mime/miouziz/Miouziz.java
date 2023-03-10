package fr.mime.miouziz;

import org.bukkit.plugin.java.JavaPlugin;

public final class Miouziz extends JavaPlugin {
    private static Miouziz INSTANCE;

    @Override
    public void onEnable() {
        // Plugin startup logic
        INSTANCE = this;
        log("Enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        log("Disabled!");
    }

    public void log(String msg) {
        getLogger().info(msg);
    }

    public static Miouziz getInstance() {
        return INSTANCE;
    }
}
