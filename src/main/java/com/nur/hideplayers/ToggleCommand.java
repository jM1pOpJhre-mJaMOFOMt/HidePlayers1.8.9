package com.nur.hideplayers;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;

public class ToggleCommand implements ICommand {
	private final ArrayList<String> comAliases = new ArrayList<String>();
	public ToggleCommand() {
		comAliases.add("ptoggle");
	}
	
	@Override
	public int compareTo(ICommand arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "playerstoggle";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getCommandAliases() {
		// TODO Auto-generated method stub
		return comAliases;
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		// TODO Auto-generated method stub
		ClientEventHandler.toggle();
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender sender) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		// TODO Auto-generated method stub
		return false;
	}
}

