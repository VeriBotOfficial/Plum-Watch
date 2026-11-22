package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.face.FaceListener;
import com.baidu.ar.face.IFace;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public class z3 extends d0 implements IFace {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<IFace> f7359a;
    public FaceListener b;
    public String c;

    @Override // com.baidu.ar.d0
    public void a() {
        WeakReference<IFace> weakReference = this.f7359a;
        if (weakReference != null) {
            weakReference.clear();
            this.f7359a = null;
        }
        this.b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.ar.d0
    public void a(c0 c0Var) {
        if (c0Var == 0) {
            WeakReference<IFace> weakReference = this.f7359a;
            if (weakReference != null) {
                weakReference.clear();
                this.f7359a = null;
                return;
            }
            return;
        }
        if (c0Var instanceof IFace) {
            this.f7359a = new WeakReference<>((IFace) c0Var);
            if (!TextUtils.isEmpty(this.c)) {
                this.f7359a.get().setFaceModelPath(this.c);
            }
        }
        if (this.b != null) {
            this.f7359a.get().setFaceListener(this.b);
        }
    }

    @Override // com.baidu.ar.face.IFace
    public void setFaceListener(FaceListener faceListener) {
        this.b = faceListener;
        WeakReference<IFace> weakReference = this.f7359a;
        if (weakReference != null) {
            weakReference.get().setFaceListener(this.b);
        }
    }

    @Override // com.baidu.ar.face.IFace
    public void setFaceModelPath(String str) {
        this.c = str;
        WeakReference<IFace> weakReference = this.f7359a;
        if (weakReference != null) {
            weakReference.get().setFaceModelPath(str);
        }
    }
}
