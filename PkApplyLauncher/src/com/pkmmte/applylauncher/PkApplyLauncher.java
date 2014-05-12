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
	
	// Launcher Type Constants
	public static final int NOVA = 0;
	public static final int APEX = 1;
	public static final int HOLO = 2;
	public static final int ADW = 3;
	public static final int ACTION = 4;
	public static final int AVIATE = 5;
	public static final int INSPIRE = 6;
	public static final int SMART = 7;
	public static final int ATOM = 8;
	public static final int GO = 9;
	public static final int NEXT = 10;
	
	// Static Launcher Objects
	public static Launcher launcherNova = getNovaLauncher();
	public static Launcher launcherApex = getApexLauncher();
	public static Launcher launcherHolo = getHoloLauncher();
	public static Launcher launcherAdw  = getAdwLauncher();
	public static Launcher launcherAction  = getActionLauncher();
	public static Launcher launcherAviate  = getAviateLauncher();
	public static Launcher launcherInspire  = getInspireLauncher();
	public static Launcher launcherSmart  = getSmartLauncher();
	public static Launcher launcherAtom = getAtomLauncher();
	public static Launcher launcherGo = getGoLauncher();
	public static Launcher launcherNext = getNextLauncher();
	
	// Static Launcher List
	public static List<Launcher> launcherList = getLauncherList();
	
	public static boolean applyLauncher(Launcher launcher, Activity activity, String packageName)
	{
		switch(launcher.getLauncher()) {
			case NOVA:
				try {
					Intent nova = new Intent(launcher.getAction());
					nova.setPackage(launcher.getPackage());
					nova.putExtra(launcher.getExtraString("TYPE"), "GO");
					nova.putExtra(launcher.getExtraString("PACKAGE"), packageName);
					nova.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(nova);

					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case APEX:
				try {
					Intent apex = new Intent(launcher.getAction());
					apex.setPackage(launcher.getPackage());
					apex.putExtra(launcher.getExtraString("PACKAGE"), packageName);
					apex.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(apex);
					
					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case HOLO:
				try {
					Intent holo = new Intent(launcher.getAction());
					holo.setPackage(launcher.getPackage());
					holo.putExtra(launcher.getExtraString("PACKAGE"), packageName);
					holo.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(holo);
					
					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case ADW:
				try {
					Intent adw = new Intent(launcher.getAction());
					adw.setPackage(launcher.getPackage());
					adw.putExtra(launcher.getExtraString("PACKAGE"), packageName);
					adw.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(adw);
					
					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case ACTION:
				try {
					Intent action = activity.getPackageManager().getLaunchIntentForPackage(launcher.getPackage());
					action.putExtra(launcher.getExtraString("PACKAGE"), packageName);
					activity.startActivity(action);
					
					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case AVIATE:
				try {
					Intent aviate = new Intent(launcher.getAction());
					aviate.setPackage(launcher.getPackage());
					aviate.putExtra(launcher.getExtraString("PACKAGE"), packageName);
					aviate.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(aviate);
					
					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case INSPIRE:
				try {
					Intent inspire = new Intent(launcher.getAction());
					inspire.setPackage(launcher.getPackage());
					inspire.putExtra(launcher.getExtraString("PACKAGE"), packageName);
					inspire.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(inspire);
					
					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case SMART:
				try {
					Intent smart = new Intent(launcher.getAction());
					smart.setPackage(launcher.getPackage());
					smart.putExtra(launcher.getExtraString("PACKAGE"), packageName);
					smart.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(smart);
					
					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case ATOM:
				try {
					Intent atom = new Intent(launcher.getAction());
					atom.setPackage(launcher.getPackage());
					atom.putExtra(launcher.getExtraString("PACKAGE"), packageName);
					atom.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(atom);
					
					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case GO:
				try {
					Intent go = activity.getPackageManager().getLaunchIntentForPackage(launcher.getPackage());
					go.putExtra(launcher.getExtraString("PACKAGE"), packageName);
					go.putExtra("type", 1);
					activity.startActivity(go);
					
					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			case NEXT:
				try {
					Intent next = new Intent(launcher.getAction());
					next.setPackage(launcher.getPackage());
					next.putExtra(launcher.getExtraString("PACKAGE"), packageName);
					next.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					activity.startActivity(next);
					
					return true;
				}
				catch(ActivityNotFoundException e) {
					return false;
				}
			default: // Generic Apply Code
				try {
					Intent generic = new Intent(launcher.getAction());
					generic.setPackage(launcher.getPackage());
					generic.putExtra(launcher.getExtraString("PACKAGE"), packageName);
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
		intent.setData(Uri.parse(MARKET_URI + launcher.getPackage()));
		activity.startActivity(intent);
	}
	
	public static List<Launcher> getLauncherList()
	{
		List<Launcher> list = new ArrayList<Launcher>();
		list.add(launcherNova);
		list.add(launcherApex);
		list.add(launcherHolo);
		list.add(launcherAdw);
		list.add(launcherAction);
		list.add(launcherAviate);
		list.add(launcherInspire);
		list.add(launcherSmart);
		list.add(launcherAtom);
		list.add(launcherGo);
		list.add(launcherNext);
		
		return list;
	}
	
	public static Launcher getNovaLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(NOVA);
		launcher.setName("Nova");
		launcher.setPackage("com.teslacoilsw.launcher");
		launcher.setAction("com.teslacoilsw.launcher.APPLY_ICON_THEME");
		launcher.putExtra("TYPE", "com.teslacoilsw.launcher.extra.ICON_THEME_TYPE");
		launcher.putExtra("PACKAGE", "com.teslacoilsw.launcher.extra.ICON_THEME_PACKAGE");
		
		return launcher;
	}
	
	public static Launcher getApexLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(APEX);
		launcher.setName("Apex");
		launcher.setPackage("com.anddoes.launcher");
		launcher.setAction("com.anddoes.launcher.SET_THEME");
		launcher.putExtra("PACKAGE", "com.anddoes.launcher.THEME_PACKAGE_NAME");
		
		return launcher;
	}
	
	public static Launcher getHoloLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(HOLO);
		launcher.setName("Holo");
		launcher.setPackage("com.mobint.hololauncher");
		launcher.setAction("com.mobint.hololauncher.SettingsActivity");
		launcher.putExtra("PACKAGE", "pkgname");
		
		return launcher;
	}
	
	public static Launcher getAdwLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(ADW);
		launcher.setName("ADW");
		launcher.setPackage("org.adw.launcher");
		launcher.setAction("org.adw.launcher.SET_THEME");
		launcher.putExtra("PACKAGE", "org.adw.launcher.theme.NAME");
		
		return launcher;
	}
	
	public static Launcher getActionLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(ACTION);
		launcher.setName("Action");
		launcher.setPackage("com.actionlauncher.playstore");
		launcher.setAction("android.intent.action.MAIN"); // TODO TEST THROUGHOULY
		launcher.putExtra("PACKAGE", "apply_icon_pack");
		
		return launcher;
	}
	
	public static Launcher getAviateLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(AVIATE);
		launcher.setName("Aviate");
		launcher.setPackage("com.tul.aviate");
		launcher.setAction("com.tul.aviate.SET_THEME");
		launcher.putExtra("PACKAGE", "THEME_PACKAGE");
		
		return launcher;
	}
	
	public static Launcher getInspireLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(INSPIRE);
		launcher.setName("Inspire");
		launcher.setPackage("com.bam.android.inspirelauncher");
		launcher.setAction("com.bam.android.inspirelauncher.action.ACTION_SET_THEME");
		launcher.putExtra("PACKAGE", "theme_name");
		
		return launcher;
	}
	
	public static Launcher getSmartLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(SMART);
		launcher.setName("Smart");
		launcher.setPackage("ginlemon.flowerfree");
		launcher.setAction("ginlemon.smartlauncher.setGSLTHEME");
		launcher.putExtra("PACKAGE", "package");
		
		return launcher;
	}
	
	public static Launcher getAtomLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(ATOM);
		launcher.setName("Atom");
		launcher.setPackage("com.dlto.atom.launcher");
		launcher.setAction("com.dlto.atom.launcher.intent.action.ACTION_VIEW_THEME_SETTINGS");
		launcher.putExtra("PACKAGE", "packageName");
		
		return launcher;
	}
	
	public static Launcher getGoLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(GO);
		launcher.setName("Go");
		launcher.setPackage("com.gau.go.launcherex");
		launcher.setAction("com.gau.go.launcherex.MyThemes.mythemeaction");
		launcher.putExtra("PACKAGE", "pkgname");
		
		return launcher;
	}
	
	public static Launcher getNextLauncher()
	{
		Launcher launcher = new Launcher();
		launcher.setLauncher(NEXT);
		launcher.setName("Next");
		launcher.setPackage("com.gtp.nextlauncher");
		launcher.setAction("com.gtp.nextlauncher.themeManager.ThemeManageActivity");
		launcher.putExtra("PACKAGE", "pkgname");
		
		return launcher;
	}
}
