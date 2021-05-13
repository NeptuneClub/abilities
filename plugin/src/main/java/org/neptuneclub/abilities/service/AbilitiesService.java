package org.neptuneclub.abilities.service;

import me.yushust.inject.InjectAll;
import org.neptuneclub.abilities.api.service.IService;

import javax.inject.Named;

@InjectAll
public class AbilitiesService implements IService {

    @Named("listener-service")
    private IService listenerService;

    public void start() {
        listenerService.start();
    }

    public void interrupt() {

    }
}
