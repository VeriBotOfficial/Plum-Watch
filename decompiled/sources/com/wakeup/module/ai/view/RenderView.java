package com.wakeup.module.ai.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class RenderView extends SurfaceView implements SurfaceHolder.Callback {
    private static final Object surfaceLock = new Object();
    private boolean isStartAnim;
    private long lastRenderMillis;
    private RenderThread renderThread;
    private List<IRenderer> renderer;

    public interface IRenderer {
        void onRender(Canvas canvas, long j);
    }

    protected abstract void doDrawBackground(Canvas canvas);

    protected List<IRenderer> onCreateRenderer() {
        return null;
    }

    protected abstract void onRender(Canvas canvas, long j);

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public RenderView(Context context) {
        this(context, null);
    }

    public RenderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isStartAnim = false;
        getHolder().addCallback(this);
    }

    private static class RenderThread extends Thread {
        private static final long SLEEP_TIME = 16;
        private boolean destoryed;
        private boolean isPause;
        private WeakReference<RenderView> renderView;
        private boolean running;

        public RenderThread(RenderView renderView) {
            super("RenderThread");
            this.running = false;
            this.destoryed = false;
            this.isPause = false;
            this.renderView = new WeakReference<>(renderView);
        }

        private SurfaceHolder getSurfaceHolder() {
            if (getRenderView() != null) {
                return getRenderView().getHolder();
            }
            return null;
        }

        private RenderView getRenderView() {
            return this.renderView.get();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z;
            Canvas lockCanvas;
            long currentTimeMillis = System.currentTimeMillis();
            while (!this.destoryed) {
                synchronized (RenderView.surfaceLock) {
                    while (true) {
                        z = this.destoryed;
                        if (z || (this.running && !this.isPause)) {
                            break;
                        } else {
                            try {
                                RenderView.surfaceLock.wait();
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                    if (z) {
                        return;
                    }
                    RenderView renderView = getRenderView();
                    SurfaceHolder surfaceHolder = getSurfaceHolder();
                    if (renderView != null && surfaceHolder != null && renderView.isStartAnim && (lockCanvas = surfaceHolder.lockCanvas()) != null) {
                        try {
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            renderView.lastRenderMillis = currentTimeMillis2;
                            renderView.doDrawBackground(lockCanvas);
                            renderView.render(lockCanvas, currentTimeMillis2);
                            surfaceHolder.unlockCanvasAndPost(lockCanvas);
                        } catch (Throwable th) {
                            surfaceHolder.unlockCanvasAndPost(lockCanvas);
                            throw th;
                        }
                    }
                }
                try {
                    Thread.sleep(16L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void setRun(boolean z) {
            this.running = z;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        synchronized (surfaceLock) {
            List<IRenderer> onCreateRenderer = onCreateRenderer();
            this.renderer = onCreateRenderer;
            if (onCreateRenderer != null && onCreateRenderer.isEmpty()) {
                throw new IllegalStateException();
            }
            this.renderThread = new RenderThread(this);
            drawFrameLocked(this.lastRenderMillis);
        }
    }

    public void onResume() {
        Object obj = surfaceLock;
        synchronized (obj) {
            RenderThread renderThread = this.renderThread;
            if (renderThread != null) {
                renderThread.isPause = false;
                obj.notifyAll();
            }
        }
    }

    public void onPause() {
        synchronized (surfaceLock) {
            RenderThread renderThread = this.renderThread;
            if (renderThread != null) {
                renderThread.isPause = true;
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Object obj = surfaceLock;
        synchronized (obj) {
            RenderThread renderThread = this.renderThread;
            if (renderThread != null) {
                renderThread.setRun(false);
                this.renderThread.destoryed = true;
                this.renderThread.isPause = false;
                obj.notifyAll();
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        Object obj = surfaceLock;
        synchronized (obj) {
            RenderThread renderThread = this.renderThread;
            if (renderThread == null) {
                return;
            }
            renderThread.isPause = !z;
            if (z && this.isStartAnim) {
                startThreadLocked();
            } else {
                obj.notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(Canvas canvas, long j) {
        List<IRenderer> list = this.renderer;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.renderer.get(i).onRender(canvas, j);
            }
            return;
        }
        onRender(canvas, j);
    }

    public void startAnim() {
        synchronized (surfaceLock) {
            this.isStartAnim = true;
            startThreadLocked();
        }
    }

    private void startThread() {
        synchronized (surfaceLock) {
            startThreadLocked();
        }
    }

    private void startThreadLocked() {
        RenderThread renderThread = this.renderThread;
        if (renderThread == null || renderThread.running) {
            return;
        }
        this.renderThread.setRun(true);
        this.renderThread.isPause = false;
        surfaceLock.notifyAll();
        try {
            if (this.renderThread.getState() == Thread.State.NEW) {
                this.renderThread.start();
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void stopAnim() {
        Object obj = surfaceLock;
        synchronized (obj) {
            this.isStartAnim = false;
            RenderThread renderThread = this.renderThread;
            if (renderThread != null) {
                renderThread.setRun(false);
                this.renderThread.isPause = false;
                this.renderThread.interrupt();
                drawFrameLocked(this.lastRenderMillis);
                obj.notifyAll();
            }
        }
    }

    private void drawFrameLocked(long j) {
        SurfaceHolder holder = getHolder();
        Canvas canvas = null;
        try {
            canvas = holder.lockCanvas();
            if (canvas != null) {
                doDrawBackground(canvas);
                render(canvas, j);
            }
            if (canvas != null) {
                holder.unlockCanvasAndPost(canvas);
            }
        } catch (Exception unused) {
            if (canvas != null) {
                holder.unlockCanvasAndPost(canvas);
            }
        } catch (Throwable th) {
            if (canvas != null) {
                holder.unlockCanvasAndPost(canvas);
            }
            throw th;
        }
    }

    public boolean isRunning() {
        RenderThread renderThread = this.renderThread;
        if (renderThread != null) {
            return renderThread.running;
        }
        return false;
    }

    public void release() {
        Object obj = surfaceLock;
        synchronized (obj) {
            RenderThread renderThread = this.renderThread;
            if (renderThread != null) {
                renderThread.setRun(false);
                this.renderThread.destoryed = true;
                this.renderThread.isPause = false;
                this.renderThread.interrupt();
                obj.notifyAll();
            }
            if (getHolder() != null && getHolder().getSurface() != null) {
                getHolder().getSurface().release();
                getHolder().removeCallback(this);
            }
        }
    }
}
