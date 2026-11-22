package com.wakeup.common.logger.core.util;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.wakeup.common.logger.core.GLogConfig;
import com.wakeup.common.logger.core.entity.GLogEntity;

/* loaded from: classes2.dex */
public class GLogWrapper {
    public static String[] wrapperContent(GLogEntity entity, String tagStr, Object... objects) {
        StringBuilder sb = new StringBuilder(GLogConfig.TAG_DEFAULT);
        if (GLogConfig.IS_SHOW_MODULE && !TextUtils.isEmpty(entity.getModuleName())) {
            sb.append("_").append(entity.getModuleName());
        }
        if (GLogConfig.IS_SHOW_TYPE && !TextUtils.isEmpty(entity.getTypeName())) {
            sb.append("_").append(entity.getTypeName());
        }
        if (!TextUtils.isEmpty(tagStr)) {
            sb.append("_").append(tagStr);
        }
        String objectsString = getObjectsString(objects);
        StringBuilder sb2 = new StringBuilder();
        if (entity.getTraceCount() > 1) {
            sb2.append(" \n");
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i = 5; i < entity.getTraceCount() + 5; i++) {
            if (i < stackTrace.length) {
                sb2.append("at ").append(stackTrace[i]).append("\n");
            }
        }
        return new String[]{sb.toString(), objectsString, sb2.toString()};
    }

    private static String getObjectsString(Object... objects) {
        StringBuilder sb = new StringBuilder(Separators.HT);
        if (objects == null) {
            sb.append("Log with null object");
            return sb.toString();
        }
        if (objects.length > 1) {
            sb.append("\n");
            for (int i = 0; i < objects.length; i++) {
                Object obj = objects[i];
                if (obj != null) {
                    sb.append("\tParam[").append(i).append("] = ").append(obj.toString()).append("\n");
                } else {
                    sb.append("\tParam[").append(i).append("] = null\n");
                }
            }
        } else if (objects.length == 1) {
            Object obj2 = objects[0];
            if (obj2 == null) {
                sb.append("Log with null object");
            } else {
                sb.append(obj2.toString());
            }
        } else {
            sb.append("Log with null object");
        }
        return sb.toString();
    }
}
