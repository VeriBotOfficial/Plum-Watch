package com.huawei.hms.scankit.p;

/* compiled from: Dimension.java */
/* loaded from: classes14.dex */
public final class Mb {

    /* renamed from: a, reason: collision with root package name */
    private final int f10580a;
    private final int b;

    public int a() {
        return this.b;
    }

    public int b() {
        return this.f10580a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Mb) {
            Mb mb = (Mb) obj;
            if (this.f10580a == mb.f10580a && this.b == mb.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f10580a * 32713) + this.b;
    }

    public String toString() {
        return this.f10580a + "x" + this.b;
    }
}
