package com.demonwav.mcdev.platform.bukkit;

import com.demonwav.mcdev.resource.MinecraftProjectsIcons;

import com.intellij.openapi.module.ModuleTypeManager;

import javax.swing.Icon;

public class SpigotModuleType extends BukkitModuleType {

    private static final String ID = "SPIGOT_MODULE_TYPE";

    public SpigotModuleType() {
        super(ID);
    }

    public SpigotModuleType(String ID) {
        super(ID);
    }

    public static SpigotModuleType getInstance() {
        return (SpigotModuleType) ModuleTypeManager.getInstance().findByID(ID);
    }

    @Override
    public Icon getBigIcon() {
        return MinecraftProjectsIcons.SpigotBig;
    }

    @Override
    public Icon getIcon() {
        return MinecraftProjectsIcons.Spigot;
    }

    @Override
    public Icon getNodeIcon(@Deprecated boolean isOpened) {
        return MinecraftProjectsIcons.Spigot;
    }
}
