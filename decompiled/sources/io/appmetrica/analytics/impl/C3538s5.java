package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.s5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3538s5 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18490a = new HashMap();
    public final HashMap b = new HashMap();
    public final Context c;

    public C3538s5(Context context) {
        this.c = context.getApplicationContext();
    }

    public final Na a(C3215f5 c3215f5, G4 g4, T7 t7, HashMap hashMap) {
        Na na = (Na) hashMap.get(c3215f5.toString());
        if (na != null) {
            na.a(g4);
            return na;
        }
        Na a2 = t7.a(this.c, c3215f5, g4);
        hashMap.put(c3215f5.toString(), a2);
        return a2;
    }
}
