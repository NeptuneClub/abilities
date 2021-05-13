package org.neptuneclub.abilities.module;

import me.yushust.inject.AbstractModule;
import org.bukkit.plugin.java.JavaPlugin;
import org.neptuneclub.abilities.Abilities;

public class AbilitiesModule extends AbstractModule {

    private final Abilities abilities;

    public AbilitiesModule(Abilities abilities) {
        this.abilities = abilities;
    }

    @Override
    protected void configure() {
        install(new ServiceModule());

        bind(Abilities.class).toInstance(abilities);
        bind(JavaPlugin.class).to(Abilities.class).singleton();
    }
}
