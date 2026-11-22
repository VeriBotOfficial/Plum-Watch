package com.huawei.hms.scankit.p;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.config.AGConnectServicesConfig;

/* compiled from: HaUtil.java */
/* renamed from: com.huawei.hms.scankit.p.pb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C3041pb {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10678a = "pb";
    private static volatile Bundle b;

    public static Bundle a(Context context) {
        if (context == null) {
            return new Bundle();
        }
        if (b == null) {
            Bundle bundle = new Bundle();
            try {
                String string = AGConnectServicesConfig.fromContext(context).getString("client/app_id");
                if (string == null) {
                    string = context.getPackageName();
                }
                bundle.putString("appid", string);
            } catch (RuntimeException unused) {
                Log.e(f10678a, "getAppInfo: RuntimeException");
            } catch (Exception unused2) {
                Log.e(f10678a, "getAppInfo: Exception");
            }
            b = bundle;
        }
        return b;
    }
}
