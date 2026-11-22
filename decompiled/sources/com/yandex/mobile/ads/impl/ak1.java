package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.media3.common.C;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ak1 {
    public static Intent a(Context context, zj1 preferredPackage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferredPackage, "preferredPackage");
        String e = preferredPackage.e();
        String d = preferredPackage.d();
        Map<String, Object> a2 = preferredPackage.a();
        Integer b = preferredPackage.b();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(e));
        if (b == null || !(context instanceof Activity)) {
            intent.addFlags((b != null ? b.intValue() : 0) | C.ENCODING_PCM_24BIT_BIG_ENDIAN);
        } else {
            intent.addFlags(b.intValue());
        }
        intent.setPackage(d);
        if (a2 != null) {
            for (Map.Entry<String, Object> entry : a2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    intent.putExtra(key, ((Number) value).intValue());
                } else if (value instanceof String) {
                    intent.putExtra(key, (String) value);
                } else if (value instanceof f80) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        ((f80) value).getClass();
                        Result.m14057constructorimpl(intent.putExtra(key, (Parcelable) null));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m14057constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }
        }
        return intent;
    }
}
