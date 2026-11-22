package com.otaliastudios.cameraview.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* loaded from: classes17.dex */
public class OrientationHelper {
    private final Callback mCallback;
    private final Context mContext;
    final OrientationEventListener mDeviceOrientationListener;
    private boolean mEnabled;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private int mDeviceOrientation = -1;
    private int mDisplayOffset = -1;
    final DisplayManager.DisplayListener mDisplayOffsetListener = new DisplayManager.DisplayListener() { // from class: com.otaliastudios.cameraview.internal.OrientationHelper.2
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            int i2 = OrientationHelper.this.mDisplayOffset;
            int findDisplayOffset = OrientationHelper.this.findDisplayOffset();
            if (findDisplayOffset != i2) {
                OrientationHelper.this.mDisplayOffset = findDisplayOffset;
                OrientationHelper.this.mCallback.onDisplayOffsetChanged();
            }
        }
    };

    public interface Callback {
        void onDeviceOrientationChanged(int i);

        void onDisplayOffsetChanged();
    }

    public OrientationHelper(Context context, Callback callback) {
        this.mContext = context;
        this.mCallback = callback;
        this.mDeviceOrientationListener = new OrientationEventListener(context.getApplicationContext(), 3) { // from class: com.otaliastudios.cameraview.internal.OrientationHelper.1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i) {
                int i2 = 0;
                if (i == -1) {
                    if (OrientationHelper.this.mDeviceOrientation != -1) {
                        i2 = OrientationHelper.this.mDeviceOrientation;
                    }
                } else if (i < 315 && i >= 45) {
                    if (i >= 45 && i < 135) {
                        i2 = 90;
                    } else if (i >= 135 && i < 225) {
                        i2 = 180;
                    } else if (i >= 225 && i < 315) {
                        i2 = 270;
                    }
                }
                if (i2 != OrientationHelper.this.mDeviceOrientation) {
                    OrientationHelper.this.mDeviceOrientation = i2;
                    OrientationHelper.this.mCallback.onDeviceOrientationChanged(OrientationHelper.this.mDeviceOrientation);
                }
            }
        };
    }

    public void enable() {
        if (this.mEnabled) {
            return;
        }
        this.mEnabled = true;
        this.mDisplayOffset = findDisplayOffset();
        ((DisplayManager) this.mContext.getSystemService("display")).registerDisplayListener(this.mDisplayOffsetListener, this.mHandler);
        this.mDeviceOrientationListener.enable();
    }

    public void disable() {
        if (this.mEnabled) {
            this.mEnabled = false;
            this.mDeviceOrientationListener.disable();
            ((DisplayManager) this.mContext.getSystemService("display")).unregisterDisplayListener(this.mDisplayOffsetListener);
            this.mDisplayOffset = -1;
            this.mDeviceOrientation = -1;
        }
    }

    public int getLastDeviceOrientation() {
        return this.mDeviceOrientation;
    }

    public int getLastDisplayOffset() {
        return this.mDisplayOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int findDisplayOffset() {
        int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }
}
