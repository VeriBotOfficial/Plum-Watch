package com.baidu.platform.domain;

import com.wakeup.commponent.module.baidu.BaiduMapToolManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: HttpUrlConstant.java */
/* JADX INFO: loaded from: classes15.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Integer, String> f9017a = new C0522a();
    public static final Map<Integer, String> b = new b();

    /* JADX INFO: renamed from: com.baidu.platform.domain.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpUrlConstant.java */
    static class C0522a extends HashMap<Integer, String> {
        C0522a() {
            put(1, BaiduMapToolManager.searchHost);
        }
    }

    /* JADX INFO: compiled from: HttpUrlConstant.java */
    static class b extends HashMap<Integer, String> {
        b() {
            put(1, "/sdkproxy/lbs_androidsdk");
        }
    }
}
