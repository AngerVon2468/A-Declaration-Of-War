package net.mavity.a_declaration_of_war.item;

import net.mavity.a_declaration_of_war.a_declaration_of_war;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(a_declaration_of_war.MODID);

    public static final DeferredItem<Item> A_Knife = ITEMS.register("a_knife",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
