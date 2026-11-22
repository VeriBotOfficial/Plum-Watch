package com.baidu.mapapi.http.wrapper;

/* loaded from: classes13.dex */
public class Response<T> {
    private T data;
    private Throwable e;

    public Response() {
    }

    public T getData() {
        return this.data;
    }

    public Throwable getE() {
        return this.e;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setE(Throwable th) {
        this.e = th;
    }

    public Response(T t, Throwable th) {
        this.data = t;
        this.e = th;
    }
}
