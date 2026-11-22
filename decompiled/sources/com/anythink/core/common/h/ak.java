package com.anythink.core.common.h;

import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class ak {

    /* renamed from: a, reason: collision with root package name */
    private int f3845a;
    private long b = 1800000;
    private List<String> c;
    private Map<String, List<String>> d;

    public final void a(int i) {
        this.f3845a = i;
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
        return this.f3845a;
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
