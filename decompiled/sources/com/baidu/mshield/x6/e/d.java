package com.baidu.mshield.x6.e;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: HandleSimState.java */
/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public Context f8477a;

    public d(Context context) {
        this.f8477a = context;
    }

    public void a() {
        try {
            com.baidu.mshield.x6.b.b bVar = new com.baidu.mshield.x6.b.b(this.f8477a);
            String a2 = com.baidu.mshield.x6.c.a.a(this.f8477a);
            String b = com.baidu.mshield.x6.c.a.b(this.f8477a);
            String O = bVar.O();
            String N = bVar.N();
            if (!TextUtils.isEmpty(O)) {
                O = com.baidu.mshield.b.f.e.a(O);
                bVar.o(O);
            }
            if (!TextUtils.isEmpty(N)) {
                N = com.baidu.mshield.b.f.e.a(N);
                bVar.n(N);
            }
            if (TextUtils.isEmpty(a2)) {
                if (TextUtils.isEmpty(b)) {
                    if (TextUtils.isEmpty(O)) {
                        return;
                    }
                    bVar.e(true);
                    bVar.o("");
                    bVar.n("");
                    return;
                }
                if (N.equals(com.baidu.mshield.b.f.e.a(b))) {
                    return;
                }
                bVar.e(true);
                bVar.o("");
                bVar.n(com.baidu.mshield.b.f.e.a(b));
                return;
            }
            if (TextUtils.isEmpty(b)) {
                if (O.equals(com.baidu.mshield.b.f.e.a(a2))) {
                    return;
                }
                bVar.e(true);
                bVar.o(com.baidu.mshield.b.f.e.a(a2));
                bVar.n("");
                return;
            }
            if (O.equals(com.baidu.mshield.b.f.e.a(a2)) && N.equals(com.baidu.mshield.b.f.e.a(b))) {
                return;
            }
            bVar.e(true);
            bVar.o(com.baidu.mshield.b.f.e.a(a2));
            bVar.n(com.baidu.mshield.b.f.e.a(b));
        } catch (Throwable th) {
            com.baidu.mshield.x6.f.f.b(th);
        }
    }
}
