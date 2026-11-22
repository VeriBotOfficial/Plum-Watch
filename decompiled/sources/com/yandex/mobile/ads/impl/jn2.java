package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jn2 implements t92 {

    /* renamed from: a, reason: collision with root package name */
    public static final jn2 f15934a = new jn2();
    private static final Object b = new Object();
    private static volatile in2 c;

    @Override // com.yandex.mobile.ads.impl.t92
    public final r92 a(Context context) {
        in2 in2Var;
        Intrinsics.checkNotNullParameter(context, "context");
        in2 in2Var2 = c;
        if (in2Var2 != null) {
            return in2Var2;
        }
        synchronized (b) {
            in2Var = c;
            if (in2Var == null) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                String str = pa.a(applicationContext) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
                we weVar = new we(applicationContext);
                weVar.a(str);
                int i = pw1.l;
                in2Var = new in2(weVar, applicationContext, pw1.a.a().a(applicationContext));
                c = in2Var;
            }
        }
        return in2Var;
    }

    private jn2() {
    }
}
