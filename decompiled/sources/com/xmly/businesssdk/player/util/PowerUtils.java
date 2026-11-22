package com.xmly.businesssdk.player.util;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes3.dex */
public class PowerUtils {
    public static PowerManager getPowerManger(Context context) {
        try {
            return (PowerManager) context.getSystemService("power");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static PowerManager.WakeLock getWakeLock(Context context) {
        PowerManager powerManger = getPowerManger(context);
        if (powerManger != null) {
            return powerManger.newWakeLock(1, PowerUtils.class.getName());
        }
        return null;
    }
}
