package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.xq1;
import java.io.UnsupportedEncodingException;

/* loaded from: classes5.dex */
public final class e32 extends up1<String> {
    private final Object s;
    private xq1.b<String> t;

    public e32(String str, xq1.b bVar, xq1.a aVar) {
        super(0, str, aVar);
        this.s = new Object();
        this.t = bVar;
    }

    @Override // com.yandex.mobile.ads.impl.up1
    public final void a() {
        super.a();
        synchronized (this.s) {
            this.t = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.up1
    protected final void a(String str) {
        xq1.b<String> bVar;
        String str2 = str;
        synchronized (this.s) {
            bVar = this.t;
        }
        if (bVar != null) {
            bVar.a(str2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.up1
    protected final xq1<String> a(xc1 xc1Var) {
        String str;
        try {
            str = new String(xc1Var.b, wh0.a(xc1Var.c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(xc1Var.b);
        }
        return xq1.a(str, wh0.a(xc1Var));
    }
}
