package com.alipay.sdk.m.y;

/* JADX INFO: loaded from: classes7.dex */
public enum i {
    WIFI(0, "WIFI"),
    NETWORK_TYPE_1(1, "unicom2G"),
    NETWORK_TYPE_2(2, "mobile2G"),
    NETWORK_TYPE_4(4, "telecom2G"),
    NETWORK_TYPE_5(5, "telecom3G"),
    NETWORK_TYPE_6(6, "telecom3G"),
    NETWORK_TYPE_12(12, "telecom3G"),
    NETWORK_TYPE_8(8, "unicom3G"),
    NETWORK_TYPE_3(3, "unicom3G"),
    NETWORK_TYPE_13(13, "LTE"),
    NETWORK_TYPE_11(11, "IDEN"),
    NETWORK_TYPE_9(9, "HSUPA"),
    NETWORK_TYPE_10(10, "HSPA"),
    NETWORK_TYPE_15(15, "HSPAP"),
    NETWORK_TYPE_20(20, "5G"),
    NONE(-1, "none");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1485a;
    public String b;

    i(int r3, String str) {
        this.f1485a = r3;
        this.b = str;
    }

    public final int b() {
        return this.f1485a;
    }

    public final String c() {
        return this.b;
    }

    public static i a(int r5) {
        for (i iVar : values()) {
            if (iVar.b() == r5) {
                return iVar;
            }
        }
        return NONE;
    }
}
