package com.efs.sdk.base.core.cache;

import com.efs.sdk.base.core.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Byte, d> f9610a = new ConcurrentHashMap<>();

    final d a(byte b) {
        if (!this.f9610a.containsKey(Byte.valueOf(b))) {
            if (b == 1) {
                this.f9610a.putIfAbsent(Byte.valueOf(b), new e());
            } else if (b == 2) {
                this.f9610a.putIfAbsent(Byte.valueOf(b), new c());
            } else {
                Log.w("efs.cache", "Cache module not support protocol ".concat(String.valueOf((int) b)));
            }
        }
        return this.f9610a.get(Byte.valueOf(b));
    }
}
