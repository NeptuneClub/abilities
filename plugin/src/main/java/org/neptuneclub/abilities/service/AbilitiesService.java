package org.neptuneclub.abilities.service;

import me.yushust.inject.InjectAll;
import org.neptuneclub.abilities.api.service.IService;

import javax.inject.Named;

@InjectAll
public class AbilitiesService implements IService {

    @Named("listener-service")
    private IService listenerService;

    @Named("loader-service")
    private IService loaderService;

    public void start() {
        listenerService.start();
        loaderService.start();
    }

    public void interrupt() {

    }
}
