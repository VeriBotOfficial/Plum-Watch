package com.bytedance.adsdk.ugeno.fxn;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class gff {
    private fxn bh;
    private Map<String, TreeMap<Float, String>> fxn;
    private int gff;
    private JSONObject hie;
    private String hm;
    private int jq = 1;
    private long kg;
    private long rb;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private String f9285sg;
    private String tw;

    public static class fxn {
        public String fxn;
        public String kg;
    }

    public JSONObject fxn() {
        return this.hie;
    }

    public void fxn(JSONObject jSONObject) {
        this.hie = jSONObject;
    }

    public Map<String, TreeMap<Float, String>> kg() {
        return this.fxn;
    }

    public void fxn(Map<String, TreeMap<Float, String>> map) {
        this.fxn = map;
    }

    public long gff() {
        return this.kg;
    }

    public void fxn(long j) {
        this.kg = j;
    }

    public int hm() {
        return this.gff;
    }

    public void fxn(int r1) {
        this.gff = r1;
    }

    public String rb() {
        return this.hm;
    }

    public void fxn(String str) {
        this.hm = str;
    }

    public long bh() {
        return this.rb;
    }

    public void kg(long j) {
        this.rb = j;
    }

    public fxn sg() {
        return this.bh;
    }

    public void fxn(fxn fxnVar) {
        this.bh = fxnVar;
    }

    public String tw() {
        return this.f9285sg;
    }

    public void kg(String str) {
        this.f9285sg = str;
    }

    public String jq() {
        return this.tw;
    }

    public void gff(String str) {
        this.tw = str;
    }

    public int hie() {
        return this.jq;
    }

    public void kg(int r1) {
        this.jq = r1;
    }

    public String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.fxn + ", mDuration=" + this.kg + ", mPlayCount=" + this.gff + ", mPlayDirection=" + this.hm + ", mDelay=" + this.rb + ", mName=" + this.tw + ", mPlayState=" + this.jq + ", mTransformOrigin='" + this.bh + "', mTimingFunction='" + this.f9285sg + "'}";
    }
}
