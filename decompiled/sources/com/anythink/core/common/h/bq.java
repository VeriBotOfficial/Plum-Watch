package com.anythink.core.common.h;

/* loaded from: classes12.dex */
public final class bq {

    /* renamed from: a, reason: collision with root package name */
    private String f3882a;
    private boolean b;
    private Boolean c;

    public bq(String str, boolean z) {
        this.f3882a = str;
        this.b = z;
    }

    public final synchronized void a(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final synchronized String a() {
        return this.f3882a;
    }

    public final synchronized boolean b() {
        return this.b;
    }

    public final synchronized Boolean c() {
        return this.c;
    }
}
