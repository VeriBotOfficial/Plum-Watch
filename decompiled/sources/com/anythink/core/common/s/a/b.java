package com.anythink.core.common.s.a;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes12.dex */
final class b {

    /* renamed from: com.anythink.core.common.s.a.b$b, reason: collision with other inner class name */
    static abstract class AbstractC0214b {

        /* renamed from: a, reason: collision with root package name */
        int f4311a;

        abstract byte a();

        abstract boolean a(AbstractC0214b abstractC0214b);

        AbstractC0214b() {
        }
    }

    b() {
    }

    static class c extends AbstractC0214b {
        boolean b;

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final byte a() {
            return (byte) 1;
        }

        c(int i, boolean z) {
            this.f4311a = i;
            this.b = z;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final boolean a(AbstractC0214b abstractC0214b) {
            return abstractC0214b.a() == 1 && ((c) abstractC0214b).b == this.b;
        }
    }

    static class f extends AbstractC0214b {
        int b;

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final byte a() {
            return (byte) 2;
        }

        f(int i, int i2) {
            this.f4311a = i;
            this.b = i2;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final boolean a(AbstractC0214b abstractC0214b) {
            return abstractC0214b.a() == 2 && ((f) abstractC0214b).b == this.b;
        }
    }

    static class e extends AbstractC0214b {
        float b;

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final byte a() {
            return (byte) 3;
        }

        e(int i, float f) {
            this.f4311a = i;
            this.b = f;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final boolean a(AbstractC0214b abstractC0214b) {
            return abstractC0214b.a() == 3 && ((e) abstractC0214b).b == this.b;
        }
    }

    static class g extends AbstractC0214b {
        long b;

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final byte a() {
            return (byte) 4;
        }

        g(int i, long j) {
            this.f4311a = i;
            this.b = j;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final boolean a(AbstractC0214b abstractC0214b) {
            return abstractC0214b.a() == 4 && ((g) abstractC0214b).b == this.b;
        }
    }

    static class d extends AbstractC0214b {
        double b;

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final byte a() {
            return (byte) 5;
        }

        d(int i, double d) {
            this.f4311a = i;
            this.b = d;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final boolean a(AbstractC0214b abstractC0214b) {
            return abstractC0214b.a() == 5 && ((d) abstractC0214b).b == this.b;
        }
    }

    static abstract class j extends AbstractC0214b {
        Object c;
        int d;
        int e;
        boolean f;

        j(int i, int i2, Object obj, int i3, boolean z) {
            this.d = i;
            this.f4311a = i2;
            this.c = obj;
            this.e = i3;
            this.f = z;
        }
    }

    static class i extends j {
        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final byte a() {
            return (byte) 6;
        }

        i(int i, int i2, String str, int i3, boolean z) {
            super(i, i2, str, i3, z);
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final boolean a(AbstractC0214b abstractC0214b) {
            if (abstractC0214b.a() != 6) {
                return false;
            }
            i iVar = (i) abstractC0214b;
            return iVar.f == this.f && Objects.equals(iVar.c, this.c);
        }
    }

    static class a extends j {
        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final byte a() {
            return (byte) 7;
        }

        a(int i, int i2, Object obj, int i3, boolean z) {
            super(i, i2, obj, i3, z);
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final boolean a(AbstractC0214b abstractC0214b) {
            if (abstractC0214b.a() != 7) {
                return false;
            }
            Object obj = ((a) abstractC0214b).c;
            if (this.c == obj) {
                return true;
            }
            if (this.c != null && obj != null) {
                if (this.c instanceof String) {
                    return this.c.equals(obj);
                }
                if ((this.c instanceof byte[]) && (obj instanceof byte[])) {
                    return Arrays.equals((byte[]) this.c, (byte[]) obj);
                }
            }
            return false;
        }
    }

    static class h extends j {
        com.anythink.core.common.s.a.a.b b;

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final byte a() {
            return (byte) 8;
        }

        h(int i, int i2, Object obj, int i3, boolean z) {
            super(i, i2, obj, i3, z);
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0214b
        final boolean a(AbstractC0214b abstractC0214b) {
            return abstractC0214b.a() == 8 && Objects.equals(((h) abstractC0214b).c, this.c);
        }
    }
}
