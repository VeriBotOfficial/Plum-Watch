package com.qumeng.overseas.update;

import android.util.Base64;
import dalvik.system.DexClassLoader;
import java.util.Map;

/* loaded from: classes17.dex */
public class a extends DexClassLoader {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f13456a;

    public a(String str, String str2, String str3, ClassLoader classLoader) {
        super(str, str2, str3, classLoader);
    }

    public void a(Map<Class, String> map) {
        String str = new String(Base64.decode("bG9hZENsYXNz", 3));
        for (Map.Entry<Class, String> entry : map.entrySet()) {
            try {
                com.qumeng.overseas.advlib.common.a.c().a(entry.getKey(), (Class) com.qumeng.overseas.advlib.common.b.a(this).a(str, entry.getValue()).c());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.f13456a = true;
    }

    public boolean a() {
        return this.f13456a;
    }
}
