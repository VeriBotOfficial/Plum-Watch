package com.qumeng.overseas.advlib.__remote__.utils;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class m {
    public static String a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            if (locale == null) {
                return "";
            }
            String language = locale.getLanguage();
            String country = locale.getCountry();
            if (TextUtils.isEmpty(country)) {
                return language;
            }
            if (!TextUtils.isEmpty(language) && !TextUtils.isEmpty(country)) {
                return language + Constants.ACCEPT_TIME_SEPARATOR_SERVER + country;
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
