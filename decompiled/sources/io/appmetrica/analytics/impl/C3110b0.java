package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3110b0 implements Pn {
    @Override // io.appmetrica.analytics.impl.Pn
    public final Nn a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new Nn(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new Nn(this, true, "");
        } catch (Throwable unused) {
            return new Nn(this, false, "Invalid ApiKey=" + str + ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
    }
}
