package com.superg280.dev.xfshelper;

public class Devices {

    public final static int DEV_MANAGER = 0;
    public final static int DEV_DISPENSER = 1;
    public final static int DEV_CARD = 2;
    public final static int DEV_PINPAD = 3;
    public final static int DEV_SENSORS = 4;
    

    private static final int dev_icons[] = { R.drawable.dev_manager,
                                            R.drawable.dev_dispenser,
                                            R.drawable.dev_card,
                                            R.drawable.dev_pinpad,
                                            R.drawable.dev_sensors};

    
    private static final String dev_literales[] = {  "Manager",
                                                    "Dispensador",
                                                    "Lector Tarjetas",
                                                    "PinPad",
                                                    "Sensores"};



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
