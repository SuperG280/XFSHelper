package com.superg280.dev.xfshelper;

public class Devices {

    public final static int DEV_MANAGER         = 0;
    public final static int DEV_PRINTER         = 1;
    public final static int DEV_CARD            = 2;
    public final static int DEV_DISPENSER       = 3;
    public final static int DEV_PINPAD          = 4;
    public final static int DEV_SENSORS         = 5;
    public final static int DEV_NOTESDEPOSIT    = 6;
    public final static int DEV_TTU             = 7;
    public final static int DEV_VDM             = 8;
    public final static int DEV_DEPOSIT         = 9;
    public final static int DEV_BARCODE         = 10;

    

    private static final int dev_icons[] = {    R.drawable.dev_manager,
                                                R.drawable.dev_printer,
                                                R.drawable.dev_card,
                                                R.drawable.dev_dispenser,
                                                R.drawable.dev_pinpad,
                                                R.drawable.dev_sensors,
                                                R.drawable.dev_notesdeposit,
                                                R.drawable.dev_ttu,
                                                R.drawable.dev_vdm,
                                                R.drawable.dev_deposit,
                                                R.drawable.dev_barcode};

    
    private static final String dev_literales[] = {     "Manager",
                                                        "Printer",
                                                        "Card Reader",
                                                        "Dispenser",
                                                        "PinPad",
                                                        "Sensors",
                                                        "Notes deposit",
                                                        "Operator panel",
                                                        "Vendor mode",
                                                        "Deposit",
                                                        "Barcode"};



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
