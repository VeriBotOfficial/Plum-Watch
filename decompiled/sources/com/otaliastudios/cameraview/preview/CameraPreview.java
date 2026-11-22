package com.otaliastudios.cameraview.preview;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.size.Size;

/* loaded from: classes17.dex */
public abstract class CameraPreview<T extends View, Output> {
    protected static final CameraLogger LOG = CameraLogger.create("CameraPreview");
    CropCallback mCropCallback;
    protected boolean mCropping;
    protected int mDrawRotation;
    protected int mInputStreamHeight;
    protected int mInputStreamWidth;
    protected int mOutputSurfaceHeight;
    protected int mOutputSurfaceWidth;
    private SurfaceCallback mSurfaceCallback;
    private T mView;

    protected interface CropCallback {
        void onCrop();
    }

    public interface SurfaceCallback {
        void onSurfaceAvailable();

        void onSurfaceChanged();

        void onSurfaceDestroyed();
    }

    public abstract Output getOutput();

    public abstract Class<Output> getOutputClass();

    public abstract View getRootView();

    protected abstract T onCreateView(Context context, ViewGroup viewGroup);

    public void onPause() {
    }

    public void onResume() {
    }

    public boolean supportsCropping() {
        return false;
    }

    public CameraPreview(Context context, ViewGroup viewGroup) {
        this.mView = onCreateView(context, viewGroup);
    }

    public void setSurfaceCallback(SurfaceCallback surfaceCallback) {
        SurfaceCallback surfaceCallback2;
        SurfaceCallback surfaceCallback3;
        if (hasSurface() && (surfaceCallback3 = this.mSurfaceCallback) != null) {
            surfaceCallback3.onSurfaceDestroyed();
        }
        this.mSurfaceCallback = surfaceCallback;
        if (!hasSurface() || (surfaceCallback2 = this.mSurfaceCallback) == null) {
            return;
        }
        surfaceCallback2.onSurfaceAvailable();
    }

    public final T getView() {
        return this.mView;
    }

    public void setStreamSize(int i, int i2) {
        LOG.i("setStreamSize:", "desiredW=", Integer.valueOf(i), "desiredH=", Integer.valueOf(i2));
        this.mInputStreamWidth = i;
        this.mInputStreamHeight = i2;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        crop(this.mCropCallback);
    }

    final Size getStreamSize() {
        return new Size(this.mInputStreamWidth, this.mInputStreamHeight);
    }

    public final Size getSurfaceSize() {
        return new Size(this.mOutputSurfaceWidth, this.mOutputSurfaceHeight);
    }

    public final boolean hasSurface() {
        return this.mOutputSurfaceWidth > 0 && this.mOutputSurfaceHeight > 0;
    }

    protected final void dispatchOnSurfaceAvailable(int i, int i2) {
        LOG.i("dispatchOnSurfaceAvailable:", "w=", Integer.valueOf(i), "h=", Integer.valueOf(i2));
        this.mOutputSurfaceWidth = i;
        this.mOutputSurfaceHeight = i2;
        if (i > 0 && i2 > 0) {
            crop(this.mCropCallback);
        }
        SurfaceCallback surfaceCallback = this.mSurfaceCallback;
        if (surfaceCallback != null) {
            surfaceCallback.onSurfaceAvailable();
        }
    }

    protected final void dispatchOnSurfaceSizeChanged(int i, int i2) {
        LOG.i("dispatchOnSurfaceSizeChanged:", "w=", Integer.valueOf(i), "h=", Integer.valueOf(i2));
        if (i == this.mOutputSurfaceWidth && i2 == this.mOutputSurfaceHeight) {
            return;
        }
        this.mOutputSurfaceWidth = i;
        this.mOutputSurfaceHeight = i2;
        if (i > 0 && i2 > 0) {
            crop(this.mCropCallback);
        }
        SurfaceCallback surfaceCallback = this.mSurfaceCallback;
        if (surfaceCallback != null) {
            surfaceCallback.onSurfaceChanged();
        }
    }

    protected final void dispatchOnSurfaceDestroyed() {
        this.mOutputSurfaceWidth = 0;
        this.mOutputSurfaceHeight = 0;
        SurfaceCallback surfaceCallback = this.mSurfaceCallback;
        if (surfaceCallback != null) {
            surfaceCallback.onSurfaceDestroyed();
        }
    }

    public void onDestroy() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            onDestroyView();
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        handler.post(new Runnable() { // from class: com.otaliastudios.cameraview.preview.CameraPreview.1
            @Override // java.lang.Runnable
            public void run() {
                CameraPreview.this.onDestroyView();
                taskCompletionSource.setResult(null);
            }
        });
        try {
            Tasks.await(taskCompletionSource.getTask());
        } catch (Exception unused) {
        }
    }

    protected void onDestroyView() {
        View rootView = getRootView();
        ViewParent parent = rootView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(rootView);
        }
    }

    protected void crop(CropCallback cropCallback) {
        if (cropCallback != null) {
            cropCallback.onCrop();
        }
    }

    public boolean isCropping() {
        return this.mCropping;
    }

    public void setDrawRotation(int i) {
        this.mDrawRotation = i;
    }
}
