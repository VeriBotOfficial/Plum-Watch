package com.wakeup.module.glasses.activity.nav;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GlassesNavConstant.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/module/glasses/activity/nav/GlassesNavConstant;", "", "<init>", "()V", "Companion", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlassesNavConstant {
    public static final int ROUTE_TYPE_ELECTRIC_RIDE = 0;
    public static final int ROUTE_TYPE_RIDE = 1;
    public static final int ROUTE_TYPE_WALK = 2;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int defRouteType = 2;

    /* compiled from: GlassesNavConstant.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/wakeup/module/glasses/activity/nav/GlassesNavConstant$Companion;", "", "<init>", "()V", "ROUTE_TYPE_ELECTRIC_RIDE", "", "ROUTE_TYPE_RIDE", "ROUTE_TYPE_WALK", "defRouteType", "getDefRouteType", "()I", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getDefRouteType() {
            return GlassesNavConstant.defRouteType;
        }
    }
}
