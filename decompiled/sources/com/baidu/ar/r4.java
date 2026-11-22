package com.baidu.ar;

import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes12.dex */
public abstract class r4 implements q4 {
    public t9 b;
    public ByteBuffer c = n1.a();

    /* renamed from: a, reason: collision with root package name */
    public boolean f7142a = true;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7143a;

        static {
            int[] iArr = new int[t9.values().length];
            f7143a = iArr;
            try {
                iArr[t9.PING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7143a[t9.PONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7143a[t9.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7143a[t9.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7143a[t9.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7143a[t9.CONTINUOUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public r4(t9 t9Var) {
        this.b = t9Var;
    }

    public static r4 a(t9 t9Var) {
        if (t9Var == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (a.f7143a[t9Var.ordinal()]) {
            case 1:
                return new ea();
            case 2:
                return new ga();
            case 3:
                return new rc();
            case 4:
                return new j1();
            case 5:
                return new c2();
            case 6:
                return new p2();
            default:
                throw new IllegalArgumentException("Supplied opcode is invalid");
        }
    }

    @Override // com.baidu.ar.q4
    public t9 a() {
        return this.b;
    }

    public void a(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
    }

    public void a(boolean z) {
        this.f7142a = z;
    }

    public void b(boolean z) {
        this.e = z;
    }

    @Override // com.baidu.ar.q4
    public boolean b() {
        return this.e;
    }

    public void c(boolean z) {
        this.f = z;
    }

    @Override // com.baidu.ar.q4
    public boolean c() {
        return this.g;
    }

    public void d(boolean z) {
        this.g = z;
    }

    @Override // com.baidu.ar.q4
    public boolean d() {
        return this.f7142a;
    }

    public void e(boolean z) {
        this.d = z;
    }

    @Override // com.baidu.ar.q4
    public boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r4 r4Var = (r4) obj;
            if (this.f7142a != r4Var.f7142a || this.d != r4Var.d || this.e != r4Var.e || this.f != r4Var.f || this.g != r4Var.g || this.b != r4Var.b) {
                return false;
            }
            ByteBuffer byteBuffer = this.c;
            ByteBuffer byteBuffer2 = r4Var.c;
            if (byteBuffer != null) {
                return byteBuffer.equals(byteBuffer2);
            }
            if (byteBuffer2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.baidu.ar.q4
    public ByteBuffer f() {
        return this.c;
    }

    public abstract void g();

    public int hashCode() {
        int hashCode = (((this.f7142a ? 1 : 0) * 31) + this.b.hashCode()) * 31;
        ByteBuffer byteBuffer = this.c;
        return ((((((((hashCode + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }

    public String toString() {
        return "Framedata{ optcode:" + a() + ", fin:" + d() + ", rsv1:" + b() + ", rsv2:" + e() + ", rsv3:" + c() + ", payloadlength:[pos:" + this.c.position() + ", len:" + this.c.remaining() + "], payload:" + (this.c.remaining() > 1000 ? "(too big to display)" : new String(this.c.array())) + AbstractJsonLexerKt.END_OBJ;
    }
}
