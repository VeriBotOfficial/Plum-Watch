package com.wakeup.feature.user.goals.util;

import kotlin.Metadata;

/* compiled from: GoalsUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/wakeup/feature/user/goals/util/GoalsUtils;", "", "<init>", "()V", "isDecimal", "", "goalType", "", "(Ljava/lang/Integer;)Z", "feature-user_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoalsUtils {
    public static final GoalsUtils INSTANCE = new GoalsUtils();

    private GoalsUtils() {
    }

    public final boolean isDecimal(Integer goalType) {
        return (goalType != null && goalType.intValue() == 5) || (goalType != null && goalType.intValue() == 4) || (goalType != null && goalType.intValue() == 1);
    }
}
