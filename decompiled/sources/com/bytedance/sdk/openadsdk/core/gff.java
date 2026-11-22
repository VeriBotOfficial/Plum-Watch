package com.bytedance.sdk.openadsdk.core;

/* loaded from: classes14.dex */
public class gff {
    private static volatile gff fxn;

    private gff() {
    }

    public static gff fxn() {
        if (fxn == null) {
            synchronized (gff.class) {
                if (fxn == null) {
                    fxn = new gff();
                }
            }
        }
        return fxn;
    }

    public void fxn(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("ttopenadsdk", str, str2);
    }

    public String kg(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.hm.hm.kg("ttopenadsdk", str, str2);
    }

    public void fxn(String str, int i) {
        com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("ttopenadsdk", str, Integer.valueOf(i));
    }

    public int kg(String str, int i) {
        return com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("ttopenadsdk", str, i);
    }

    public void fxn(String str, long j) {
        com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("ttopenadsdk", str, Long.valueOf(j));
    }

    public Long kg(String str, long j) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("ttopenadsdk", str, j));
    }
}
