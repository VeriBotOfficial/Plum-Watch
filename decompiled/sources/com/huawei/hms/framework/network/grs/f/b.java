package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.AssetsUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class b {
    private static final Map<String, b> b = new ConcurrentHashMap(16);
    private static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private a f10363a;

    public b(Context context, GrsBaseInfo grsBaseInfo, boolean z) {
        a(context, z);
        b.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
    }

    public static b a(String str, GrsBaseInfo grsBaseInfo) {
        return b.get(str + grsBaseInfo.uniqueCode());
    }

    public static void a(Context context, GrsBaseInfo grsBaseInfo) {
        b a2 = a(context.getPackageName(), grsBaseInfo);
        if (a2 != null) {
            Logger.i("LocalManagerProxy", "appGrs is not null and clear services.");
            synchronized (c) {
                a2.f10363a.a();
            }
        }
    }

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.f10363a.b();
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z) {
        String a2;
        synchronized (c) {
            a2 = this.f10363a.a(context, aVar, grsBaseInfo, str, str2, z);
            if (TextUtils.isEmpty(a2) && this.f10363a.d()) {
                a(context, true);
                a(grsBaseInfo);
                b.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
                a2 = this.f10363a.a(context, aVar, grsBaseInfo, str, str2, z);
            }
        }
        return a2;
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z) {
        Map<String, String> a2;
        synchronized (c) {
            a2 = this.f10363a.a(context, aVar, grsBaseInfo, str, z);
            if ((a2 == null || a2.isEmpty()) && this.f10363a.d()) {
                a(context, true);
                a(grsBaseInfo);
                b.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
                a2 = this.f10363a.a(context, aVar, grsBaseInfo, str, z);
            }
        }
        return a2;
    }

    public void a(Context context, boolean z) {
        String[] list = AssetsUtil.list(context, GrsApp.getInstance().getBrand(""));
        List<String> arrayList = list == null ? new ArrayList<>() : Arrays.asList(list);
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.i("LocalManagerProxy", "appConfigName is: " + appConfigName);
        this.f10363a = new d(false, z);
        if (arrayList.contains("grs_app_global_route_config.json") || !TextUtils.isEmpty(appConfigName)) {
            this.f10363a = new d(context, appConfigName, z);
        }
        if (!this.f10363a.e() && arrayList.contains("grs_sdk_global_route_config.json")) {
            this.f10363a = new c(context, z);
        }
        this.f10363a.a(context, arrayList);
    }

    public void a(GrsBaseInfo grsBaseInfo) {
        this.f10363a.a(grsBaseInfo);
    }

    public Set<String> b() {
        return this.f10363a.c();
    }
}
