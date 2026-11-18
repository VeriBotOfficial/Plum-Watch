package com.anythink.core.common.h;

/* JADX INFO: loaded from: classes16.dex */
public final class bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3884a;
    private boolean b;
    private Boolean c;

    public bq(String str, boolean z) {
        this.f3884a = str;
        this.b = z;
    }

    public final synchronized void a(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final synchronized String a() {
        return this.f3884a;
    }

    public final synchronized boolean b() {
        return this.b;
    }

    public final synchronized Boolean c() {
        return this.c;
    }
}
