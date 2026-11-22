package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* compiled from: ViewOption.java */
/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f12383a;
    private String b;
    private int c;
    private float d;
    private float e;
    private int f;
    private int g;
    private View h;
    private List<CampaignEx> i;
    private int j;
    private boolean k;
    private List<String> l;
    private int m;
    private String n;
    private int o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private String f12384q;

    /* compiled from: ViewOption.java */
    public static class b implements InterfaceC0749c {

        /* renamed from: a, reason: collision with root package name */
        private Context f12385a;
        private String b;
        private int c;
        private float d;
        private float e;
        private int f;
        private int g;
        private View h;
        private List<CampaignEx> i;
        private int j;
        private boolean k;
        private List<String> l;
        private int m;
        private String n;
        private int o;
        private int p = 1;

        /* renamed from: q, reason: collision with root package name */
        private String f12386q;

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public c build() {
            return new c(this);
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c fileDirs(List<String> list) {
            this.l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c orientation(int i) {
            this.f = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c a(Context context) {
            this.f12385a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c b(int i) {
            this.c = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c c(String str) {
            this.b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c d(int i) {
            this.m = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c e(int i) {
            this.p = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c f(int i) {
            this.o = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c a(float f) {
            this.e = f;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c b(float f) {
            this.d = f;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c c(int i) {
            this.g = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c a(View view) {
            this.h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c b(String str) {
            this.f12386q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c a(List<CampaignEx> list) {
            this.i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c a(int i) {
            this.j = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c a(boolean z) {
            this.k = z;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0749c
        public InterfaceC0749c a(String str) {
            this.n = str;
            return this;
        }
    }

    /* compiled from: ViewOption.java */
    /* renamed from: com.mbridge.msdk.video.dynview.c$c, reason: collision with other inner class name */
    public interface InterfaceC0749c {
        InterfaceC0749c a(float f);

        InterfaceC0749c a(int i);

        InterfaceC0749c a(Context context);

        InterfaceC0749c a(View view);

        InterfaceC0749c a(String str);

        InterfaceC0749c a(List<CampaignEx> list);

        InterfaceC0749c a(boolean z);

        InterfaceC0749c b(float f);

        InterfaceC0749c b(int i);

        InterfaceC0749c b(String str);

        c build();

        InterfaceC0749c c(int i);

        InterfaceC0749c c(String str);

        InterfaceC0749c d(int i);

        InterfaceC0749c e(int i);

        InterfaceC0749c f(int i);

        InterfaceC0749c fileDirs(List<String> list);

        InterfaceC0749c orientation(int i);
    }

    public static b a() {
        return new b();
    }

    public List<CampaignEx> b() {
        return this.i;
    }

    public Context c() {
        return this.f12383a;
    }

    public List<String> d() {
        return this.l;
    }

    public int e() {
        return this.o;
    }

    public String f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.f;
    }

    public View i() {
        return this.h;
    }

    public int j() {
        return this.g;
    }

    public float k() {
        return this.d;
    }

    public int l() {
        return this.j;
    }

    public float m() {
        return this.e;
    }

    public String n() {
        return this.f12384q;
    }

    public int o() {
        return this.p;
    }

    public boolean p() {
        return this.k;
    }

    private c(b bVar) {
        this.e = bVar.e;
        this.d = bVar.d;
        this.f = bVar.f;
        this.g = bVar.g;
        this.f12383a = bVar.f12385a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
        this.n = bVar.n;
        this.o = bVar.o;
        this.p = bVar.p;
        this.f12384q = bVar.f12386q;
    }
}
