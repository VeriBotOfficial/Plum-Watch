package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes5.dex */
public class ry extends gm {
    public final gv c;
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer g;
    private final int h;
    private final int i;

    static {
        u60.a("goog.exo.decoder");
    }

    public static ry j() {
        return new ry(0, 0);
    }

    public static final class a extends IllegalStateException {
        public a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + Separators.RPAREN);
        }
    }

    public ry(int i) {
        this(i, 0);
    }

    public ry(int i, int i2) {
        this.c = new gv();
        this.h = i;
        this.i = 0;
    }

    @EnsuresNonNull({"data"})
    public final void e(int i) {
        ByteBuffer allocateDirect;
        ByteBuffer allocateDirect2;
        int i2 = i + this.i;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            int i3 = this.h;
            if (i3 == 1) {
                allocateDirect2 = ByteBuffer.allocate(i2);
            } else if (i3 == 2) {
                allocateDirect2 = ByteBuffer.allocateDirect(i2);
            } else {
                throw new a(byteBuffer != null ? byteBuffer.capacity() : 0, i2);
            }
            this.d = allocateDirect2;
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i4 = i2 + position;
        if (capacity >= i4) {
            this.d = byteBuffer;
            return;
        }
        int i5 = this.h;
        if (i5 == 1) {
            allocateDirect = ByteBuffer.allocate(i4);
        } else if (i5 == 2) {
            allocateDirect = ByteBuffer.allocateDirect(i4);
        } else {
            ByteBuffer byteBuffer2 = this.d;
            throw new a(byteBuffer2 != null ? byteBuffer2.capacity() : 0, i4);
        }
        allocateDirect.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            allocateDirect.put(byteBuffer);
        }
        this.d = allocateDirect;
    }

    public final boolean i() {
        return c(1073741824);
    }

    public final void h() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gm
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }
}
