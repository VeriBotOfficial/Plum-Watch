package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes4.dex */
class an {

    /* renamed from: a, reason: collision with root package name */
    static int f14432a;

    public static aj a(Context context) {
        if (j.m12357a()) {
            f14432a = 1;
            return new am(context);
        }
        if (ai.a(context)) {
            f14432a = 2;
            return new ai(context);
        }
        if (ap.a(context)) {
            f14432a = 4;
            return new ap(context);
        }
        if (ar.a(context)) {
            f14432a = 5;
            return new ar(context);
        }
        if (al.a(context)) {
            f14432a = 3;
            return new ak(context);
        }
        f14432a = 0;
        return new aq();
    }
}
