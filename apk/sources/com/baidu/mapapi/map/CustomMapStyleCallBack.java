package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes15.dex */
public interface CustomMapStyleCallBack {
    boolean onCustomMapStyleLoadFailed(int r1, String str, String str2);

    boolean onCustomMapStyleLoadSuccess(boolean z, String str);

    boolean onPreLoadLastCustomMapStyle(String str);
}
