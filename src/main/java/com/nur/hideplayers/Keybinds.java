package com.nur.hideplayers;


import org.lwjgl.input.Keyboard;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class Keybinds {
    public static KeyBinding toggle;

    public static void register() {
        toggle = new KeyBinding("Toggle Player Visibility", Keyboard.KEY_Q, "Hide Players");
        ClientRegistry.registerKeyBinding(toggle);
    }
}
