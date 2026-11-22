package com.baidu.ar;

import android.graphics.Bitmap;
import com.baidu.ar.track2d.ITrack2D;
import com.baidu.ar.track2d.ITrack2DStateChangedListener;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public class uc extends d0 implements ITrack2D {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<ITrack2D> f7244a;
    public ITrack2DStateChangedListener b;

    @Override // com.baidu.ar.d0
    public void a() {
        WeakReference<ITrack2D> weakReference = this.f7244a;
        if (weakReference != null) {
            weakReference.clear();
            this.f7244a = null;
        }
        this.b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.ar.d0
    public void a(c0 c0Var) {
        if (c0Var instanceof ITrack2D) {
            ITrack2D iTrack2D = (ITrack2D) c0Var;
            this.f7244a = new WeakReference<>(iTrack2D);
            ITrack2DStateChangedListener iTrack2DStateChangedListener = this.b;
            if (iTrack2DStateChangedListener != null) {
                iTrack2D.setStateChangedListener(iTrack2DStateChangedListener);
            }
        }
    }

    @Override // com.baidu.ar.track2d.ITrack2D
    public Bitmap getTargetBitmap() {
        WeakReference<ITrack2D> weakReference = this.f7244a;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f7244a.get().getTargetBitmap();
    }

    @Override // com.baidu.ar.track2d.ITrack2D
    public void haltTrack() {
        WeakReference<ITrack2D> weakReference = this.f7244a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f7244a.get().haltTrack();
    }

    @Override // com.baidu.ar.track2d.ITrack2D
    public void resumeTrack() {
        WeakReference<ITrack2D> weakReference = this.f7244a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f7244a.get().resumeTrack();
    }

    @Override // com.baidu.ar.track2d.ITrack2D
    public void setStateChangedListener(ITrack2DStateChangedListener iTrack2DStateChangedListener) {
        WeakReference<ITrack2D> weakReference;
        this.b = iTrack2DStateChangedListener;
        if (iTrack2DStateChangedListener == null || (weakReference = this.f7244a) == null || weakReference.get() == null) {
            return;
        }
        this.f7244a.get().setStateChangedListener(this.b);
    }
}
