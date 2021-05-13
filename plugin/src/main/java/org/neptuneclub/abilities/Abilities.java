package org.neptuneclub.abilities;

import me.yushust.inject.Injector;
import org.bukkit.plugin.java.JavaPlugin;
import org.neptuneclub.abilities.api.service.IService;
import org.neptuneclub.abilities.module.AbilitiesModule;

import javax.inject.Inject;
import javax.inject.Named;

public class Abilities extends JavaPlugin {

    @Inject
    @Named("abilities-service")
    private IService abilitiesService;

    public void onEnable() {
        Injector injector = Injector.create(new AbilitiesModule(this));
        injector.injectMembers(this);

        abilitiesService.start();
    }
}
