package com.wakeup.common.logger.core.impl;

import com.wakeup.common.logger.core.GLogConfig;
import com.wakeup.common.logger.core.entity.GLogEntity;
import com.wakeup.common.logger.core.util.GLogWrapper;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public class TraceLogImpl {
    public static void printStackTrace(GLogEntity entity) {
        if (entity.isForceShow() || GLogConfig.IS_SHOW_LOG) {
            Throwable th = new Throwable();
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String[] split = stringWriter.toString().split("\\n\\t");
            StringBuilder sb = new StringBuilder("\n");
            for (String str : split) {
                if (!str.contains("at anda.travel.driver.common.tools.logger")) {
                    sb.append(str).append("\n");
                }
            }
            String[] wrapperContent = GLogWrapper.wrapperContent(entity, null, sb.toString());
            DefaultLogImpl.printDefault(entity, entity.getDefaultLevel(), wrapperContent[0], wrapperContent[2] + wrapperContent[1]);
        }
    }
}
