package com.huawei.hms.scankit.p;

import android.graphics.Point;
import kotlinx.coroutines.DebugKt;

/* compiled from: CameraConfig.java */
/* renamed from: com.huawei.hms.scankit.p.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C2983b {

    /* renamed from: a, reason: collision with root package name */
    private int f10625a;
    private int b;
    private String c;
    private Point d;
    private int e;
    private boolean f;
    private boolean g;

    /* compiled from: CameraConfig.java */
    /* renamed from: com.huawei.hms.scankit.p.b$a */
    public static class a {
        private Point e;

        /* renamed from: a, reason: collision with root package name */
        private int f10626a = 0;
        private int b = 1;
        private int c = 0;
        private String d = DebugKt.DEBUG_PROPERTY_VALUE_OFF;
        private boolean f = true;
        private boolean g = false;

        public a a(int i) {
            this.b = i;
            return this;
        }

        public a b(int i) {
            this.c = i;
            return this;
        }

        public a a(Point point) {
            this.e = point;
            return this;
        }

        public a b(boolean z) {
            this.f = z;
            return this;
        }

        public a a(boolean z) {
            this.g = z;
            return this;
        }

        public C2983b a() {
            return new C2983b(this.f10626a, this.b, this.c, this.d, this.e, this.f).a(this.g);
        }
    }

    public int b() {
        return this.f10625a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public String f() {
        return this.c;
    }

    public boolean g() {
        return this.g;
    }

    private C2983b(int i, int i2, int i3, String str, Point point, boolean z) {
        this.f10625a = i;
        this.b = i2;
        this.e = i3;
        this.c = str;
        this.d = point;
        this.f = z;
    }

    public void a(int i) {
        this.e = i;
    }

    public Point a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C2983b a(boolean z) {
        this.g = z;
        return this;
    }
}
