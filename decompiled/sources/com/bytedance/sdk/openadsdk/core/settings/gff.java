package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.utils.ils;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class gff {
    private static final ConcurrentHashMap<String, kg> fxn = new ConcurrentHashMap<>();

    public static void fxn(boolean z) {
        String fxn2;
        File kg = kg();
        try {
            if (!kg.exists()) {
                if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
                    fxn2 = com.bytedance.sdk.openadsdk.multipro.hm.fxn.kg("tt_sdk_settings", "ad_slot_conf", null);
                } else {
                    fxn2 = ils.fxn("tt_sdk_settings", rmu.fxn()).fxn("ad_slot_conf", (String) null);
                }
                if (TextUtils.isEmpty(fxn2)) {
                    return;
                }
                HashMap<String, kg> kg2 = kg(new JSONArray(fxn2));
                if (kg2.isEmpty()) {
                    return;
                }
                ConcurrentHashMap<String, kg> concurrentHashMap = fxn;
                concurrentHashMap.clear();
                concurrentHashMap.putAll(kg2);
                return;
            }
            HashMap<String, kg> kg3 = kg(new JSONArray(new String(com.bytedance.sdk.component.utils.sg.hm(kg))));
            if (kg3.isEmpty()) {
                return;
            }
            for (Map.Entry<String, kg> entry : kg3.entrySet()) {
                fxn.put(entry.getKey(), entry.getValue());
            }
        } catch (Exception unused) {
        }
    }

    private static HashMap<String, kg> kg(JSONArray jSONArray) {
        HashMap<String, kg> hashMap = new HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                kg fxn2 = fxn(jSONArray.getJSONObject(i));
                if (fxn2 != null) {
                    hashMap.put(fxn2.fxn, fxn2);
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    private static File kg() {
        return new File(rmu.fxn().getFilesDir(), "tt_ads_conf_sr");
    }

    private static kg fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new kg(jSONObject);
    }

    public static kg fxn(String str) {
        kg kgVar = fxn.get(str);
        return kgVar == null ? kg(str) : kgVar;
    }

    private static kg kg(String str) {
        return new kg(str, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void fxn(org.json.JSONArray r5) {
        /*
            if (r5 != 0) goto L4
            goto La9
        L4:
            java.io.File r0 = kg()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r0.getParent()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ".tmp"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r2 = 0
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r3 == 0) goto L32
            r1.delete()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
        L32:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            r3.write(r2)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            r1.renameTo(r0)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r0 = "tt_sdk_settings"
            android.content.Context r2 = com.bytedance.sdk.openadsdk.core.rmu.fxn()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            com.bytedance.sdk.openadsdk.utils.ils r0 = com.bytedance.sdk.openadsdk.utils.ils.fxn(r0, r2)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            java.lang.String r2 = "ad_slot_conf"
            r0.fxn(r2)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L60
            boolean r0 = r1.exists()
            if (r0 == 0) goto L59
            r1.delete()
        L59:
            com.bytedance.sdk.openadsdk.utils.rlu.fxn(r3)
            goto L79
        L5d:
            r5 = move-exception
            r2 = r3
            goto Laa
        L60:
            r0 = move-exception
            r2 = r3
            goto L66
        L63:
            r5 = move-exception
            goto Laa
        L65:
            r0 = move-exception
        L66:
            java.lang.String r3 = "SdkSettings.AdSlot"
            java.lang.String r4 = "saveAdSlotToLocal: "
            android.util.Log.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L63
            boolean r0 = r1.exists()
            if (r0 == 0) goto L76
            r1.delete()
        L76:
            com.bytedance.sdk.openadsdk.utils.rlu.fxn(r2)
        L79:
            java.util.HashMap r5 = kg(r5)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto La9
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L8b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            com.bytedance.sdk.openadsdk.core.settings.kg r0 = (com.bytedance.sdk.openadsdk.core.settings.kg) r0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.kg> r2 = com.bytedance.sdk.openadsdk.core.settings.gff.fxn
            r2.put(r1, r0)
            goto L8b
        La9:
            return
        Laa:
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lb3
            r1.delete()
        Lb3:
            com.bytedance.sdk.openadsdk.utils.rlu.fxn(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.gff.fxn(org.json.JSONArray):void");
    }

    public static void fxn() {
        File kg = kg();
        if (kg.exists()) {
            kg.delete();
        }
    }
}
