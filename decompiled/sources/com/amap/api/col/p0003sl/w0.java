package com.amap.api.col.p0003sl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: FeatureManager.java */
/* loaded from: classes11.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Boolean> f1939a;
    private AtomicBoolean b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FeatureManager.java */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static w0 f1940a = new w0();
    }

    private void a() {
        this.f1939a.put("feature_mvt", Boolean.TRUE);
        Map<String, Boolean> map = this.f1939a;
        Boolean bool = Boolean.FALSE;
        map.put("feature_gltf", bool);
        this.f1939a.put("feature_terrain", bool);
    }

    public boolean b() {
        return this.b.get();
    }

    private w0() {
        this.f1939a = new ConcurrentHashMap();
        this.b = new AtomicBoolean(false);
        a();
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("mvt_able");
        a9.a(optString, true);
        this.f1939a.put("feature_mvt", Boolean.valueOf(a9.a(optString, true)));
        this.f1939a.put("feature_gltf", Boolean.valueOf(a9.a(jSONObject.optString("gltf_able"), false)));
        this.f1939a.put("feature_terrain", Boolean.valueOf(a9.a(jSONObject.optString("terrain_able"), false)));
        this.b.set(true);
    }

    public boolean a(String str) {
        if (this.f1939a.containsKey(str)) {
            return this.f1939a.get(str).booleanValue();
        }
        return false;
    }
}
