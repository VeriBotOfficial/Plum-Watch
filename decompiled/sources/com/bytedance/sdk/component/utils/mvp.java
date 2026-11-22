package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* loaded from: classes13.dex */
public class mvp {
    private static Context fxn;

    public static void fxn(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            fxn = context.createConfigurationContext(kg(context, str, str2));
        } catch (Throwable th) {
            th.getMessage();
        }
        jz.fxn(fxn);
    }

    private static Configuration kg(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }
}
