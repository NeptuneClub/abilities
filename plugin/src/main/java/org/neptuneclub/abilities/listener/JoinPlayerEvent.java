package org.neptuneclub.abilities.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.neptuneclub.abilities.api.item.ItemUtil;
import org.neptuneclub.abilities.util.version.SimpleNMS;

public class JoinPlayerEvent implements Listener {

    private final SimpleNMS simpleNMS = new SimpleNMS();

    private final ItemUtil itemUtil = new ItemUtil(simpleNMS
            .getNMSHandler()
            .angelGuardian("Angel Guardian", "this is an text"), 10);

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        player
                .getInventory()
                .addItem(itemUtil.getItemStack());
    }
}
