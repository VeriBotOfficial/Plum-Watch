package com.bykv.vk.openvk.fxn.fxn.fxn.gff;

import android.text.TextUtils;
import com.wakeup.feature.wkvideo.cache.PreloadManager;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class gff implements Serializable {
    private kg bh;
    private int ckl;
    private int dx;
    public int gff;
    private boolean je;
    private boolean jq;
    private int ke;
    public String kg;
    private String rlu;
    private long rmu;

    /* renamed from: sg, reason: collision with root package name */
    private kg f9079sg;
    private String tw;
    private boolean ud;
    private int ums;
    private String xdg;
    private int zu;
    private int hie = PreloadManager.PRELOAD_LENGTH;
    private int dgx = 0;
    private int mvp = 0;
    protected float fxn = -1.0f;
    public final HashMap<String, Object> hm = new HashMap<>();
    private int iwp = 10000;
    private int jz = 10000;
    private int bx = 10000;
    private int uhw = 0;
    public int rb = 1;
    private JSONObject mve = new JSONObject();

    public gff(String str, kg kgVar, kg kgVar2, int i, int i2) {
        this.dx = 0;
        this.ums = 0;
        this.tw = str;
        this.bh = kgVar;
        this.f9079sg = kgVar2;
        this.dx = i;
        this.ums = i2;
    }

    public void fxn(int i) {
        this.ke = i;
    }

    public boolean fxn() {
        int i = this.ke;
        return i == 1 || i == 2;
    }

    public boolean kg() {
        return this.ke == 2;
    }

    public JSONObject gff() {
        return this.mve;
    }

    public int hm() {
        return this.mve.optInt("pitaya_cache_size", 0);
    }

    public String rb() {
        return this.tw;
    }

    public void fxn(String str) {
        this.tw = str;
    }

    public int bh() {
        if (zu()) {
            return this.f9079sg.ckl();
        }
        kg kgVar = this.bh;
        if (kgVar != null) {
            return kgVar.ckl();
        }
        return 0;
    }

    public boolean sg() {
        return this.ud;
    }

    public void kg(String str) {
        this.rlu = str;
    }

    public int tw() {
        return this.zu;
    }

    public void kg(int i) {
        this.zu = i;
    }

    public int jq() {
        return this.ckl;
    }

    public void gff(int i) {
        this.ckl = i;
    }

    public void gff(String str) {
        this.xdg = str;
    }

    public long hie() {
        return this.rmu;
    }

    public void fxn(long j) {
        this.rmu = j;
    }

    public boolean dgx() {
        return this.je;
    }

    public void fxn(boolean z) {
        this.je = z;
    }

    public long mvp() {
        if (zu()) {
            return this.f9079sg.rb();
        }
        kg kgVar = this.bh;
        if (kgVar != null) {
            return kgVar.rb();
        }
        return 0L;
    }

    public boolean rlu() {
        if (zu()) {
            return this.f9079sg.ums();
        }
        kg kgVar = this.bh;
        if (kgVar != null) {
            return kgVar.ums();
        }
        return true;
    }

    public void hm(String str) {
        this.kg = str;
    }

    public void hm(int i) {
        this.gff = i;
    }

    public boolean zu() {
        kg kgVar;
        if (this.ums != 1 || (kgVar = this.f9079sg) == null || TextUtils.isEmpty(kgVar.dgx())) {
            return false;
        }
        return com.bykv.vk.openvk.fxn.fxn.fxn.gff.bh() == 2 || this.dx == 1;
    }

    public float ckl() {
        float f = this.fxn;
        if (f != -1.0f) {
            return f;
        }
        if (zu()) {
            return this.f9079sg.tw();
        }
        kg kgVar = this.bh;
        if (kgVar != null) {
            return kgVar.tw();
        }
        return -1.0f;
    }

    public String xdg() {
        if (zu()) {
            return this.f9079sg.dgx();
        }
        kg kgVar = this.bh;
        if (kgVar != null) {
            return kgVar.dgx();
        }
        return null;
    }

    public String rmu() {
        if (zu()) {
            return this.f9079sg.zu();
        }
        kg kgVar = this.bh;
        if (kgVar != null) {
            return kgVar.zu();
        }
        return null;
    }

    public int je() {
        return this.dx;
    }

    public synchronized void fxn(String str, Object obj) {
        this.hm.put(str, obj);
    }

    public synchronized Object rb(String str) {
        return this.hm.get(str);
    }

    public int ud() {
        return this.iwp;
    }

    public void rb(int i) {
        this.iwp = i;
    }

    public int dx() {
        return this.jz;
    }

    public void bh(int i) {
        this.jz = i;
    }

    public int ums() {
        return this.bx;
    }

    public void sg(int i) {
        this.bx = i;
    }

    public int iwp() {
        return this.uhw;
    }

    public void tw(int i) {
        this.uhw = i;
    }

    public kg jz() {
        return this.bh;
    }

    public kg bx() {
        return this.f9079sg;
    }

    public void kg(boolean z) {
        this.jq = z;
    }

    public boolean uhw() {
        return this.jq;
    }
}
