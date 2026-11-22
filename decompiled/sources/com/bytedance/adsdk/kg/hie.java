package com.bytedance.adsdk.kg;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes13.dex */
public class hie {
    private final String bh;
    private Bitmap dgx;
    private final int fxn;
    private final String gff;
    private final JSONArray hie;
    private final String hm;
    private final int[][] jq;
    private final int kg;
    private final String rb;

    /* renamed from: sg, reason: collision with root package name */
    private final List<fxn> f9262sg;
    private final String tw;

    public static class fxn {
        public int bh;
        public int fxn;
        public String gff;
        public String hm;
        public int kg;
        public int rb;

        /* renamed from: sg, reason: collision with root package name */
        public String f9263sg;
    }

    public hie(int i, int i2, String str, String str2, String str3, String str4, List<fxn> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.fxn = i;
        this.kg = i2;
        this.gff = str;
        this.hm = str2;
        this.rb = str3;
        this.bh = str4;
        this.f9262sg = list;
        this.tw = str5;
        this.jq = iArr;
        this.hie = jSONArray;
    }

    public int fxn() {
        return this.fxn;
    }

    public int kg() {
        return this.kg;
    }

    public List<fxn> gff() {
        return this.f9262sg;
    }

    public String hm() {
        return this.bh;
    }

    public String rb() {
        return this.tw;
    }

    public int[][] bh() {
        return this.jq;
    }

    public JSONArray sg() {
        return this.hie;
    }

    public String tw() {
        return this.gff;
    }

    public String jq() {
        return this.hm;
    }

    public String hie() {
        return this.rb;
    }

    public Bitmap dgx() {
        return this.dgx;
    }

    public void fxn(Bitmap bitmap) {
        this.dgx = bitmap;
    }
}
