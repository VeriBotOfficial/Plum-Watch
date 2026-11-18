package com.baidu.ar.baidumap;

/* JADX INFO: loaded from: classes16.dex */
public enum BusinessSoType {
    engine("main"),
    eglCore("egl_core"),
    localRecognize("local_recognize"),
    cloudRecognize("cloud_recognize");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6811a;

    BusinessSoType(String str) {
        this.f6811a = str;
    }

    public String getBusiness() {
        String str = this.f6811a;
        return str == null ? "" : str;
    }
}
