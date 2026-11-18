package com.anythink.expressad.foundation.b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4763a = "a";
    private static volatile a b;
    private Context c;
    private String d;
    private String e;
    private JSONObject g;
    private boolean i;
    private WeakReference<Context> j;
    private WeakReference<Activity> k;
    private String l;
    private int f = 0;
    private boolean h = false;

    public final void a(String str) {
        this.l = str;
    }

    public final String a() {
        return this.l;
    }

    public final String b() {
        try {
            Context context = this.c;
            if (context != null) {
                return context.getPackageName();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private a() {
    }

    public static a c() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final void d() {
        if (this.h) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.g = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final Context e() {
        return this.c;
    }

    public final void a(Context context) {
        this.c = context;
    }

    public final String f() {
        if (!TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        return "";
    }

    public final void b(String str) {
        this.d = str;
    }

    public final String g() {
        if (!TextUtils.isEmpty(this.e)) {
            return this.e;
        }
        return "";
    }

    public final void c(String str) {
        this.e = str;
    }

    public final Context h() {
        WeakReference<Context> weakReference = this.j;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void b(Context context) {
        this.j = new WeakReference<>(context);
    }

    public final int i() {
        return this.f;
    }

    private void a(int r1) {
        this.f = r1;
    }

    public final JSONObject j() {
        return this.g;
    }

    private void a(JSONObject jSONObject) {
        this.g = jSONObject;
    }
}
