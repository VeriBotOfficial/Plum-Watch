package com.otaliastudios.cameraview.frame;

import android.graphics.ImageFormat;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.offset.Angles;
import com.otaliastudios.cameraview.engine.offset.Axis;
import com.otaliastudios.cameraview.engine.offset.Reference;
import com.otaliastudios.cameraview.size.Size;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes17.dex */
public abstract class FrameManager<T> {
    private Angles mAngles;
    private final Class<T> mFrameDataClass;
    private LinkedBlockingQueue<Frame> mFrameQueue;
    private final int mPoolSize;
    private static final String TAG = "FrameManager";
    protected static final CameraLogger LOG = CameraLogger.create(TAG);
    private int mFrameBytes = -1;
    private Size mFrameSize = null;
    private int mFrameFormat = -1;

    protected abstract T onCloneFrameData(T t);

    protected abstract void onFrameDataReleased(T t, boolean z);

    protected FrameManager(int i, Class<T> cls) {
        this.mPoolSize = i;
        this.mFrameDataClass = cls;
        this.mFrameQueue = new LinkedBlockingQueue<>(i);
    }

    public final int getPoolSize() {
        return this.mPoolSize;
    }

    public final int getFrameBytes() {
        return this.mFrameBytes;
    }

    public final Class<T> getFrameDataClass() {
        return this.mFrameDataClass;
    }

    public void setUp(int i, Size size, Angles angles) {
        isSetUp();
        this.mFrameSize = size;
        this.mFrameFormat = i;
        this.mFrameBytes = (int) Math.ceil(((size.getHeight() * size.getWidth()) * ImageFormat.getBitsPerPixel(i)) / 8.0d);
        for (int i2 = 0; i2 < getPoolSize(); i2++) {
            this.mFrameQueue.offer(new Frame(this));
        }
        this.mAngles = angles;
    }

    protected boolean isSetUp() {
        return this.mFrameSize != null;
    }

    public Frame getFrame(T t, long j) {
        if (!isSetUp()) {
            throw new IllegalStateException("Can't call getFrame() after releasing or before setUp.");
        }
        Frame poll = this.mFrameQueue.poll();
        if (poll != null) {
            LOG.v("getFrame for time:", Long.valueOf(j), "RECYCLING.");
            poll.setContent(t, j, this.mAngles.offset(Reference.SENSOR, Reference.OUTPUT, Axis.RELATIVE_TO_SENSOR), this.mAngles.offset(Reference.SENSOR, Reference.VIEW, Axis.RELATIVE_TO_SENSOR), this.mFrameSize, this.mFrameFormat);
            return poll;
        }
        LOG.i("getFrame for time:", Long.valueOf(j), "NOT AVAILABLE.");
        onFrameDataReleased(t, false);
        return null;
    }

    void onFrameReleased(Frame frame, T t) {
        if (isSetUp()) {
            onFrameDataReleased(t, this.mFrameQueue.offer(frame));
        }
    }

    final T cloneFrameData(T t) {
        return onCloneFrameData(t);
    }

    public void release() {
        if (!isSetUp()) {
            LOG.w("release called twice. Ignoring.");
            return;
        }
        LOG.i("release: Clearing the frame and buffer queue.");
        this.mFrameQueue.clear();
        this.mFrameBytes = -1;
        this.mFrameSize = null;
        this.mFrameFormat = -1;
        this.mAngles = null;
    }
}
