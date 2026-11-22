package com.hihonor.push.sdk;

import android.util.Log;
import com.hihonor.push.sdk.common.RequestHeader;

/* loaded from: classes11.dex */
public abstract class z0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public m0<TResult> f10169a;
    public final String b;
    public final c c;
    public final y d;
    public RequestHeader e;

    public z0(String str, c cVar) {
        this.b = str;
        this.c = cVar;
        this.d = y.b(str);
    }

    public abstract void a(h hVar, Object obj);

    public final void b(h hVar, Object obj) {
        if (this.f10169a != null) {
            a(hVar, obj);
        } else {
            Log.e("TaskApiCall", "This Task has been canceled, uri:" + this.b);
        }
    }
}
