package com.itztk.trimsexpandeded.item;

import com.itztk.trimsexpandeded.TrimsExpandeded;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item DANGER_SMITHING_TEMPALTE = registerItem("danger_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(TrimsExpandeded.MOD_ID, "danger"), FeatureFlags.VANILLA));
    public static final Item DRIP_SMITHING_TEMPALTE = registerItem("drip_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(TrimsExpandeded.MOD_ID, "drip"), FeatureFlags.VANILLA));
    public static final Item HEART_SMITHING_TEMPALTE = registerItem("heart_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(TrimsExpandeded.MOD_ID, "heart"), FeatureFlags.VANILLA));
    public static final Item MARGIN_SMITHING_TEMPALTE = registerItem("margin_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(TrimsExpandeded.MOD_ID, "margin"), FeatureFlags.VANILLA));
    public static final Item PLATED_SMITHING_TEMPALTE = registerItem("plated_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(TrimsExpandeded.MOD_ID, "plated"), FeatureFlags.VANILLA));
    public static final Item PRIDE_SMITHING_TEMPALTE = registerItem("pride_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(TrimsExpandeded.MOD_ID, "pride"), FeatureFlags.VANILLA));
    public static final Item SHELL_SMITHING_TEMPALTE = registerItem("shell_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(TrimsExpandeded.MOD_ID, "shell"), FeatureFlags.VANILLA));
    public static final Item SUSPICIOUS_SMITHING_TEMPALTE = registerItem("suspicious_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(TrimsExpandeded.MOD_ID, "suspicious"), FeatureFlags.VANILLA));
    public static final Item VERDANT_SMITHING_TEMPALTE = registerItem("verdant_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(TrimsExpandeded.MOD_ID, "verdant"), FeatureFlags.VANILLA));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TrimsExpandeded.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TrimsExpandeded.LOGGER.info("Registering Mod Items for " + TrimsExpandeded.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}
