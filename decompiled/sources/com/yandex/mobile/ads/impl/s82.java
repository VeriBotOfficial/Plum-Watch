package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public final class s82 {

    /* renamed from: a, reason: collision with root package name */
    private final pw1 f16841a;
    private final Context b;

    public final String a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ju1 a2 = this.f16841a.a(this.b);
        if (a2 == null || a2.P()) {
            return a(url, String.valueOf(System.currentTimeMillis()), StringsKt.indexOf$default((CharSequence) url, '?', 0, false, 6, (Object) null) == -1 ? '?' : Typography.amp);
        }
        return url;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s82(Context context) {
        this(context, pw1.a.a());
        int i = pw1.l;
    }

    public s82(Context context, pw1 sdkSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f16841a = sdkSettings;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.b = applicationContext;
    }

    private static String a(String str, String str2, char c) {
        return str + (str.length() == 0 ? "" : Character.valueOf(c)) + "ctime=" + str2;
    }
}
