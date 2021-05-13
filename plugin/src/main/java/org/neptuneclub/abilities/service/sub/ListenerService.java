package org.neptuneclub.abilities.service.sub;

import me.yushust.inject.InjectAll;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.neptuneclub.abilities.Abilities;
import org.neptuneclub.abilities.api.service.IService;
import org.neptuneclub.abilities.listener.TestEvent;

import java.util.Arrays;

@InjectAll
public class ListenerService implements IService {

    private Abilities abilities;

    private TestEvent testEvent;

    public void start() {
        registerListener(
                testEvent
        );
    }

    public void interrupt() {
        Bukkit
                .getLogger()
                .info("All listeners has been disabled");
    }

    private void registerListener(Listener... listeners) {
        Arrays.stream(listeners)
                .forEach(listener -> Bukkit
                        .getPluginManager()
                        .registerEvents(listener, abilities));
    }
}
