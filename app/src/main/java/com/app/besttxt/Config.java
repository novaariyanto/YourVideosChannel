package com.app.besttxt;

public class Config {

    //put your admin panel url
    public static final String ADMIN_PANEL_URL = "http://yvc.herokuapp.com";

    //put your api key which obtained from admin panel
    public static final String API_KEY = "cda11HlY4ZPvj1rNeyhOw0UJLKm8cSEW6aTMiq2fbxuC5s7kpo";

    //Ads Configuration
    //set true to enable or set false to disable
    public static final boolean ENABLE_ADMOB_BANNER_ADS = true;
    public static final boolean ENABLE_ADMOB_INTERSTITIAL_ADS = true;
    public static final int ADMOB_INTERSTITIAL_ADS_INTERVAL = 3;
    public static final boolean ENABLE_ADMOB_INTERSTITIAL_ADS_ON_CLICK_VIDEO = true;

    //layout customization
    public static final boolean ENABLE_TAB_LAYOUT = true;
    public static final boolean ENABLE_SINGLE_ROW_COLUMN = false;
    public static final boolean FORCE_PLAYER_TO_LANDSCAPE = false;
    public static final boolean ENABLE_VIEW_COUNT = true;
    public static final boolean ENABLE_DATE_DISPLAY = true;
    public static final boolean DISPLAY_DATE_AS_TIME_AGO = true;

    //if you use RTL Language e.g : Arabic Language or other, set true
    public static final boolean ENABLE_RTL_MODE = false;

    //load more for next list videos
    public static final int LOAD_MORE = 25;

    //splash screen duration in millisecond
    public static final int SPLASH_TIME = 3000;

}