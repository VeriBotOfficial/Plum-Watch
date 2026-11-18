package com.baidu.ar;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7348a;
    public boolean b;
    public int c;
    public c d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7349a;
        public HashMap<String, Double> b;

        public static a a(JSONObject jSONObject) {
            a aVar = null;
            if (jSONObject == null) {
                return null;
            }
            try {
                a aVar2 = new a();
                try {
                    if (jSONObject.has("audio")) {
                        aVar2.a(jSONObject.getString("audio"));
                    }
                    if (jSONObject.has("values")) {
                        HashMap<String, Double> map = new HashMap<>();
                        JSONObject jSONObject2 = jSONObject.getJSONObject("values");
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, Double.valueOf(jSONObject2.getDouble(next)));
                        }
                        aVar2.a(map);
                    }
                    return aVar2;
                } catch (Exception e) {
                    e = e;
                    aVar = aVar2;
                    e.printStackTrace();
                    return aVar;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }

        public String a() {
            return this.f7349a;
        }

        public void a(String str) {
            this.f7349a = str;
        }

        public void a(HashMap<String, Double> map) {
            this.b = map;
        }

        public HashMap<String, Double> b() {
            return this.b;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f7350a;

        public static b a(JSONObject jSONObject) {
            b bVar = null;
            if (jSONObject == null) {
                return null;
            }
            try {
                b bVar2 = new b();
                try {
                    if (jSONObject.has(com.anythink.core.common.m.b.g.h)) {
                        bVar2.a(a.a(jSONObject.getJSONObject(com.anythink.core.common.m.b.g.h)));
                    }
                    return bVar2;
                } catch (Exception e) {
                    e = e;
                    bVar = bVar2;
                    e.printStackTrace();
                    return bVar;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }

        public a a() {
            return this.f7350a;
        }

        public void a(a aVar) {
            this.f7350a = aVar;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f7351a;

        public static c a(JSONObject jSONObject) {
            c cVar = null;
            if (jSONObject == null) {
                return null;
            }
            try {
                c cVar2 = new c();
                try {
                    if (jSONObject.has("animation")) {
                        cVar2.a(b.a(jSONObject.getJSONObject("animation")));
                    }
                    return cVar2;
                } catch (Exception e) {
                    e = e;
                    cVar = cVar2;
                    e.printStackTrace();
                    return cVar;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }

        public b a() {
            return this.f7351a;
        }

        public void a(b bVar) {
            this.f7351a = bVar;
        }
    }

    public static yb a(JSONObject jSONObject) {
        yb ybVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            yb ybVar2 = new yb();
            try {
                if (jSONObject.has("id")) {
                    ybVar2.a(jSONObject.getString("id"));
                }
                if (jSONObject.has("initial")) {
                    ybVar2.a(jSONObject.getBoolean("initial"));
                }
                if (jSONObject.has("last")) {
                    ybVar2.b(jSONObject.getBoolean("last"));
                }
                if (jSONObject.has("frame_size")) {
                    ybVar2.a(jSONObject.getInt("frame_size"));
                }
                if (jSONObject.has("frame")) {
                    ybVar2.a(c.a(jSONObject.getJSONObject("frame")));
                }
                return ybVar2;
            } catch (Exception e) {
                e = e;
                ybVar = ybVar2;
                e.printStackTrace();
                return ybVar;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public c a() {
        return this.d;
    }

    public void a(int r1) {
        this.c = r1;
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
