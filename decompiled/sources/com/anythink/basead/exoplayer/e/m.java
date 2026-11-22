package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.k.s;
import java.util.Arrays;

/* loaded from: classes11.dex */
public interface m {
    int a(f fVar, int i, boolean z);

    void a(long j, int i, int i2, int i3, a aVar);

    void a(s sVar, int i);

    void a(com.anythink.basead.exoplayer.m mVar);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2478a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.f2478a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f2478a == aVar.f2478a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.f2478a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
        }
    }
}
