package com.anythink.core.common.m.d;

import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    String f4012a;
    int c;
    private final String l = getClass().getSimpleName();
    boolean b = true;

    @Override // com.anythink.core.common.m.d.d
    public final void a(String str, String str2, String str3, int i) {
    }

    @Override // com.anythink.core.common.m.d.d
    public final int d() {
        return 3;
    }

    public c(String str, int i) {
        this.c = 1;
        this.f4012a = str;
        if (i == 1000) {
            this.c = 1;
        } else if (i == 1001) {
            this.c = 2;
        }
    }

    @Override // com.anythink.core.common.m.d.d
    public final int c() {
        return this.c;
    }

    @Override // com.anythink.core.common.m.d.d
    public final byte[] e() {
        if (!TextUtils.isEmpty(this.f4012a)) {
            return a(this.f4012a);
        }
        return new byte[0];
    }

    @Override // com.anythink.core.common.m.d.d
    public final boolean f() {
        return this.b;
    }
}
