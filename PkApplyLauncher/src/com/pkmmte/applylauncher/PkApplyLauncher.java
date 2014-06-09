package com.pkmmte.applylauncher;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;

public class PkApplyLauncher
{
	// General Private Constants
	private static final String MARKET_URI = "market://details?id=";
	private static final String MARKET_URL = "https://play.google.com/store/apps/details?id=";
	private static final String PACKAGE_KEY = "PACKAGE";

	// Launcher Type Constants
	public static final int ACTION = 0;
	public static final int ADW = 1;
	public static final int APEX = 2;
	public static final int ATOM = 3;
	public static final int AVIATE = 4;
	public static final int GO = 5;
	public static final int HOLO = 6;
	public static final int INSPIRE = 7;
	public static final int NEXT = 8;
	public static final int NOVA = 9;
	public static final int SMART = 10;

	// Static Launcher Objects
	public static Launcher launcherAction  = getActionLauncher();
	public static Launcher launcherAdw  = getAdwLauncher();
	public static Launcher launcherApex = getApexLauncher();
	public static Launcher launcherAtom = getAtomLauncher();
	public static Launcher launcherAviate  = getAviateLauncher();
	public static Launcher launcherGo = getGoLauncher();
	public static Launcher launcherHolo = getHoloLauncher();
	public static Launcher launcherInspire  = getInspireLauncher();
	public static Launcher launcherNext = getNextLauncher();
	public static Launcher launcherNova = getNovaLauncher();
	public static Launcher launcherSmart  = getSmartLauncher();

	// Static Launcher List
	public static List<Launcher> launcherList = getLauncherList();

