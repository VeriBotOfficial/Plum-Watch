package com.bytedance.adsdk.kg.gff;

import com.bytedance.adsdk.kg.gff.kg.xdg;
import java.util.List;

/* loaded from: classes13.dex */
public class hm {
    private final String bh;
    private final List<xdg> fxn;
    private final double gff;
    private final double hm;
    private final char kg;
    private final String rb;

    public static int fxn(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public hm(List<xdg> list, char c, double d, double d2, String str, String str2) {
        this.fxn = list;
        this.kg = c;
        this.gff = d;
        this.hm = d2;
        this.rb = str;
        this.bh = str2;
    }

    public List<xdg> fxn() {
        return this.fxn;
    }

    public double kg() {
        return this.hm;
    }

    public int hashCode() {
        return fxn(this.kg, this.bh, this.rb);
    }
}
