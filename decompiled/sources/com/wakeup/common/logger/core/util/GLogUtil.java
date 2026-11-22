package com.wakeup.common.logger.core.util;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.wakeup.common.logger.core.GLogConfig;
import java.util.Random;

/* loaded from: classes2.dex */
public class GLogUtil {
    public static void printLine(int type, String tag, boolean isTop) {
        if (isTop) {
            GLogPrinter.printSub(type, tag, "╔═══════════════════════════════════════════════════════════════════════════════════════");
        } else {
            GLogPrinter.printSub(type, tag, "╚═══════════════════════════════════════════════════════════════════════════════════════");
        }
    }

    public static boolean isEmpty(String line) {
        return TextUtils.isEmpty(line) || "\n".equals(line) || Separators.HT.equals(line) || TextUtils.isEmpty(line.trim());
    }

    public static String getFileName() {
        return GLogConfig.FILE_PREFIX + Long.toString(System.currentTimeMillis() + new Random().nextInt(10000)).substring(4) + ".log";
    }
}
