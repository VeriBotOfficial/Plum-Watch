package com.wakeup.common.apm.memory.view;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.wakeup.common.apm.memory.MemoryMonitor;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: MemoryOverlayView.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002,-B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0017J\u0006\u0010\u001b\u001a\u00020\u0019J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020#H\u0002J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0015J\u000e\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010)\u001a\u00020\u0019H\u0014J\u0006\u0010*\u001a\u00020\u0019J\u0006\u0010+\u001a\u00020\u0019R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/wakeup/common/apm/memory/view/MemoryOverlayView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "memoryTextView", "Landroid/widget/TextView;", "handler", "Landroid/os/Handler;", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ScheduledExecutorService;", "isMonitoring", "", "displayMode", "Lcom/wakeup/common/apm/memory/view/MemoryOverlayView$DisplayMode;", "updateInterval", "", "startMonitoring", "", "intervalMs", "stopMonitoring", "updateMemoryDisplay", "formatMemoryInfo", "", ParameterNames.INFO, "Lcom/wakeup/common/apm/memory/MemoryMonitor$MemoryInfo;", "getColorForMemoryLevel", "percent", "", "getMemoryLevel", "Lcom/wakeup/common/apm/memory/view/MemoryOverlayView$MemoryLevel;", "setDisplayMode", DOMConstants.ATTR_MODE, "setUpdateInterval", "onDetachedFromWindow", "show", "hide", "MemoryLevel", "DisplayMode", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MemoryOverlayView extends FrameLayout {
    private DisplayMode displayMode;
    private final ScheduledExecutorService executor;
    private final Handler handler;
    private boolean isMonitoring;
    private final TextView memoryTextView;
    private long updateInterval;

    /* compiled from: MemoryOverlayView.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DisplayMode.values().length];
            try {
                iArr[DisplayMode.SIMPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplayMode.DETAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplayMode.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MemoryLevel.values().length];
            try {
                iArr2[MemoryLevel.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MemoryLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MemoryLevel.CRITICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MemoryOverlayView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MemoryOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MemoryOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TextView textView = new TextView(context);
        textView.setText("Memory: --");
        textView.setTextColor(-1);
        textView.setBackgroundColor(Color.parseColor("#80000000"));
        textView.setGravity(17);
        textView.setPadding(16, 8, 16, 8);
        textView.setTextSize(12.0f);
        textView.setAllCaps(false);
        this.memoryTextView = textView;
        this.handler = new Handler(Looper.getMainLooper());
        this.executor = Executors.newSingleThreadScheduledExecutor();
        this.displayMode = DisplayMode.DETAILED;
        this.updateInterval = 1000L;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = 280;
        layoutParams.setMarginEnd(16);
        Unit unit = Unit.INSTANCE;
        addView(textView, layoutParams);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MemoryOverlayView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/wakeup/common/apm/memory/view/MemoryOverlayView$MemoryLevel;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "WARNING", "CRITICAL", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MemoryLevel {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MemoryLevel[] $VALUES;
        public static final MemoryLevel NORMAL = new MemoryLevel("NORMAL", 0);
        public static final MemoryLevel WARNING = new MemoryLevel("WARNING", 1);
        public static final MemoryLevel CRITICAL = new MemoryLevel("CRITICAL", 2);

        private static final /* synthetic */ MemoryLevel[] $values() {
            return new MemoryLevel[]{NORMAL, WARNING, CRITICAL};
        }

        public static EnumEntries<MemoryLevel> getEntries() {
            return $ENTRIES;
        }

        private MemoryLevel(String str, int i) {
        }

        static {
            MemoryLevel[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static MemoryLevel valueOf(String str) {
            return (MemoryLevel) Enum.valueOf(MemoryLevel.class, str);
        }

        public static MemoryLevel[] values() {
            return (MemoryLevel[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MemoryOverlayView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/wakeup/common/apm/memory/view/MemoryOverlayView$DisplayMode;", "", "<init>", "(Ljava/lang/String;I)V", "SIMPLE", "DETAILED", "PERCENT", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DisplayMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DisplayMode[] $VALUES;
        public static final DisplayMode SIMPLE = new DisplayMode("SIMPLE", 0);
        public static final DisplayMode DETAILED = new DisplayMode("DETAILED", 1);
        public static final DisplayMode PERCENT = new DisplayMode("PERCENT", 2);

        private static final /* synthetic */ DisplayMode[] $values() {
            return new DisplayMode[]{SIMPLE, DETAILED, PERCENT};
        }

        public static EnumEntries<DisplayMode> getEntries() {
            return $ENTRIES;
        }

        private DisplayMode(String str, int i) {
        }

        static {
            DisplayMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static DisplayMode valueOf(String str) {
            return (DisplayMode) Enum.valueOf(DisplayMode.class, str);
        }

        public static DisplayMode[] values() {
            return (DisplayMode[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ void startMonitoring$default(MemoryOverlayView memoryOverlayView, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        memoryOverlayView.startMonitoring(j);
    }

    public final void startMonitoring(long intervalMs) {
        if (this.isMonitoring) {
            return;
        }
        this.updateInterval = intervalMs;
        this.isMonitoring = true;
        this.executor.scheduleWithFixedDelay(new Runnable() { // from class: com.wakeup.common.apm.memory.view.MemoryOverlayView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                MemoryOverlayView.this.updateMemoryDisplay();
            }
        }, 0L, intervalMs, TimeUnit.MILLISECONDS);
    }

    public final void stopMonitoring() {
        if (this.isMonitoring) {
            this.executor.shutdown();
            this.isMonitoring = false;
            this.handler.post(new Runnable() { // from class: com.wakeup.common.apm.memory.view.MemoryOverlayView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MemoryOverlayView.stopMonitoring$lambda$3(MemoryOverlayView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopMonitoring$lambda$3(MemoryOverlayView memoryOverlayView) {
        memoryOverlayView.memoryTextView.setText("Memory Monitor Stopped");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMemoryDisplay() {
        final MemoryMonitor.MemoryInfo memoryInfo = MemoryMonitor.INSTANCE.getMemoryInfo();
        this.handler.post(new Runnable() { // from class: com.wakeup.common.apm.memory.view.MemoryOverlayView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MemoryOverlayView.updateMemoryDisplay$lambda$4(MemoryOverlayView.this, memoryInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMemoryDisplay$lambda$4(MemoryOverlayView memoryOverlayView, MemoryMonitor.MemoryInfo memoryInfo) {
        memoryOverlayView.memoryTextView.setText(memoryOverlayView.formatMemoryInfo(memoryInfo));
        memoryOverlayView.memoryTextView.setTextColor(memoryOverlayView.getColorForMemoryLevel(memoryInfo.getMemoryUsagePercent()));
        if (memoryInfo.getMemoryUsagePercent() > 85.0f) {
            memoryOverlayView.memoryTextView.setBackgroundColor(Color.parseColor("#CCFF0000"));
        } else if (memoryInfo.getMemoryUsagePercent() > 70.0f) {
            memoryOverlayView.memoryTextView.setBackgroundColor(Color.parseColor("#CCFF9900"));
        } else {
            memoryOverlayView.memoryTextView.setBackgroundColor(Color.parseColor("#80000000"));
        }
    }

    private final String formatMemoryInfo(MemoryMonitor.MemoryInfo info) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.displayMode.ordinal()];
        if (i == 1) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(info.getMemoryUsagePercent())}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return "Mem: " + format + Separators.PERCENT;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(info.getMemoryUsagePercent())}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            return "Memory: " + format2 + Separators.PERCENT;
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String format3 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(info.getUsedMemoryMB())}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
        String format4 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(info.getMaxMemoryMB())}, 1));
        Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
        StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
        String format5 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(info.getMemoryUsagePercent())}, 1));
        Intrinsics.checkNotNullExpressionValue(format5, "format(...)");
        return "Used: " + format3 + "/" + format4 + "MB (" + format5 + "%)";
    }

    private final int getColorForMemoryLevel(float percent) {
        int i = WhenMappings.$EnumSwitchMapping$1[getMemoryLevel(percent).ordinal()];
        if (i == 1) {
            return -16711936;
        }
        if (i == 2) {
            return InputDeviceCompat.SOURCE_ANY;
        }
        if (i == 3) {
            return SupportMenu.CATEGORY_MASK;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final MemoryLevel getMemoryLevel(float percent) {
        if (percent < 70.0f) {
            return MemoryLevel.NORMAL;
        }
        if (percent < 85.0f) {
            return MemoryLevel.WARNING;
        }
        return MemoryLevel.CRITICAL;
    }

    public final void setDisplayMode(DisplayMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.displayMode = mode;
    }

    public final void setUpdateInterval(long intervalMs) {
        this.updateInterval = intervalMs;
        if (this.isMonitoring) {
            stopMonitoring();
            startMonitoring(intervalMs);
        }
    }

    /* renamed from: isMonitoring, reason: from getter */
    public final boolean getIsMonitoring() {
        return this.isMonitoring;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopMonitoring();
    }

    public final void show() {
        setVisibility(0);
    }

    public final void hide() {
        setVisibility(8);
    }
}
