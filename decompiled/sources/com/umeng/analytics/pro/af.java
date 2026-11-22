package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import org.repackage.com.heytap.openid.sdk.OpenIDSDK;

/* compiled from: OppoDeviceIdSupplier.java */
/* loaded from: classes2.dex */
public class af implements z {

    /* renamed from: a, reason: collision with root package name */
    private boolean f13780a = false;

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        try {
            if (!this.f13780a) {
                OpenIDSDK.a(context);
                this.f13780a = true;
            }
            if (!OpenIDSDK.a()) {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
                return null;
            }
            return OpenIDSDK.c(context);
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
