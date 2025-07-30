package com.lyttledev.lyttlenavigation;

import com.lyttledev.lyttlenavigation.commands.LyttleNavigationCommand;
import com.lyttledev.lyttlenavigation.handlers.NavigationHandler;
import com.lyttledev.lyttlenavigation.types.Configs;
import com.lyttledev.lyttlenavigation.utils.MaterialExporter;
import com.lyttledev.lyttleutils.utils.communication.Console;
import com.lyttledev.lyttleutils.utils.communication.Message;
import com.lyttledev.lyttleutils.utils.storage.GlobalConfig;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class LyttleNavigation extends JavaPlugin {
    public Configs config;
    public Console console;
    public Message message;
    public GlobalConfig global;
    public NavigationHandler compassHandler;
    public MiniMessage miniMessage = MiniMessage.miniMessage();

    @Override
    public void onEnable() {
        saveDefaultConfig();
        // Setup config after creating the configs
        this.config = new Configs(this);
        this.global = new GlobalConfig(this);
        // Migrate config
        migrateConfig();

        // Plugin startup logic
        this.console = new Console(this);
        this.message = new Message(this, config.messages, global);

        // Commands
        new LyttleNavigationCommand(this);

        // Handlers
        this.compassHandler = new NavigationHandler(this);

        // Export Material list on plugin startup (only if file doesn't exist)
        File materialsFile = new File(getDataFolder(), "../resources/available_materials.txt");
        try {
            if (!materialsFile.exists()) {
                MaterialExporter.exportMaterials(materialsFile);
                getLogger().info("Exported available_materials.txt with all Material types.");
            }
        } catch (IOException e) {
            getLogger().warning("Failed to export available_materials.txt: " + e.getMessage());
        }
    }

    @Override
    public void saveDefaultConfig() {
        String configPath = "config.yml";
        if (!new File(getDataFolder(), configPath).exists())
            saveResource(configPath, false);

        String messagesPath = "messages.yml";
        if (!new File(getDataFolder(), messagesPath).exists())
            saveResource(messagesPath, false);

        // Defaults:
        String defaultPath = "#defaults/";
        String defaultGeneralPath = defaultPath + configPath;
        saveResource(defaultGeneralPath, true);

        String defaultMessagesPath = defaultPath + messagesPath;
        saveResource(defaultMessagesPath, true);
    }

    private void migrateConfig() {
        if (!config.general.contains("config_version")) {
            config.general.set("config_version", 0);
        }

        switch (config.general.get("config_version").toString()) {
            case "0":
                // Migrate config entries.
                config.general.set("nametag", config.messages.get("nametag"));
                config.messages.remove("nametag");

                // Update config version.
                config.general.set("config_version", 1);

                // Recheck if the config is fully migrated.
                migrateConfig();
                break;
            default:
                break;
        }
    }
}
