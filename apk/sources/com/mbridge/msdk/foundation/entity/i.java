package com.mbridge.msdk.foundation.entity;

import java.io.Serializable;

/* JADX INFO: compiled from: LoopEntity.java */
/* JADX INFO: loaded from: classes2.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11537a;
    private String b;
    private String c;

    public i(String str, String str2, int r3) {
        this.b = str;
        this.c = str2;
        this.f11537a = r3;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }
}
