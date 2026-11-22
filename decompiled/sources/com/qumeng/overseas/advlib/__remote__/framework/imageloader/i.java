package com.qumeng.overseas.advlib.__remote__.framework.imageloader;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes17.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<ImageView> f12952a;
    private ImageView.ScaleType b;
    private b<Bitmap> c;
    private b<Bitmap> d;
    private com.qumeng.overseas.advlib.__remote__.framework.imageloader.a<Bitmap> e;
    private String f;
    private String g;
    private Drawable h;
    private int i;
    private Drawable j;
    private int k;
    private boolean l;
    private String m;
    private boolean n;
    private boolean o;
    private boolean p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f12953q;
    private HashMap<String, String> r;
    private boolean s;

    public static class a {
        private String b;
        private String c;
        private String d;
        private WeakReference<ImageView> e;
        private com.qumeng.overseas.advlib.__remote__.framework.imageloader.a<Bitmap> f;
        private b<Bitmap> h;
        private b<Bitmap> i;
        private Drawable j;
        private int k;
        private Drawable l;
        private int m;
        private boolean n;
        private boolean o;

        /* renamed from: q, reason: collision with root package name */
        private String f12955q;

        /* renamed from: a, reason: collision with root package name */
        HashMap<String, String> f12954a = new HashMap<>();
        private ImageView.ScaleType g = ImageView.ScaleType.CENTER_CROP;
        private boolean p = false;
        private boolean r = true;
        private boolean s = true;
        private boolean t = false;

        public a() {
        }

        public void asBitmap(com.qumeng.overseas.advlib.__remote__.framework.imageloader.a aVar) {
            this.f = aVar;
            this.n = true;
            a();
        }

        public a error(Drawable drawable) {
            this.j = drawable;
            return this;
        }

        public a grayImage(boolean z) {
            this.t = z;
            return this;
        }

        public void into(ImageView imageView) {
            this.e = new WeakReference<>(imageView);
            a();
        }

        public boolean isPreload() {
            return this.p;
        }

        public a isReport(boolean z) {
            this.s = z;
            return this;
        }

        public a memoryCache(boolean z) {
            this.r = z;
            return this;
        }

        public a placeholder(Drawable drawable) {
            this.l = drawable;
            return this;
        }

        public void preload(String str) {
            this.p = true;
            url(str);
            a();
        }

        public a reportData(String str, String str2) {
            this.f12954a.put(str, str2);
            return this;
        }

        public a scaleType(ImageView.ScaleType scaleType) {
            this.g = scaleType;
            return this;
        }

        public a thumbnail(String str, b<Bitmap> bVar) {
            this.i = bVar;
            if (!com.qumeng.overseas.advlib.__remote__.utils.q.a(str)) {
                this.o = true;
                this.f12955q = str;
            }
            return this;
        }

        public a transform(b<Bitmap> bVar) {
            this.h = bVar;
            return this;
        }

        public a url(String str) {
            this.c = str;
            return this;
        }

        private void a() {
            if (TextUtils.isEmpty(this.b)) {
                new i(this).t();
            } else {
                new i(this).a(this.b);
            }
        }

        public a error(int i) {
            this.k = i;
            return this;
        }

        public a placeholder(int i) {
            this.m = i;
            return this;
        }

        public a(String str) {
            this.b = str;
        }
    }

    public i(a aVar) {
        this.s = false;
        this.f = aVar.c;
        this.g = aVar.d;
        this.f12952a = aVar.e;
        this.i = aVar.k;
        this.h = aVar.j;
        this.k = aVar.m;
        this.j = aVar.l;
        this.e = aVar.f;
        this.b = aVar.g;
        this.o = aVar.r;
        this.m = aVar.f12955q;
        this.l = aVar.o;
        this.d = aVar.i;
        this.c = aVar.h;
        this.r = aVar.f12954a;
        this.p = aVar.s;
        this.n = aVar.n;
        this.f12953q = aVar.p;
        this.s = aVar.t;
    }

    public void a(String str) {
        j.a(str).a(this);
    }

    public String b() {
        return this.g;
    }

    public Drawable c() {
        return this.h;
    }

    public int d() {
        return this.i;
    }

    public WeakReference<ImageView> e() {
        return this.f12952a;
    }

    public Drawable f() {
        return this.j;
    }

    public int g() {
        return this.k;
    }

    public HashMap<String, String> h() {
        return this.r;
    }

    public ImageView.ScaleType i() {
        return this.b;
    }

    public String j() {
        return this.m;
    }

    public b<Bitmap> k() {
        return this.d;
    }

    public b<Bitmap> l() {
        return this.c;
    }

    public String m() {
        return this.f;
    }

    public boolean n() {
        return this.n;
    }

    public boolean o() {
        return this.s;
    }

    public boolean p() {
        return this.f12953q;
    }

    public boolean q() {
        return this.p;
    }

    public boolean r() {
        return this.l;
    }

    public boolean s() {
        return this.o;
    }

    public void t() {
        j.a().a(this);
    }

    public com.qumeng.overseas.advlib.__remote__.framework.imageloader.a<Bitmap> a() {
        return this.e;
    }
}
