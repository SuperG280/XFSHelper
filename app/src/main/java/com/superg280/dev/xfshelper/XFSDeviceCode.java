package com.superg280.dev.xfshelper;

public class XFSDeviceCode {

	private String Name;
	private String Value;
	private String Description;
	private boolean SelectedInListView;
	
	public XFSDeviceCode() {
		Name = "";
		Value = "";
		Description = "";
        SelectedInListView = false;
	}
	
	public XFSDeviceCode( String name, String value) {
		Name = name;
		Value = value;
		Description = "";
        SelectedInListView = false;
	}

	public XFSDeviceCode( String name, String value, String description) {
		Name = name;
		Value = value;
		Description = description;
        SelectedInListView = false;
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

	public void setSelectedInListView( boolean bValue) {
        SelectedInListView = bValue;
    }

    public boolean isSelectedInListView() {
	    return SelectedInListView;
    }
}