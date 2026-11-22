package com.wakeup.howear.push.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import com.autonavi.aps.amapapi.config.Const;
import com.blankj.utilcode.util.ActivityUtils;
import com.vivo.push.PushClientConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PushActivityChecker.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0005R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/wakeup/howear/push/util/PushActivityChecker;", "", "<init>", "()V", "tag", "", "getTag", "()Ljava/lang/String;", "isActivityExistsInStack", "", PushClientConstants.TAG_CLASS_NAME, "isActivityRunning", "context", "Landroid/content/Context;", "module-push_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushActivityChecker {
    public static final PushActivityChecker INSTANCE;
    private static final String tag;

    private PushActivityChecker() {
    }

    static {
        PushActivityChecker pushActivityChecker = new PushActivityChecker();
        INSTANCE = pushActivityChecker;
        String simpleName = pushActivityChecker.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        tag = simpleName;
    }

    public final String getTag() {
        return tag;
    }

    public final boolean isActivityExistsInStack(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            Class<?> cls = Class.forName(className);
            if (!Activity.class.isAssignableFrom(cls)) {
                return false;
            }
            Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out android.app.Activity>");
            return ActivityUtils.isActivityExistsInStack((Class<? extends Activity>) cls);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(tag, "push activity can not get main activity");
            return false;
        }
    }

    public final boolean isActivityRunning(Context context, String className) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(className, "className");
        Object systemService = context.getSystemService(Const.STR_PROCESS_TAG);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        for (ActivityManager.RunningTaskInfo runningTaskInfo : ((ActivityManager) systemService).getRunningTasks(Integer.MAX_VALUE)) {
            if (runningTaskInfo.topActivity != null) {
                ComponentName componentName = runningTaskInfo.topActivity;
                Intrinsics.checkNotNull(componentName);
                if (Intrinsics.areEqual(className, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
