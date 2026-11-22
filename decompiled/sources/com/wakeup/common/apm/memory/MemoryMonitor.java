package com.wakeup.common.apm.memory;

import android.gov.nist.core.Separators;
import android.os.Debug;
import io.nats.client.support.ApiConstants;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;

/* compiled from: MemoryMonitor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/wakeup/common/apm/memory/MemoryMonitor;", "", "<init>", "()V", "MemoryInfo", "Companion", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MemoryMonitor {
    private static final int MB = 1048576;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ThreadLocal<DecimalFormat> twoDecimalFormat = ThreadLocal.withInitial(new Supplier() { // from class: com.wakeup.common.apm.memory.MemoryMonitor$$ExternalSyntheticLambda0
        @Override // java.util.function.Supplier
        public final Object get() {
            DecimalFormat twoDecimalFormat$lambda$1;
            twoDecimalFormat$lambda$1 = MemoryMonitor.twoDecimalFormat$lambda$1();
            return twoDecimalFormat$lambda$1;
        }
    });

    /* compiled from: MemoryMonitor.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/wakeup/common/apm/memory/MemoryMonitor$MemoryInfo;", "", "usedMemoryMB", "", "totalMemoryMB", "maxMemoryMB", "nativeHeapMB", "availableMemoryMB", "memoryUsagePercent", "<init>", "(FFFFFF)V", "getUsedMemoryMB", "()F", "getTotalMemoryMB", "getMaxMemoryMB", "getNativeHeapMB", "getAvailableMemoryMB", "getMemoryUsagePercent", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MemoryInfo {
        private final float availableMemoryMB;
        private final float maxMemoryMB;
        private final float memoryUsagePercent;
        private final float nativeHeapMB;
        private final float totalMemoryMB;
        private final float usedMemoryMB;

        public static /* synthetic */ MemoryInfo copy$default(MemoryInfo memoryInfo, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
            if ((i & 1) != 0) {
                f = memoryInfo.usedMemoryMB;
            }
            if ((i & 2) != 0) {
                f2 = memoryInfo.totalMemoryMB;
            }
            if ((i & 4) != 0) {
                f3 = memoryInfo.maxMemoryMB;
            }
            if ((i & 8) != 0) {
                f4 = memoryInfo.nativeHeapMB;
            }
            if ((i & 16) != 0) {
                f5 = memoryInfo.availableMemoryMB;
            }
            if ((i & 32) != 0) {
                f6 = memoryInfo.memoryUsagePercent;
            }
            float f7 = f5;
            float f8 = f6;
            return memoryInfo.copy(f, f2, f3, f4, f7, f8);
        }

        /* renamed from: component1, reason: from getter */
        public final float getUsedMemoryMB() {
            return this.usedMemoryMB;
        }

        /* renamed from: component2, reason: from getter */
        public final float getTotalMemoryMB() {
            return this.totalMemoryMB;
        }

        /* renamed from: component3, reason: from getter */
        public final float getMaxMemoryMB() {
            return this.maxMemoryMB;
        }

        /* renamed from: component4, reason: from getter */
        public final float getNativeHeapMB() {
            return this.nativeHeapMB;
        }

        /* renamed from: component5, reason: from getter */
        public final float getAvailableMemoryMB() {
            return this.availableMemoryMB;
        }

        /* renamed from: component6, reason: from getter */
        public final float getMemoryUsagePercent() {
            return this.memoryUsagePercent;
        }

        public final MemoryInfo copy(float usedMemoryMB, float totalMemoryMB, float maxMemoryMB, float nativeHeapMB, float availableMemoryMB, float memoryUsagePercent) {
            return new MemoryInfo(usedMemoryMB, totalMemoryMB, maxMemoryMB, nativeHeapMB, availableMemoryMB, memoryUsagePercent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MemoryInfo)) {
                return false;
            }
            MemoryInfo memoryInfo = (MemoryInfo) other;
            return Float.compare(this.usedMemoryMB, memoryInfo.usedMemoryMB) == 0 && Float.compare(this.totalMemoryMB, memoryInfo.totalMemoryMB) == 0 && Float.compare(this.maxMemoryMB, memoryInfo.maxMemoryMB) == 0 && Float.compare(this.nativeHeapMB, memoryInfo.nativeHeapMB) == 0 && Float.compare(this.availableMemoryMB, memoryInfo.availableMemoryMB) == 0 && Float.compare(this.memoryUsagePercent, memoryInfo.memoryUsagePercent) == 0;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.usedMemoryMB) * 31) + Float.hashCode(this.totalMemoryMB)) * 31) + Float.hashCode(this.maxMemoryMB)) * 31) + Float.hashCode(this.nativeHeapMB)) * 31) + Float.hashCode(this.availableMemoryMB)) * 31) + Float.hashCode(this.memoryUsagePercent);
        }

        public String toString() {
            return "MemoryInfo(usedMemoryMB=" + this.usedMemoryMB + ", totalMemoryMB=" + this.totalMemoryMB + ", maxMemoryMB=" + this.maxMemoryMB + ", nativeHeapMB=" + this.nativeHeapMB + ", availableMemoryMB=" + this.availableMemoryMB + ", memoryUsagePercent=" + this.memoryUsagePercent + Separators.RPAREN;
        }

        public MemoryInfo(float f, float f2, float f3, float f4, float f5, float f6) {
            this.usedMemoryMB = f;
            this.totalMemoryMB = f2;
            this.maxMemoryMB = f3;
            this.nativeHeapMB = f4;
            this.availableMemoryMB = f5;
            this.memoryUsagePercent = f6;
        }

        public final float getUsedMemoryMB() {
            return this.usedMemoryMB;
        }

        public final float getTotalMemoryMB() {
            return this.totalMemoryMB;
        }

        public final float getMaxMemoryMB() {
            return this.maxMemoryMB;
        }

        public final float getNativeHeapMB() {
            return this.nativeHeapMB;
        }

        public final float getAvailableMemoryMB() {
            return this.availableMemoryMB;
        }

        public final float getMemoryUsagePercent() {
            return this.memoryUsagePercent;
        }
    }

    /* compiled from: MemoryMonitor.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R4\u0010\u0006\u001a&\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0012\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/apm/memory/MemoryMonitor$Companion;", "", "<init>", "()V", "MB", "", "twoDecimalFormat", "Ljava/lang/ThreadLocal;", "Ljava/text/DecimalFormat;", "kotlin.jvm.PlatformType", "Ljava/lang/ThreadLocal;", "formatToTwoDecimalsFixed", "", "value", "", "getMemoryInfo", "Lcom/wakeup/common/apm/memory/MemoryMonitor$MemoryInfo;", "formatMemory", "", ApiConstants.BYTES, "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final double formatToTwoDecimalsFixed(float value) {
            return MathKt.roundToInt(value * 100) / 100.0d;
        }

        public final MemoryInfo getMemoryInfo() {
            Runtime runtime = Runtime.getRuntime();
            long j = runtime.totalMemory();
            long freeMemory = j - runtime.freeMemory();
            long maxMemory = runtime.maxMemory();
            Debug.getNativeHeapSize();
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
            Debug.getNativeHeapFreeSize();
            float f = freeMemory;
            float f2 = f / 1048576.0f;
            float f3 = j / 1048576.0f;
            float f4 = maxMemory;
            float f5 = f4 / 1048576.0f;
            return new MemoryInfo(f2, f3, f5, nativeHeapAllocatedSize / 1048576.0f, f5 - f2, (f / f4) * 100);
        }

        public final String formatMemory(long bytes) {
            if (bytes < 1024) {
                return bytes + " B";
            }
            if (bytes < 1048576) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%.2f KB", Arrays.copyOf(new Object[]{Float.valueOf(bytes / 1024.0f)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return format;
            }
            if (bytes < 1073741824) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String format2 = String.format("%.2f MB", Arrays.copyOf(new Object[]{Float.valueOf(bytes / 1048576.0f)}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                return format2;
            }
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String format3 = String.format("%.2f GB", Arrays.copyOf(new Object[]{Float.valueOf(bytes / 1.0737418E9f)}, 1));
            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
            return format3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecimalFormat twoDecimalFormat$lambda$1() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }
}
