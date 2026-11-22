package com.qumeng.overseas.advlib.core;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.sdk.AppLovinMediationProvider;
import com.wakeup.common.common.constants.nativead.AdsEyeSDK.AdsEyeAdConstantsKt;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13270a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 8;
    public static final int i = 9;
    public static final int j = 12;
    public static final int k = 16;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 3;
    public static final int p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static final int f13271q = 0;
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = 3;
    public static final int u = 4;
    public static final int v = 5;

    String A();

    Object C();

    double D();

    int a(boolean z);

    default View a(Context context) {
        return null;
    }

    default View a(Context context, ViewGroup viewGroup) {
        return null;
    }

    default float b() {
        return -1.0f;
    }

    default View b(Context context) {
        return null;
    }

    AppInformation c();

    String d();

    boolean f();

    boolean g();

    String getAdFrom();

    default String getAdm() {
        return "";
    }

    String getMainImageUrl();

    String getTitle();

    int getVideoDuration();

    String getWarning();

    default Pair<Integer, Integer> h() {
        return new Pair<>(0, 0);
    }

    int i();

    List<String> j();

    String k();

    default Map l() {
        return Collections.emptyMap();
    }

    String m();

    boolean n();

    default String o() {
        return "";
    }

    String p();

    boolean q();

    boolean s();

    default String t() {
        return "";
    }

    int u();

    boolean v();

    boolean w();

    Pair<Integer, Integer> x();

    default String y() {
        return "";
    }

    default String z() {
        return "";
    }

    default String a() {
        return "";
    }

    default String a(String str, String str2) {
        if (str2.contains(com.qumeng.overseas.advlib.trdparty.unionset.network.c.w)) {
            return "https://cdn.adseye.com/nsdk/res/imgstatic/max_logo.png";
        }
        if (str2.contains(com.qumeng.overseas.advlib.trdparty.unionset.network.c.v)) {
            return "https://cdn.adseye.com/nsdk/res/imgstatic/pangle_logo_1.png";
        }
        if (str2.contains(AdsEyeAdConstantsKt.SOURCE_AD_ADSEYE)) {
            return "https://cdn.adseye.com/nsdk/res/imgstatic/adseye_logo.png";
        }
        if (str2.contains("admob")) {
            return "https://cdn.adseye.com/nsdk/res/imgstatic/admob_logo.png";
        }
        if (str2.contains("facebook")) {
            return "https://cdn.adseye.com/nsdk/res/imgstatic/meta_logo.png";
        }
        if (str2.contains("inmobi")) {
            return "https://cdn.adseye.com/nsdk/res/imgstatic/inmobi_logo.png";
        }
        if (str2.contains(AppLovinMediationProvider.IRONSOURCE)) {
            return "https://cdn.adseye.com/nsdk/res/imgstatic/ironsource_logo.png";
        }
        if (str2.contains("liftoff")) {
            return "https://cdn.adseye.com/nsdk/res/imgstatic/liftoff_logo.png";
        }
        if (str2.contains("mintegral")) {
            return "https://cdn.adseye.com/nsdk/res/imgstatic/mintegral_logo.png";
        }
        if (str2.contains(PluginErrorDetails.Platform.UNITY)) {
            return "https://cdn.adseye.com/nsdk/res/imgstatic/unity_logo.png";
        }
        if (str2.contains("bigo")) {
            return "https://cdn.adseye.com/nsdk/res/imgstatic/bigo_logo.png";
        }
        return str2.contains("yandex") ? "https://cdn.adseye.com/nsdk/res/imgstatic/yandex_logo.png" : str;
    }
}
