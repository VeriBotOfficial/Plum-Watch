package com.wakeup.common.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.wakeup.common.base.BaseApplication;
import java.util.Locale;

/* loaded from: classes2.dex */
public class StringUtils {
    public static String getString(int resId, String str) {
        return !TextUtils.isEmpty(str) ? BaseApplication.getContext().getString(resId, str) : str;
    }

    public static String getString(int resId) {
        if (resId != 0) {
            return BaseApplication.getContext().getString(resId);
        }
        return "";
    }

    public static boolean isHttpUrl(String url) {
        if (TextUtils.isEmpty(url)) {
            return false;
        }
        return url.contains("http") || url.contains("www") || url.contains("https");
    }

    public static String getStrByLocale(int resId, Locale locale) {
        Context context = BaseApplication.getContext();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        try {
            return context.createConfigurationContext(configuration).getResources().getString(resId);
        } catch (Resources.NotFoundException unused) {
            return context.getString(resId);
        }
    }
}
