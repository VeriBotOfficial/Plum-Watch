package com.wakeup.common.burypoint;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseBuryPoint.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/common/burypoint/BaseBuryPoint;", "", "<init>", "()V", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BaseBuryPoint {
    private static long actionTime;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String itemId = "";
    private static String action = "";
    private static String actionValue = "";
    private static String position = "";
    private static String originPosition = "";
    private static String sceneId = "";
    private static String expIds = "";
    private static String traceId = "";

    /* compiled from: BaseBuryPoint.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001a\u0010\"\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\t¨\u0006%"}, d2 = {"Lcom/wakeup/common/burypoint/BaseBuryPoint$Companion;", "", "<init>", "()V", "itemId", "", "getItemId", "()Ljava/lang/String;", "setItemId", "(Ljava/lang/String;)V", "actionTime", "", "getActionTime", "()J", "setActionTime", "(J)V", "action", "getAction", "setAction", "actionValue", "getActionValue", "setActionValue", "position", "getPosition", "setPosition", "originPosition", "getOriginPosition", "setOriginPosition", "sceneId", "getSceneId", "setSceneId", "expIds", "getExpIds", "setExpIds", "traceId", "getTraceId", "setTraceId", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getItemId() {
            return BaseBuryPoint.itemId;
        }

        public final void setItemId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BaseBuryPoint.itemId = str;
        }

        public final long getActionTime() {
            return BaseBuryPoint.actionTime;
        }

        public final void setActionTime(long j) {
            BaseBuryPoint.actionTime = j;
        }

        public final String getAction() {
            return BaseBuryPoint.action;
        }

        public final void setAction(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BaseBuryPoint.action = str;
        }

        public final String getActionValue() {
            return BaseBuryPoint.actionValue;
        }

        public final void setActionValue(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BaseBuryPoint.actionValue = str;
        }

        public final String getPosition() {
            return BaseBuryPoint.position;
        }

        public final void setPosition(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BaseBuryPoint.position = str;
        }

        public final String getOriginPosition() {
            return BaseBuryPoint.originPosition;
        }

        public final void setOriginPosition(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BaseBuryPoint.originPosition = str;
        }

        public final String getSceneId() {
            return BaseBuryPoint.sceneId;
        }

        public final void setSceneId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BaseBuryPoint.sceneId = str;
        }

        public final String getExpIds() {
            return BaseBuryPoint.expIds;
        }

        public final void setExpIds(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BaseBuryPoint.expIds = str;
        }

        public final String getTraceId() {
            return BaseBuryPoint.traceId;
        }

        public final void setTraceId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            BaseBuryPoint.traceId = str;
        }
    }
}
