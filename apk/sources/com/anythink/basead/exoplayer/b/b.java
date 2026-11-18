package com.anythink.basead.exoplayer.b;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2369a = new a().a();
    public final int b;
    public final int c;
    public final int d;
    private AudioAttributes e;

    /* synthetic */ b(int r1, int r2, int r3, byte b) {
        this(r1, r2, r3);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2370a = 0;
        private int b = 0;
        private int c = 1;

        public final a a(int r1) {
            this.f2370a = r1;
            return this;
        }

        private a c(int r1) {
            this.b = r1;
            return this;
        }

        public final a b(int r1) {
            this.c = r1;
            return this;
        }

        public final b a() {
            return new b(this.f2370a, this.b, this.c, (byte) 0);
        }
    }

    private b(int r1, int r2, int r3) {
        this.b = r1;
        this.c = r2;
        this.d = r3;
    }

    final AudioAttributes a() {
        if (this.e == null) {
            this.e = new AudioAttributes.Builder().setContentType(this.b).setFlags(this.c).setUsage(this.d).build();
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.b == bVar.b && this.c == bVar.c && this.d == bVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31) + this.c) * 31) + this.d;
    }
}
