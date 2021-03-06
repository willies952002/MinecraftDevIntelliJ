package com.demonwav.mcdev.platform.sponge;

import com.demonwav.mcdev.platform.MinecraftModuleType;
import com.demonwav.mcdev.resource.MinecraftProjectsIcons;

import com.intellij.openapi.module.ModuleTypeManager;

import javax.swing.Icon;

public class SpongeModuleType extends MinecraftModuleType {

    private static final String ID = "SPONGE_MODULE_TYPE";

    public SpongeModuleType() {
        super(ID);
    }

    public static SpongeModuleType getInstance() {
        return (SpongeModuleType) ModuleTypeManager.getInstance().findByID(ID);
    }

    @Override
    public Icon getBigIcon() {
        return MinecraftProjectsIcons.SpongeBig;
    }

    @Override
    public Icon getIcon() {
        return MinecraftProjectsIcons.Sponge;
    }

    @Override
    public Icon getNodeIcon(@Deprecated boolean isOpened) {
        return MinecraftProjectsIcons.Sponge;
    }
}
