package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class fxn {
    private String bh;
    private String fxn;
    private List<C0455fxn> gff;
    private long hm;
    private float kg;
    private long rb;

    public String fxn() {
        return this.fxn;
    }

    public void fxn(String str) {
        this.fxn = str;
    }

    public void fxn(float f) {
        this.kg = f;
    }

    public float kg() {
        return this.kg;
    }

    public List<C0455fxn> gff() {
        return this.gff;
    }

    public void fxn(List<C0455fxn> list) {
        this.gff = list;
    }

    public long hm() {
        return this.hm;
    }

    public void fxn(long j) {
        this.hm = j;
    }

    public long rb() {
        return this.rb;
    }

    public void kg(long j) {
        this.rb = j;
    }

    public String bh() {
        return this.bh;
    }

    public void kg(String str) {
        this.bh = str;
    }

    public static fxn fxn(String str, com.bytedance.adsdk.ugeno.kg.gff gffVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return fxn(new JSONObject(str), gffVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static fxn fxn(JSONObject jSONObject, com.bytedance.adsdk.ugeno.kg.gff gffVar) {
        return fxn(jSONObject, null, gffVar);
    }

    public static fxn fxn(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.kg.gff gffVar) {
        if (jSONObject == null) {
            return null;
        }
        fxn fxnVar = new fxn();
        fxnVar.fxn(jSONObject.optString("ordering"));
        String optString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", optString)) {
            fxnVar.fxn(-1.0f);
        } else {
            try {
                fxnVar.fxn(Float.parseFloat(optString));
            } catch (NumberFormatException unused) {
                fxnVar.fxn(0.0f);
            }
        }
        fxnVar.fxn(jSONObject.optLong("duration", 0L));
        fxnVar.kg(com.bytedance.adsdk.ugeno.sg.gff.fxn(com.bytedance.adsdk.ugeno.gff.kg.fxn(jSONObject.optString("startDelay"), gffVar.mvp()), 0L));
        fxnVar.kg(jSONObject.optString("loopMode"));
        JSONArray optJSONArray = jSONObject.optJSONArray("animators");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.sg.kg.fxn(jSONObject2, optJSONObject);
                }
                arrayList.add(C0455fxn.fxn(optJSONObject, gffVar));
            }
            fxnVar.fxn(arrayList);
        }
        return fxnVar;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.core.fxn$fxn, reason: collision with other inner class name */
    public static class C0455fxn {
        private float bh;
        private long fxn;
        private String gff;
        private String hie;
        private long hm;
        private String jq;
        private float kg;
        private String rb;

        /* renamed from: sg, reason: collision with root package name */
        private float f9273sg;
        private float[] tw;

        public long fxn() {
            return this.fxn;
        }

        public void fxn(long j) {
            this.fxn = j;
        }

        public float kg() {
            return this.kg;
        }

        public void fxn(float f) {
            this.kg = f;
        }

        public String gff() {
            return this.gff;
        }

        public void fxn(String str) {
            this.gff = str;
        }

        public long hm() {
            return this.hm;
        }

        public void kg(long j) {
            this.hm = j;
        }

        public String rb() {
            return this.rb;
        }

        public void kg(String str) {
            this.rb = str;
        }

        public float bh() {
            return this.bh;
        }

        public void kg(float f) {
            this.bh = f;
        }

        public float sg() {
            return this.f9273sg;
        }

        public void gff(float f) {
            this.f9273sg = f;
        }

        public float[] tw() {
            return this.tw;
        }

        public void fxn(float[] fArr) {
            this.tw = fArr;
        }

        public String jq() {
            return this.jq;
        }

        public String hie() {
            return this.hie;
        }

        public void gff(String str) {
            this.hie = str;
        }

        public void hm(String str) {
            this.jq = str;
        }

        public static C0455fxn fxn(JSONObject jSONObject, com.bytedance.adsdk.ugeno.kg.gff gffVar) {
            if (jSONObject == null) {
                return null;
            }
            C0455fxn c0455fxn = new C0455fxn();
            c0455fxn.fxn(jSONObject.optLong("duration"));
            String optString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", optString)) {
                c0455fxn.fxn(-1.0f);
            } else {
                try {
                    c0455fxn.fxn(Float.parseFloat(optString));
                } catch (NumberFormatException unused) {
                    c0455fxn.fxn(0.0f);
                }
            }
            c0455fxn.fxn(jSONObject.optString("loopMode"));
            c0455fxn.kg(jSONObject.optString("type"));
            if (TextUtils.equals(c0455fxn.rb(), "ripple")) {
                c0455fxn.gff(jSONObject.optString("rippleColor"));
            }
            View dgx = gffVar.dgx();
            Context context = dgx != null ? dgx.getContext() : null;
            if (TextUtils.equals(c0455fxn.rb(), "backgroundColor")) {
                String fxn = com.bytedance.adsdk.ugeno.gff.kg.fxn(jSONObject.optString("valueTo"), gffVar.mvp());
                int fxn2 = com.bytedance.adsdk.ugeno.sg.fxn.fxn(jSONObject.optString("valueFrom"));
                int fxn3 = com.bytedance.adsdk.ugeno.sg.fxn.fxn(fxn);
                c0455fxn.kg(fxn2);
                c0455fxn.gff(fxn3);
            } else if ((TextUtils.equals(c0455fxn.rb(), ViewProps.TRANSLATE_X) || TextUtils.equals(c0455fxn.rb(), ViewProps.TRANSLATE_Y)) && context != null) {
                try {
                    float fxn4 = com.bytedance.adsdk.ugeno.sg.tw.fxn(context, (float) jSONObject.optDouble("valueFrom"));
                    float fxn5 = com.bytedance.adsdk.ugeno.sg.tw.fxn(context, (float) jSONObject.optDouble("valueTo"));
                    c0455fxn.kg(fxn4);
                    c0455fxn.gff(fxn5);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0455fxn.kg((float) jSONObject.optDouble("valueFrom"));
                c0455fxn.gff((float) jSONObject.optDouble("valueTo"));
            }
            c0455fxn.hm(jSONObject.optString("interpolator"));
            String fxn6 = com.bytedance.adsdk.ugeno.gff.kg.fxn(jSONObject.optString("startDelay"), gffVar.mvp());
            Log.d("TAG", "createAnimationModel: ");
            c0455fxn.kg(com.bytedance.adsdk.ugeno.sg.gff.fxn(fxn6, 0L));
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                float[] fArr = new float[optJSONArray.length()];
                int i = 0;
                if ((TextUtils.equals(c0455fxn.rb(), ViewProps.TRANSLATE_X) || TextUtils.equals(c0455fxn.rb(), ViewProps.TRANSLATE_Y)) && context != null) {
                    while (i < optJSONArray.length()) {
                        fArr[i] = com.bytedance.adsdk.ugeno.sg.tw.fxn(context, (float) fxn.fxn(optJSONArray.optString(i), gffVar.mvp()));
                        i++;
                    }
                } else {
                    while (i < optJSONArray.length()) {
                        fArr[i] = (float) fxn.fxn(optJSONArray.optString(i), gffVar.mvp());
                        i++;
                    }
                }
                c0455fxn.fxn(fArr);
            }
            return c0455fxn;
        }
    }

    public static double fxn(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.sg.gff.fxn(com.bytedance.adsdk.ugeno.gff.kg.fxn((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
