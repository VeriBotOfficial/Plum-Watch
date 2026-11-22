package com.wakeup.common.apm.fps;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.yandex.div.core.timer.TimerController;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FpsMonitor.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0016\u001a\u00020\u0014J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\rH\u0002J\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/apm/fps/FpsMonitor;", "", "<init>", "()V", "choreographer", "Landroid/view/Choreographer;", "frameCallback", "Landroid/view/Choreographer$FrameCallback;", "isMonitoring", "", "frameCount", "", "lastFrameTime", "", "fpsUpdateInterval", "fpsListener", "Lcom/wakeup/common/apm/fps/FpsMonitor$FpsListener;", "mainHandler", "Landroid/os/Handler;", "start", "", "listener", TimerController.STOP_COMMAND, "onFrame", "frameTimeNanos", "Companion", "FpsListener", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FpsMonitor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile FpsMonitor INSTANCE;
    private Choreographer choreographer;
    private FpsListener fpsListener;
    private final long fpsUpdateInterval;
    private Choreographer.FrameCallback frameCallback;
    private int frameCount;
    private boolean isMonitoring;
    private long lastFrameTime;
    private final Handler mainHandler;

    /* compiled from: FpsMonitor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/wakeup/common/apm/fps/FpsMonitor$FpsListener;", "", "onFpsUpdated", "", "fps", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface FpsListener {
        void onFpsUpdated(float fps);
    }

    public /* synthetic */ FpsMonitor(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FpsMonitor() {
        this.fpsUpdateInterval = TimeUnit.SECONDS.toNanos(1L);
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* compiled from: FpsMonitor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/wakeup/common/apm/fps/FpsMonitor$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/wakeup/common/apm/fps/FpsMonitor;", "getInstance", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FpsMonitor getInstance() {
            FpsMonitor fpsMonitor;
            FpsMonitor fpsMonitor2 = FpsMonitor.INSTANCE;
            if (fpsMonitor2 != null) {
                return fpsMonitor2;
            }
            synchronized (this) {
                fpsMonitor = FpsMonitor.INSTANCE;
                if (fpsMonitor == null) {
                    fpsMonitor = new FpsMonitor(null);
                    Companion companion = FpsMonitor.INSTANCE;
                    FpsMonitor.INSTANCE = fpsMonitor;
                }
            }
            return fpsMonitor;
        }
    }

    public static /* synthetic */ void start$default(FpsMonitor fpsMonitor, FpsListener fpsListener, int i, Object obj) {
        if ((i & 1) != 0) {
            fpsListener = null;
        }
        fpsMonitor.start(fpsListener);
    }

    public final void start(FpsListener listener) {
        if (this.isMonitoring) {
            return;
        }
        this.fpsListener = listener;
        this.isMonitoring = true;
        this.frameCount = 0;
        this.lastFrameTime = System.nanoTime();
        this.choreographer = Choreographer.getInstance();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: com.wakeup.common.apm.fps.FpsMonitor$start$1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long frameTimeNanos) {
                Choreographer choreographer;
                FpsMonitor.this.onFrame(frameTimeNanos);
                choreographer = FpsMonitor.this.choreographer;
                if (choreographer != null) {
                    choreographer.postFrameCallback(this);
                }
            }
        };
        this.frameCallback = frameCallback;
        Choreographer choreographer = this.choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(frameCallback);
        }
    }

    public final void stop() {
        Choreographer choreographer;
        if (this.isMonitoring) {
            Choreographer.FrameCallback frameCallback = this.frameCallback;
            if (frameCallback != null && (choreographer = this.choreographer) != null) {
                choreographer.removeFrameCallback(frameCallback);
            }
            this.choreographer = null;
            this.frameCallback = null;
            this.isMonitoring = false;
            this.fpsListener = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFrame(long frameTimeNanos) {
        this.frameCount++;
        long nanoTime = System.nanoTime();
        long j = nanoTime - this.lastFrameTime;
        if (j >= this.fpsUpdateInterval) {
            final float f = (this.frameCount * 1000000000) / j;
            this.mainHandler.post(new Runnable() { // from class: com.wakeup.common.apm.fps.FpsMonitor$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    FpsMonitor.onFrame$lambda$1(FpsMonitor.this, f);
                }
            });
            this.frameCount = 0;
            this.lastFrameTime = nanoTime;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFrame$lambda$1(FpsMonitor fpsMonitor, float f) {
        FpsListener fpsListener = fpsMonitor.fpsListener;
        if (fpsListener != null) {
            fpsListener.onFpsUpdated(f);
        }
    }

    /* renamed from: isMonitoring, reason: from getter */
    public final boolean getIsMonitoring() {
        return this.isMonitoring;
    }
}
