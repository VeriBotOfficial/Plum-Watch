package com.efs.sdk.base.core.model;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f9638a;
    byte b;
    int c = 0;
    String d = "none";
    int e = 1;
    long f = 0;
    int g = 1;
    String h = "";
    String i = "";
    long j = 0;
    long k = 0;

    a(String str, byte b) {
        this.b = (byte) 2;
        this.f9638a = str;
        if (b <= 0 || 3 < b) {
            throw new IllegalArgumentException("log protocol flag invalid : ".concat(String.valueOf((int) b)));
        }
        this.b = b;
    }
}
