package com.wakeup.common.logger;

import android.content.Context;
import com.wakeup.common.logger.core.GLogConfig;
import com.wakeup.common.logger.core.GLogInterface;
import com.wakeup.common.logger.settings.GLogSettingsActivity;

/* loaded from: classes2.dex */
public class GLog {
    private static GLogInterface gLogInterface;

    public static GLogInterface getgLogInterface() {
        return gLogInterface;
    }

    public static void initLogger(boolean showLog, boolean isAllError, String defaultTag, boolean isShowModule, boolean isShowType, GLogInterface gLogInterface2) {
        GLogConfig.IS_SHOW_LOG = showLog;
        GLogConfig.IS_ALL_ERROR = isAllError;
        GLogConfig.TAG_DEFAULT = defaultTag;
        GLogConfig.FILE_PREFIX = defaultTag + "_";
        GLogConfig.IS_SHOW_MODULE = isShowModule;
        GLogConfig.IS_SHOW_TYPE = isShowType;
        gLogInterface = gLogInterface2;
    }

    public static void startSetttingActivity(Context context) {
        GLogSettingsActivity.startActivity(context);
    }
}
