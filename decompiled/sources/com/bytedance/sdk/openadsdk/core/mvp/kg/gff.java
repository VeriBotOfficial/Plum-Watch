package com.bytedance.sdk.openadsdk.core.mvp.kg;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.tw.tw;
import com.bytedance.sdk.component.utils.ke;
import com.bytedance.sdk.openadsdk.core.model.jz;
import com.bytedance.sdk.openadsdk.core.mvp.kg.fxn;
import com.bytedance.sdk.openadsdk.core.mvp.kg.kg;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.utils.qhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class gff {
    private static final Map<String, kg> fxn = new ConcurrentHashMap();
    private static final AtomicBoolean kg = new AtomicBoolean(false);
    private boolean bh;
    private final String gff;
    private final boolean hm;
    private EnumC0520gff rb;

    /* renamed from: com.bytedance.sdk.openadsdk.core.mvp.kg.gff$gff, reason: collision with other inner class name */
    enum EnumC0520gff {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    static {
        ke.fxn(new ke.fxn() { // from class: com.bytedance.sdk.openadsdk.core.mvp.kg.gff.1
            @Override // com.bytedance.sdk.component.utils.ke.fxn
            public void fxn(Context context, Intent intent, boolean z, int i) {
                if (i == 0 || gff.fxn.size() <= 0) {
                    return;
                }
                gff.kg();
            }
        }, rmu.fxn());
    }

    protected gff(String str, EnumC0520gff enumC0520gff, Boolean bool) {
        this.gff = str;
        this.rb = enumC0520gff;
        this.hm = bool.booleanValue();
    }

    public static List<String> fxn(jz jzVar, List<gff> list, com.bytedance.sdk.openadsdk.core.mvp.fxn.fxn fxnVar, long j, String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (gff gffVar : list) {
            if (gffVar != null && (!gffVar.rb() || gffVar.hm())) {
                arrayList.add(gffVar.gff());
                gffVar.j_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new com.bytedance.sdk.openadsdk.core.mvp.gff.gff(arrayList, jzVar).fxn(fxnVar).fxn(j).kg(str).fxn(str2).fxn();
    }

    public static boolean fxn(jz jzVar, List<gff> list, com.bytedance.sdk.openadsdk.core.mvp.fxn.fxn fxnVar, long j, String str, kg kgVar, String str2) {
        List<String> fxn2 = fxn(jzVar, list, fxnVar, j, str, str2);
        fxn(fxn2, kgVar);
        return !fxn2.isEmpty();
    }

    public static void kg(jz jzVar, List<gff> list, com.bytedance.sdk.openadsdk.core.mvp.fxn.fxn fxnVar, long j, String str, String str2) {
        fxn(jzVar, list, fxnVar, j, str, null, str2);
    }

    public static void fxn(List<String> list, kg kgVar) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                fxn(str, kgVar, false);
            }
        }
    }

    private static void fxn(final String str, final kg kgVar, final boolean z) {
        com.bytedance.sdk.component.sg.kg.kg gff = com.bytedance.sdk.openadsdk.je.kg.kg().gff().gff();
        if (gff == null) {
            return;
        }
        gff.fxn(true);
        gff.kg(str);
        gff.fxn(new com.bytedance.sdk.component.sg.fxn.fxn() { // from class: com.bytedance.sdk.openadsdk.core.mvp.kg.gff.2
            @Override // com.bytedance.sdk.component.sg.fxn.fxn
            public void fxn(com.bytedance.sdk.component.sg.kg.gff gffVar, com.bytedance.sdk.component.sg.kg kgVar2) {
                String str2;
                boolean z2;
                kg kgVar3 = kg.this;
                if (kgVar3 == null || kgVar3.fxn == null) {
                    return;
                }
                String str3 = null;
                if (kgVar2 == null || !kgVar2.bh()) {
                    if (kgVar2 != null) {
                        str3 = kgVar2.fxn() + ":" + kgVar2.kg();
                        if (!z && (kgVar2.fxn() <= 300 || kgVar2.fxn() >= 400)) {
                            gff.fxn.put(str, kg.this);
                        }
                    }
                    str2 = str3;
                    z2 = false;
                } else {
                    str2 = null;
                    z2 = true;
                }
                gff.kg(z2, str2, qhf.gff(kg.this.fxn.md()), kg.this, str, z);
                if (!z2 || gff.fxn.isEmpty()) {
                    return;
                }
                gff.kg();
            }

            @Override // com.bytedance.sdk.component.sg.fxn.fxn
            public void fxn(com.bytedance.sdk.component.sg.kg.gff gffVar, IOException iOException) {
                kg kgVar2 = kg.this;
                if (kgVar2 != null && kgVar2.fxn != null) {
                    gff.kg(false, iOException != null ? iOException.getMessage() : null, qhf.gff(kg.this.fxn.md()), kg.this, str, z);
                }
                if (z || kg.this == null) {
                    return;
                }
                gff.fxn.put(str, kg.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void kg() {
        if (kg.compareAndSet(false, true)) {
            Map<String, kg> map = fxn;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    fxn((String) entry.getKey(), (kg) entry.getValue(), true);
                }
            }
            kg.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void kg(final boolean z, final String str, final String str2, final kg kgVar, final String str3, final boolean z2) {
        if (kgVar == null || kgVar.fxn == null) {
            return;
        }
        final boolean ew = kgVar.fxn.ew();
        final String str4 = ew ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.hm.gff.fxn(new tw(str4) { // from class: com.bytedance.sdk.openadsdk.core.mvp.kg.gff.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", kgVar.kg);
                    jSONObject.put("success", z);
                    jSONObject.put("url", str3);
                    if (ew) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("description", str);
                        }
                        if (kgVar.gff >= 0.0f) {
                            jSONObject.put("progress", Math.round(kgVar.gff * 100.0f) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.hm.gff.fxn(System.currentTimeMillis(), kgVar.fxn, str2, str4, new com.bytedance.sdk.openadsdk.ckl.gff.fxn() { // from class: com.bytedance.sdk.openadsdk.core.mvp.kg.gff.3.1
                    @Override // com.bytedance.sdk.openadsdk.ckl.gff.fxn, com.bytedance.sdk.openadsdk.ckl.gff.kg
                    public JSONObject gff() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.ckl.gff.fxn, com.bytedance.sdk.openadsdk.ckl.gff.kg
                    public JSONObject fxn() {
                        if (!z2) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        });
    }

    public static JSONArray fxn(List<gff> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i).gff());
        }
        return jSONArray;
    }

    public static List<gff> fxn(JSONArray jSONArray) {
        return fxn(jSONArray, false);
    }

    public static List<gff> fxn(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new fxn(optString).fxn(z).fxn());
                }
            }
        }
        return arrayList;
    }

    public static List<com.bytedance.sdk.openadsdk.core.mvp.kg.kg> kg(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new kg.fxn(optJSONObject.optString("content"), (float) optJSONObject.optDouble("trackingFraction", 0.0d)).fxn());
                }
            }
        }
        return arrayList;
    }

    public static List<com.bytedance.sdk.openadsdk.core.mvp.kg.fxn> gff(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new fxn.C0519fxn(optJSONObject.optString("content"), optJSONObject.optLong("trackingMilliseconds", 0L)).fxn());
                }
            }
        }
        return arrayList;
    }

    public String gff() {
        return this.gff;
    }

    public boolean hm() {
        return this.hm;
    }

    public void j_() {
        this.bh = true;
    }

    public boolean rb() {
        return this.bh;
    }

    public static class fxn {
        private final String fxn;
        private EnumC0520gff kg = EnumC0520gff.TRACKING_URL;
        private boolean gff = false;

        public fxn(String str) {
            this.fxn = str;
        }

        public fxn fxn(boolean z) {
            this.gff = z;
            return this;
        }

        public gff fxn() {
            return new gff(this.fxn, this.kg, Boolean.valueOf(this.gff));
        }
    }

    public static class kg {
        final jz fxn;
        float gff;
        String kg;

        public kg(String str, jz jzVar) {
            this(str, jzVar, -1.0f);
        }

        public kg(String str, jz jzVar, float f) {
            this.kg = str;
            this.fxn = jzVar;
            this.gff = f;
        }

        public String toString() {
            return super.toString();
        }
    }
}
