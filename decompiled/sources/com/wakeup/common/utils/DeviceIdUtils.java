package com.wakeup.common.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.wakeup.common.log.LogUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.UUID;

/* loaded from: classes2.dex */
public class DeviceIdUtils {
    private static final String SP_KEY_DEVICE_ID = "device_id";
    private static final String SP_KEY_DEVICE_ID_TIMESTAMP = "device_id_timestamp";
    private static final String SP_NAME = "device_info";
    private static final String TAG = "DeviceIdUtils";

    public static String getUUID(Context context) {
        return getUUIDBoth(context, false);
    }

    public static String getUUIDWithTimestamp(Context context) {
        return getUUIDBoth(context, true);
    }

    private static String getUUIDBoth(Context context, boolean isTimestamp) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info", 0);
        String string = sharedPreferences.getString("device_id", "");
        String string2 = sharedPreferences.getString(SP_KEY_DEVICE_ID_TIMESTAMP, "");
        if (!TextUtils.isEmpty(string)) {
            return (!isTimestamp || TextUtils.isEmpty(string2)) ? string : string2;
        }
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        }
        String str = string + "_" + String.valueOf(System.currentTimeMillis() / 1000);
        sharedPreferences.edit().putString("device_id", string).apply();
        sharedPreferences.edit().putString(SP_KEY_DEVICE_ID_TIMESTAMP, str).apply();
        LogUtils.i(TAG, "用户UUID = " + string + " with stamp = " + str);
        return isTimestamp ? str : string;
    }
}
