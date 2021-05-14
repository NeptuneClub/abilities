package org.neptuneclub.abilities.api.item;

import org.bukkit.inventory.ItemStack;

public class ItemUtil {

    private final ItemStack itemStack;
    private double awaitTime;

    /**
     * <h3>Item Util - Abilities constructor</h3>
     *
     * <p>Here you will find the way to build the abilities already created before, with the difference that you will
     * be able to get and set the waiting time.</p>
     *
     * @param itemStack The ItemStack, created earlier.
     * @param awaitTime cooldown you want to put on the ability
     * @see org.neptuneclub.abilities.api.nms.NMSHandler
     */

    public ItemUtil(ItemStack itemStack, double awaitTime) {
        this.itemStack = itemStack;
        this.awaitTime = awaitTime;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public double getAwaitTime() {
        return awaitTime;
    }

    public void setAwaitTime(double awaitTime) {
        this.awaitTime = awaitTime;
    }
}