	public static boolean applyLauncher(Launcher launcher, Activity activity, String packageName)
	{
		switch(launcher.getLauncher()) {
			case ACTION:
				try {
					Intent action = activity.getPackageManager().getLaunchIntentForPackage(launcher.getPackage());
					if(action == null)
						return false;
					action.putExtra(launcher.getExtraString(PACKAGE_KEY), packageName);
					activity.startActivity(action);

					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case ADW:
				try {
					Intent adw = new Intent(launcher.getAction());
					adw.setPackage(launcher.getPackage());
					adw.putExtra(launcher.getExtraString(PACKAGE_KEY), packageName);
					adw.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(adw);

					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case ATOM:
				try {
					Intent atom = new Intent(launcher.getAction());
					atom.setPackage(launcher.getPackage());
					atom.putExtra(launcher.getExtraString(PACKAGE_KEY), packageName);
					atom.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(atom);

					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case AVIATE:
				try {
					Intent aviate = new Intent(launcher.getAction());
					aviate.setPackage(launcher.getPackage());
					aviate.putExtra(launcher.getExtraString(PACKAGE_KEY), packageName);
					aviate.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(aviate);

					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case GO:
				try {		
					Intent goApply = activity.getPackageManager().getLaunchIntentForPackage(launcher.getPackage());
					if(goApply == null)
						return false;
					Intent go = new Intent(launcher.getAction());
					go.putExtra("type", 1);
					go.putExtra(launcher.getExtraString(PACKAGE_KEY), packageName);
					activity.sendBroadcast(go);
					activity.startActivity(goApply);

					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case HOLO:
				try {
					Intent holo = new Intent(launcher.getAction());
					holo.setPackage(launcher.getPackage());
					holo.putExtra(launcher.getExtraString(PACKAGE_KEY), packageName);
					holo.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(holo);

					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case INSPIRE:
				try {
					Intent inspireMain = activity.getPackageManager().
						getLaunchIntentForPackage(launcher.getPackage());
					if(inspireMain == null)
						return false;
					Intent inspire = new Intent(launcher.getAction());
					inspire.putExtra(launcher.getExtraString(PACKAGE_KEY), packageName);
					activity.sendBroadcast(inspire);
					activity.startActivity(inspireMain);
					
					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case NEXT: 
				try {
					Intent nextApply = activity.getPackageManager().getLaunchIntentForPackage(launcher.getPackage());
					if(nextApply == null)
						return false;
					Intent next = new Intent(launcher.getAction());
					next.putExtra("type", 1);
					next.putExtra(launcher.getExtraString(PACKAGE_KEY), packageName);
					activity.sendBroadcast(next);
					activity.startActivity(nextApply);

					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case NOVA:
				try {
					Intent nova = new Intent(launcher.getAction());
					nova.setPackage(launcher.getPackage());
					nova.putExtra(launcher.getExtraString("TYPE"), "GO");
					nova.putExtra(launcher.getExtraString(PACKAGE_KEY), packageName);
					nova.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(nova);

					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case SMART:
				try {
					Intent smart = new Intent(launcher.getAction());
					smart.setPackage(launcher.getPackage());
					smart.putExtra(launcher.getExtraString(PACKAGE_KEY), packageName);
					smart.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(smart);

					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}

			default: // Generic Apply Code
				try {
					Intent generic = new Intent(launcher.getAction());
					generic.setPackage(launcher.getPackage());
					generic.putExtra(launcher.getExtraString(PACKAGE_KEY), packageName);
					generic.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(generic);

					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
		}
	}

	public static void launchPlayStore(Launcher launcher, Activity activity)
	{
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse(MARKET_URL + launcher.getPackage()));
		activity.startActivity(intent);
	}

	public static List<Launcher> getLauncherList()
	{
		List<Launcher> list = new ArrayList<Launcher>();
		list.add(launcherAction);
		list.add(launcherAdw);
		list.add(launcherApex);
		list.add(launcherAtom);
		list.add(launcherAviate);
		list.add(launcherInspire);
		list.add(launcherGo);
		list.add(launcherHolo);
		list.add(launcherNext);
		list.add(launcherNova);
		list.add(launcherSmart);

		return list;
	}

	public static Launcher getActionLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(ACTION);
		launcher.setName("Action");
		launcher.setPackage("com.actionlauncher.playstore");
		launcher.setAction("android.intent.action.MAIN");
		launcher.putExtra(PACKAGE_KEY, "apply_icon_pack");

		return launcher;
	}

	public static Launcher getAdwLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(ADW);
		launcher.setName("ADW");
		launcher.setPackage("org.adw.launcher");
		launcher.setAction("org.adw.launcher.SET_THEME");
		launcher.putExtra(PACKAGE_KEY, "org.adw.launcher.theme.NAME");

		return launcher;
	}

	public static Launcher getApexLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(APEX);
		launcher.setName("Apex");
		launcher.setPackage("com.anddoes.launcher");
		launcher.setAction("com.anddoes.launcher.SET_THEME");
		launcher.putExtra(PACKAGE_KEY, "com.anddoes.launcher.THEME_PACKAGE_NAME");

		return launcher;
	}

	public static Launcher getAtomLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(ATOM);
		launcher.setName("Atom");
		launcher.setPackage("com.dlto.atom.launcher");
		launcher.setAction("com.dlto.atom.launcher.intent.action.ACTION_VIEW_THEME_SETTINGS");
		launcher.putExtra(PACKAGE_KEY, "packageName");

		return launcher;
	}

	public static Launcher getAviateLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(AVIATE);
		launcher.setName("Aviate");
		launcher.setPackage("com.tul.aviate");
		launcher.setAction("com.tul.aviate.SET_THEME");
		launcher.putExtra(PACKAGE_KEY, "THEME_PACKAGE");

		return launcher;
	}

	public static Launcher getGoLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(GO);
		launcher.setName("Go");
		launcher.setPackage("com.gau.go.launcherex");
		launcher.setAction("com.gau.go.launcherex.MyThemes.mythemeaction");
		launcher.putExtra(PACKAGE_KEY, "pkgname");

		return launcher;
	}

	public static Launcher getHoloLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(HOLO);
		launcher.setName("Holo");
		launcher.setPackage("com.mobint.hololauncher");
		launcher.setAction("com.mobint.hololauncher.SettingsActivity");
		launcher.putExtra(PACKAGE_KEY, "pkgname");

		return launcher;
	}

	public static Launcher getInspireLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(INSPIRE);
		launcher.setName("Inspire");
		launcher.setPackage("com.bam.android.inspirelauncher");
		launcher.setAction("com.bam.android.inspirelauncher.action.ACTION_SET_THEME");
		launcher.putExtra(PACKAGE_KEY, "theme_name");

		return launcher;
	}

	public static Launcher getNextLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(NEXT);
		launcher.setName("Next");
		launcher.setPackage("com.gtp.nextlauncher");
		launcher.setAction("com.gau.go.launcherex.MyThemes.mythemeaction");
		launcher.putExtra(PACKAGE_KEY, "pkgname");

		return launcher;
	}

	public static Launcher getNovaLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(NOVA);
		launcher.setName("Nova");
		launcher.setPackage("com.teslacoilsw.launcher");
		launcher.setAction("com.teslacoilsw.launcher.APPLY_ICON_THEME");
		launcher.putExtra("TYPE", "com.teslacoilsw.launcher.extra.ICON_THEME_TYPE");
		launcher.putExtra(PACKAGE_KEY, "com.teslacoilsw.launcher.extra.ICON_THEME_PACKAGE");

		return launcher;
	}

	public static Launcher getSmartLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(SMART);
		launcher.setName("Smart");
		launcher.setPackage("ginlemon.flowerfree");
		launcher.setAction("ginlemon.smartlauncher.setGSLTHEME");
		launcher.putExtra(PACKAGE_KEY, "package");

		return launcher;
	}
}
