package com.baidu.android.bbalbs.common.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.bbalbscesium.m.c;

/* loaded from: classes12.dex */
public final class Util {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f6718a = false;
    private static final String b = "Util";

    private Util() {
    }

    public static boolean hasOtherServiceRuninMyPid(Context context, String str) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getApplicationContext().getSystemService(Const.STR_PROCESS_TAG)).getRunningServices(100)) {
            if (runningServiceInfo.pid == Process.myPid() && !TextUtils.equals(runningServiceInfo.service.getClassName(), str)) {
                return true;
            }
        }
        return false;
    }

    public static String toHexString(byte[] bArr, String str, boolean z) {
        return c.a(bArr, str, z);
    }

    public static String toMd5(byte[] bArr, boolean z) {
        return c.a(bArr, z);
    }
}
