package com.mbridge.msdk.foundation.same.image;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.tools.t0;

/* compiled from: CommonImageLoader.java */
/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f11569a;

    protected b(Context context) {
    }

    public static b a(Context context) {
        if (f11569a == null) {
            f11569a = new b(context);
        }
        return f11569a;
    }

    public void a() {
    }

    public void a(String str) {
    }

    public Bitmap b(String str) {
        if (t0.k(str)) {
            return null;
        }
        return d.a().c(str);
    }

    public void b() {
    }

    public boolean c(String str) {
        if (t0.k(str)) {
            return false;
        }
        return d.a().d(str);
    }

    public void a(String str, c cVar) {
        d.a().b(str, null, cVar);
    }
}
