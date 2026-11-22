package com.tramini.plugin.a.a;

import android.content.Intent;
import com.anythink.core.common.d.j;
import com.tramini.plugin.a.b.b;
import com.tramini.plugin.a.b.c;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    public static void a(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "1004688");
            jSONObject.put("msg", "3");
            jSONObject.put("msg1", str);
            jSONObject.put("msg2", str2);
            jSONObject.put("msg3", str3);
            c.a();
            c.a(new AnonymousClass1(jSONObject));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com.tramini.plugin.a.a.a$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f13691a;

        AnonymousClass1(JSONObject jSONObject) {
            this.f13691a = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Intent intent = new Intent();
                intent.setAction(j.v);
                intent.putExtra(j.w, this.f13691a.toString());
                b.a(c.a().b()).a(intent);
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(JSONObject jSONObject) {
        c.a();
        c.a(new AnonymousClass1(jSONObject));
    }
}
