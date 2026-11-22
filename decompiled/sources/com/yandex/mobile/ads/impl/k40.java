package com.yandex.mobile.ads.impl;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* loaded from: classes5.dex */
final class k40 {
    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }

    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }
}
