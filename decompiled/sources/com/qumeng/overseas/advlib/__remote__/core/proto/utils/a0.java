package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.__bootstrap__.LibInit;
import com.qumeng.overseas.advlib.__remote__.core.ICliFactory;
import com.qumeng.overseas.advlib.__remote__.core.coreutils.a;
import com.qumeng.overseas.advlib.open.AliCheatParams;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes17.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12850a = "android_cpc_sdk_error";
    public static final String b = "android_cpc_sdk_lpload";
    public static final String c = "android_cpc_sdk_video";
    public static final String d = "android_cpc_sdk_custom";

    public static String a(int i) {
        boolean z;
        try {
            z = AliCheatParams.isSupportBase64();
        } catch (Throwable unused) {
            z = false;
        }
        return (com.qumeng.overseas.advlib.__remote__.core.coreutils.a.f12826a || !z) ? i == 1 ? ICliFactory.urlReportNew : ICliFactory.urlReportBidsdkNew : i == 1 ? ICliFactory.urlEncryptReportNew : ICliFactory.urlEncryptBidsdkNew;
    }

    public static String b(Map<String, String> map) {
        String a2 = a(1);
        return a2 + l.b(a2, map);
    }

    public static String c(Map<String, String> map) {
        if (com.qumeng.overseas.advlib.__remote__.utils.network.c.a(map)) {
            return ICliFactory.urlBugManReportHttps + l.a(map);
        }
        String b2 = b(1);
        return b2 + l.b(b2, map);
    }

    public static String b(int i) {
        boolean z;
        try {
            z = AliCheatParams.isSupportBase64();
        } catch (Throwable unused) {
            z = false;
        }
        if (com.qumeng.overseas.advlib.__remote__.core.coreutils.a.f12826a || !z) {
            if (i == 1) {
                return ICliFactory.urlReport;
            }
            return ICliFactory.urlReportBidsdk;
        }
        if (i == 1) {
            return ICliFactory.urlEncryptReport;
        }
        return ICliFactory.urlEncryptBidsdk;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ICliFactory.urlEncryptReport) || str.startsWith(ICliFactory.urlEncryptBidsdk);
    }

    public static void a(Map<String, String> map) throws IOException {
        String c2 = c(map);
        com.qumeng.overseas.advlib.__remote__.utils.network.b bVar = new com.qumeng.overseas.advlib.__remote__.utils.network.b();
        bVar.f13238a = c2;
        com.qumeng.overseas.advlib.__remote__.utils.network.c.b(bVar);
    }

    public static Map<String, String> a(Context context, com.qumeng.overseas.advlib.__remote__.ui.incite.j jVar, String str, Map<String, String> map, String... strArr) {
        if (context == null) {
            context = e.a();
        }
        String valueOf = String.valueOf(context.getResources().getDisplayMetrics().heightPixels);
        String valueOf2 = String.valueOf(context.getResources().getDisplayMetrics().widthPixels);
        TreeMap treeMap = new TreeMap();
        if (map != null && map.size() > 0) {
            treeMap.putAll(map);
        }
        treeMap.put("opt_ideaid", jVar.b() + "");
        if (!treeMap.containsKey("adslot_id") && !TextUtils.isEmpty(jVar.a())) {
            treeMap.put("adslot_id", jVar.a());
        }
        if (!treeMap.containsKey("opt_searchid")) {
            treeMap.put("opt_searchid", jVar.c());
        }
        treeMap.put("os", "Android");
        treeMap.put("v", "1.6.0");
        treeMap.put("sh", valueOf);
        treeMap.put("sw", valueOf2);
        treeMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        treeMap.put("opt_v", "1.049");
        treeMap.put("opt_bootstrap_v", LibInit.aisdk_bootstrap_version);
        treeMap.put("opt_remote_v_code", String.valueOf(LibInit.aisdk_whole_vc));
        treeMap.put("opt_remote_v", LibInit.aisdk_whole_vn);
        treeMap.put(ak.aH, String.valueOf(str));
        treeMap.put("opt_app_pkgid", com.qumeng.overseas.advlib.__remote__.core.coreutils.a.y);
        treeMap.put("opt_app_vn", com.qumeng.overseas.advlib.__remote__.core.coreutils.a.z);
        treeMap.put("opt_app_vc", String.valueOf(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.A));
        treeMap.put("opt_is_fold", String.valueOf(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.H));
        treeMap.put("opt_is_pad", String.valueOf(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.G));
        treeMap.put("opt_is_vpn", String.valueOf(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.d0));
        treeMap.put("opt_bid_config_id", com.qumeng.overseas.advlib.trdparty.unionset.network.c.f().b());
        treeMap.put("opt_com_config_id", com.qumeng.overseas.advlib.__remote__.framework.config.a.k().d());
        treeMap.put("opt_exp_id", TextUtils.join(",", a().toArray()));
        treeMap.put("opt_os_version", Build.VERSION.RELEASE);
        treeMap.put("opt_hms_os_version", k.b());
        treeMap.put("opt_overseas", "1");
        treeMap.put("opt_gaid", com.qumeng.overseas.advlib.__remote__.core.coreutils.a.O);
        treeMap.put("opt_country_id", com.qumeng.overseas.advlib.__remote__.framework.config.a.e() + "");
        treeMap.put("opt_ump_status", String.valueOf(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.X));
        treeMap.put("opt_process_id", com.qumeng.overseas.advlib.__remote__.core.coreutils.a.I);
        treeMap.put("opt_adseye_user_id", a.C0785a.b);
        treeMap.put("opt_is_foreground", com.qumeng.overseas.advlib.__remote__.business.utils.a.h ? "1" : "0");
        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b(com.qumeng.overseas.advlib.__remote__.core.coreutils.a.P)) {
            treeMap.put("opt_media_user_id", com.qumeng.overseas.advlib.__remote__.core.coreutils.a.P);
        }
        if (!treeMap.containsKey(com.qumeng.overseas.advlib.trdparty.unionset.common.h.z)) {
            treeMap.put(com.qumeng.overseas.advlib.trdparty.unionset.common.h.z, "");
        }
        if (strArr != null) {
            int i = 0;
            while (i < strArr.length) {
                int i2 = i + 1;
                treeMap.put("op" + i2, strArr[i]);
                i = i2;
            }
        }
        try {
            treeMap.put("opt_nettype", q.a());
            String str2 = Build.BRAND;
            if (str2 != null) {
                treeMap.put("opt_brand", str2);
            }
            String str3 = Build.MODEL;
            if (str3 != null) {
                treeMap.put("opt_model", str3);
                return treeMap;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return treeMap;
    }

    public static List<Integer> a() {
        ArrayList arrayList = new ArrayList();
        List<Integer> d2 = com.qumeng.overseas.advlib.trdparty.unionset.network.c.f().d();
        if (com.qumeng.overseas.advlib.__remote__.utils.q.b(d2)) {
            arrayList.addAll(d2);
        }
        List<Integer> f = com.qumeng.overseas.advlib.__remote__.framework.config.a.k().f();
        if (com.qumeng.overseas.advlib.__remote__.utils.q.b(f)) {
            arrayList.addAll(f);
        }
        return arrayList;
    }
}
