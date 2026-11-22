package com.anythink.expressad.video.dynview;

import android.content.Context;
import android.view.View;
import com.anythink.expressad.foundation.d.d;
import java.util.List;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f5230a;
    private String b;
    private int c;
    private float d;
    private float e;
    private int f;
    private int g;
    private View h;
    private List<d> i;
    private int j;
    private boolean k;
    private List<String> l;
    private int m;
    private String n;
    private int o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private String f5231q;

    public interface b {
        b a(float f);

        b a(int i);

        b a(Context context);

        b a(View view);

        b a(String str);

        b a(List<d> list);

        b a(boolean z);

        c a();

        b b(float f);

        b b(int i);

        b b(String str);

        b b(List<String> list);

        b c(int i);

        b c(String str);

        b d(int i);

        b e(int i);

        b f(int i);

        b g(int i);
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }

    public final Context a() {
        return this.f5230a;
    }

    public final String b() {
        return this.b;
    }

    public final float c() {
        return this.d;
    }

    public final float d() {
        return this.e;
    }

    public final int e() {
        return this.f;
    }

    public final View f() {
        return this.h;
    }

    public final List<d> g() {
        return this.i;
    }

    public final int h() {
        return this.c;
    }

    public final int i() {
        return this.j;
    }

    public final int j() {
        return this.g;
    }

    public final boolean k() {
        return this.k;
    }

    private List<String> o() {
        return this.l;
    }

    private int p() {
        return this.m;
    }

    private String q() {
        return this.n;
    }

    public final int l() {
        return this.o;
    }

    public final int m() {
        return this.p;
    }

    public final String n() {
        return this.f5231q;
    }

    private c(a aVar) {
        this.e = aVar.e;
        this.d = aVar.d;
        this.f = aVar.f;
        this.g = aVar.g;
        this.f5230a = aVar.f5232a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
    }

    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Context f5232a;
        private String b;
        private int c;
        private float d;
        private float e;
        private int f;
        private int g;
        private View h;
        private List<d> i;
        private int j;
        private boolean k;
        private List<String> l;
        private int m;
        private String n;
        private int o;
        private int p = 1;

        /* renamed from: q, reason: collision with root package name */
        private String f5233q;

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(Context context) {
            this.f5232a = context.getApplicationContext();
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(String str) {
            this.b = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(int i) {
            this.c = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(float f) {
            this.d = f;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(float f) {
            this.e = f;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(int i) {
            this.f = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b c(int i) {
            this.g = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(View view) {
            this.h = view;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(List<d> list) {
            this.i = list;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b d(int i) {
            this.j = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b a(boolean z) {
            this.k = z;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(List<String> list) {
            this.l = list;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b e(int i) {
            this.m = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b b(String str) {
            this.n = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b f(int i) {
            this.o = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b g(int i) {
            this.p = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final b c(String str) {
            this.f5233q = str;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.c.b
        public final c a() {
            return new c(this, (byte) 0);
        }
    }

    private static a r() {
        return new a();
    }
}
