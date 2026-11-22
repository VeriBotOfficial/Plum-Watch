package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.config.Const;
import com.qumeng.overseas.advlib.core.ADEvent;
import com.umeng.commonsdk.utils.UMUtils;
import com.wakeup.common.common.config.ChannelConfig;

/* compiled from: DeviceIdSupplier.java */
/* loaded from: classes2.dex */
public class ac {
    public static z a(Context context) {
        String str = Build.BRAND;
        aj.a("Device", com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash.e.l, str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(Const.BRAND_HUAWEI) || str.equalsIgnoreCase(Const.BRAND_HONOR) || str.equalsIgnoreCase("华为")) {
            return new ad();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米")) {
            return new ai();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new ah();
        }
        if (str.equalsIgnoreCase(ADEvent.OPPO) || str.equalsIgnoreCase("oneplus")) {
            return new af();
        }
        if (str.equalsIgnoreCase(ChannelConfig.LENOVO) || str.equalsIgnoreCase("zuk")) {
            return new ae();
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG")) {
            return new ag();
        }
        if (UMUtils.isAppInstalled(context, "com.coolpad.deviceidsupport")) {
            return new ab();
        }
        return null;
    }
}
