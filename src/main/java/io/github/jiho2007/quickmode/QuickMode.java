package io.github.jiho2007.quickmode;

import io.github.jiho2007.quickmode.commands.RegisterCMD;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = QuickMode.MODID, version = QuickMode.VERSION, acceptedMinecraftVersions="[1.8.9]")
public class QuickMode {

    public static final String MODID = "QuickMode";
    public static final String VERSION = "1.0";

    @Mod.Instance
    private static QuickMode instance;

    private boolean isOn = true;
    private int tickDelay = 20;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {}

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        RegisterCMD.register();
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void setOn(boolean on) {
        this.isOn = on;
    }

    public int getTickDelay() {
        return this.tickDelay;
    }

    public void setTickDelay(int delay) {
        this.tickDelay = delay;
    }

    public static QuickMode getInstance() {
        return instance;
    }
}
