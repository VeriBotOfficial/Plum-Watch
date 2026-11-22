package com.efs.sdk.net.a;

import java.util.WeakHashMap;
import okhttp3.Call;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final WeakHashMap<Call, f> f9958a = new WeakHashMap<>();

    public static void a(Call call, f fVar) {
        f9958a.put(call, fVar);
    }

    public static f a(Call call) {
        return f9958a.get(call);
    }

    public static void b(Call call) {
        f9958a.remove(call);
    }
}
