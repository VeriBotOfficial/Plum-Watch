package com.anythink.basead.exoplayer.b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes7.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f2374a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a(ByteBuffer byteBuffer);

    boolean a();

    boolean a(int r1, int r2, int r3);

    int b();

    int c();

    int d();

    void e();

    ByteBuffer f();

    boolean g();

    void h();

    void i();

    public static final class a extends Exception {
        public a(int r3, int r4, int r5) {
            super("Unhandled format: " + r3 + " Hz, " + r4 + " channels in encoding " + r5);
        }
    }
}
