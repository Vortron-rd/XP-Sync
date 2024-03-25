package com.vortron.xpsync;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;
import com.vortron.xpsync.xpsync;
@SuppressWarnings("unused")
@Mod.EventBusSubscriber
public class DimChangeEvent {
	@SubscribeEvent
	public static void playerChangedDimension(PlayerChangedDimensionEvent event) {
		//Force the client to sync xp by adding then removing 1 xp, a workaround for sure, but a solid one.
		EntityPlayer player = event.player;
		player.addExperience(1);
		player.addExperience(-1);
		xpsync.logger.info("Succsessfully synced XP");
		
	}

}
