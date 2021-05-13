package org.neptuneclub.abilities.api.nms;

import org.bukkit.inventory.ItemStack;

public interface NMSHandler {

    /**
     * <h3>Items builder</h1>
     *
     * <p> Here, everything will return the value of the specified item converted into an ItemStack, for the versioning
     * of the different versions 1.8x up to 1.16.5. </p>
     *
     * @param name The name of the item
     * @param lore The lore of the item
     * @return The value of the constructed item.
     */

    ItemStack grapplingHook(String name, String... lore);

    ItemStack rageBrick(String name, String... lore);

    ItemStack rocketLauncher(String name, String... lore);

    ItemStack swapperAxe(String name, String... lore);

    ItemStack timeWarp(String name, String... lore);

    ItemStack belchBomb(String name, String... lore);

    ItemStack freezeGun(String name, String... lore);

    ItemStack explosiveBow(String name, String... lore);

    ItemStack antiBuilder(String name, String... lore);

    ItemStack teleportationBall(String name, String... lore);

    ItemStack teleportationBow(String name, String... lore);

    ItemStack angelGuardian(String name, String... lore);

    ItemStack tntRain(String name, String... lore);

    ItemStack invisibilityRaid(String name, String... lore);

    ItemStack focusMode(String name, String... lore);

    ItemStack fakePearl(String name, String... lore);

    ItemStack antiFall(String name, String... lore);

    ItemStack effectDisabler(String name, String... lore);

    ItemStack antiTrapBeacon(String name, String... lore);

    ItemStack loggerBait(String name, String... lore);

    ItemStack explosiveEgg(String name, String... lore);
}
