package com.bykv.vk.openvk.fxn.fxn.fxn.bh;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public class bh implements SurfaceHolder.Callback {
    private final WeakReference<SurfaceHolder.Callback> fxn;

    public bh(SurfaceHolder.Callback callback) {
        this.fxn = new WeakReference<>(callback);
    }

    public SurfaceHolder.Callback fxn() {
        return this.fxn.get();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.fxn.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = this.fxn.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.fxn.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
