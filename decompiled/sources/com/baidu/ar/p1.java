package com.baidu.ar;

import com.baidu.ar.callback.ICallback;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.IError;

/* loaded from: classes12.dex */
public class p1<T> extends e0<T, T> {
    public ICallback i;
    public IError j;

    public p1(ICallback iCallback, IError iError) {
        this.i = iCallback;
        this.j = iError;
    }

    @Override // com.baidu.ar.e0
    public void a(int i, String str, IError iError) {
        IError iError2 = this.j;
        if (iError2 != null) {
            iError2.onError(i, str, null);
        }
    }

    @Override // com.baidu.ar.e0
    public void a(T t, ICallbackWith<T> iCallbackWith, IError iError) {
        ICallback iCallback = this.i;
        if (iCallback != null) {
            iCallback.run();
        }
    }

    @Override // com.baidu.ar.e0
    public void b() {
    }
}
