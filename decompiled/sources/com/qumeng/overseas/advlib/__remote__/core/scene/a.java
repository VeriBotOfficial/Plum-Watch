package com.qumeng.overseas.advlib.__remote__.core.scene;

import com.qumeng.overseas.advlib.__remote__.ui.incite.j;
import com.qumeng.overseas.advlib.__remote__.utils.network.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class a implements oqmd.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f12870a;
    private final String b;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a f12871a = new a();

        private b() {
        }
    }

    public static a a() {
        return b.f12871a;
    }

    @Override // oqmd.a
    public void mediaTrace(String str, String str2, String str3, Map<String, String> map) {
        a(str, str3, str2, map);
    }

    private a() {
        this.f12870a = "adsdk_media_trace";
        this.b = "opt_media_";
    }

    private void a(String str, String str2, String str3, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("opt_scene_adseye_type", str);
        hashMap.put("opt_scene_name", str3);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && !key.isEmpty()) {
                    if (!key.startsWith("opt_media_")) {
                        key = "opt_media_" + key;
                    }
                    if (value == null) {
                        value = "";
                    }
                    hashMap.put(key, value);
                }
            }
        }
        c.b(null, new j("", 0, str2), "adsdk_media_trace", hashMap);
    }
}
