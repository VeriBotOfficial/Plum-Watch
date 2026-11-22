package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class M1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3270ha f17967a;
    public boolean b;

    public M1() {
        this(new C3270ha());
    }

    public final synchronized long a(Context context) {
        String a2;
        try {
            this.f17967a.getClass();
            a2 = Qa.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return TextUtils.isEmpty(a2) ? 0L : new JSONObject(a2).optLong("delay");
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.b) {
            return;
        }
        long a2 = a(context);
        if (a2 > 0) {
            try {
                Thread.sleep(a2);
            } catch (Throwable unused) {
            }
        }
        this.b = true;
    }

    public M1(C3270ha c3270ha) {
        this.b = false;
        this.f17967a = c3270ha;
    }
}
