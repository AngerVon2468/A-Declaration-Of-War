package net.mavity.a_declaration_of_war.event;

import net.minecraft.network.chat.Component;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.TickEvent;

public class ModEvents {
    @SubscribeEvent
    public void tests(TickEvent.PlayerTickEvent event) {
        //You can run whatever code you want to here, use this later
    }
}
