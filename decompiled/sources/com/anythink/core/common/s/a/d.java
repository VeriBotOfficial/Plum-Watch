package com.anythink.core.common.s.a;

import android.util.Log;

/* loaded from: classes12.dex */
final class d implements com.anythink.core.common.s.a.a.c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4313a = "FastKV";

    d() {
    }

    @Override // com.anythink.core.common.s.a.a.c
    public final void a(String str, String str2) {
        Log.i(f4313a, str + " " + str2);
    }

    @Override // com.anythink.core.common.s.a.a.c
    public final void a(String str, Exception exc) {
        Log.w(f4313a, str, exc);
    }

    @Override // com.anythink.core.common.s.a.a.c
    public final void b(String str, Exception exc) {
        Log.e(f4313a, str, exc);
    }
}
