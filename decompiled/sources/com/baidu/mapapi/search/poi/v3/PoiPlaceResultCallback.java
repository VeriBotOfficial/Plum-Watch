package com.baidu.mapapi.search.poi.v3;

/* loaded from: classes13.dex */
public interface PoiPlaceResultCallback<T> {
    void failed(int i, String str);

    void success(T t);
}
