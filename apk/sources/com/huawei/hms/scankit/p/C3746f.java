package com.huawei.hms.scankit.p;

import android.graphics.Rect;

/* JADX INFO: renamed from: com.huawei.hms.scankit.p.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CameraMeteringData.java */
/* JADX INFO: loaded from: classes11.dex */
public class C3746f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10637a;
    private Rect b;

    /* JADX INFO: renamed from: com.huawei.hms.scankit.p.f$a */
    /* JADX INFO: compiled from: CameraMeteringData.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f10638a;
        public int b;

        public a(Rect rect, int r2) {
            this.f10638a = rect;
            this.b = r2;
        }
    }

    public C3746f(int r1, Rect rect) {
        this.f10637a = r1;
        this.b = new Rect(rect);
    }

    public int a() {
        return this.f10637a;
    }

    public Rect b() {
        return this.b;
    }
}
