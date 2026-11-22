package com.bytedance.adsdk.kg.hm;

/* loaded from: classes13.dex */
public enum gff {
    JSON(".json"),
    ZIP(".zip");

    public final String gff;

    gff(String str) {
        this.gff = str;
    }

    public String fxn() {
        return ".temp" + this.gff;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.gff;
    }
}
