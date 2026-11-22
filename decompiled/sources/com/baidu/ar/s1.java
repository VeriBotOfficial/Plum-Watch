package com.baidu.ar;

import android.graphics.Bitmap;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.capture.ICapture;
import com.baidu.ar.capture.ICaptureAbilityListener;
import com.baidu.ar.capture.ICaptureResult;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public class s1 extends d0 implements ICapture {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<ICapture> f7183a;
    public ICaptureAbilityListener b;

    @Override // com.baidu.ar.d0
    public void a() {
        this.b = null;
        WeakReference<ICapture> weakReference = this.f7183a;
        if (weakReference != null) {
            weakReference.clear();
            this.f7183a = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.ar.d0
    public void a(c0 c0Var) {
        if (c0Var == 0) {
            WeakReference<ICapture> weakReference = this.f7183a;
            if (weakReference != null) {
                weakReference.clear();
                this.f7183a = null;
                return;
            }
            return;
        }
        if (c0Var instanceof ICapture) {
            WeakReference<ICapture> weakReference2 = new WeakReference<>((ICapture) c0Var);
            this.f7183a = weakReference2;
            if (this.b != null) {
                weakReference2.get().setAbilityListener(this.b);
            }
        }
    }

    @Override // com.baidu.ar.capture.ICapture
    public void capture(ICallbackWith<ICaptureResult> iCallbackWith) {
        WeakReference<ICapture> weakReference = this.f7183a;
        if (weakReference == null || weakReference.get() == null || iCallbackWith == null) {
            return;
        }
        this.f7183a.get().capture(iCallbackWith);
    }

    @Override // com.baidu.ar.capture.ICapture
    public void sendBase64ImageToLua(String... strArr) {
        WeakReference<ICapture> weakReference = this.f7183a;
        if (weakReference == null || weakReference.get() == null || strArr == null || strArr.length <= 0) {
            return;
        }
        this.f7183a.get().sendBase64ImageToLua(strArr);
    }

    @Override // com.baidu.ar.capture.ICapture
    public void sendImageToLua(Bitmap... bitmapArr) {
        WeakReference<ICapture> weakReference = this.f7183a;
        if (weakReference == null || weakReference.get() == null || bitmapArr == null || bitmapArr.length <= 0) {
            return;
        }
        this.f7183a.get().sendImageToLua(bitmapArr);
    }

    @Override // com.baidu.ar.capture.ICapture
    public void setAbilityListener(ICaptureAbilityListener iCaptureAbilityListener) {
        WeakReference<ICapture> weakReference = this.f7183a;
        if (weakReference == null || weakReference.get() == null) {
            this.b = iCaptureAbilityListener;
        } else {
            this.f7183a.get().setAbilityListener(iCaptureAbilityListener);
        }
    }

    @Override // com.baidu.ar.capture.ICapture
    public void setCaptureCallback(ICallbackWith<ICaptureResult> iCallbackWith) {
        WeakReference<ICapture> weakReference = this.f7183a;
        if (weakReference == null || weakReference.get() == null || iCallbackWith == null) {
            return;
        }
        this.f7183a.get().setCaptureCallback(iCallbackWith);
    }
}
