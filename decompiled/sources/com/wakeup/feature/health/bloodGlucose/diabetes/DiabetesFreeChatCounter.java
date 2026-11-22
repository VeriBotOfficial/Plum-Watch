package com.wakeup.feature.health.bloodGlucose.diabetes;

import android.content.Context;
import android.content.SharedPreferences;
import com.wakeup.common.storage.UserDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: DiabetesFreeChatCounter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/wakeup/feature/health/bloodGlucose/diabetes/DiabetesFreeChatCounter;", "", "<init>", "()V", "PREFS", "", "FREE_LIMIT", "", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "key", "uid", "usedCount", "remainingFree", "canSendFree", "", "recordFreeUse", "", "freeLimit", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiabetesFreeChatCounter {
    public static final int $stable = 0;
    private static final int FREE_LIMIT = 3;
    public static final DiabetesFreeChatCounter INSTANCE = new DiabetesFreeChatCounter();
    private static final String PREFS = "diabetes_advisor_chat";

    public final int freeLimit() {
        return 3;
    }

    private DiabetesFreeChatCounter() {
    }

    private final SharedPreferences prefs(Context context) {
        return context.getSharedPreferences(PREFS, 0);
    }

    private final String key(String uid) {
        return "used_" + uid;
    }

    public final int usedCount(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String uid = UserDao.getUid();
        if (uid.length() == 0) {
            uid = "guest";
        }
        String str = uid;
        SharedPreferences prefs = prefs(context);
        Intrinsics.checkNotNull(str);
        return prefs.getInt(key(str), 0);
    }

    public final int remainingFree(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RangesKt.coerceAtLeast(3 - usedCount(context), 0);
    }

    public final boolean canSendFree(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UserDao.isAIVip() || usedCount(context) < 3;
    }

    public final void recordFreeUse(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (UserDao.isAIVip()) {
            return;
        }
        String uid = UserDao.getUid();
        if (uid.length() == 0) {
            uid = "guest";
        }
        String str = uid;
        SharedPreferences prefs = prefs(context);
        Intrinsics.checkNotNull(str);
        prefs.edit().putInt(key(str), prefs.getInt(key(str), 0) + 1).apply();
    }
}
