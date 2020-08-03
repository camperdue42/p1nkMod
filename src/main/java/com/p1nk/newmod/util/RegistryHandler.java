package com.p1nk.newmod.util;

import com.p1nk.newmod.P1nkMain;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, P1nkMain.MOD_ID);

    //Items
    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife", ItemBase::new)
}
