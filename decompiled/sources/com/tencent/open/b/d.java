package com.tencent.open.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.WindowManager;
import java.util.Locale;

/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f13636a;
    private static String b;

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f13636a)) {
            return f13636a;
        }
        if (context == null) {
            return "";
        }
        f13636a = "";
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            f13636a = windowManager.getDefaultDisplay().getWidth() + "x" + windowManager.getDefaultDisplay().getHeight();
        }
        return f13636a;
    }

    public static String a() {
        return Locale.getDefault().getLanguage();
    }
}
