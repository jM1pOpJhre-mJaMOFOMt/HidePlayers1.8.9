package com.nur.hideplayers;


import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class ClientEventHandler {
	static boolean hidden = false;
	public static void toggle() {
		hidden=!hidden;
		if(hidden) {
			//Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(""+EnumChatFormatting.RED+"Players are now hidden."));
			Minecraft.getMinecraft().ingameGUI.setRecordPlaying(new ChatComponentText(""+EnumChatFormatting.RED+"Players are now hidden."), true);
		}
		else {
			//Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(""+EnumChatFormatting.GREEN+"Players are now visible."));
			Minecraft.getMinecraft().ingameGUI.setRecordPlaying(new ChatComponentText(""+EnumChatFormatting.GREEN+"Players are now visible."), true);
		}
	}
	@SubscribeEvent
    public void onKeyInput(KeyInputEvent event)
    {
		if (Keybinds.toggle.isPressed()) toggle();
    }
	@SubscribeEvent
	public void pre(RenderPlayerEvent.Pre event) {
		if(hidden) {
			event.setCanceled(true);
		}
	}
}
