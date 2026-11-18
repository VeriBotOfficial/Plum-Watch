package com.bytedance.adsdk.kg.gff;

/* JADX INFO: loaded from: classes15.dex */
public class bh {
    public final float fxn;
    private final String gff;
    public final float kg;

    public bh(String str, float f, float f2) {
        this.gff = str;
        this.kg = f2;
        this.fxn = f;
    }

    public boolean fxn(String str) {
        if (this.gff.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.gff.endsWith("\r")) {
            String str2 = this.gff;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
