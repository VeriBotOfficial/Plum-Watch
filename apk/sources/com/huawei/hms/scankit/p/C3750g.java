package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.scankit.p.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CameraZoomData.java */
/* JADX INFO: loaded from: classes11.dex */
public class C3750g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10641a;
    private int b;
    private List<Integer> c;

    public C3750g(int r1, int r2, List<Integer> list) {
        this.f10641a = r1;
        this.b = r2;
        this.c = new ArrayList(list);
    }

    public List<Integer> a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.f10641a;
    }
}
