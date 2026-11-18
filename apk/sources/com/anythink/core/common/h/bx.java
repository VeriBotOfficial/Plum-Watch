package com.anythink.core.common.h;

/* JADX INFO: loaded from: classes16.dex */
public final class bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f3898a;

    public bx(long j, long j2) {
        this.f3898a = j + j2;
    }

    public final boolean a() {
        return System.currentTimeMillis() <= this.f3898a;
    }
}
