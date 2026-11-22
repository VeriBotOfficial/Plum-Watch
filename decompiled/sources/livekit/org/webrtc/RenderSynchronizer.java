package livekit.org.webrtc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class RenderSynchronizer {
    private static final float DEFAULT_TARGET_FPS = 30.0f;
    private static final String TAG = "RenderSynchronizer";
    private Choreographer choreographer;
    private boolean isListening;
    private long lastOpenedTimeNanos;
    private long lastRefreshTimeNanos;
    private final List<Listener> listeners;
    private final Object lock;
    private final Handler mainThreadHandler;
    private boolean renderWindowOpen;
    private final long targetFrameIntervalNanos;

    public interface Listener {
        void onRenderWindowClose();

        void onRenderWindowOpen();
    }

    public RenderSynchronizer(float targetFrameRateFps) {
        this.lock = new Object();
        this.listeners = new CopyOnWriteArrayList();
        this.targetFrameIntervalNanos = Math.round(TimeUnit.SECONDS.toNanos(1L) / targetFrameRateFps);
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainThreadHandler = handler;
        handler.post(new Runnable() { // from class: livekit.org.webrtc.RenderSynchronizer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                RenderSynchronizer.this.lambda$new$0();
            }
        });
        Logging.d(TAG, "Created");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.choreographer = Choreographer.getInstance();
    }

    public RenderSynchronizer() {
        this(30.0f);
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
        synchronized (this.lock) {
            if (!this.isListening) {
                Logging.d(TAG, "First listener, subscribing to frame callbacks");
                this.isListening = true;
                this.mainThreadHandler.post(new Runnable() { // from class: livekit.org.webrtc.RenderSynchronizer$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        RenderSynchronizer.this.lambda$registerListener$1();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerListener$1() {
        this.choreographer.postFrameCallback(new RenderSynchronizer$$ExternalSyntheticLambda0(this));
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onDisplayRefreshCycleBegin(long refreshTimeNanos) {
        synchronized (this.lock) {
            if (this.listeners.isEmpty()) {
                Logging.d(TAG, "No listeners, unsubscribing to frame callbacks");
                this.isListening = false;
                return;
            }
            this.choreographer.postFrameCallback(new RenderSynchronizer$$ExternalSyntheticLambda0(this));
            long j = refreshTimeNanos - this.lastOpenedTimeNanos;
            long j2 = refreshTimeNanos - this.lastRefreshTimeNanos;
            this.lastRefreshTimeNanos = refreshTimeNanos;
            if (Math.abs(j - this.targetFrameIntervalNanos) < Math.abs((j - this.targetFrameIntervalNanos) + j2)) {
                this.lastOpenedTimeNanos = refreshTimeNanos;
                openRenderWindow();
            } else if (this.renderWindowOpen) {
                closeRenderWindow();
            }
        }
    }

    private void traceRenderWindowChange() {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter("RenderWindow", this.renderWindowOpen ? 1L : 0L);
        }
    }

    private void openRenderWindow() {
        this.renderWindowOpen = true;
        traceRenderWindowChange();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowOpen();
        }
    }

    private void closeRenderWindow() {
        this.renderWindowOpen = false;
        traceRenderWindowChange();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRenderWindowClose();
        }
    }
}
