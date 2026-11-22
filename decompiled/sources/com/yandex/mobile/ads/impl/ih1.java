package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ih1 {
    @JvmStatic
    public static final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            return activeNetworkInfo.getType() == 0 ? activeNetworkInfo.getSubtypeName() : activeNetworkInfo.getTypeName();
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmStatic
    public static final Point b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @JvmStatic
    public static final Boolean c(Context context) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            int i = pw1.l;
            ju1 a2 = pw1.a.a().a(context);
            if (Intrinsics.areEqual(a2 != null ? Boolean.valueOf(a2.T()) : null, Boolean.TRUE)) {
                Object systemService = context.getSystemService("connectivity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    z = true;
                    if (networkCapabilities.hasTransport(4)) {
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
