package net.marcant0z.marc_qol.item;

import net.marcant0z.marc_qol.MarcQoL;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS= DeferredRegister.createItems(MarcQoL.MOD_ID);

    public static final DeferredItem<Item> PENGUINITE = ITEMS.registerSimpleItem("penguinite");
    public static final DeferredItem<Item> RAW_PENGUINITE =
            ITEMS.registerItem("raw_penguinite", Item::new, new Item.Properties());



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus) ;
    }

}
