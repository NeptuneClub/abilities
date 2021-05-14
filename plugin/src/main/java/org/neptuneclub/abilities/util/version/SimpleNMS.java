package org.neptuneclub.abilities.util.version;

import org.bukkit.Bukkit;
import org.neptuneclub.abilities.api.nms.NMSHandler;
import org.neptuneclub.abilities.api.service.IService;
import org.neptuneclub.abilities.nms.NMSHandler_1_8_R3;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.regex.Pattern;

public class SimpleNMS {

    private final String serverVersion;
    @Inject
    @Named("loader-service")
    private IService loaderService;
    private NMSHandler nmsHandler;

    public SimpleNMS() {
        this.serverVersion = Bukkit.getServer().getClass().getPackage().getName().split(Pattern.quote("."))[3];
    }

    public boolean enableNMS() {
        switch (serverVersion) {
            case "v1_8_R3":
                nmsHandler = new NMSHandler_1_8_R3();
                break;
            default:
                Bukkit
                        .getLogger()
                        .warning("you're current version isn't compatible with abilities plugin..");
                loaderService.interrupt();
                return false;
        }
        return true;
    }

    public String getVersion() {
        return serverVersion;
    }

    public NMSHandler getNMSHandler() {
        return nmsHandler;
    }
}
