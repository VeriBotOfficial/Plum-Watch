package io.appmetrica.analytics.impl;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Locale;

/* renamed from: io.appmetrica.analytics.impl.ve, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3622ve {

    /* renamed from: a, reason: collision with root package name */
    public static final SafePackageManager f18551a = new SafePackageManager();
    public static final C3498qe b = new C3498qe();
    public static final C3522re c = new C3522re();
    public static final C3547se d = new C3547se(2);

    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        String script = locale.getScript();
        if (!TextUtils.isEmpty(script)) {
            sb.append('-').append(script);
        }
        if (!TextUtils.isEmpty(country)) {
            sb.append('_').append(country);
        }
        return sb.toString();
    }

    public static EnumC3597ue a(ConnectivityManager connectivityManager) {
        NetworkInfo networkInfo;
        EnumC3597ue enumC3597ue = EnumC3597ue.UNDEFINED;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (!AndroidUtils.isApiAchieved(29) ? !(activeNetwork != null && ((networkInfo = connectivityManager.getNetworkInfo(activeNetwork)) == null || networkInfo.isConnected())) : activeNetwork == null) {
            return EnumC3597ue.OFFLINE;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            for (Integer num : c.f17917a.keySet()) {
                if (networkCapabilities.hasTransport(num.intValue())) {
                    return (EnumC3597ue) c.a(num);
                }
            }
        }
        return enumC3597ue;
    }
}
