package com.lyttledev.lyttlenavigation.handlers;

import com.lyttledev.lyttlenavigation.LyttleNavigation;
import com.lyttledev.lyttleutils.utils.gameplay.ActionBar;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;

public class NavigationHandler implements Listener {
    private final LyttleNavigation plugin;

    public NavigationHandler(LyttleNavigation plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerItemHeldChange(PlayerItemHeldEvent event) {
        Player player = event.getPlayer();
        ItemStack heldItem = player.getInventory().getItem(event.getNewSlot());
        handleNavigationUpdate(player, heldItem, player.getInventory().getItemInOffHand());
    }

    @EventHandler
    public void onPlayerSwapHandItems(PlayerSwapHandItemsEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHand = event.getMainHandItem();
        ItemStack offHand = event.getOffHandItem();
        handleNavigationUpdate(player, mainHand, offHand);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!(event.getWhoClicked() instanceof Player player)) return;
        plugin.getServer().getScheduler().runTask(plugin, () -> {
            ItemStack mainHand = player.getInventory().getItemInMainHand();
            ItemStack offHand = player.getInventory().getItemInOffHand();
            handleNavigationUpdate(player, mainHand, offHand);
        });
    }

    @EventHandler
    public void onInventoryDrag(InventoryDragEvent event) {
        if (!(event.getWhoClicked() instanceof Player player)) return;
        plugin.getServer().getScheduler().runTask(plugin, () -> {
            ItemStack mainHand = player.getInventory().getItemInMainHand();
            ItemStack offHand = player.getInventory().getItemInOffHand();
            handleNavigationUpdate(player, mainHand, offHand);
        });
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event) {
        if (!(event.getPlayer() instanceof Player player)) return;
        plugin.getServer().getScheduler().runTask(plugin, () -> {
            ItemStack mainHand = player.getInventory().getItemInMainHand();
            ItemStack offHand = player.getInventory().getItemInOffHand();
            handleNavigationUpdate(player, mainHand, offHand);
        });
    }

    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event) {
        Player player = event.getPlayer();
        plugin.getServer().getScheduler().runTask(plugin, () -> {
            ItemStack mainHand = player.getInventory().getItemInMainHand();
            ItemStack offHand = player.getInventory().getItemInOffHand();
            handleNavigationUpdate(player, mainHand, offHand);
        });
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        ActionBar.setActionBar(false, player, null, plugin);
    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent event) {
        Player player = event.getPlayer();
        plugin.getServer().getScheduler().runTask(plugin, () -> {
            ItemStack mainHand = player.getInventory().getItemInMainHand();
            ItemStack offHand = player.getInventory().getItemInOffHand();
            handleNavigationUpdate(player, mainHand, offHand);
        });
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        ActionBar.setActionBar(false, player, null, plugin);
    }

    @EventHandler
    public void onPlayerChangedWorld(PlayerChangedWorldEvent event) {
        Player player = event.getPlayer();
        plugin.getServer().getScheduler().runTask(plugin, () -> {
            ItemStack mainHand = player.getInventory().getItemInMainHand();
            ItemStack offHand = player.getInventory().getItemInOffHand();
            handleNavigationUpdate(player, mainHand, offHand);
        });
    }

    @EventHandler
    public void onPlayerTeleport(PlayerTeleportEvent event) {
        Player player = event.getPlayer();
        plugin.getServer().getScheduler().runTask(plugin, () -> {
            ItemStack mainHand = player.getInventory().getItemInMainHand();
            ItemStack offHand = player.getInventory().getItemInOffHand();
            handleNavigationUpdate(player, mainHand, offHand);
        });
    }

    @EventHandler
    public void onPlayerGameModeChange(PlayerGameModeChangeEvent event) {
        Player player = event.getPlayer();
        plugin.getServer().getScheduler().runTask(plugin, () -> {
            ItemStack mainHand = player.getInventory().getItemInMainHand();
            ItemStack offHand = player.getInventory().getItemInOffHand();
            handleNavigationUpdate(player, mainHand, offHand);
        });
    }

    private void handleNavigationUpdate(Player player, ItemStack mainHand, ItemStack offHand) {
        boolean mainActive = isNavigationItem(mainHand);
        boolean offActive = isNavigationItem(offHand);

        if (mainActive) {
            handleNavigation(player, mainHand, "main hand");
        } else if (offActive) {
            handleNavigation(player, offHand, "off hand");
        } else {
            ActionBar.setActionBar(false, player, null, plugin);
        }
    }

    private boolean isNavigationItem(ItemStack item) {
        if (item == null) return false;
        Material type = item.getType();
        return type == Material.COMPASS || type == Material.CLOCK;
    }

    private void handleNavigation(Player player, ItemStack item, String hand) {
        Component message = plugin.miniMessage.deserialize(
                "<green>Navigation active! <yellow>Using " + item.getType().name().toLowerCase() + " in " + hand + ".</yellow>"
        );
        ActionBar.setActionBar(true, player, message, plugin);
    }
}