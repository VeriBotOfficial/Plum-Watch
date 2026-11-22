package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public interface gv0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final kv0 f15631a;
        public final MediaFormat b;
        public final jc0 c;
        public final Surface d;
        public final MediaCrypto e;

        public static a a(kv0 kv0Var, MediaFormat mediaFormat, jc0 jc0Var, MediaCrypto mediaCrypto) {
            return new a(kv0Var, mediaFormat, jc0Var, null, mediaCrypto);
        }

        private a(kv0 kv0Var, MediaFormat mediaFormat, jc0 jc0Var, Surface surface, MediaCrypto mediaCrypto) {
            this.f15631a = kv0Var;
            this.b = mediaFormat;
            this.c = jc0Var;
            this.d = surface;
            this.e = mediaCrypto;
        }

        public static a a(kv0 kv0Var, MediaFormat mediaFormat, jc0 jc0Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(kv0Var, mediaFormat, jc0Var, surface, mediaCrypto);
        }
    }

    public interface b {
        gv0 a(a aVar) throws IOException;
    }

    public interface c {
        void a(long j);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    MediaFormat a();

    void a(int i);

    void a(int i, int i2, long j, int i3);

    void a(int i, long j);

    void a(int i, gv gvVar, long j);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    void a(boolean z, int i);

    int b();

    ByteBuffer b(int i);

    ByteBuffer c(int i);

    void flush();

    void release();
}
