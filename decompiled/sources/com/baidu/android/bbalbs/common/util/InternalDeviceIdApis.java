package com.baidu.android.bbalbs.common.util;

import android.content.Context;
import com.baidu.bbalbscesium.h;
import com.baidu.bbalbscesium.j.b;

/* loaded from: classes12.dex */
public class InternalDeviceIdApis {

    public static class TargetPackageCuidV270Info {
        public String iscChannelCuid;
        public String upcChannelCuid;
    }

    private static h a(Context context) {
        DeviceId.getCUID(context);
        return DeviceId.a(context).b();
    }

    public static String getSelfC270Ids(Context context) {
        h.a b = a(context).b();
        if (b != null) {
            return b.d();
        }
        return null;
    }

    public static TargetPackageCuidV270Info getTargetPackageCuid270Info(Context context, String str) {
        h a2 = a(context);
        TargetPackageCuidV270Info targetPackageCuidV270Info = new TargetPackageCuidV270Info();
        h.a a3 = a2.a(str, b.c);
        if (a3 != null) {
            targetPackageCuidV270Info.upcChannelCuid = a3.d();
        }
        h.a a4 = a2.a(str, b.e);
        if (a4 != null) {
            targetPackageCuidV270Info.iscChannelCuid = a4.d();
        }
        return targetPackageCuidV270Info;
    }
}
