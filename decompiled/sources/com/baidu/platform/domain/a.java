package com.baidu.platform.domain;

import com.wakeup.commponent.module.baidu.BaiduMapToolManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: HttpUrlConstant.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<Integer, String> f9017a = new C0435a();
    public static final Map<Integer, String> b = new b();

    /* compiled from: HttpUrlConstant.java */
    /* renamed from: com.baidu.platform.domain.a$a, reason: collision with other inner class name */
    static class C0435a extends HashMap<Integer, String> {
        C0435a() {
            put(1, BaiduMapToolManager.searchHost);
        }
    }

    /* compiled from: HttpUrlConstant.java */
    static class b extends HashMap<Integer, String> {
        b() {
            put(1, "/sdkproxy/lbs_androidsdk");
        }
    }
}
