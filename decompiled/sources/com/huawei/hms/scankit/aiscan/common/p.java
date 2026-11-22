package com.huawei.hms.scankit.aiscan.common;

import com.huawei.hms.scankit.p.L;

/* compiled from: Patch.java */
/* loaded from: classes14.dex */
public class p implements Comparable<p> {

    /* renamed from: a, reason: collision with root package name */
    public L f10522a;
    public int b;

    public p(L l, int i) {
        this.f10522a = l;
        this.b = i;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(p pVar) {
        return Float.compare((-pVar.f10522a.g()) + pVar.f10522a.h(), (-this.f10522a.g()) + this.f10522a.h());
    }
}
