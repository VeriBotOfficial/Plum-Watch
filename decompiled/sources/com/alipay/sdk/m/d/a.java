package com.alipay.sdk.m.d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.config.Const;
import com.qumeng.overseas.advlib.core.ADEvent;
import com.wakeup.common.common.config.ChannelConfig;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1367a = "ro.build.version.emui";
    public static final String b = "hw_sc.build.platform.version";

    public static com.alipay.sdk.m.c.b a(Context context) {
        String str = Build.BRAND;
        com.alipay.sdk.m.e.a.b("Device", com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.e.l, str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(Const.BRAND_HUAWEI) || str.equalsIgnoreCase(Const.BRAND_HONOR) || str.equalsIgnoreCase("华为")) {
            return new b();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new i();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new h();
        }
        if (str.equalsIgnoreCase(ADEvent.OPPO) || str.equalsIgnoreCase("oneplus") || str.equalsIgnoreCase("realme")) {
            return new f();
        }
        if (str.equalsIgnoreCase(ChannelConfig.LENOVO) || str.equalsIgnoreCase("zuk")) {
            return new c();
        }
        if (str.equalsIgnoreCase("nubia")) {
            return new e();
        }
        if (str.equalsIgnoreCase("samsung")) {
            return new g();
        }
        if (a()) {
            return new b();
        }
        if (str.equalsIgnoreCase("meizu") || str.equalsIgnoreCase("mblu")) {
            return new d();
        }
        return null;
    }

    public static boolean a() {
        return (TextUtils.isEmpty(a(f1367a)) && TextUtils.isEmpty(a(b))) ? false : true;
    }

    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }
}
