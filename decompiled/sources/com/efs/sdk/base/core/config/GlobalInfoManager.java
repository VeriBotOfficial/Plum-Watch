package com.efs.sdk.base.core.config;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.anythink.basead.c.b;
import com.anythink.basead.webtemplet.a.b;
import com.anythink.core.common.m.e;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.PackageUtil;
import com.efs.sdk.base.core.util.ProcessUtil;
import com.efs.sdk.base.core.util.c;
import com.efs.sdk.base.core.util.secure.EncodeUtil;
import com.umeng.umcrash.UMCrash;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes14.dex */
public class GlobalInfoManager {

    /* renamed from: a, reason: collision with root package name */
    private GlobalInfo f9618a;
    private Context b;

    /* synthetic */ GlobalInfoManager(byte b) {
        this();
    }

    private GlobalInfoManager() {
        this.b = ControllerCenter.getGlobalEnvStruct().mAppContext;
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final GlobalInfoManager f9619a = new GlobalInfoManager(0);
    }

    public static GlobalInfoManager getInstance() {
        return a.f9619a;
    }

    public void initGlobalInfo() {
        Log.e("ballack", "initGlobalInfo called once.");
        GlobalInfo globalInfo = new GlobalInfo();
        this.f9618a = globalInfo;
        globalInfo.a("appid", ControllerCenter.getGlobalEnvStruct().getAppid());
        int myPid = ProcessUtil.myPid();
        this.f9618a.a("pid", Integer.valueOf(myPid));
        this.f9618a.a(e.bc, ProcessUtil.getProcessName(myPid));
        String a2 = c.a(this.b);
        this.f9618a.a("wid", a2);
        if (TextUtils.isEmpty(ControllerCenter.getGlobalEnvStruct().getUid())) {
            this.f9618a.a("uid", a2);
        } else {
            this.f9618a.a("uid", ControllerCenter.getGlobalEnvStruct().getUid());
        }
        GlobalInfo globalInfo2 = this.f9618a;
        com.efs.sdk.base.core.a.a.a();
        globalInfo2.a("stime", Long.valueOf(com.efs.sdk.base.core.a.a.b() - Process.getElapsedCpuTime()));
        this.f9618a.a(b.a.A, PackageUtil.getPackageName(this.b));
        this.f9618a.a("ver", PackageUtil.getAppVersionName(this.b));
        this.f9618a.a("vcode", PackageUtil.getAppVersionCode(this.b));
        this.f9618a.a("sdk_ver", BuildConfig.VERSION_NAME);
        this.f9618a.a("brand", Build.BRAND.toLowerCase());
        this.f9618a.a("model", Build.MODEL == null ? "unknown" : Build.MODEL.replace(" ", Constants.ACCEPT_TIME_SEPARATOR_SERVER).replace("_", Constants.ACCEPT_TIME_SEPARATOR_SERVER).toLowerCase());
        this.f9618a.a("build_model", Build.MODEL);
        DisplayMetrics displayMetrics = this.b.getResources().getDisplayMetrics();
        this.f9618a.a("dsp_w", Integer.valueOf(displayMetrics.widthPixels));
        this.f9618a.a("dsp_h", Integer.valueOf(displayMetrics.heightPixels));
        this.f9618a.a("fr", "android");
        this.f9618a.a("rom", Build.VERSION.RELEASE);
        this.f9618a.a("sdk", Integer.valueOf(Build.VERSION.SDK_INT));
        this.f9618a.a(b.c.j, Locale.getDefault().getLanguage());
        this.f9618a.a("tzone", TimeZone.getDefault().getID());
        this.f9618a.a("net", NetworkUtil.getNetworkType(this.b));
        try {
            String[] networkAccessMode = NetworkUtil.getNetworkAccessMode(this.b);
            if (!"Wi-Fi".equals(networkAccessMode[0])) {
                if ("2G/3G".equals(networkAccessMode[0])) {
                    this.f9618a.a(UMCrash.KEY_HEADER_ACCESS, "2G/3G");
                } else {
                    this.f9618a.a(UMCrash.KEY_HEADER_ACCESS, "unknow");
                }
            } else {
                this.f9618a.a(UMCrash.KEY_HEADER_ACCESS, "wifi");
            }
            if (!"".equals(networkAccessMode[1])) {
                this.f9618a.a(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, networkAccessMode[1]);
            }
            this.f9618a.a(UMCrash.KEY_HEADER_NETWORK_TYPE, Integer.valueOf(NetworkUtil.getNetworkTypeUmeng(this.b)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            this.f9618a.a("log_uid", EncodeUtil.base64DecodeToStr(ControllerCenter.getGlobalEnvStruct().getLogUid().getBytes()));
            this.f9618a.a("log_did", ControllerCenter.getGlobalEnvStruct().getLogDid());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public String getNetStatus() {
        return this.f9618a.b("net", NetworkUtil.NETWORK_CLASS_DISCONNECTED).toString();
    }

    public void refreshNetStatus() {
        String networkType = NetworkUtil.getNetworkType(ControllerCenter.getGlobalEnvStruct().mAppContext);
        Log.w("efs.info.manager", "network change: ".concat(String.valueOf(networkType)));
        this.f9618a.a("net", networkType);
    }

    private static String a(Context context) {
        Class<?> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.statistics.common.DeviceConfig");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getSid", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, context);
            if (invoke != null) {
                return invoke.toString();
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    public GlobalInfo getGlobalInfo() {
        try {
            String a2 = a(this.b);
            if (!TextUtils.isEmpty(a2)) {
                this.f9618a.a(UMCrash.KEY_CALLBACK_SESSION_ID, a2);
            }
        } catch (Throwable th) {
            Log.d("efs.info.manager", "refreshSessionId caused error: " + th.getMessage());
        }
        return this.f9618a;
    }
}
