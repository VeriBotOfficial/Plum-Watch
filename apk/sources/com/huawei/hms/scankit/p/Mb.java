package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: Dimension.java */
/* JADX INFO: loaded from: classes11.dex */
public final class Mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10580a;
    private final int b;

    public int a() {
        return this.b;
    }

    public int b() {
        return this.f10580a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Mb)) {
            return false;
        }
        Mb mb = (Mb) obj;
        return this.f10580a == mb.f10580a && this.b == mb.b;
    }

    public int hashCode() {
        return (this.f10580a * 32713) + this.b;
    }

    public String toString() {
        return this.f10580a + "x" + this.b;
    }
}
