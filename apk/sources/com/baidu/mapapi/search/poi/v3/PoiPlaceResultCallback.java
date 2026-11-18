package com.baidu.mapapi.search.poi.v3;

/* JADX INFO: loaded from: classes15.dex */
public interface PoiPlaceResultCallback<T> {
    void failed(int r1, String str);

    void success(T t);
}
