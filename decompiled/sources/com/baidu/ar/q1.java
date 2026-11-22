package com.baidu.ar;

import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.IError;
import com.baidu.ar.content.IRequestCallback;

/* loaded from: classes12.dex */
public class q1<T> extends e0<T, T> {
    public IRequestCallback<T> i;

    public q1(IRequestCallback<T> iRequestCallback) {
        this.i = iRequestCallback;
    }

    @Override // com.baidu.ar.e0
    public void a(int i, String str, IError iError) {
        IRequestCallback<T> iRequestCallback = this.i;
        if (iRequestCallback != null) {
            iRequestCallback.onFail(i, str);
        }
    }

    @Override // com.baidu.ar.e0
    public void a(T t, ICallbackWith<T> iCallbackWith, IError iError) {
        IRequestCallback<T> iRequestCallback = this.i;
        if (iRequestCallback != null) {
            iRequestCallback.onResponse(t);
        }
    }

    @Override // com.baidu.ar.e0
    public void b() {
    }
}
