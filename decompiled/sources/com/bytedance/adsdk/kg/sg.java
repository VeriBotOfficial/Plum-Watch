package com.bytedance.adsdk.kg;

import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes13.dex */
public class sg {
    private List<com.bytedance.adsdk.kg.gff.bh> bh;
    private float dgx;
    private Map<String, List<com.bytedance.adsdk.kg.gff.gff.rb>> gff;
    private Rect hie;
    private Map<String, hie> hm;
    private fxn je;
    private List<com.bytedance.adsdk.kg.gff.gff.rb> jq;
    private float mvp;
    private Map<String, com.bytedance.adsdk.kg.gff.gff> rb;
    private float rlu;

    /* renamed from: sg, reason: collision with root package name */
    private SparseArray<com.bytedance.adsdk.kg.gff.hm> f9266sg;
    private LongSparseArray<com.bytedance.adsdk.kg.gff.gff.rb> tw;
    private kg ud;
    private gff xdg;
    private boolean zu;
    private final je fxn = new je();
    private final HashSet<String> kg = new HashSet<>();
    private int ckl = 0;
    private String rmu = "";

    public static class fxn {
        public String bh;
        public int fxn;
        public Map<String, Object> gff;
        public int hm;
        public Map<String, Object> kg;
        public int rb;

        /* renamed from: sg, reason: collision with root package name */
        public JSONArray f9268sg;
    }

    public static class gff {
        public String bh;
        public int fxn;
        public String gff;
        public String hm;
        public String kg;
        public int[] rb;

        /* renamed from: sg, reason: collision with root package name */
        public JSONArray f9269sg;
    }

    public static class kg {
        public String fxn;
        public JSONArray gff;
        public int[][] kg;
    }

    public void fxn(Rect rect, float f, float f2, float f3, List<com.bytedance.adsdk.kg.gff.gff.rb> list, LongSparseArray<com.bytedance.adsdk.kg.gff.gff.rb> longSparseArray, Map<String, List<com.bytedance.adsdk.kg.gff.gff.rb>> map, Map<String, hie> map2, SparseArray<com.bytedance.adsdk.kg.gff.hm> sparseArray, Map<String, com.bytedance.adsdk.kg.gff.gff> map3, List<com.bytedance.adsdk.kg.gff.bh> list2, gff gffVar, String str, fxn fxnVar, kg kgVar) {
        this.hie = rect;
        this.dgx = f;
        this.mvp = f2;
        this.rlu = f3;
        this.jq = list;
        this.tw = longSparseArray;
        this.gff = map;
        this.hm = map2;
        this.f9266sg = sparseArray;
        this.rb = map3;
        this.bh = list2;
        this.xdg = gffVar;
        this.rmu = str;
        this.je = fxnVar;
        this.ud = kgVar;
    }

    public void fxn(String str) {
        this.kg.add(str);
    }

    public void fxn(boolean z) {
        this.zu = z;
    }

    public void fxn(int i) {
        this.ckl += i;
    }

    public boolean fxn() {
        return this.zu;
    }

    public int kg() {
        return this.ckl;
    }

    public void kg(boolean z) {
        this.fxn.fxn(z);
    }

    public je gff() {
        return this.fxn;
    }

    public com.bytedance.adsdk.kg.gff.gff.rb fxn(long j) {
        return this.tw.get(j);
    }

    public Rect hm() {
        return this.hie;
    }

    public float rb() {
        return (long) ((rmu() / this.rlu) * 1000.0f);
    }

    public float bh() {
        return this.dgx;
    }

    public float sg() {
        return this.mvp;
    }

    public float fxn(float f) {
        return com.bytedance.adsdk.kg.bh.rb.fxn(this.dgx, this.mvp, f);
    }

    public gff tw() {
        return this.xdg;
    }

    public String jq() {
        return this.rmu;
    }

    public kg hie() {
        return this.ud;
    }

    public fxn dgx() {
        return this.je;
    }

    public float mvp() {
        return this.rlu;
    }

    public List<com.bytedance.adsdk.kg.gff.gff.rb> rlu() {
        return this.jq;
    }

    public List<com.bytedance.adsdk.kg.gff.gff.rb> kg(String str) {
        return this.gff.get(str);
    }

    public SparseArray<com.bytedance.adsdk.kg.gff.hm> zu() {
        return this.f9266sg;
    }

    public Map<String, com.bytedance.adsdk.kg.gff.gff> ckl() {
        return this.rb;
    }

    public com.bytedance.adsdk.kg.gff.bh gff(String str) {
        int size = this.bh.size();
        for (int i = 0; i < size; i++) {
            com.bytedance.adsdk.kg.gff.bh bhVar = this.bh.get(i);
            if (bhVar.fxn(str)) {
                return bhVar;
            }
        }
        return null;
    }

    public Map<String, hie> xdg() {
        return this.hm;
    }

    public float rmu() {
        return this.mvp - this.dgx;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.kg.gff.gff.rb> it = this.jq.iterator();
        while (it.hasNext()) {
            sb.append(it.next().fxn(Separators.HT));
        }
        return sb.toString();
    }
}
