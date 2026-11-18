package com.baidu.ar.camera;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes16.dex */
public class DuMixDrawer {
    public static float[] n = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
    public static float[] o = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FloatBuffer f6854a;
    public FloatBuffer b;
    public ShortBuffer d;
    public int f;
    public int l;
    public int m;
    public int[] c = new int[1];
    public int[] e = new int[1];
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public short[] k = {0, 1, 2, 0, 2, 3};

    public DuMixDrawer(int r3, int r4) {
        this.l = r3;
        this.m = r4;
        a();
    }

    public final int a(int r1, String str) {
        int r2 = GLES20.glCreateShader(r1);
        GLES20.glShaderSource(r2, str);
        GLES20.glCompileShader(r2);
        return r2;
    }

    public final void a() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(n.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f6854a = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(n);
        this.f6854a.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(o.length * 4);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.b = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(o);
        this.b.position(0);
        GLES20.glGenBuffers(1, this.c, 0);
        GLES20.glBindBuffer(34962, this.c[0]);
        GLES20.glBufferData(34962, (n.length * 4) + (o.length * 4), null, 35044);
        GLES20.glBufferSubData(34962, 0, n.length * 4, this.f6854a);
        GLES20.glBufferSubData(34962, n.length * 4, o.length * 4, this.b);
        GLES20.glBindBuffer(34962, 0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(this.k.length * 2);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect3.asShortBuffer();
        this.d = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(this.k);
        this.d.position(0);
        GLES20.glGenBuffers(1, this.e, 0);
        GLES20.glBindBuffer(34963, this.e[0]);
        GLES20.glBufferData(34963, this.k.length * 2, null, 35044);
        GLES20.glBufferSubData(34963, 0, this.k.length * 2, this.d);
        GLES20.glBindBuffer(34963, 0);
        int r0 = a(35633, "attribute vec4 vPosition;uniform mat4 uMVPMatrix;attribute vec2 inputTextureCoordinate;varying vec2 textureCoordinate;void main(){gl_Position = uMVPMatrix * vPosition;textureCoordinate = inputTextureCoordinate;}");
        int r1 = a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 textureCoordinate;\nuniform samplerExternalOES inputTexture;\nvoid main() {  gl_FragColor = texture2D( inputTexture, textureCoordinate );\n}");
        int r2 = GLES20.glCreateProgram();
        this.f = r2;
        GLES20.glAttachShader(r2, r0);
        GLES20.glAttachShader(this.f, r1);
        GLES20.glLinkProgram(this.f);
        GLES20.glUseProgram(this.f);
    }

    public void destroyGL() {
        GLES20.glUseProgram(0);
        GLES20.glFinish();
        GLES20.glDisableVertexAttribArray(this.g);
        GLES20.glDisableVertexAttribArray(this.h);
        int[] r1 = this.c;
        GLES20.glDeleteBuffers(r1.length, r1, 0);
        int[] r2 = this.e;
        GLES20.glDeleteBuffers(r2.length, r2, 0);
    }

    public void draw(float[] fArr) {
        if (this.j == -1) {
            this.j = GLES20.glGetUniformLocation(this.f, "inputTexture");
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(this.m, this.l);
            GLES20.glUniform1i(this.j, 0);
        }
        if (this.i == -1) {
            int r0 = GLES20.glGetUniformLocation(this.f, "uMVPMatrix");
            this.i = r0;
            GLES20.glUniformMatrix4fv(r0, 1, false, fArr, 0);
        }
        if (this.g == -1 || this.h == -1) {
            GLES20.glBindBuffer(34962, this.c[0]);
            int r10 = GLES20.glGetAttribLocation(this.f, "vPosition");
            this.g = r10;
            GLES20.glEnableVertexAttribArray(r10);
            GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 8, 0);
            int r11 = GLES20.glGetAttribLocation(this.f, "inputTextureCoordinate");
            this.h = r11;
            GLES20.glEnableVertexAttribArray(r11);
            GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 8, n.length * 4);
            GLES20.glBindBuffer(34962, 0);
        }
        GLES20.glBindBuffer(34963, this.e[0]);
        GLES20.glDrawElements(4, this.k.length, 5123, 0);
        GLES20.glBindBuffer(34963, 0);
    }
}
