package com.wakeup.common.device;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthSyncUiQuiet.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bH\u0007J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0006\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\n0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/device/HealthSyncUiQuiet;", "", "<init>", "()V", "quiet", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingTypes", "", "", "kotlin.jvm.PlatformType", "", "Ljava/util/Set;", "begin", "", "end", "isQuiet", "", "markPending", "type", "drainPending", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HealthSyncUiQuiet {
    public static final HealthSyncUiQuiet INSTANCE = new HealthSyncUiQuiet();
    private static final AtomicBoolean quiet = new AtomicBoolean(false);
    private static final Set<Integer> pendingTypes = Collections.newSetFromMap(new ConcurrentHashMap());

    private HealthSyncUiQuiet() {
    }

    @JvmStatic
    public static final void begin() {
        if (DevicePerfOpt.shouldQuietHealthUiDuringSync()) {
            quiet.set(true);
        }
    }

    @JvmStatic
    public static final void end() {
        quiet.set(false);
    }

    @JvmStatic
    public static final boolean isQuiet() {
        return quiet.get();
    }

    @JvmStatic
    public static final void markPending(int type) {
        pendingTypes.add(Integer.valueOf(type));
    }

    @JvmStatic
    public static final Set<Integer> drainPending() {
        Set<Integer> pendingTypes2 = pendingTypes;
        if (pendingTypes2.isEmpty()) {
            return SetsKt.emptySet();
        }
        Intrinsics.checkNotNullExpressionValue(pendingTypes2, "pendingTypes");
        Set<Integer> set = CollectionsKt.toSet(pendingTypes2);
        pendingTypes2.clear();
        return set;
    }
}
