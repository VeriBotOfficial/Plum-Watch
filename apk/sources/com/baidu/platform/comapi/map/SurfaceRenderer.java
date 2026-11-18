package com.baidu.platform.comapi.map;

import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes15.dex */
public interface SurfaceRenderer {
    void onDrawFrame(Object obj);

    void onSurfaceChanged(int r1, int r2);

    void onSurfaceCreated(SurfaceHolder surfaceHolder, int r2, int r3, int r4);

    void onSurfaceDestroyed(SurfaceHolder surfaceHolder);
}
