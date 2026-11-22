package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public interface a62 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14978a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3, byte[] bArr) {
            this.f14978a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f14978a == aVar.f14978a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.b) + (this.f14978a * 31)) * 31) + this.c) * 31) + this.d;
        }
    }

    int a(qv qvVar, int i, boolean z) throws IOException;

    void a(long j, int i, int i2, int i3, a aVar);

    void a(jc0 jc0Var);

    void b(int i, ag1 ag1Var);

    default void a(int i, ag1 ag1Var) {
        b(i, ag1Var);
    }

    default int b(qv qvVar, int i, boolean z) throws IOException {
        return a(qvVar, i, z);
    }
}
