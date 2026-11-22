package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import com.yandex.mobile.ads.impl.hm1;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes5.dex */
final class jm1 {
    private static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    private static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private int f15928a;
    private a b;
    private pe0 c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public final void a(int i2, float[] fArr) {
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        int i3 = this.f15928a;
        GLES20.glUniformMatrix3fv(this.e, 1, false, i3 == 1 ? j : i3 == 2 ? k : i, 0);
        GLES20.glUniformMatrix4fv(this.d, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glUniform1i(this.h, 0);
        qe0.a();
        GLES20.glVertexAttribPointer(this.f, 3, 5126, false, 12, (Buffer) aVar.b);
        qe0.a();
        GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 8, (Buffer) aVar.c);
        qe0.a();
        GLES20.glDrawArrays(aVar.d, 0, aVar.f15929a);
        qe0.a();
    }

    jm1() {
    }

    public final void a() {
        pe0 pe0Var = new pe0();
        this.c = pe0Var;
        this.d = pe0Var.b("uMvpMatrix");
        this.e = this.c.b("uTexMatrix");
        this.f = this.c.a("aPosition");
        this.g = this.c.a("aTexCoords");
        this.h = this.c.b("uTexture");
    }

    public final void a(hm1 hm1Var) {
        hm1.a aVar = hm1Var.f15706a;
        hm1.a aVar2 = hm1Var.b;
        if (aVar.b() == 1 && aVar.a().f15708a == 0 && aVar2.b() == 1 && aVar2.a().f15708a == 0) {
            this.f15928a = hm1Var.c;
            this.b = new a(hm1Var.f15706a.a());
            if (hm1Var.d) {
                return;
            }
            new a(hm1Var.b.a());
        }
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f15929a;
        private final FloatBuffer b;
        private final FloatBuffer c;
        private final int d;

        public a(hm1.b bVar) {
            this.f15929a = bVar.a();
            this.b = qe0.a(bVar.c);
            this.c = qe0.a(bVar.d);
            int i = bVar.b;
            if (i == 1) {
                this.d = 5;
            } else if (i != 2) {
                this.d = 4;
            } else {
                this.d = 6;
            }
        }
    }
}
