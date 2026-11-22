package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class pe0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16553a;
    private final a[] b;
    private final b[] c;
    private final HashMap d;
    private final HashMap e;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f16554a;

        private a(String str) {
            this.f16554a = str;
        }

        public static a a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            String str = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i, str);
            return new a(str);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f16555a;

        private b(String str) {
            this.f16555a = str;
        }

        public static b a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
            String str = new String(bArr, 0, i3);
            GLES20.glGetUniformLocation(i, str);
            return new b(str);
        }
    }

    public pe0() {
        int glCreateProgram = GLES20.glCreateProgram();
        this.f16553a = glCreateProgram;
        qe0.a();
        a(glCreateProgram, 35633, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n");
        a(glCreateProgram, 35632, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            qe0.a("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        GLES20.glUseProgram(glCreateProgram);
        this.d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.b = new a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            a a2 = a.a(this.f16553a, i);
            this.b[i] = a2;
            this.d.put(a2.f16554a, a2);
        }
        this.e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f16553a, 35718, iArr3, 0);
        this.c = new b[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            b a3 = b.a(this.f16553a, i2);
            this.c[i2] = a3;
            this.e.put(a3.f16555a, a3);
        }
        qe0.a();
    }

    private static void a(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String str2 = GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str;
            int i3 = qe0.b;
            et0.b("GlUtil", str2);
        }
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        qe0.a();
    }

    public final int a(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f16553a, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        qe0.a();
        return glGetAttribLocation;
    }

    public final int b(String str) {
        return GLES20.glGetUniformLocation(this.f16553a, str);
    }
}
