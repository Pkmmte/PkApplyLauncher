package com.pkmmte.applylauncher;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;

public class PkApplyLauncher
{
	// Launcher Type Constants
	public static final int NOVA = 0;
	public static final int APEX = 1;
	public static final int HOLO = 2;
	
	// Static Launcher Objects
	public static Launcher launcherNova = getNovaLauncher();
	public static Launcher launcherApex = getApexLauncher();
	public static Launcher launcherHolo = getHoloLauncher();
	
	// Static Launcher List
	public static List<Launcher> launcherList = getLauncherList();
	
	public static boolean applyLauncher(Launcher launcher, Activity activity, String packageName)
	{
		switch(launcher.getLauncher()) {
			case NOVA:
				Intent nova = new Intent(launcher.getAction());
				nova.setPackage(launcher.getPackage());
				nova.putExtra(launcher.getExtraAction("TYPE"), "GO");
				nova.putExtra(launcher.getExtraAction("PACKAGE"), packageName);
				nova.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				activity.startActivity(nova);
				
				return true;
			case APEX:
				Intent apex = new Intent(launcher.getAction());
				apex.setPackage(launcher.getPackage());
				apex.putExtra(launcher.getExtraAction("PACKAGE"), packageName);
				apex.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				activity.startActivity(apex);
				
				return true;
			case HOLO:
				Intent holo = new Intent(launcher.getAction());
				holo.setPackage(launcher.getPackage());
				holo.putExtra(launcher.getExtraAction("PACKAGE"), packageName);
				holo.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				activity.startActivity(holo);
				
				return true;
			default:
				// TODO Add Generic Apply Code
				return false;
		}
	}
	
	public static List<Launcher> getLauncherList()
	{
		List<Launcher> list = new ArrayList<Launcher>();
		list.add(launcherNova);
		list.add(launcherApex);
		list.add(launcherHolo);
		
		return list;
	}
	
	public static Launcher getNovaLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(NOVA);
		launcher.setName("Nova");
		launcher.setPackage("com.teslacoilsw.launcher");
		launcher.setAction("com.teslacoilsw.launcher.APPLY_ICON_THEME");
		launcher.setExtraAction("TYPE", "com.teslacoilsw.launcher.extra.ICON_THEME_TYPE");
		launcher.setExtraAction("PACKAGE", "com.teslacoilsw.launcher.extra.ICON_THEME_PACKAGE");
		
		return launcher;
	}
	
	public static Launcher getApexLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(APEX);
		launcher.setName("Apex");
		launcher.setPackage("com.anddoes.launcher");
		launcher.setAction("com.anddoes.launcher.SET_THEME");
		launcher.setExtraAction("PACKAGE", "com.anddoes.launcher.THEME_PACKAGE_NAME");
		
		return launcher;
	}
	
	public static Launcher getHoloLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(HOLO);
		launcher.setName("Holo");
		launcher.setPackage("com.mobint.hololauncher");
		launcher.setAction("com.mobint.hololauncher.SettingsActivity");
		launcher.setExtraAction("PACKAGE", "pkgname");
		
		return launcher;
	}
}