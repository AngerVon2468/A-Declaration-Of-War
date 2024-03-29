package net.mavity.a_declaration_of_war.item;

import net.mavity.a_declaration_of_war.a_declaration_of_war;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(a_declaration_of_war.MODID);

    public static final DeferredItem<Item> A_Knife = ITEMS.register("a_knife",
            () -> new SwordItem(Tiers.IRON, 2, -2.4f,
                    new Item.Properties()));

    public static final DeferredItem<Item> ODM_GEAR_HANDLE = ITEMS.register("odm_gear_handle",
            () -> new SwordItem(Tiers.DIAMOND, 5, -2.4f,
                    new Item.Properties()));

    public static final DeferredItem<Item> ODM_GEAR_HANDLE_NS = ITEMS.register("odm_gear_handle_ns",
            () -> new SwordItem(Tiers.STONE, 0, -2.4f,
                    new Item.Properties()));

    public static final DeferredItem<Item> Key = ITEMS.register("key",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
