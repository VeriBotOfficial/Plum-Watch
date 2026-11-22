package com.baidu.ar;

import com.baidu.ar.cloud.ICloudIR;
import com.baidu.ar.cloud.ICloudIRStateChangedListener;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public class g2 extends d0 implements ICloudIR {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<ICloudIR> f6941a;
    public ICloudIRStateChangedListener b;

    @Override // com.baidu.ar.d0
    public void a() {
        WeakReference<ICloudIR> weakReference = this.f6941a;
        if (weakReference != null) {
            weakReference.clear();
            this.f6941a = null;
        }
        this.b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.ar.d0
    public void a(c0 c0Var) {
        if (c0Var instanceof ICloudIR) {
            ICloudIR iCloudIR = (ICloudIR) c0Var;
            this.f6941a = new WeakReference<>(iCloudIR);
            ICloudIRStateChangedListener iCloudIRStateChangedListener = this.b;
            if (iCloudIRStateChangedListener != null) {
                iCloudIR.setStateChangedListener(iCloudIRStateChangedListener);
            }
        }
    }

    @Override // com.baidu.ar.cloud.ICloudIR
    public void pause() {
        WeakReference<ICloudIR> weakReference = this.f6941a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6941a.get().pause();
    }

    @Override // com.baidu.ar.cloud.ICloudIR
    public void resume() {
        WeakReference<ICloudIR> weakReference = this.f6941a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6941a.get().resume();
    }

    @Override // com.baidu.ar.cloud.ICloudIR
    public void setStateChangedListener(ICloudIRStateChangedListener iCloudIRStateChangedListener) {
        WeakReference<ICloudIR> weakReference;
        this.b = iCloudIRStateChangedListener;
        if (iCloudIRStateChangedListener == null || (weakReference = this.f6941a) == null || weakReference.get() == null) {
            return;
        }
        this.f6941a.get().setStateChangedListener(this.b);
    }
}
