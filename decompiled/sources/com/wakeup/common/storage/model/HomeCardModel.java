package com.wakeup.common.storage.model;

/* loaded from: classes2.dex */
public class HomeCardModel {
    public static final int TYPE_ACTIVE_RAINBOW = 14;
    public static final int TYPE_AD = 15;
    public static final int TYPE_ANNUAL_REPORT = 13;
    public static final int TYPE_BLOOD_OXYGEN = 5;
    public static final int TYPE_BLOOD_PRESSURE = 4;
    public static final int TYPE_BLOOD_SUGAR = 6;
    public static final int TYPE_BREATH = 9;
    public static final int TYPE_HEART = 2;
    public static final int TYPE_IMMUNITY = 10;
    public static final int TYPE_MENSTRUAL = 12;
    public static final int TYPE_MET = 11;
    public static final int TYPE_PRESSURE = 7;
    public static final int TYPE_SLEEP = 1;
    public static final int TYPE_SLEEP_APNEA = 16;
    public static final int TYPE_SPORT_RECORD = 0;
    public static final int TYPE_TEMPERATURE = 8;
    public static final int TYPE_WEIGHT = 3;
    private int position;
    private final int type;

    public HomeCardModel(int type, int position) {
        this.type = type;
        this.position = position;
    }

    public int getType() {
        return this.type;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }
}
