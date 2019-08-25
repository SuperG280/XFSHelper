package com.superg280.dev.xfshelper;

public class XFSDeviceCode {

	private String Name;
	private String Value;
	private String Description;
	
	public XFSDeviceCode() {
		Name = "";
		Value = "";
		Description = "";
	}
	
	public XFSDeviceCode( String name, String value) {
		Name = name;
		Value = value;
		Description = "";
	}

	public XFSDeviceCode( String name, String value, String description) {
		Name = name;
		Value = value;
		Description = description;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getValue() {
		return Value;
	}

	public String getDescription() {
		return Description;
	}
}