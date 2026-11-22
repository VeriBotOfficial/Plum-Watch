package livekit.org.webrtc;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.RenderSynchronizer;

/* loaded from: classes8.dex */
public class EglThread implements RenderSynchronizer.Listener {
    private final EglBase.EglConnection eglConnection;
    private final HandlerWithExceptionCallbacks handler;
    private final ReleaseMonitor releaseMonitor;
    private final RenderSynchronizer renderSynchronizer;
    private final Map<UUID, RenderUpdate> pendingRenderUpdates = new HashMap();
    private final List<RenderUpdate> pendingRenderUpdatesQueued = new ArrayList();
    private boolean renderWindowOpen = true;

    public interface ReleaseMonitor {
        boolean onRelease(EglThread eglThread);
    }

    public interface RenderUpdate {
        void update(boolean runsInline);
    }

    static /* synthetic */ boolean lambda$create$1(EglThread eglThread) {
        return true;
    }

    public static EglThread create(ReleaseMonitor releaseMonitor, final EglBase.Context sharedContext, final int[] configAttributes, RenderSynchronizer renderSynchronizer) {
        HandlerThread handlerThread = new HandlerThread("EglThread");
        handlerThread.start();
        HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = new HandlerWithExceptionCallbacks(handlerThread.getLooper());
        EglBase.EglConnection eglConnection = (EglBase.EglConnection) ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallbacks, new Callable() { // from class: livekit.org.webrtc.EglThread$$ExternalSyntheticLambda3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return EglThread.lambda$create$0(EglBase.Context.this, configAttributes);
            }
        });
        if (releaseMonitor == null) {
            releaseMonitor = new ReleaseMonitor() { // from class: livekit.org.webrtc.EglThread$$ExternalSyntheticLambda4
                @Override // livekit.org.webrtc.EglThread.ReleaseMonitor
                public final boolean onRelease(EglThread eglThread) {
                    return EglThread.lambda$create$1(eglThread);
                }
            };
        }
        return new EglThread(releaseMonitor, handlerWithExceptionCallbacks, eglConnection, renderSynchronizer);
    }

    static /* synthetic */ EglBase.EglConnection lambda$create$0(EglBase.Context context, int[] iArr) throws Exception {
        if (context == null) {
            return EglBase.EglConnection.createEgl10(iArr);
        }
        return EglBase.EglConnection.create(context, iArr);
    }

    public static EglThread create(ReleaseMonitor releaseMonitor, final EglBase.Context sharedContext, final int[] configAttributes) {
        return create(releaseMonitor, sharedContext, configAttributes, null);
    }

    private static class HandlerWithExceptionCallbacks extends Handler {
        private final Object callbackLock;
        private final List<Runnable> exceptionCallbacks;

        public HandlerWithExceptionCallbacks(Looper looper) {
            super(looper);
            this.callbackLock = new Object();
            this.exceptionCallbacks = new ArrayList();
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message msg) {
            try {
                super.dispatchMessage(msg);
            } catch (Exception e) {
                Logging.e("EglThread", "Exception on EglThread", e);
                synchronized (this.callbackLock) {
                    Iterator<Runnable> it = this.exceptionCallbacks.iterator();
                    while (it.hasNext()) {
                        it.next().run();
                    }
                    throw e;
                }
            }
        }

        public void addExceptionCallback(Runnable callback) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.add(callback);
            }
        }

        public void removeExceptionCallback(Runnable callback) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.remove(callback);
            }
        }
    }

    private EglThread(ReleaseMonitor releaseMonitor, HandlerWithExceptionCallbacks handler, EglBase.EglConnection eglConnection, RenderSynchronizer renderSynchronizer) {
        this.releaseMonitor = releaseMonitor;
        this.handler = handler;
        this.eglConnection = eglConnection;
        this.renderSynchronizer = renderSynchronizer;
        if (renderSynchronizer != null) {
            renderSynchronizer.registerListener(this);
        }
    }

    public void release() {
        if (this.releaseMonitor.onRelease(this)) {
            RenderSynchronizer renderSynchronizer = this.renderSynchronizer;
            if (renderSynchronizer != null) {
                renderSynchronizer.removeListener(this);
            }
            HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = this.handler;
            final EglBase.EglConnection eglConnection = this.eglConnection;
            Objects.requireNonNull(eglConnection);
            handlerWithExceptionCallbacks.post(new Runnable() { // from class: livekit.org.webrtc.EglThread$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    EglBase.EglConnection.this.release();
                }
            });
            this.handler.getLooper().quitSafely();
        }
    }

    public EglBase createEglBaseWithSharedConnection() {
        return EglBase.create(this.eglConnection);
    }

    public Handler getHandler() {
        return this.handler;
    }

    public void addExceptionCallback(Runnable callback) {
        this.handler.addExceptionCallback(callback);
    }

    public void removeExceptionCallback(Runnable callback) {
        this.handler.removeExceptionCallback(callback);
    }

    public void scheduleRenderUpdate(UUID id2, RenderUpdate update) {
        if (this.renderWindowOpen) {
            update.update(true);
        } else {
            this.pendingRenderUpdates.put(id2, update);
        }
    }

    @Deprecated
    public void scheduleRenderUpdate(RenderUpdate update) {
        if (this.renderWindowOpen) {
            update.update(true);
        } else {
            this.pendingRenderUpdatesQueued.add(update);
        }
    }

    @Override // livekit.org.webrtc.RenderSynchronizer.Listener
    public void onRenderWindowOpen() {
        this.handler.post(new Runnable() { // from class: livekit.org.webrtc.EglThread$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                EglThread.this.lambda$onRenderWindowOpen$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRenderWindowOpen$2() {
        this.renderWindowOpen = true;
        Iterator<RenderUpdate> it = this.pendingRenderUpdates.values().iterator();
        while (it.hasNext()) {
            it.next().update(false);
        }
        this.pendingRenderUpdates.clear();
        Iterator<RenderUpdate> it2 = this.pendingRenderUpdatesQueued.iterator();
        while (it2.hasNext()) {
            it2.next().update(false);
        }
        this.pendingRenderUpdatesQueued.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRenderWindowClose$3() {
        this.renderWindowOpen = false;
    }

    @Override // livekit.org.webrtc.RenderSynchronizer.Listener
    public void onRenderWindowClose() {
        this.handler.post(new Runnable() { // from class: livekit.org.webrtc.EglThread$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                EglThread.this.lambda$onRenderWindowClose$3();
            }
        });
    }
}
