package org.neptuneclub.abilities.nms;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.neptuneclub.abilities.api.nms.NMSHandler;
import team.unnamed.gui.core.item.type.ItemBuilder;

public class NMSHandler_1_8_R3 implements NMSHandler {

    public ItemStack grapplingHook(String name, String... lore) {
        return ItemBuilder
                .newBuilder(Material.FISHING_ROD)
                .setName(name)
                .setLore(lore)
                .build();
    }

    public ItemStack rageBrick(String name, String... lore) {
        return ItemBuilder
                .newBuilder(Material.NETHER_BRICK_ITEM)
                .setName(name)
                .setLore(lore)
                .build();
    }


    public ItemStack rocketLauncher(String name, String... lore) {
        return ItemBuilder
                .newBuilder(Material.FIREWORK)
                .setName(name)
                .setLore(lore)
                .build();
    }


    public ItemStack swapperAxe(String name, String... lore) {
        return ItemBuilder
                .newBuilder(Material.GOLD_AXE)
                .setName(name)
                .setLore(lore)
                .build();
    }


    public ItemStack timeWarp(String name, String... lore) {
        return ItemBuilder
                .newBuilder(Material.PAPER)
                .setName(name)
                .setLore(lore)
                .build();
    }


    public ItemStack belchBomb(String name, String... lore) {
        return ItemBuilder
                .newBuilder(Material.SLIME_BALL)
                .setName(name)
                .setLore(lore)
                .build();
    }


    public ItemStack freezeGun(String name, String... lore) {
        return ItemBuilder
                .newBuilder(Material.DIAMOND_HOE)
                .setName(name)
                .setLore(lore)
                .build();
    }


    public ItemStack explosiveBow(String name, String... lore) {
        return ItemBuilder
                .newBuilder(Material.BOW)
                .setName(name)
                .setLore(lore)
                .build();
    }


    public ItemStack antiBuilder(String name, String... lore) {
        return null;
    }


    public ItemStack teleportationBall(String name, String... lore) {
        return null;
    }


    public ItemStack teleportationBow(String name, String... lore) {
        return null;
    }


    public ItemStack angelGuardian(String name, String... lore) {
        return null;
    }


    public ItemStack tntRain(String name, String... lore) {
        return null;
    }


    public ItemStack invisibilityRaid(String name, String... lore) {
        return null;
    }


    public ItemStack focusMode(String name, String... lore) {
        return null;
    }


    public ItemStack fakePearl(String name, String... lore) {
        return null;
    }


    public ItemStack antiFall(String name, String... lore) {
        return null;
    }


    public ItemStack effectDisabler(String name, String... lore) {
        return null;
    }


    public ItemStack antiTrapBeacon(String name, String... lore) {
        return null;
    }


    public ItemStack loggerBait(String name, String... lore) {
        return null;
    }


    public ItemStack explosiveEgg(String name, String... lore) {
        return null;
    }
}
