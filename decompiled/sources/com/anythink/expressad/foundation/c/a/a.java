package com.anythink.expressad.foundation.c.a;

import com.anythink.expressad.foundation.g.a.d;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private d f4767a;

    /* synthetic */ a(byte b) {
        this();
    }

    private a() {
        this.f4767a = new d();
    }

    /* renamed from: com.anythink.expressad.foundation.c.a.a$a, reason: collision with other inner class name */
    private static class C0235a {

        /* renamed from: a, reason: collision with root package name */
        private static a f4768a = new a(0);

        private C0235a() {
        }
    }

    public static a a() {
        return C0235a.f4768a;
    }

    public final JSONObject a(String str) {
        JSONObject b = this.f4767a.b(str);
        if (b != null) {
            return b;
        }
        return null;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.f4767a.a(next, jSONObject.optJSONObject(next));
            }
        }
    }

    private JSONArray b() {
        return new JSONArray((Collection) this.f4767a.a());
    }
}
