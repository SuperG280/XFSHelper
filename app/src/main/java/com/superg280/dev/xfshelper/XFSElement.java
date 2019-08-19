package com.superg280.dev.xfshelper;

public class XFSElement {

    private String ErrorCode;

    private String Description;

    public XFSElement() {
        ErrorCode = "";
        Description = "";
    }

    public XFSElement( String errorCode, String description) {
        ErrorCode = errorCode;
        Description = description;
    }

    public String getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(String errorCode) {
        ErrorCode = errorCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
