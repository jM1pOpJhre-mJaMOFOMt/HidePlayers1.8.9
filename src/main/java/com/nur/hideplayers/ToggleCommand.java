package com.nur.hideplayers;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;

import java.util.Collections;
import java.util.List;

public class ToggleCommand implements ICommand {
    private final List<String> comAliases = Collections.singletonList("ptoggle");

    @Override
    public int compareTo(ICommand arg0) {
        return 0;
    }

    @Override
    public String getCommandName() {
        return "playerstoggle";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "playerstoggle";
    }

    @Override
    public List<String> getCommandAliases() {
        return comAliases;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        ClientEventHandler.toggle();
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }
}

