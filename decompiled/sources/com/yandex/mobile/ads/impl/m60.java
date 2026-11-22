package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.km;
import com.yandex.mobile.ads.impl.vw0;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class m60 extends yh1 {
    public final int d;
    public final String e;
    public final int f;
    public final jc0 g;
    public final int h;
    public final rw0 i;
    final boolean j;

    /* renamed from: $r8$lambda$Dz8fXPOqWIB2qJE7ILOR0-f5M4Y, reason: not valid java name */
    public static /* synthetic */ m60 m13388$r8$lambda$Dz8fXPOqWIB2qJE7ILOR0f5M4Y(Bundle bundle) {
        return new m60(bundle);
    }

    static {
        new km.a() { // from class: com.yandex.mobile.ads.impl.m60$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.km.a
            public final km fromBundle(Bundle bundle) {
                return m60.m13388$r8$lambda$Dz8fXPOqWIB2qJE7ILOR0f5M4Y(bundle);
            }
        };
    }

    private m60(int i, Throwable th, int i2, int i3) {
        this(a(i, null, null, -1, null, 4), th, i2, i, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    public static m60 a() {
        return new m60(a(3, "Video load error occurred", null, -1, null, 4), null, 1001, 3, null, -1, null, 4, null, SystemClock.elapsedRealtime(), false);
    }

    public static m60 a(Exception exc, String str, int i, jc0 jc0Var, int i2, boolean z, int i3) {
        int i4 = jc0Var == null ? 4 : i2;
        return new m60(a(1, null, str, i, jc0Var, i4), exc, i3, 1, str, i, jc0Var, i4, null, SystemClock.elapsedRealtime(), z);
    }

    @Deprecated
    public static m60 a(IllegalStateException illegalStateException) {
        return new m60(2, illegalStateException, 1000, 0);
    }

    private m60(Bundle bundle) {
        super(bundle);
        this.d = bundle.getInt(yh1.a(1001), 2);
        this.e = bundle.getString(yh1.a(1002));
        this.f = bundle.getInt(yh1.a(1003), -1);
        Bundle bundle2 = bundle.getBundle(yh1.a(1004));
        this.g = bundle2 == null ? null : jc0.I.fromBundle(bundle2);
        this.h = bundle.getInt(yh1.a(1005), 4);
        this.j = bundle.getBoolean(yh1.a(1006), false);
        this.i = null;
    }

    private m60(String str, Throwable th, int i, int i2, String str2, int i3, jc0 jc0Var, int i4, vw0.b bVar, long j, boolean z) {
        super(str, th, i, j);
        hg.a(!z || i2 == 1);
        hg.a(th != null || i2 == 3);
        this.d = i2;
        this.e = str2;
        this.f = i3;
        this.g = jc0Var;
        this.h = i4;
        this.i = bVar;
        this.j = z;
    }

    private static String a(int i, String str, String str2, int i2, jc0 jc0Var, int i3) {
        String str3;
        String str4;
        if (i == 0) {
            str3 = "Source error";
        } else if (i == 1) {
            StringBuilder append = new StringBuilder().append(str2).append(" error, index=").append(i2).append(", format=").append(jc0Var).append(", format_supported=");
            int i4 = f92.f15466a;
            if (i3 == 0) {
                str4 = "NO";
            } else if (i3 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i3 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i3 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i3 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            str3 = append.append(str4).toString();
        } else if (i != 3) {
            str3 = "Unexpected runtime error";
        } else {
            str3 = "Remote error";
        }
        return !TextUtils.isEmpty(str) ? str3 + ": " + str : str3;
    }

    public static m60 a(IOException iOException, int i) {
        return new m60(0, iOException, i, 0);
    }

    public static m60 a(RuntimeException runtimeException, int i) {
        return new m60(2, runtimeException, i, 0);
    }

    final m60 a(vw0.b bVar) {
        String message = getMessage();
        int i = f92.f15466a;
        return new m60(message, getCause(), this.b, this.d, this.e, this.f, this.g, this.h, bVar, this.c, this.j);
    }
}
