package com.vortron.xpsync;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = xpsync.MODID, name = xpsync.NAME, version = xpsync.VERSION)
public class xpsync
{
    public static final String MODID = "xpsync";
    public static final String NAME = "XP-Sync";
    public static final String VERSION = "1.0";
    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
     logger = event.getModLog();
         
    }
}
