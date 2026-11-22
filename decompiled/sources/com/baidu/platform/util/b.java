package com.baidu.platform.util;

import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SearchHttpManager.java */
/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f9019a;
    private final Map<Integer, HttpManager> b = new HashMap();

    private b() {
    }

    public static b a() {
        if (f9019a == null) {
            synchronized (b.class) {
                if (f9019a == null) {
                    f9019a = new b();
                }
            }
        }
        return f9019a;
    }

    public HttpManager b(int i) {
        if (this.b.containsKey(Integer.valueOf(i))) {
            return this.b.get(Integer.valueOf(i));
        }
        a(i);
        return this.b.get(Integer.valueOf(i));
    }

    private synchronized void a(int i) {
        if (this.b.containsKey(Integer.valueOf(i))) {
            return;
        }
        String str = com.baidu.platform.domain.a.f9017a.get(Integer.valueOf(i));
        String str2 = com.baidu.platform.domain.a.b.get(Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            this.b.put(Integer.valueOf(i), new HttpManager(str, str2));
        }
    }
}
