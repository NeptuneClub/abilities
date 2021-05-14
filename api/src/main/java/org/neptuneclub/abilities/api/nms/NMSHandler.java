package org.neptuneclub.abilities.api.nms;

import org.bukkit.inventory.ItemStack;

/*
 * Credits: Special thanks to Javier (https://github.com/Espryth)
 * from there I got the name of the packages / classes and guided me in most of the NMS,
 * besides this thanks to iAlexT (https://github.com/iAlexT)
 * who was the one who explained me about packets and other things...
 *
 * Here https://www.spigotmc.org/threads/nms-tutorials-1-introduction-to-nms.204127/
 * I found an nms tutorial, which helped me to create them.
 *
 * Sincerely yours: vCamilo
 */

public interface NMSHandler {

    /**
     * <h3>Items builder</h3>
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

    ItemStack refillPotion(String name, String... lore);
}