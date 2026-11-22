package com.baidu.platform.comapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.baidu.platform.comapi.map.s;

/* compiled from: RenderSurfaceView.java */
/* loaded from: classes13.dex */
class t extends SurfaceView implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    protected r f8658a;

    public t(Context context) {
        super(context);
        a(context, s.a.OPENGL_ES, true);
    }

    protected void a(Context context, s.a aVar, boolean z) {
        if (this.f8658a != null) {
            return;
        }
        this.f8658a = a(aVar, z, context);
        getHolder().addCallback(this);
    }

    public Bitmap captureImageFromSurface(int i, int i2, int i3, int i4, Object obj, Bitmap.Config config) {
        return this.f8658a.captureImageFromSurface(i, i2, i3, i4, obj, config);
    }

    public int getDebugFlags() {
        return this.f8658a.getDebugFlags();
    }

    public r getRenderControl() {
        return this.f8658a;
    }

    public int getRenderMode() {
        return this.f8658a.getRenderMode();
    }

    public s.a getViewType() {
        r rVar = this.f8658a;
        return rVar != null ? rVar.getViewType() : s.a.AUTO;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8658a.onAttachedToWindow();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        this.f8658a.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    public void onPause() {
        this.f8658a.onPause();
    }

    public void onResume() {
        this.f8658a.onResume();
    }

    public void queueEvent(Runnable runnable) {
        this.f8658a.queueEvent(runnable);
    }

    public void requestRender() {
        this.f8658a.requestRender();
    }

    public void setDebugFlags(int i) {
        this.f8658a.setDebugFlags(i);
    }

    public void setRenderMode(int i) {
        this.f8658a.setRenderMode(i);
    }

    public void setRenderer(SurfaceRenderer surfaceRenderer) {
        this.f8658a.setRenderer(surfaceRenderer);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f8658a.surfaceChanged(surfaceHolder, i, i2, i3);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f8658a.surfaceCreated(surfaceHolder);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f8658a.surfaceDestroyed(surfaceHolder);
    }

    @Deprecated
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        this.f8658a.surfaceRedrawNeededAsync(surfaceHolder, runnable);
    }

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, s.a.OPENGL_ES, true);
    }

    public t(Context context, s.a aVar) {
        super(context);
        a(context, aVar, true);
    }

    public t(Context context, s.a aVar, boolean z) {
        super(context);
        a(context, aVar, z);
    }

    public t(Context context, boolean z) {
        super(context);
        a(context, s.a.OPENGL_ES, z);
    }

    protected r a(s.a aVar, boolean z, Context context) {
        return s.a(this, aVar, z, context);
    }
}
