package com.bytedance.sdk.openadsdk.core.model;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.gff.gff;
import com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class mvp {
    private final float bh;
    private final JSONObject ckl;
    private final int dgx;
    private final int[] fxn;
    private final float gff;
    private final int hie;
    private final float hm;
    private final int jq;
    private final int[] kg;
    private final int mvp;
    private final float rb;
    private final SparseArray<gff.fxn> rlu;
    private final JSONObject rmu;

    /* renamed from: sg, reason: collision with root package name */
    private final long f9503sg;
    private final long tw;
    private final String xdg;
    private final int zu;

    private mvp(fxn fxnVar) {
        this.fxn = fxnVar.hie;
        this.kg = fxnVar.dgx;
        this.gff = fxnVar.jq;
        this.hm = fxnVar.tw;
        this.rb = fxnVar.f9504sg;
        this.bh = fxnVar.bh;
        this.f9503sg = fxnVar.rb;
        this.tw = fxnVar.hm;
        this.jq = fxnVar.mvp;
        this.hie = fxnVar.rlu;
        this.dgx = fxnVar.zu;
        this.mvp = fxnVar.xdg;
        this.rlu = fxnVar.ckl;
        this.xdg = fxnVar.rmu;
        this.zu = fxnVar.je;
        this.ckl = fxnVar.ud;
        this.rmu = fxnVar.dx;
    }

    public JSONObject fxn() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.rmu;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.putOpt(next, this.rmu.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.fxn;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.fxn[1]));
            }
            int[] iArr2 = this.kg;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.kg[1]));
            }
            jSONObject.putOpt(a.f13039a, Float.toString(this.gff)).putOpt(a.b, Float.toString(this.hm)).putOpt(a.c, Float.toString(this.rb)).putOpt(a.d, Float.toString(this.bh)).putOpt("down_time", Long.valueOf(this.f9503sg)).putOpt("up_time", Long.valueOf(this.tw)).putOpt("toolType", Integer.valueOf(this.jq)).putOpt("deviceId", Integer.valueOf(this.hie)).putOpt("source", Integer.valueOf(this.dgx)).putOpt("ft", fxn(this.rlu, this.mvp)).putOpt("click_area_type", this.xdg);
            int i = this.zu;
            if (i > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i));
            }
            JSONObject jSONObject3 = this.ckl;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    public static JSONObject fxn(SparseArray<gff.fxn> sparseArray, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    gff.fxn valueAt = sparseArray.valueAt(i2);
                    if (valueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(valueAt.gff)).putOpt("mr", Double.valueOf(valueAt.kg)).putOpt(TypedValues.CycleType.S_WAVE_PHASE, Integer.valueOf(valueAt.fxn)).putOpt("ts", Long.valueOf(valueAt.hm));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i)).putOpt(ParameterNames.INFO, jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static class fxn {
        private float bh;
        private SparseArray<gff.fxn> ckl;
        private int[] dgx;
        private JSONObject dx;
        float fxn;
        float gff;
        private int[] hie;
        private long hm;
        private int je;
        private float jq;
        int kg;
        private int mvp;
        private long rb;
        private int rlu;
        private String rmu;

        /* renamed from: sg, reason: collision with root package name */
        private float f9504sg;
        private float tw;
        private JSONObject ud;
        private int xdg;
        private int zu;

        public fxn fxn(int i) {
            this.je = i;
            return this;
        }

        public fxn fxn(JSONObject jSONObject) {
            this.ud = jSONObject;
            return this;
        }

        public fxn kg(JSONObject jSONObject) {
            this.dx = jSONObject;
            return this;
        }

        public fxn kg(int i) {
            this.xdg = i;
            return this;
        }

        public fxn fxn(SparseArray<gff.fxn> sparseArray) {
            this.ckl = sparseArray;
            return this;
        }

        public fxn fxn(float f) {
            this.fxn = f;
            return this;
        }

        public fxn gff(int i) {
            this.kg = i;
            return this;
        }

        public fxn kg(float f) {
            this.gff = f;
            return this;
        }

        public fxn fxn(long j) {
            this.hm = j;
            return this;
        }

        public fxn kg(long j) {
            this.rb = j;
            return this;
        }

        public fxn gff(float f) {
            this.bh = f;
            return this;
        }

        public fxn hm(float f) {
            this.f9504sg = f;
            return this;
        }

        public fxn rb(float f) {
            this.tw = f;
            return this;
        }

        public fxn bh(float f) {
            this.jq = f;
            return this;
        }

        public fxn fxn(int[] iArr) {
            this.hie = iArr;
            return this;
        }

        public fxn kg(int[] iArr) {
            this.dgx = iArr;
            return this;
        }

        public fxn hm(int i) {
            this.mvp = i;
            return this;
        }

        public fxn rb(int i) {
            this.rlu = i;
            return this;
        }

        public fxn bh(int i) {
            this.zu = i;
            return this;
        }

        public fxn fxn(String str) {
            this.rmu = str;
            return this;
        }

        public mvp fxn() {
            return new mvp(this);
        }
    }
}
