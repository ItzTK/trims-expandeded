package com.itztk.trimsexpandeded.item;

import com.itztk.trimsexpandeded.TrimsExpandeded;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TrimsExpandededGroups {
    private static final ItemGroup TRIMS_EXPANDEDED_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TrimsExpandeded.MOD_ID, "trimsexpandeded"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DANGER_SMITHING_TEMPALTE))
                    .displayName(Text.translatable("itemgroup.trimsexpandeded.trimsexpandeded"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DANGER_SMITHING_TEMPALTE);
                        entries.add(ModItems.DRIP_SMITHING_TEMPALTE);
                        entries.add(ModItems.HEART_SMITHING_TEMPALTE);
                        entries.add(ModItems.MARGIN_SMITHING_TEMPALTE);
                        entries.add(ModItems.PLATED_SMITHING_TEMPALTE);
                        entries.add(ModItems.PRIDE_SMITHING_TEMPALTE);
                        entries.add(ModItems.SHELL_SMITHING_TEMPALTE);
                        entries.add(ModItems.SUSPICIOUS_SMITHING_TEMPALTE);
                        entries.add(ModItems.VERDANT_SMITHING_TEMPALTE);

                    }).build());


    public static void registerItemGroups() {
        TrimsExpandeded.LOGGER.info("Registering Item Groups for " + TrimsExpandeded.MOD_ID);
    }
}