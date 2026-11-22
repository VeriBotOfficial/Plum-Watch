package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.g;
import com.xiaomi.push.ax;

/* loaded from: classes4.dex */
public class s {
    public static AbstractPushManager a(Context context, d dVar) {
        return b(context, dVar);
    }

    private static AbstractPushManager b(Context context, d dVar) {
        g.a a2 = g.a(dVar);
        if (a2 == null || TextUtils.isEmpty(a2.f14392a) || TextUtils.isEmpty(a2.b)) {
            return null;
        }
        return (AbstractPushManager) ax.a(a2.f14392a, a2.b, context);
    }
}
