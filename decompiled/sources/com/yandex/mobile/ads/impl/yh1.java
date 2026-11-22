package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.km;

/* loaded from: classes5.dex */
public class yh1 extends Exception implements km {
    public final int b;
    public final long c;

    static {
        new km.a() { // from class: com.yandex.mobile.ads.impl.yh1$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.km.a
            public final km fromBundle(Bundle bundle) {
                return new yh1(bundle);
            }
        };
    }

    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(3, 36));
        String string2 = bundle.getString(Integer.toString(4, 36));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, yh1.class.getClassLoader());
            Throwable th = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string2) : null;
            return th == null ? new RemoteException(string2) : th;
        } catch (Throwable unused) {
            return new RemoteException(string2);
        }
    }

    protected yh1(Bundle bundle) {
        this(bundle.getString(a(2)), a(bundle), bundle.getInt(a(0), 1000), bundle.getLong(a(1), SystemClock.elapsedRealtime()));
    }

    protected static String a(int i) {
        return Integer.toString(i, 36);
    }

    protected yh1(String str, Throwable th, int i, long j) {
        super(str, th);
        this.b = i;
        this.c = j;
    }
}
