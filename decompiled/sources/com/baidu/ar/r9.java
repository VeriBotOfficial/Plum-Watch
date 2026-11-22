package com.baidu.ar;

import com.baidu.ar.recg.IOnDeviceIR;
import com.baidu.ar.recg.IOnDeviceIRStateChangedListener;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public class r9 extends d0 implements IOnDeviceIR {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<IOnDeviceIR> f7145a;
    public IOnDeviceIRStateChangedListener b;

    @Override // com.baidu.ar.d0
    public void a() {
        WeakReference<IOnDeviceIR> weakReference = this.f7145a;
        if (weakReference != null) {
            weakReference.clear();
            this.f7145a = null;
        }
        this.b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.ar.d0
    public void a(c0 c0Var) {
        if (c0Var instanceof IOnDeviceIR) {
            IOnDeviceIR iOnDeviceIR = (IOnDeviceIR) c0Var;
            this.f7145a = new WeakReference<>(iOnDeviceIR);
            IOnDeviceIRStateChangedListener iOnDeviceIRStateChangedListener = this.b;
            if (iOnDeviceIRStateChangedListener != null) {
                iOnDeviceIR.setStateChangedListener(iOnDeviceIRStateChangedListener);
            }
        }
    }

    @Override // com.baidu.ar.recg.IOnDeviceIR
    public void retry() {
        WeakReference<IOnDeviceIR> weakReference = this.f7145a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f7145a.get().retry();
    }

    @Override // com.baidu.ar.recg.IOnDeviceIR
    public void setStateChangedListener(IOnDeviceIRStateChangedListener iOnDeviceIRStateChangedListener) {
        WeakReference<IOnDeviceIR> weakReference;
        this.b = iOnDeviceIRStateChangedListener;
        if (iOnDeviceIRStateChangedListener == null || (weakReference = this.f7145a) == null || weakReference.get() == null) {
            return;
        }
        this.f7145a.get().setStateChangedListener(this.b);
    }
}
