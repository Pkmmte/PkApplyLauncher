package com.pkmmte.applylauncher;

import android.os.Bundle;

public class Launcher
{
	private int Launcher;
	
	private String Name;
	private String Package;
	
	private String Action;
	private Bundle extraActions;
	
	public Launcher()
	{
		this.Launcher = -1;
		this.Name = "null";
		this.Package = "null";
		this.Action = null;
		this.extraActions = new Bundle();
	}
	
	public void setLauncher(int Launcher)
	{
		this.Launcher = Launcher;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public void setPackage(String Package)
	{
		this.Package = Package;
	}
	
	public void setAction(String Action)
	{
		this.Action = Action;
	}
	
	public void setExtraActions(Bundle extraActions)
	{
		this.extraActions = (Bundle) extraActions.clone();
	}
	
	public void setExtraAction(String key, String value)
	{
		this.extraActions.putString(key, value);
	}
	
	public int getLauncher()
	{
		return this.Launcher;
	}
	
	public String getName()
	{
		return this.Name;
	}
	
	public String getPackage()
	{
		return this.Package;
	}
	
	public String getAction()
	{
		return this.Action;
	}
	
	public Bundle getExtraActions()
	{
		return this.extraActions;
	}
	
	public String getExtraAction(String key)
	{
		return this.extraActions.getString(key);
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		
		builder.append("Launcher: " + this.Launcher + "\n");
		builder.append("Name: " + this.Name + "\n");
		builder.append("Package: " + this.Package + "\n");
		builder.append("Action: " + this.Action + "\n");
		for(String key : extraActions.keySet())
			builder.append("Extra [" + key + "]: " + this.extraActions.getString(key) + "\n");
		
		return builder.toString();
	}
}