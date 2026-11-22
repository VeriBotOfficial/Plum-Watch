package com.anythink.basead.mixad.c.a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.anythink.core.api.ATNativeAdInfo;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.l.e.a.b;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private ATNativeAdInfo f2891a;
    private x b;
    private w<?> c;
    private Context d;
    private WeakReference<Context> e;
    private boolean f;
    private String g;
    private int h;
    private boolean i;
    private b j;
    private View k;
    private int l;
    private int m;

    /* synthetic */ a(byte b) {
        this();
    }

    private a() {
    }

    public final ATNativeAdInfo a() {
        return this.f2891a;
    }

    public final x b() {
        return this.b;
    }

    public final w<?> c() {
        return this.c;
    }

    public final boolean d() {
        return this.f;
    }

    public final String e() {
        return this.g;
    }

    public final int f() {
        return this.h;
    }

    public final boolean g() {
        return this.i;
    }

    public final b h() {
        return this.j;
    }

    public final View i() {
        return this.k;
    }

    public final void a(View view) {
        this.k = view;
    }

    public final Context j() {
        Context context = this.d;
        WeakReference<Context> weakReference = this.e;
        if (weakReference != null && weakReference.get() != null) {
            context = this.e.get();
        }
        return context == null ? t.b().g() : context;
    }

    public final int k() {
        return this.l;
    }

    public final int l() {
        return this.m;
    }

    /* renamed from: com.anythink.basead.mixad.c.a.a$a, reason: collision with other inner class name */
    public static class C0159a {

        /* renamed from: a, reason: collision with root package name */
        private Context f2892a;
        private ATNativeAdInfo b;
        private x c;
        private w<?> d;
        private boolean e;
        private String f;
        private int g;
        private boolean h;
        private b i;
        private View j;
        private int k;
        private int l;

        public final C0159a a(a aVar) {
            if (aVar != null) {
                this.f2892a = aVar.j();
                this.d = aVar.c();
                this.c = aVar.b();
                this.i = aVar.h();
                this.b = aVar.a();
                this.j = aVar.i();
                this.h = aVar.g();
                this.e = aVar.d();
                this.g = aVar.f();
                this.f = aVar.e();
                this.k = aVar.k();
                this.l = aVar.l();
            }
            return this;
        }

        public final C0159a a(ATNativeAdInfo aTNativeAdInfo) {
            this.b = aTNativeAdInfo;
            return this;
        }

        private b b() {
            return this.i;
        }

        public final C0159a a(b bVar) {
            this.i = bVar;
            return this;
        }

        public final C0159a a(x xVar) {
            this.c = xVar;
            return this;
        }

        public final C0159a a(w<?> wVar) {
            this.d = wVar;
            return this;
        }

        public final C0159a a(boolean z) {
            this.e = z;
            return this;
        }

        public final C0159a a(String str) {
            this.f = str;
            return this;
        }

        public final C0159a a(int i) {
            this.g = i;
            return this;
        }

        public final C0159a a(Context context) {
            this.f2892a = context;
            return this;
        }

        public final C0159a b(boolean z) {
            this.h = z;
            return this;
        }

        private C0159a a(View view) {
            this.j = view;
            return this;
        }

        public final C0159a b(int i) {
            this.k = i;
            return this;
        }

        public final C0159a c(int i) {
            this.l = i;
            return this;
        }

        public final a a() {
            a aVar = new a((byte) 0);
            Context context = this.f2892a;
            if (context instanceof Activity) {
                aVar.e = new WeakReference(this.f2892a);
            } else {
                aVar.d = context;
            }
            aVar.f2891a = this.b;
            aVar.k = this.j;
            aVar.i = this.h;
            aVar.j = this.i;
            aVar.c = this.d;
            aVar.b = this.c;
            aVar.f = this.e;
            aVar.h = this.g;
            aVar.g = this.f;
            aVar.l = this.k;
            aVar.m = this.l;
            return aVar;
        }
    }
}
