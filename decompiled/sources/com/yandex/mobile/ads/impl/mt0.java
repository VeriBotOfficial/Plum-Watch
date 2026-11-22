package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class mt0 {
    public static String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (String) a(context, nt0.f.a());
    }

    public static ArrayList b(Context context) {
        List split$default;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = (String) a(context, nt0.g.a());
        if (str == null || (split$default = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static Boolean c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (Boolean) a(context, nt0.d.a());
    }

    public static boolean d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = (Boolean) a(context, nt0.h.a());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static boolean e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = (Boolean) a(context, nt0.c.a());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static Boolean f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (Boolean) a(context, nt0.e.a());
    }

    public static boolean g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = (Boolean) a(context, nt0.i.a());
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static Object a(Context context, String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Throwable unused) {
                sp0.c(new Object[0]);
                applicationInfo = null;
            }
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(str)) {
                Object obj = bundle.get(str);
                if (obj == null) {
                    return null;
                }
                return obj;
            }
        } catch (Throwable unused2) {
            sp0.c(new Object[0]);
        }
        return null;
    }
}
