package com.anythink.basead.exoplayer;

/* JADX INFO: loaded from: classes7.dex */
public final class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aa f2358a = new aa(0);
    public final int b;

    public aa(int r1) {
        this.b = r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.b == ((aa) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }
}
