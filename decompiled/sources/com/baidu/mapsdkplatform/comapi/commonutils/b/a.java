package com.baidu.mapsdkplatform.comapi.commonutils.b;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: DownloadThreadInfo.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private int f8355a;
    private int b;
    private int c;

    public a(int i, int i2, int i3) {
        this.f8355a = i;
        this.b = i2;
        this.c = i3;
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

    public void a(int i) {
        this.c = i;
    }
}
