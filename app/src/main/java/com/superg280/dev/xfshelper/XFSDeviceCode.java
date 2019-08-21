package com.superg280.dev.xfshelper;

public class XFSDeviceCode {

	private String Name;
	private String Value;
	
	public XFSDeviceCode() {
		Name = "";
		Value = "";
	}
	
	public XFSDeviceCode( String name, String value) {
		Name = name;
		Value = value;
	}
	
	public String getName() {
		return Name;
	}
	
	public String gerValue() {
		return Value;
	}
}