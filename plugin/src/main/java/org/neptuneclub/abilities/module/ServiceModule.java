package org.neptuneclub.abilities.module;

import me.yushust.inject.AbstractModule;
import org.neptuneclub.abilities.api.service.IService;
import org.neptuneclub.abilities.service.AbilitiesService;
import org.neptuneclub.abilities.service.sub.ListenerService;

public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(IService.class).named("abilities-service").to(AbilitiesService.class).singleton();
        bind(IService.class).named("listener-service").to(ListenerService.class).singleton();
    }
}
