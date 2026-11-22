package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public interface uh {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f17051a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    a a(a aVar) throws b;

    void a(ByteBuffer byteBuffer);

    boolean a();

    void b();

    ByteBuffer c();

    void d();

    void flush();

    boolean isActive();

    public static final class a {
        public static final a e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f17052a;
        public final int b;
        public final int c;
        public final int d;

        public final String toString() {
            return "AudioFormat[sampleRate=" + this.f17052a + ", channelCount=" + this.b + ", encoding=" + this.c + AbstractJsonLexerKt.END_LIST;
        }

        public a(int i, int i2, int i3) {
            this.f17052a = i;
            this.b = i2;
            this.c = i3;
            this.d = f92.e(i3) ? f92.b(i3, i2) : -1;
        }
    }

    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }
}
