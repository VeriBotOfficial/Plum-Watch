package com.baidu.ar;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class t3 implements Cloneable {
    public static final Object c = new Object();
    public static t3 d = null;
    public static int e = 0;
    public static volatile boolean f = false;
    public t3 b = null;

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f7207a = new JSONObject();

    public t3(String str) {
        h(str);
        a(System.currentTimeMillis());
    }

    public static void a(t3 t3Var) {
        if (f) {
            return;
        }
        synchronized (c) {
            t3Var.f();
        }
    }

    public static void a(t3... t3VarArr) {
        if (f) {
            return;
        }
        synchronized (c) {
            if (t3VarArr != null) {
                for (t3 t3Var : t3VarArr) {
                    t3Var.f();
                }
            }
        }
    }

    public static t3 b(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str.trim());
                t3 f2 = f(jSONObject.getString("event_id"));
                f2.f7207a = jSONObject;
                return f2;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static String b(t3 t3Var) {
        JSONObject jSONObject;
        if (t3Var == null || (jSONObject = t3Var.f7207a) == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public static t3 f(String str) {
        if (!f) {
            synchronized (c) {
                t3 t3Var = d;
                if (t3Var != null) {
                    d = t3Var.b;
                    t3Var.b = null;
                    e--;
                    if (t3Var.f7207a == null) {
                        t3Var.f7207a = new JSONObject();
                    }
                    t3Var.h(str);
                    t3Var.a(System.currentTimeMillis());
                    return t3Var;
                }
            }
        }
        return new t3(str);
    }

    public static void g() {
        if (f) {
            return;
        }
        synchronized (c) {
            f = true;
            d = null;
            e = 0;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public t3 clone() {
        t3 f2 = f("");
        try {
            f2.f7207a = new JSONObject(this.f7207a.toString());
            return f2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return f2;
        }
    }

    public JSONObject a(Collection<String> collection) {
        return a((JSONObject) null, collection);
    }

    public JSONObject a(JSONObject jSONObject, Collection<String> collection) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            Iterator<String> keys = this.f7207a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (collection == null || !collection.contains(next)) {
                    jSONObject.put(next, this.f7207a.get(next));
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public void a(long j) {
        try {
            this.f7207a.putOpt("time", Long.valueOf(j));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void a(String str, Object obj) {
        try {
            this.f7207a.putOpt(str, obj);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f7207a.putOpt(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public boolean a(String str) {
        return this.f7207a.has(str);
    }

    public String b() {
        return this.f7207a.optString("event_id");
    }

    public long c() {
        return this.f7207a.optLong("time");
    }

    public Object c(String str) {
        return this.f7207a.opt(str);
    }

    public long d(String str) {
        Object c2 = c(str);
        if (c2 instanceof Number) {
            return ((Number) c2).longValue();
        }
        return 0L;
    }

    public String d() {
        String b = b(this);
        if (b == null) {
            return null;
        }
        return k8.a(b);
    }

    public String e(String str) {
        return this.f7207a.optString(str);
    }

    public Iterator<String> e() {
        return this.f7207a.keys();
    }

    public final void f() {
        this.f7207a = null;
        int i = e;
        if (i < 500) {
            this.b = d;
            d = this;
            e = i + 1;
        }
    }

    public void g(String str) {
        this.f7207a.remove(str);
    }

    public JSONObject h() {
        return a((JSONObject) null, (Collection<String>) null);
    }

    public void h(String str) {
        try {
            this.f7207a.putOpt("event_id", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
