package com.wakeup.commonui.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/wakeup/commonui/utils/ActivityUtils;", "", "<init>", "()V", "assertValidRequest", "", "context", "Landroid/content/Context;", "isDestroy", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityUtils {
    public static final ActivityUtils INSTANCE = new ActivityUtils();

    private ActivityUtils() {
    }

    @JvmStatic
    public static final boolean assertValidRequest(Context context) {
        if (context instanceof Activity) {
            return !isDestroy((Activity) context);
        }
        if (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                Intrinsics.checkNotNull(contextWrapper.getBaseContext(), "null cannot be cast to non-null type android.app.Activity");
                return !isDestroy((Activity) r2);
            }
        }
        return true;
    }

    @JvmStatic
    public static final boolean isDestroy(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
