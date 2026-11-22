package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class go0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15617a;
    private final xn0 b;
    private final List<xn0> c;
    private final zc2 d;
    private final od2 e;
    private final cm0 f;
    private final JSONObject g;
    private final long h;
    private final List<u70> i;

    public go0(String videoAdId, xn0 recommendedMediaFile, ArrayList mediaFiles, zc2 adPodInfo, od2 od2Var, cm0 adInfo, JSONObject jSONObject, long j, List extensions) {
        Intrinsics.checkNotNullParameter(videoAdId, "videoAdId");
        Intrinsics.checkNotNullParameter(recommendedMediaFile, "recommendedMediaFile");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(adPodInfo, "adPodInfo");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f15617a = videoAdId;
        this.b = recommendedMediaFile;
        this.c = mediaFiles;
        this.d = adPodInfo;
        this.e = od2Var;
        this.f = adInfo;
        this.g = jSONObject;
        this.h = j;
        this.i = extensions;
    }

    public final xn0 g() {
        return this.b;
    }

    public final List<xn0> f() {
        return this.c;
    }

    public final zc2 b() {
        return this.d;
    }

    public final od2 h() {
        return this.e;
    }

    public final cm0 a() {
        return this.f;
    }

    public final JSONObject e() {
        return this.g;
    }

    public final long c() {
        return this.h;
    }

    public final List<u70> d() {
        return this.i;
    }

    public final String toString() {
        return this.f15617a;
    }
}
