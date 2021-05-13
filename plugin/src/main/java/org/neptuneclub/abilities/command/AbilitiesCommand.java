package org.neptuneclub.abilities.command;

import me.fixeddev.commandflow.annotated.CommandClass;
import me.fixeddev.commandflow.annotated.annotation.Command;
import me.fixeddev.commandflow.bukkit.annotation.Sender;
import org.bukkit.entity.Player;

@Command(names = {"abilities", "ability"}, permission = "abilities.*")
public class AbilitiesCommand implements CommandClass {

    @Command(names = {"give", "add"})
    public boolean giveAbilities(@Sender Player player, String abilitiesName, int quantity) {
        return true;
    }

    @Command(names = {"remove", "rest"})
    public boolean removeAbilities(@Sender Player player, String abilitiesName, int quantity) {
        return true;
    }
}
