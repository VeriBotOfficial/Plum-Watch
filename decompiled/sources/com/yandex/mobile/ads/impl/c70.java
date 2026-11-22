package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.j01;
import com.yandex.mobile.ads.impl.pw1;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c70 {

    /* renamed from: a, reason: collision with root package name */
    private final r10 f15162a;
    private final ny1 b;

    public final my1 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15162a.getClass();
        File cacheDir = r10.a(context, "mobileads-video-cache");
        int i = pw1.l;
        ju1 a2 = pw1.a.a().a(context);
        or0 cacheEvictor = new or0(j01.a.a(context, 41943040L, (a2 == null || a2.B() == 0) ? 52428800L : a2.B()));
        k60 databaseProvider = new k60(context);
        this.b.getClass();
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(cacheEvictor, "cacheEvictor");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        return new my1(cacheDir, cacheEvictor, databaseProvider);
    }

    public /* synthetic */ c70() {
        this(new r10(), new ny1());
    }

    public c70(r10 diskCacheProvider, ny1 simpleCacheFactory) {
        Intrinsics.checkNotNullParameter(diskCacheProvider, "diskCacheProvider");
        Intrinsics.checkNotNullParameter(simpleCacheFactory, "simpleCacheFactory");
        this.f15162a = diskCacheProvider;
        this.b = simpleCacheFactory;
    }
}
