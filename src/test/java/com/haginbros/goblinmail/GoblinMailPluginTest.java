package com.haginbros.goblinmail;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class GoblinMailPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(GoblinMailPlugin.class);
		RuneLite.main(args);
	}
}