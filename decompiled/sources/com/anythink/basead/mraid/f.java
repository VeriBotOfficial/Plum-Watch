package com.anythink.basead.mraid;

/* loaded from: classes11.dex */
public class f extends com.anythink.core.express.d.a {

    /* renamed from: a, reason: collision with root package name */
    private static f f2917a;

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str) {
    }

    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str, String str2) {
    }

    @Override // com.anythink.core.express.d.b
    public final void b(Object obj, String str) {
    }

    private f() {
    }

    public static f a() {
        if (f2917a == null) {
            synchronized (f.class) {
                if (f2917a == null) {
                    f2917a = new f();
                }
            }
        }
        return f2917a;
    }
}
