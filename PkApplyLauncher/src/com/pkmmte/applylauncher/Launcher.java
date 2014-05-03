package com.pkmmte.applylauncher;

import android.os.Bundle;

public class Launcher
{
	private int Launcher;
	
	private String Name;
	private String Package;
	
	private String Action;
	private Bundle Extras;
	
	public Launcher()
	{
		this.Launcher = -1;
		this.Name = "null";
		this.Package = "null";
		this.Action = null;
		this.Extras = new Bundle();
	}
	
	public Launcher(Builder builder)
	{
		this.Launcher = builder.Launcher;
		this.Name = builder.Name;
		this.Package = builder.Package;
		this.Action = builder.Action;
		this.Extras = (Bundle) builder.Extras.clone();
	}
	
	public Launcher setLauncher(int Launcher)
	{
		this.Launcher = Launcher;
		return this;
	}
	
	public Launcher setName(String Name)
	{
		this.Name = Name;
		return this;
	}
	
	public Launcher setPackage(String Package)
	{
		this.Package = Package;
		return this;
	}
	
	public Launcher setAction(String Action)
	{
		this.Action = Action;
		return this;
	}
	
	public Launcher setExtras(Bundle Extras)
	{
		this.Extras = (Bundle) Extras.clone();
		return this;
	}
	
	public Launcher putExtra(String key, String value)
	{
		this.Extras.putString(key, value);
		return this;
	}
	
	public Launcher putExtra(String key, int value)
	{
		this.Extras.putInt(key, value);
		return this;
	}
	
	public Launcher putExtra(String key, boolean value)
	{
		this.Extras.putBoolean(key, value);
		return this;
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
	
	public Bundle getExtras()
	{
		return this.Extras;
	}
	
	public Object getExtra(String key)
	{
		return this.Extras.get(key);
	}
	
	public String getExtraString(String key)
	{
		return this.Extras.getString(key);
	}
	
	public int getExtraInt(String key)
	{
		return this.Extras.getInt(key);
	}
	
	public boolean getExtraBoolean(String key)
	{
		return this.Extras.getBoolean(key);
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		
		builder.append("Launcher: " + this.Launcher + "\n");
		builder.append("Name: " + this.Name + "\n");
		builder.append("Package: " + this.Package + "\n");
		builder.append("Action: " + this.Action + "\n");
		for(String key : Extras.keySet())
			builder.append("Extra [" + key + "]: " + this.Extras.get(key) + "\n");
		
		return builder.toString();
	}
	
	public static class Builder
	{
		private int Launcher;
		private String Name;
		private String Package;
		private String Action;
		private Bundle Extras;
		
		public Builder() {
			this.Launcher = -1;
			this.Name = "null";
			this.Package = "null";
			this.Action = null;
			this.Extras = new Bundle();
		}
		
		public Builder launcher(int Launcher) {
			this.Launcher = Launcher;
			return this;
		}
		
		public Builder name(String Name) {
			this.Name = Name;
			return this;
		}
		
		public Builder lPackage(String Package) {
			this.Package = Package;
			return this;
		}
		
		public Builder action(String Action) {
			this.Action = Action;
			return this;
		}
		
		public Builder extras(Bundle Extras) {
			this.Extras = Extras;
			return this;
		}
		
		public Builder putExtra(String key, String value) {
			this.Extras.putString(key, value);
			return this;
		}
		
		public Builder putExtra(String key, int value) {
			this.Extras.putInt(key, value);
			return this;
		}
		
		public Builder putExtra(String key, boolean value) {
			this.Extras.putBoolean(key, value);
			return this;
		}
		
		public Launcher build() {
			return new Launcher(this);
		}
	}
}