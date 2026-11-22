package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import org.repackage.com.miui.deviceid.IdentifierManager;

/* compiled from: XiaomiDeviceIdSupplier.java */
/* loaded from: classes2.dex */
class ai implements z {
    ai() {
    }

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        try {
            if (!IdentifierManager.a()) {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
                return null;
            }
            return IdentifierManager.b(context);
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
