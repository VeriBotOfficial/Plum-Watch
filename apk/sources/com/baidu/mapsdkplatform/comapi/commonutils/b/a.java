package com.baidu.mapsdkplatform.comapi.commonutils.b;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: DownloadThreadInfo.java */
/* JADX INFO: loaded from: classes15.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8355a;
    private int b;
    private int c;

    public a(int r1, int r2, int r3) {
        this.f8355a = r1;
        this.b = r2;
        this.c = r3;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        return "DownloadThreadInfo{id=" + this.f8355a + ", start=" + this.b + ", end=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public void a(int r1) {
        this.c = r1;
    }
}
