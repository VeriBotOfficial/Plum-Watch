package com.otaliastudios.cameraview.frame;

import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.size.Size;

/* loaded from: classes17.dex */
public class Frame {
    private final Class<?> mDataClass;
    private final FrameManager mManager;
    private static final String TAG = "Frame";
    private static final CameraLogger LOG = CameraLogger.create(TAG);
    private Object mData = null;
    private long mTime = -1;
    private long mLastTime = -1;
    private int mUserRotation = 0;
    private int mViewRotation = 0;
    private Size mSize = null;
    private int mFormat = -1;

    Frame(FrameManager frameManager) {
        this.mManager = frameManager;
        this.mDataClass = frameManager.getFrameDataClass();
    }

    void setContent(Object obj, long j, int i, int i2, Size size, int i3) {
        this.mData = obj;
        this.mTime = j;
        this.mLastTime = j;
        this.mUserRotation = i;
        this.mViewRotation = i2;
        this.mSize = size;
        this.mFormat = i3;
    }

    private boolean hasContent() {
        return this.mData != null;
    }

    private void ensureHasContent() {
        if (hasContent()) {
            return;
        }
        LOG.e("Frame is dead! time:", Long.valueOf(this.mTime), "lastTime:", Long.valueOf(this.mLastTime));
        throw new RuntimeException("You should not access a released frame. If this frame was passed to a FrameProcessor, you can only use its contents synchronously, for the duration of the process() method.");
    }

    public boolean equals(Object obj) {
        return (obj instanceof Frame) && ((Frame) obj).mTime == this.mTime;
    }

    public Frame freeze() {
        ensureHasContent();
        Frame frame = new Frame(this.mManager);
        frame.setContent(this.mManager.cloneFrameData(getData()), this.mTime, this.mUserRotation, this.mViewRotation, this.mSize, this.mFormat);
        return frame;
    }

    public void release() {
        if (hasContent()) {
            LOG.v("Frame with time", Long.valueOf(this.mTime), "is being released.");
            Object obj = this.mData;
            this.mData = null;
            this.mUserRotation = 0;
            this.mViewRotation = 0;
            this.mTime = -1L;
            this.mSize = null;
            this.mFormat = -1;
            this.mManager.onFrameReleased(this, obj);
        }
    }

    public <T> T getData() {
        ensureHasContent();
        return (T) this.mData;
    }

    public Class<?> getDataClass() {
        return this.mDataClass;
    }

    public long getTime() {
        ensureHasContent();
        return this.mTime;
    }

    @Deprecated
    public int getRotation() {
        return getRotationToUser();
    }

    public int getRotationToUser() {
        ensureHasContent();
        return this.mUserRotation;
    }

    public int getRotationToView() {
        ensureHasContent();
        return this.mViewRotation;
    }

    public Size getSize() {
        ensureHasContent();
        return this.mSize;
    }

    public int getFormat() {
        ensureHasContent();
        return this.mFormat;
    }
}
