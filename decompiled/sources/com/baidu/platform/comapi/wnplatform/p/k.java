package com.baidu.platform.comapi.wnplatform.p;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: VolumeUtil.java */
/* loaded from: classes13.dex */
public class k {
    private static AudioManager a(Context context) {
        if (context != null) {
            return (AudioManager) context.getSystemService("audio");
        }
        return null;
    }

    public static int b(Context context) {
        if (a(context) == null) {
            return 0;
        }
        return a(context).getStreamVolume(3);
    }

    public static void a(Context context, int i) {
        if (a(context) == null) {
            return;
        }
        a(context).setStreamVolume(3, i, 0);
        if (a(context).isBluetoothScoOn()) {
            com.baidu.platform.comapi.wnplatform.d.a.c("VolumeUtil", "phone state isBluetoothScoOn volume=" + i);
            a(context).setStreamVolume(6, i, 0);
        }
    }
}
