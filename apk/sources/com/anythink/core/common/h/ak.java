package com.anythink.core.common.h;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3847a;
    private long b = 1800000;
    private List<String> c;
    private Map<String, List<String>> d;

    public final void a(int r1) {
        this.f3847a = r1;
    }

    public final void a(long j) {
        this.b = j;
    }

    public final void a(List<String> list) {
        this.c = list;
    }

    public final List<String> a() {
        return this.c;
    }

    private int d() {
        return this.f3847a;
    }

    public final long b() {
        return this.b;
    }

    public final Map<String, List<String>> c() {
        return this.d;
    }

    public final void a(Map<String, List<String>> map) {
        this.d = map;
    }
}
