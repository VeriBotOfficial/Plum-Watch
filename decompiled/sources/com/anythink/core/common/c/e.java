package com.anythink.core.common.c;

import android.content.Context;

/* loaded from: classes12.dex */
public abstract class e implements f {

    /* renamed from: a, reason: collision with root package name */
    static final int f3652a = 1;
    static final int b = 2;
    static final int c = 3;
    protected final long d = 86400000;
    protected String e;
    protected Context f;
    protected String g;
    protected long h;

    public e(Context context, String str, String str2, long j) {
        this.e = str;
        this.f = context;
        this.g = str2;
        this.h = j;
    }

    private String c() {
        return this.e;
    }

    private String d() {
        return this.g;
    }

    private long e() {
        return this.h;
    }
}
