package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.xh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3675xh extends C3114b4 {
    protected I8 c;
    protected C3324jf d;
    public boolean e;
    public String f;

    public C3675xh(C3474pf c3474pf, CounterConfiguration counterConfiguration) {
        this(c3474pf, counterConfiguration, null);
    }

    public final void a(Tk tk) {
        this.c = new I8(tk);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.b.toBundle(bundle);
        C3474pf c3474pf = this.f18194a;
        synchronized (c3474pf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", c3474pf);
        }
        return bundle;
    }

    public final String d() {
        I8 i8 = this.c;
        if (i8.f17902a.isEmpty()) {
            return null;
        }
        return new JSONObject(i8.f17902a).toString();
    }

    public final synchronized String e() {
        return this.f;
    }

    public boolean f() {
        return this.e;
    }

    public C3675xh(C3474pf c3474pf, CounterConfiguration counterConfiguration, String str) {
        super(c3474pf, counterConfiguration);
        this.e = true;
        this.f = str;
    }
}
