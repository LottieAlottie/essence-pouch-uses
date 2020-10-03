package com.lottiealottie.essencepouchuses;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class EssencePouchUsesPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(EssencePouchUsesPlugin.class);
		RuneLite.main(args);
	}
}