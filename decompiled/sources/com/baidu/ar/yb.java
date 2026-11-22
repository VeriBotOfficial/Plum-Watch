package com.baidu.ar;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class yb {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7348a;
    public boolean b;
    public int c;
    public c d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f7349a;
        public HashMap<String, Double> b;

        public static a a(JSONObject jSONObject) {
            a aVar;
            a aVar2 = null;
            if (jSONObject != null) {
                try {
                    aVar = new a();
                } catch (Exception e) {
                    e = e;
                }
                try {
                    if (jSONObject.has("audio")) {
                        aVar.a(jSONObject.getString("audio"));
                    }
                    if (jSONObject.has("values")) {
                        HashMap<String, Double> hashMap = new HashMap<>();
                        JSONObject jSONObject2 = jSONObject.getJSONObject("values");
                        Iterator<String> keys = jSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, Double.valueOf(jSONObject2.getDouble(next)));
                        }
                        aVar.a(hashMap);
                    }
                    return aVar;
                } catch (Exception e2) {
                    e = e2;
                    aVar2 = aVar;
                    e.printStackTrace();
                    return aVar2;
                }
            }
            return aVar2;
        }

        public String a() {
            return this.f7349a;
        }

        public void a(String str) {
            this.f7349a = str;
        }

        public void a(HashMap<String, Double> hashMap) {
            this.b = hashMap;
        }

        public HashMap<String, Double> b() {
            return this.b;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public a f7350a;

        public static b a(JSONObject jSONObject) {
            b bVar;
            b bVar2 = null;
            if (jSONObject != null) {
                try {
                    bVar = new b();
                } catch (Exception e) {
                    e = e;
                }
                try {
                    if (jSONObject.has(com.anythink.core.common.m.b.g.h)) {
                        bVar.a(a.a(jSONObject.getJSONObject(com.anythink.core.common.m.b.g.h)));
                    }
                    return bVar;
                } catch (Exception e2) {
                    e = e2;
                    bVar2 = bVar;
                    e.printStackTrace();
                    return bVar2;
                }
            }
            return bVar2;
        }

        public a a() {
            return this.f7350a;
        }

        public void a(a aVar) {
            this.f7350a = aVar;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public b f7351a;

        public static c a(JSONObject jSONObject) {
            c cVar;
            c cVar2 = null;
            if (jSONObject != null) {
                try {
                    cVar = new c();
                } catch (Exception e) {
                    e = e;
                }
                try {
                    if (jSONObject.has("animation")) {
                        cVar.a(b.a(jSONObject.getJSONObject("animation")));
                    }
                    return cVar;
                } catch (Exception e2) {
                    e = e2;
                    cVar2 = cVar;
                    e.printStackTrace();
                    return cVar2;
                }
            }
            return cVar2;
        }

        public b a() {
            return this.f7351a;
        }

        public void a(b bVar) {
            this.f7351a = bVar;
        }
    }

    public static yb a(JSONObject jSONObject) {
        yb ybVar;
        yb ybVar2 = null;
        if (jSONObject != null) {
            try {
                ybVar = new yb();
            } catch (Exception e) {
                e = e;
            }
            try {
                if (jSONObject.has("id")) {
                    ybVar.a(jSONObject.getString("id"));
                }
                if (jSONObject.has("initial")) {
                    ybVar.a(jSONObject.getBoolean("initial"));
                }
                if (jSONObject.has("last")) {
                    ybVar.b(jSONObject.getBoolean("last"));
                }
                if (jSONObject.has("frame_size")) {
                    ybVar.a(jSONObject.getInt("frame_size"));
                }
                if (jSONObject.has("frame")) {
                    ybVar.a(c.a(jSONObject.getJSONObject("frame")));
                }
                return ybVar;
            } catch (Exception e2) {
                e = e2;
                ybVar2 = ybVar;
                e.printStackTrace();
                return ybVar2;
            }
        }
        return ybVar2;
    }

    public c a() {
        return this.d;
    }

    public void a(int i) {
        this.c = i;
    }

    public void a(c cVar) {
        this.d = cVar;
    }

    public void a(String str) {
    }

    public void a(boolean z) {
        this.f7348a = z;
    }

    public int b() {
        return this.c;
    }

    public void b(boolean z) {
        this.b = z;
    }

    public boolean c() {
        return this.f7348a;
    }

    public boolean d() {
        return this.b;
    }
}
