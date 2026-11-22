package com.huawei.hms.scankit.p;

import android.graphics.Rect;

/* compiled from: CameraMeteringData.java */
/* renamed from: com.huawei.hms.scankit.p.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C2999f {

    /* renamed from: a, reason: collision with root package name */
    private int f10637a;
    private Rect b;

    /* compiled from: CameraMeteringData.java */
    /* renamed from: com.huawei.hms.scankit.p.f$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Rect f10638a;
        public int b;

        public a(Rect rect, int i) {
            this.f10638a = rect;
            this.b = i;
        }
    }

    public C2999f(int i, Rect rect) {
        this.f10637a = i;
        this.b = new Rect(rect);
    }

    public int a() {
        return this.f10637a;
    }

    public Rect b() {
        return this.b;
    }
}
