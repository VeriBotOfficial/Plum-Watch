package com.anythink.core.common.l.d;

import android.content.Context;
import com.anythink.core.api.ATNativeAdCustomRender;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.IATBaseAdAdapter;
import com.anythink.core.common.h.n;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f3965a;
    private BaseAd b;
    private n c;
    private ATNativeAdCustomRender d;
    private com.anythink.core.common.l.e.a.b e;
    private com.anythink.core.common.l.b.a.b f;
    private boolean g;
    private b h;
    private int i;
    private int j;

    /* synthetic */ a(byte b) {
        this();
    }

    private a() {
    }

    public final Context a() {
        return this.f3965a;
    }

    public final BaseAd b() {
        return this.b;
    }

    public final ATNativeAdCustomRender c() {
        return this.d;
    }

    public final com.anythink.core.common.l.e.a.b d() {
        return this.e;
    }

    public final int e() {
        b bVar = this.h;
        if (bVar != null) {
            return bVar.e();
        }
        return -1;
    }

    private int l() {
        b bVar = this.h;
        if (bVar != null) {
            return bVar.b();
        }
        return -1;
    }

    public final IATBaseAdAdapter f() {
        b bVar = this.h;
        if (bVar != null) {
            return bVar.r();
        }
        return null;
    }

    public final n g() {
        return this.c;
    }

    public final boolean h() {
        return this.g;
    }

    public final com.anythink.core.common.l.b.a.b i() {
        return this.f;
    }

    public final void a(b bVar) {
        this.h = bVar;
    }

    public final int a(String str) {
        b bVar = this.h;
        return Math.max(bVar != null ? ((Integer) bVar.a(str, 5)).intValue() : 5, 3);
    }

    public final int j() {
        return this.i;
    }

    public final int k() {
        return this.j;
    }

    /* renamed from: com.anythink.core.common.l.d.a$a, reason: collision with other inner class name */
    public static class C0198a {

        /* renamed from: a, reason: collision with root package name */
        private Context f3966a;
        private BaseAd b;
        private n c;
        private ATNativeAdCustomRender d;
        private com.anythink.core.common.l.e.a.b e;
        private com.anythink.core.common.l.b.a.b f;
        private boolean g;
        private int h;
        private int i;

        public final C0198a a(Context context) {
            this.f3966a = context;
            return this;
        }

        public final C0198a a(BaseAd baseAd) {
            this.b = baseAd;
            return this;
        }

        public final C0198a a(ATNativeAdCustomRender aTNativeAdCustomRender) {
            this.d = aTNativeAdCustomRender;
            return this;
        }

        public final C0198a a(com.anythink.core.common.l.e.a.b bVar) {
            this.e = bVar;
            return this;
        }

        public final C0198a a(n nVar) {
            this.c = nVar;
            return this;
        }

        public final C0198a a(boolean z) {
            this.g = z;
            return this;
        }

        public final C0198a a(com.anythink.core.common.l.b.a.b bVar) {
            this.f = bVar;
            return this;
        }

        public final C0198a a(int i) {
            this.h = i;
            return this;
        }

        public final C0198a b(int i) {
            this.i = i;
            return this;
        }

        public final a a() {
            a aVar = new a((byte) 0);
            aVar.f3965a = this.f3966a;
            aVar.b = this.b;
            aVar.d = this.d;
            aVar.e = this.e;
            aVar.f = this.f;
            aVar.c = this.c;
            aVar.g = this.g;
            aVar.i = this.h;
            aVar.j = this.i;
            return aVar;
        }
    }
}
