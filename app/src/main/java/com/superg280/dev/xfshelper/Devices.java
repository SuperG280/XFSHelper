package com.superg280.dev.xfshelper;

public class Devices {

    final static int DEV_MANAGER         = 0;
    final static int DEV_ALARMS          = 1;
    final static int DEV_BARCODE         = 2;
    final static int DEV_CAMERA          = 3;
    final static int DEV_DISPENSER       = 4;
    final static int DEV_CEU             = 5;
    final static int DEV_CHK             = 6;
    final static int DEV_NOTESDEPOSIT    = 7;
    final static int DEV_CRD             = 8;
    final static int DEV_DEPOSIT         = 9;
    final static int DEV_CARD            = 10;
    final static int DEV_IPM             = 11;
    final static int DEV_PINPAD          = 12;
    final static int DEV_PRINTER         = 13;
    final static int DEV_SENSORS         = 14;
    final static int DEV_TTU             = 15;
    final static int DEV_VDM             = 16;

    private static final int dev_icons[] = {
            R.drawable.dev_manager,
            R.drawable.dev_alarm,
            R.drawable.dev_barcode,
            R.drawable.dev_cam,
            R.drawable.dev_dispenser,
            R.drawable.dev_ceu,
            R.drawable.dev_chk,
            R.drawable.dev_notesdeposit,
            R.drawable.dev_crd,
            R.drawable.dev_deposit,
            R.drawable.dev_card,
            R.drawable.dev_ipm,
            R.drawable.dev_pinpad,
            R.drawable.dev_printer,
            R.drawable.dev_sensors,
            R.drawable.dev_ttu,
            R.drawable.dev_vdm};

    private static final String dev_literales[] = {
            "API Manager",
            "ALM Alarms",
            "BCR Barcode",
            "CAM Camera",
            "CDM Dispenser",
            "CEU Card embossing",
            "CHK Check reader",
            "CIM Cash acceptor",
            "CRD Card dispenser",
            "DEP Depository",
            "IDC Card",
            "IPM Item processing",
            "PIN Pin pad",
            "PTR Printers",
            "SIU Sensors",
            "TTU Text terminal",
            "VDM Vendor dependent"};

    public static int[] getDev_icons() {
        return dev_icons;
    }

    public static String[] getDev_literales() {
        return dev_literales;
    }

    public static int getDeviceIcon( int deviceID) {

        if( deviceID >= dev_icons.length || deviceID < 0) {
            return dev_icons[ DEV_MANAGER];
        }

        return dev_icons[ deviceID];
    }

    public static String getDeviceLiteral( int deviceID) {

        if( deviceID >= dev_literales.length || deviceID < 0) {
            return dev_literales[ DEV_MANAGER];
        }

        return dev_literales[ deviceID];
    }
}
