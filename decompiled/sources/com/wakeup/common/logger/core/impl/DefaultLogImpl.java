package com.wakeup.common.logger.core.impl;

import com.wakeup.common.logger.core.entity.GLogEntity;
import com.wakeup.common.logger.core.util.GLogPrinter;
import com.wakeup.common.logger.core.util.GLogUtil;

/* loaded from: classes2.dex */
public class DefaultLogImpl {
    public static void printDefault(GLogEntity entity, int type, String tag, String msg) {
        int length = msg.length() / 4000;
        if (entity.isShowDivide()) {
            GLogUtil.printLine(type, tag, true);
        }
        if (length > 0 && entity.isShowAll()) {
            int i = 0;
            int i2 = 0;
            while (i < length && i < entity.getMaxLengthCount()) {
                int i3 = i2 + 4000;
                GLogPrinter.printSub(type, tag, msg.substring(i2, i3));
                i++;
                i2 = i3;
            }
            GLogPrinter.printSub(type, tag, msg.substring(i2));
        } else {
            GLogPrinter.printSub(type, tag, msg);
        }
        if (entity.isShowDivide()) {
            GLogUtil.printLine(type, tag, false);
        }
    }
}
