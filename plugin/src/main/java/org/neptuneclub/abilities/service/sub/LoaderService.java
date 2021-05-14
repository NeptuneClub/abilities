package org.neptuneclub.abilities.service.sub;

import me.yushust.inject.InjectAll;
import org.bukkit.Bukkit;
import org.neptuneclub.abilities.Abilities;
import org.neptuneclub.abilities.api.service.IService;
import org.neptuneclub.abilities.util.version.SimpleNMS;

@InjectAll
public class LoaderService implements IService {

    private Abilities abilities;
    private SimpleNMS simpleNMS;

    public void start() {
        simpleNMS.enableNMS();
    }

    public void interrupt() {
        Bukkit
                .getLogger()
                .info(simpleNMS.getVersion() + " version has been disabled");
        Bukkit.getPluginManager().disablePlugin(abilities);
    }
}
