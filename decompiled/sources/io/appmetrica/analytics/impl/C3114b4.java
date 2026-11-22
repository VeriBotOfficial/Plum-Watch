package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3114b4 {

    /* renamed from: a, reason: collision with root package name */
    public final C3474pf f18194a;
    public final CounterConfiguration b;

    public C3114b4(C3474pf c3474pf, CounterConfiguration counterConfiguration) {
        this.f18194a = c3474pf;
        this.b = counterConfiguration;
    }

    public static C3114b4 a(Context context, Bundle bundle) {
        C3474pf c3474pf;
        CounterConfiguration fromBundle;
        String str = C3474pf.c;
        if (bundle != null) {
            try {
                c3474pf = (C3474pf) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
            fromBundle = CounterConfiguration.fromBundle(bundle);
            if (fromBundle == null && c3474pf != null && context.getPackageName().equals(c3474pf.f18454a.getAsString("PROCESS_CFG_PACKAGE_NAME")) && c3474pf.f18454a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() == AppMetrica.getLibraryApiLevel()) {
                return new C3114b4(c3474pf, fromBundle);
            }
            return null;
        }
        c3474pf = null;
        fromBundle = CounterConfiguration.fromBundle(bundle);
        if (fromBundle == null) {
        }
        return null;
    }

    public final CounterConfiguration b() {
        return this.b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f18194a + ", mCounterConfiguration=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }

    public final C3474pf a() {
        return this.f18194a;
    }
}
