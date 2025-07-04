package net.marcant0z.marc_qol.item;

import net.marcant0z.marc_qol.MarcQoL;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MarcQoL.MOD_ID);

    public static final Supplier<CreativeModeTab> MARC_QOL_TAB =
            CREATIVE_MODE_TABS.register("marc_qol_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.marc_qol.marc_qol_tab"))
                    .icon(() -> new ItemStack(ModItems.PENGUINITE.get()))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PENGUINITE);
                        output.accept(ModItems.RAW_PENGUINITE);
                    })
                    .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
