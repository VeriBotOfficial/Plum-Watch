package com.wakeup.common.logger.core.util;

import android.util.Log;
import com.wakeup.common.logger.core.GLogConfig;

/* loaded from: classes2.dex */
public class GLogPrinter {
    public static void printSub(int type, String tag, String sub) {
        if (GLogConfig.IS_ALL_ERROR && type != 6) {
            Log.e(tag, sub);
        }
        switch (type) {
            case 1:
                Log.v(tag, sub);
                break;
            case 2:
                Log.d(tag, sub);
                break;
            case 3:
                Log.i(tag, sub);
                break;
            case 4:
                Log.w(tag, sub);
                break;
            case 5:
                Log.e(tag, sub);
                break;
            case 6:
                Log.wtf(tag, sub);
                break;
        }
    }
}
