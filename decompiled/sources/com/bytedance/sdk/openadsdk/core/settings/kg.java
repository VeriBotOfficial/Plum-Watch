package com.bytedance.sdk.openadsdk.core.settings;

import com.anythink.expressad.videocommon.e.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class kg {
    public boolean ax;
    public int bh;
    public int bx;
    public int ci;
    public int ckl;
    public int dgx;
    public int dx;
    public String fxn;
    public int gff;
    public boolean ggo;
    public int hie;
    public int hm;
    public int iwp;
    public int je;
    public int jq;
    public List<String> jz;
    public int ke;
    public int kg;
    public int mve;
    public int mvp;
    public int rb;
    public int rlu;
    public int rmu;
    public JSONObject rz;

    /* renamed from: sg, reason: collision with root package name */
    public int f9524sg;
    public int tw;
    public int ud;
    public int uhw;
    public boolean ums;
    public int xdg;
    public boolean zn;
    public int zu;

    private static boolean fxn(int i) {
        return i == 1 || i == 2;
    }

    public kg(JSONObject jSONObject) {
        this.kg = 1;
        this.gff = 1;
        this.hm = 2;
        this.rb = 1;
        this.bh = 100;
        this.f9524sg = 0;
        this.tw = 2;
        this.jq = 1;
        this.hie = 3;
        this.dgx = 30;
        this.mvp = 30;
        this.rlu = 1;
        this.zu = 1;
        this.ckl = 2;
        this.xdg = 1500;
        this.rmu = 2;
        this.je = 3500;
        this.ud = 0;
        this.dx = 5;
        this.ums = false;
        this.iwp = 0;
        this.bx = 2;
        this.uhw = 0;
        this.ke = 0;
        this.mve = 5;
        this.zn = true;
        this.ggo = false;
        this.ax = false;
        this.ci = -1;
        new JSONObject();
        this.rz = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.fxn = jSONObject.optString("code_id");
        this.kg = jSONObject.optInt("auto_play", 1);
        this.ci = jSONObject.optInt("endcard_close_time", -1);
        this.gff = jSONObject.optInt("voice_control", 1);
        this.hm = jSONObject.optInt("rv_preload", 2);
        this.rb = jSONObject.optInt("nv_preload", 1);
        this.bh = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.f9524sg = jSONObject.optInt("skip_time_displayed", 0);
        this.tw = jSONObject.optInt(b.Q, 2);
        this.jq = jSONObject.optInt("reg_creative_control", 1);
        this.hie = jSONObject.optInt("play_bar_show_time", 3);
        int optInt = jSONObject.optInt("rv_skip_time", 30);
        this.dgx = optInt;
        if (optInt < 0) {
            this.dgx = 30;
        }
        this.rlu = jSONObject.optInt("voice_control", 2);
        this.zu = jSONObject.optInt("if_show_win", 1);
        this.ckl = jSONObject.optInt("sp_preload", 2);
        this.xdg = jSONObject.optInt("stop_time", 1500);
        this.rmu = jSONObject.optInt("native_playable_delay", 2);
        this.je = jSONObject.optInt("time_out_control", -1);
        this.ud = jSONObject.optInt("playable_reward_type", 0);
        this.iwp = jSONObject.optInt("reward_is_callback", 0);
        int optInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.dx = optInt2;
        if (optInt2 < 0) {
            this.dx = 5;
        }
        fxn(jSONObject.optJSONArray("parent_tpl_ids"));
        this.bx = jSONObject.optInt("slot_type", 2);
        this.ums = jSONObject.optBoolean("close_on_click", false);
        this.uhw = jSONObject.optInt("allow_system_back", 0);
        this.ke = jSONObject.optInt("splash_skip_time", 0);
        this.mve = jSONObject.optInt("splash_image_count_down_time", 5);
        this.ggo = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.ax = jSONObject.optBoolean("splash_close_on_click", false);
        this.zn = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!fxn(this.gff)) {
            this.gff = 1;
        }
        if (!fxn(this.rlu)) {
            this.rlu = 1;
        }
        this.mvp = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    public kg(String str, int i) {
        this.kg = 1;
        this.gff = 1;
        this.hm = 2;
        this.rb = 1;
        this.bh = 100;
        this.f9524sg = 0;
        this.tw = 2;
        this.jq = 1;
        this.hie = 3;
        this.dgx = 30;
        this.mvp = 30;
        this.rlu = 1;
        this.zu = 1;
        this.ckl = 2;
        this.xdg = 1500;
        this.rmu = 2;
        this.je = 3500;
        this.ud = 0;
        this.dx = 5;
        this.ums = false;
        this.iwp = 0;
        this.bx = 2;
        this.uhw = 0;
        this.ke = 0;
        this.mve = 5;
        this.zn = true;
        this.ggo = false;
        this.ax = false;
        this.ci = -1;
        this.rz = new JSONObject();
        this.fxn = str;
        this.gff = i;
    }

    public void fxn(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.jz = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.jz.add(jSONArray.get(i).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }
}
