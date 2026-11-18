package com.otaliastudios.cameraview.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
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
        public void onDisplayAdded(int r1) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int r1) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int r2) {
            int r3 = OrientationHelper.this.mDisplayOffset;
            int r0 = OrientationHelper.this.findDisplayOffset();
            if (r0 != r3) {
                OrientationHelper.this.mDisplayOffset = r0;
                OrientationHelper.this.mCallback.onDisplayOffsetChanged();
            }
        }
    };

    public interface Callback {
        void onDeviceOrientationChanged(int r1);

        void onDisplayOffsetChanged();
    }

    public OrientationHelper(Context context, Callback callback) {
        this.mContext = context;
        this.mCallback = callback;
        this.mDeviceOrientationListener = new OrientationEventListener(context.getApplicationContext(), 3) { // from class: com.otaliastudios.cameraview.internal.OrientationHelper.1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int r5) {
                int r0 = 0;
                if (r5 == -1) {
                    if (OrientationHelper.this.mDeviceOrientation != -1) {
                        r0 = OrientationHelper.this.mDeviceOrientation;
                    }
                } else if (r5 < 315 && r5 >= 45) {
                    if (r5 >= 45 && r5 < 135) {
                        r0 = 90;
                    } else if (r5 >= 135 && r5 < 225) {
                        r0 = 180;
                    } else if (r5 >= 225 && r5 < 315) {
                        r0 = 270;
                    }
                }
                if (r0 != OrientationHelper.this.mDeviceOrientation) {
                    OrientationHelper.this.mDeviceOrientation = r0;
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
