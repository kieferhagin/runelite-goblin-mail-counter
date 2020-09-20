package com.haginbros.goblinmail;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.ItemID;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Goblin Mail Counter"
)
public class GoblinMailPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private GoblinMailConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Example started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}

	@Subscribe
	public void onMenuOptionClicked(final MenuOptionClicked event)
	{
		log.info("Something Happened!");
		if (event.getId() == ItemID.GOBLIN_MAIL && event.getMenuOption().equals("Wear"))
		{
			log.info("You clicked the mail!");
		}
	}

	@Provides
	GoblinMailConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(GoblinMailConfig.class);
	}
}
