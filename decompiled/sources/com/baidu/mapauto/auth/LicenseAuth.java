package com.baidu.mapauto.auth;

import android.content.Context;
import com.baidu.mapauto.auth.AuthCore;
import com.baidu.mapauto.auth.base.BaseLicenseAuthDataStandardProcess;
import com.baidu.mapauto.auth.util.LogUtil;
import java.util.Map;

/* loaded from: classes13.dex */
public final class LicenseAuth {
    public static volatile LicenseAuth b;

    /* renamed from: a, reason: collision with root package name */
    public final AuthCore f8241a = new AuthCore();

    public static LicenseAuth getInstance() {
        if (b == null) {
            synchronized (LicenseAuth.class) {
                if (b == null) {
                    b = new LicenseAuth();
                }
            }
        }
        return b;
    }

    public void loadAuth(Context context, String str, String str2, String str3, String str4, int i, ILicenseAuthListener iLicenseAuthListener) {
        loadAuth(context, str, str2, str3, str4, null, i, null, iLicenseAuthListener);
    }

    public void loadAuth(Context context, String str, String str2, String str3, String str4, int i, Map<String, Object> map, ILicenseAuthListener iLicenseAuthListener) {
        loadAuth(context, str, str2, str3, str4, null, i, map, iLicenseAuthListener);
    }

    public void loadAuth(Context context, String str, String str2, String str3, String str4, String str5, int i, int i2, Map<String, Object> map, ILicenseAuthListener iLicenseAuthListener) {
        this.f8241a.a(context.getApplicationContext(), new AuthCore.AuthParam(str, str2, str3, str4, str5, i, map), i2, iLicenseAuthListener);
    }

    public void loadAuth(Context context, String str, String str2, String str3, String str4, String str5, int i, Map<String, Object> map, ILicenseAuthListener iLicenseAuthListener) {
        this.f8241a.a(context.getApplicationContext(), new AuthCore.AuthParam(str, str2, str3, str4, str5, 1, map), i, iLicenseAuthListener);
    }

    public Map<String, Integer> loadLocalAuth(Context context, String str, String str2, int i) throws BaseLicenseAuthDataStandardProcess.ProcessException {
        return this.f8241a.a(context, null, null, null, str, str2, i);
    }

    public Map<String, Integer> loadLocalAuth(Context context, String str, String str2, String str3, int i) throws BaseLicenseAuthDataStandardProcess.ProcessException {
        return this.f8241a.a(context, null, null, str, str2, str3, i);
    }

    public Map<String, Integer> loadLocalAuth(Context context, String str, String str2, String str3, String str4, String str5, int i) throws BaseLicenseAuthDataStandardProcess.ProcessException {
        return this.f8241a.a(context, str, str3, str2, str4, str5, i);
    }

    public void setDebug(Boolean bool) {
        LogUtil.getInstance().openLog(bool);
    }
}
