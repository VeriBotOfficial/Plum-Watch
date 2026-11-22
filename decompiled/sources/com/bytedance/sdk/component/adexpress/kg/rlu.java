package com.bytedance.sdk.component.adexpress.kg;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class rlu {
    private boolean ax;
    private String bh;
    private double bx;
    private String ci;
    private int ckl;
    private long dgx;
    private int dx;
    private JSONObject fxn;
    private String gff;
    private JSONObject ggo;
    private int hie;
    private jq hm;
    private final String ij;
    private final boolean ils;
    private int iwp;
    private int je;
    private boolean jq;
    private String jz;
    private boolean ke;
    private rb kg;
    private JSONObject mve;
    private int mvp;
    private int rb;
    private String rlu;
    private String rmu;
    private int rz;

    /* renamed from: sg, reason: collision with root package name */
    private String f9343sg;
    private String tw;
    private int ud;
    private int uhw;
    private int ums;
    private boolean xdg;
    private final String yws;
    private JSONObject zn;
    private Map<String, String> zu;

    public rlu(fxn fxnVar) {
        this.fxn = fxnVar.fxn;
        this.kg = fxnVar.kg;
        this.gff = fxnVar.gff;
        this.hm = fxnVar.hm;
        this.rb = fxnVar.rb;
        this.bh = fxnVar.bh;
        this.f9343sg = fxnVar.f9344sg;
        this.tw = fxnVar.tw;
        this.jq = fxnVar.jq;
        this.hie = fxnVar.hie;
        this.dgx = fxnVar.dgx;
        this.mvp = fxnVar.mvp;
        this.rlu = fxnVar.rlu;
        this.zu = fxnVar.zu;
        this.ckl = fxnVar.ckl;
        this.xdg = fxnVar.xdg;
        this.rmu = fxnVar.rmu;
        this.je = fxnVar.je;
        this.ud = fxnVar.ud;
        this.dx = fxnVar.dx;
        this.ums = fxnVar.ums;
        this.iwp = fxnVar.iwp;
        this.jz = fxnVar.jz;
        this.bx = fxnVar.bx;
        this.uhw = fxnVar.uhw;
        this.ke = fxnVar.ke;
        this.mve = fxnVar.mve;
        this.zn = fxnVar.zn;
        this.ggo = fxnVar.ggo;
        this.ax = fxnVar.ax;
        this.ci = fxnVar.ci;
        this.rz = fxnVar.yws;
        this.ils = fxnVar.rz;
        this.ij = fxnVar.ils;
        this.yws = fxnVar.ij;
    }

    public boolean fxn() {
        return this.ke;
    }

    public double kg() {
        return this.bx;
    }

    public JSONObject gff() {
        rb rbVar;
        if (this.fxn == null && (rbVar = this.kg) != null) {
            this.fxn = rbVar.fxn();
        }
        return this.fxn;
    }

    public String hm() {
        return this.gff;
    }

    public jq rb() {
        return this.hm;
    }

    public int bh() {
        return this.rb;
    }

    public int sg() {
        return this.uhw;
    }

    public boolean tw() {
        return this.jq;
    }

    public long jq() {
        return this.dgx;
    }

    public int hie() {
        return this.mvp;
    }

    public Map<String, String> dgx() {
        return this.zu;
    }

    public int mvp() {
        return this.ckl;
    }

    public boolean rlu() {
        return this.xdg;
    }

    public String zu() {
        return this.rmu;
    }

    public int ckl() {
        return this.je;
    }

    public int xdg() {
        return this.ud;
    }

    public int rmu() {
        return this.dx;
    }

    public JSONObject je() {
        return this.mve;
    }

    public JSONObject ud() {
        return this.zn;
    }

    public JSONObject dx() {
        return this.ggo;
    }

    public int ums() {
        return this.ums;
    }

    public int iwp() {
        return this.iwp;
    }

    public boolean jz() {
        return this.ax;
    }

    public String bx() {
        return this.ci;
    }

    public int uhw() {
        return this.rz;
    }

    public boolean ke() {
        return this.ils;
    }

    public String mve() {
        return this.ij;
    }

    public String zn() {
        return this.yws;
    }

    public static class fxn {
        private boolean ax;
        private String bh;
        private double bx;
        private String ci;
        private int ckl;
        private long dgx;
        private int dx;
        private JSONObject fxn;
        private String gff;
        private JSONObject ggo;
        private int hie;
        private jq hm;
        private String ij;
        private String ils;
        private int iwp;
        private int je;
        private boolean jq;
        private String jz;
        private rb kg;
        private JSONObject mve;
        private int mvp;
        private int rb;
        private String rlu;
        private String rmu;

        /* renamed from: sg, reason: collision with root package name */
        private String f9344sg;
        private String tw;
        private int ud;
        private int uhw;
        private int ums;
        private boolean xdg;
        private int yws;
        private JSONObject zn;
        private Map<String, String> zu;
        private boolean ke = true;
        private boolean rz = true;

        public fxn fxn(rb rbVar) {
            this.kg = rbVar;
            return this;
        }

        public fxn fxn(boolean z) {
            this.ke = z;
            return this;
        }

        public fxn fxn(String str) {
            this.gff = str;
            return this;
        }

        public fxn fxn(jq jqVar) {
            this.hm = jqVar;
            return this;
        }

        public fxn fxn(int i) {
            this.rb = i;
            return this;
        }

        public fxn kg(String str) {
            this.bh = str;
            return this;
        }

        public fxn gff(String str) {
            this.f9344sg = str;
            return this;
        }

        public fxn hm(String str) {
            this.tw = str;
            return this;
        }

        public fxn kg(boolean z) {
            this.jq = z;
            return this;
        }

        public fxn gff(boolean z) {
            this.rz = z;
            return this;
        }

        public fxn kg(int i) {
            this.hie = i;
            return this;
        }

        public fxn fxn(long j) {
            this.dgx = j;
            return this;
        }

        public fxn gff(int i) {
            this.mvp = i;
            return this;
        }

        public fxn fxn(Map<String, String> map) {
            this.zu = map;
            return this;
        }

        public fxn hm(int i) {
            this.ckl = i;
            return this;
        }

        public fxn hm(boolean z) {
            this.xdg = z;
            return this;
        }

        public fxn rb(String str) {
            this.rmu = str;
            return this;
        }

        public fxn rb(int i) {
            this.uhw = i;
            return this;
        }

        public fxn rb(boolean z) {
            this.ax = z;
            return this;
        }

        public fxn bh(String str) {
            this.ci = str;
            return this;
        }

        public fxn bh(int i) {
            this.yws = i;
            return this;
        }

        public rlu fxn() {
            return new rlu(this);
        }

        public fxn fxn(double d) {
            this.bx = d;
            return this;
        }

        public fxn sg(String str) {
            this.ils = str;
            return this;
        }

        public fxn tw(String str) {
            this.ij = str;
            return this;
        }
    }
}
