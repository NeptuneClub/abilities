package org.neptuneclub.abilities.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class TestEvent implements Listener {

    @EventHandler
    public void aea(EntityDamageByEntityEvent event) {
        Player player = (Player) event.getEntity();

        player.sendMessage(event.getDamager().getName() + " is hitting you!");
    }
}
