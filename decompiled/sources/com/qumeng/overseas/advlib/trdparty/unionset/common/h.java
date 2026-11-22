package com.qumeng.overseas.advlib.trdparty.unionset.common;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.qumeng.overseas.advlib.core.AdRequestParam;
import com.qumeng.overseas.advlib.core.ICliBundle;
import com.qumeng.overseas.advlib.core.IMultiAdObject;
import com.qumeng.overseas.advlib.core.QMNativeAdViewBinder;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public interface h {
    public static final String A = "requestId";
    public static final String B = "adSrc";

    /* renamed from: a, reason: collision with root package name */
    public static final String f13374a = "CPC";
    public static final String b = "ADMOB";
    public static final String c = "ADMOB_MEDIATION";
    public static final String d = "PANGLE";
    public static final String e = "APPLOVIN";
    public static final String f = "TOPON";
    public static final String g = "META";
    public static final String h = "TRADPLUS";
    public static final String i = "ADMOST";
    public static final String j = "cpt";
    public static final String k = "normal";
    public static final String l = "opt_event_x";
    public static final String m = "opt_event_y";
    public static final String n = "opt_event_x1";
    public static final String o = "opt_event_y1";
    public static final String p = "opt_event_w";

    /* renamed from: q, reason: collision with root package name */
    public static final String f13375q = "opt_event_h";
    public static final String r = "opt_close_start_x";
    public static final String s = "opt_close_start_y";
    public static final String t = "opt_close_end_y";
    public static final String u = "opt_close_end_x";
    public static final String v = "opt_mediation_winner_adsrc";
    public static final String w = "opt_mediation_winner_slotid";
    public static final String x = "opt_mediation_winner_revenue";
    public static final String y = "opt_mediation_winner_show_revenue";
    public static final String z = "opt_mediation_country_code";

    public interface a {
        void callbackMethod(String str, Object... objArr);
    }

    public interface b extends IMultiAdObject.SplashEventListener {
        void onAdExposure();
    }

    View a(Context context, ViewGroup viewGroup);

    ViewGroup a(ViewGroup viewGroup, IMultiAdObject.ADEventListener aDEventListener);

    void a();

    void a(Activity activity, AdRequestParam.ADRewardVideoListener aDRewardVideoListener);

    void a(Activity activity, IMultiAdObject.ADEventListener aDEventListener, IMultiAdObject.ADStateListener aDStateListener, DialogInterface.OnDismissListener onDismissListener);

    void a(ViewGroup viewGroup, ViewGroup viewGroup2, IMultiAdObject.ADEventListener aDEventListener);

    void a(ViewGroup viewGroup, IMultiAdObject.SplashEventListener splashEventListener);

    void a(ViewGroup viewGroup, QMNativeAdViewBinder qMNativeAdViewBinder, List<View> list, List<View> list2, IMultiAdObject.ADEventListener aDEventListener);

    void a(ViewGroup viewGroup, List<View> list, IMultiAdObject.ADEventListener aDEventListener);

    void a(IMultiAdObject.RevenueListener revenueListener);

    boolean a(Object obj);

    String b();

    String c();

    void d();

    String e();

    Map<String, Object> f();

    boolean g();

    ICliBundle h();

    List<ICliBundle> i();

    void recycle();

    void setADStateListener(IMultiAdObject.ADStateListener aDStateListener);
}
