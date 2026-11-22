package com.baidu.ar.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.hardware.SensorManager;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.NavigationType;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.c6;
import com.baidu.ar.gb;
import com.baidu.ar.id;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.ar.r8;
import com.google.ar.core.ArCoreApk;
import com.huawei.hiar.AREnginesApk;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class DeviceSupportAbility {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f7247a;
    public static boolean b;
    public static NavigationType c;

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f7248a;
        public final /* synthetic */ File b;

        public a(File file, File file2) {
            this.f7248a = file;
            this.b = file2;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            httpException.printStackTrace();
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                DeviceSupportAbility.b(iHttpResponse.getContent(), this.f7248a, this.b);
            } catch (IOException | JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static JSONObject a(Context context, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            gb.a(jSONObject2);
            gb.b(context, jSONObject2);
            if (!TextUtils.isEmpty(str)) {
                gb.a(context, jSONObject2, str, str2);
            }
            gb.a(context, jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            jSONObject.put(ParameterNames.INFO, jSONObject2.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static boolean a(Context context) {
        return ((long) context.getPackageManager().getPackageInfo("com.huawei.arengine.service", 0).versionCode) >= 100000105;
    }

    public static void b(String str, File file, File file2) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("errorNum")) {
            int i = jSONObject.getInt("errorNum");
            if (i != 1 && i != 3) {
                if (i == 0 && file2.exists()) {
                    file2.delete();
                    return;
                }
                return;
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file2.exists()) {
                return;
            }
            file2.createNewFile();
        }
    }

    public static boolean b(Context context) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        File file = new File(filesDir, sb.append(str).append(com.anythink.expressad.video.dynview.a.a.X).append(str).append("devices/").toString());
        File file2 = new File(file.getAbsolutePath(), "ar-devices");
        r8.a(id.b(), a(context, (String) null, (String) null), new a(file, file2));
        return file2.exists();
    }

    public static boolean checkARCoreSupportVersionCode(Context context) {
        return ((long) context.getPackageManager().getPackageInfo("com.google.ar.core", 0).versionCode) >= 210260663;
    }

    public static String getBlacklistParams(Context context, String str) {
        return a(context, str, ARConfig.getARId()).toString();
    }

    public static NavigationType getNavigationAbilityType(Context context, boolean z) {
        NavigationType navigationType;
        try {
            NavigationType navigationType2 = c;
            if (navigationType2 != null) {
                return navigationType2;
            }
            if (((SensorManager) context.getSystemService(ak.ac)).getDefaultSensor(4) != null && !b(context)) {
                b = z;
                if (AREnginesApk.isAREngineApkReady(context) && a(context)) {
                    navigationType = NavigationType.AREngine;
                } else {
                    if (ArCoreApk.getInstance().checkAvailability(context).isSupported() && checkARCoreSupportVersionCode(context)) {
                        c = NavigationType.ARCore;
                        if (!z) {
                            c = NavigationType.ARPedometer;
                        }
                        return c;
                    }
                    navigationType = !z ? NavigationType.ARPedometer : NavigationType.ARIMU;
                }
                c = navigationType;
                return navigationType;
            }
            navigationType = NavigationType.None;
            c = navigationType;
            return navigationType;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            NavigationType navigationType3 = NavigationType.ARIMU;
            c = navigationType3;
            return navigationType3;
        } catch (RuntimeException e2) {
            e2.printStackTrace();
            NavigationType navigationType32 = NavigationType.ARIMU;
            c = navigationType32;
            return navigationType32;
        } catch (Throwable th) {
            th.printStackTrace();
            NavigationType navigationType322 = NavigationType.ARIMU;
            c = navigationType322;
            return navigationType322;
        }
    }

    public static NavigationType getSelectedNavigationType() {
        return c;
    }

    public static boolean isOutDoor() {
        return b;
    }

    public static void jumpMarket(Context context) {
        StringBuilder sb;
        String message;
        if (f7247a) {
            try {
                Intent intent = new Intent("com.huawei.appmarket.intent.action.AppDetail");
                intent.putExtra("APP_PACKAGENAME", "com.huawei.arengine.service");
                intent.setPackage("com.huawei.appmarket");
                intent.setFlags(268435456);
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                sb = new StringBuilder("the target activity is not found: ");
                message = e.getMessage();
                Log.w("DeviceSupportAbility", sb.append(message).toString());
            } catch (SecurityException e2) {
                sb = new StringBuilder("the target app has no permission of media");
                message = e2.getMessage();
                Log.w("DeviceSupportAbility", sb.append(message).toString());
            }
        }
    }

    public static void setNavigationType(NavigationType navigationType) {
        c = navigationType;
    }
}
