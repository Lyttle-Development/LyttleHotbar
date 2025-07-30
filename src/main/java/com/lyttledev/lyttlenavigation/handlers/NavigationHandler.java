package com.lyttledev.lyttlenavigation.handlers;

import com.lyttledev.lyttlenavigation.LyttleNavigation;
import com.lyttledev.lyttleutils.utils.gameplay.ActionBar;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;

public class NavigationHandler implements Listener {
    private final LyttleNavigation plugin;

    public NavigationHandler(LyttleNavigation plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerItemHeldChange(PlayerItemHeldEvent event) {
        // Check if the held item is a compass
        ItemStack heldItem = event.getPlayer().getInventory().getItem(event.getNewSlot());
        Player player = event.getPlayer();

        if (player == null || heldItem == null) {
            // If player or item is null, clear the action bar
            ActionBar.setActionBar(false, player, null, plugin);
            return;
        }

        switch (heldItem.getType()) {
            case COMPASS:
            case CLOCK:
                handleNavigation(player, heldItem);
                break;
            default:
                ActionBar.setActionBar(false, player, null, plugin);
                break;
        }
    }

    private void handleNavigation(Player player, ItemStack item) {
        Component message = plugin.miniMessage.deserialize(
                "<green>Navigation active! <yellow>Using " + item.getType().name().toLowerCase() + ".</yellow>"
        );
        ActionBar.setActionBar(true, player, message, plugin);
    }
}