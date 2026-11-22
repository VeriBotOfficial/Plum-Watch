package com.wakeup.common.logger.core.impl;

import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.logger.core.constants.GLogStrs;
import com.wakeup.common.logger.core.entity.GLogEntity;
import com.wakeup.common.logger.core.util.GLogPrinter;
import com.wakeup.common.logger.core.util.GLogUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JsonLogImpl {
    public static void printJson(GLogEntity entity, String tag, String msg, String headString) {
        DefaultLogImpl.printDefault(entity, entity.getJsonLevel(), tag, headString + msg);
        if (entity.isFormatJson()) {
            String trim = msg.trim();
            try {
                if (trim.startsWith(Const.STR_MART_JSON_BEGIN)) {
                    trim = new JSONObject(trim).toString(4);
                } else if (trim.startsWith("[")) {
                    trim = new JSONArray(trim).toString(4);
                }
            } catch (JSONException unused) {
            }
            String str = headString + GLogStrs.LINE_SEPARATOR + trim;
            GLogUtil.printLine(entity.getJsonLevel(), tag, true);
            if (GLogStrs.LINE_SEPARATOR != null) {
                for (String str2 : str.split(GLogStrs.LINE_SEPARATOR)) {
                    GLogPrinter.printSub(entity.getJsonLevel(), tag, "║ " + str2);
                }
            }
            GLogUtil.printLine(entity.getJsonLevel(), tag, false);
        }
    }
}
