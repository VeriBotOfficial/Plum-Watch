package com.huawei.hms.feature.dynamic.a;

import android.util.Log;
import dalvik.system.PathClassLoader;

/* loaded from: classes14.dex */
public final class a extends PathClassLoader {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10345a = "a";

    public a(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    protected final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
                Log.w(f10345a, "Cannot find The class:".concat(String.valueOf(str)));
            }
        }
        return super.loadClass(str, z);
    }
}
