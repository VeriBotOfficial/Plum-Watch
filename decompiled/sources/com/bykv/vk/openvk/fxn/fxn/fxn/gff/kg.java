package com.bykv.vk.openvk.fxn.fxn.fxn.gff;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class kg {
    private String bh;
    private double dgx;
    private int fxn;
    private long gff;
    private String hie;
    private double hm;
    private String jq;
    private int kg;
    private int mvp;
    private String rb;
    private int rlu;

    /* renamed from: sg, reason: collision with root package name */
    private String f9080sg;
    private String tw;
    private float zu = -1.0f;
    private int ckl = 0;
    private int xdg = 0;
    private int rmu = 0;
    private int je = 0;
    private int ud = 307200;
    private int dx = 1;

    public int fxn() {
        return this.mvp;
    }

    public void fxn(int i) {
        this.mvp = i;
    }

    public int kg() {
        return this.fxn;
    }

    public void kg(int i) {
        this.fxn = i;
    }

    public int gff() {
        return this.kg;
    }

    public void gff(int i) {
        this.kg = i;
    }

    public int hm() {
        return this.rlu;
    }

    public void hm(int i) {
        this.rlu = i;
    }

    public long rb() {
        return this.gff;
    }

    public void fxn(long j) {
        this.gff = j;
    }

    public double bh() {
        return this.hm;
    }

    public void fxn(double d) {
        this.hm = d;
    }

    public double sg() {
        return this.dgx;
    }

    public float tw() {
        return this.zu;
    }

    public String jq() {
        return this.rb;
    }

    public void fxn(String str) {
        this.rb = str;
    }

    public String hie() {
        return this.bh;
    }

    public void kg(String str) {
        this.bh = str;
    }

    public String dgx() {
        return this.f9080sg;
    }

    public void gff(String str) {
        this.f9080sg = str;
    }

    public String mvp() {
        return this.tw;
    }

    public void hm(String str) {
        this.tw = str;
    }

    public String rlu() {
        return this.jq;
    }

    public void rb(String str) {
        this.jq = str;
    }

    public String zu() {
        if (TextUtils.isEmpty(this.hie)) {
            this.hie = com.bykv.vk.openvk.fxn.fxn.fxn.sg.kg.fxn(this.f9080sg);
        }
        return this.hie;
    }

    public void bh(String str) {
        this.hie = str;
    }

    public int ckl() {
        if (this.ud < 0) {
            this.ud = 307200;
        }
        long j = this.ud;
        long j2 = this.gff;
        if (j > j2) {
            this.ud = (int) j2;
        }
        return this.ud;
    }

    public void rb(int i) {
        this.ud = i;
    }

    public int xdg() {
        return this.rmu;
    }

    public void bh(int i) {
        this.rmu = i;
    }

    public int rmu() {
        return this.je;
    }

    public void sg(int i) {
        this.je = i;
    }

    public JSONObject je() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", kg());
            jSONObject.put("cover_url", hie());
            jSONObject.put("cover_width", gff());
            jSONObject.put("endcard", mvp());
            jSONObject.put("file_hash", zu());
            jSONObject.put("resolution", jq());
            jSONObject.put("size", rb());
            jSONObject.put("video_duration", bh());
            jSONObject.put("video_url", dgx());
            jSONObject.put("playable_download_url", rlu());
            jSONObject.put("if_playable_loading_show", ud());
            jSONObject.put("remove_loading_page_type", dx());
            jSONObject.put("fallback_endcard_judge", fxn());
            jSONObject.put("video_preload_size", ckl());
            jSONObject.put("reward_video_cached_type", xdg());
            jSONObject.put("execute_cached_type", rmu());
            jSONObject.put("endcard_render", hm());
            jSONObject.put("replay_time", iwp());
            jSONObject.put("play_speed_ratio", tw());
            if (sg() > 0.0d) {
                jSONObject.put("start", sg());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int ud() {
        return this.ckl;
    }

    public void tw(int i) {
        this.ckl = i;
    }

    public int dx() {
        return this.xdg;
    }

    public void jq(int i) {
        this.xdg = i;
    }

    public boolean ums() {
        return this.rmu == 0;
    }

    public void hie(int i) {
        this.dx = Math.min(4, Math.max(1, i));
    }

    public int iwp() {
        return this.dx;
    }
}
