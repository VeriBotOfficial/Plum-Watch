package com.baidu.ar.content;

/* JADX INFO: loaded from: classes16.dex */
public interface IRequestCallback<T> {
    void onFail(int r1, String str);

    void onResponse(T t);
}
