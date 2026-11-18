package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes15.dex */
public class ckl {
    private static boolean fxn = false;
    private static String gff = "";
    private static int kg = 4;

    public static void fxn(String str) {
        gff = str;
    }

    public static void fxn(int r0) {
        kg = r0;
    }

    public static boolean fxn() {
        return kg <= 3;
    }

    public static void kg() {
        fxn = true;
        fxn(3);
    }

    public static void gff() {
        fxn = false;
        fxn(7);
    }

    public static boolean hm() {
        return fxn;
    }
}
