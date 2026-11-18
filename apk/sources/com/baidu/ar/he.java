package com.baidu.ar;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes16.dex */
public class he {
    public static final float[] m;
    public static final short[] n = {0, 1, 2, 0, 2, 3};
    public static final float[] o = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
    public static final float[] p = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FloatBuffer f6972a;
    public FloatBuffer b;
    public ShortBuffer c;
    public final int d;
    public int e;
    public int f;
    public int g = -1;
    public int h = -1;
    public int i;
    public int j;
    public int k;
    public int l;

    static {
        float[] fArr = new float[16];
        m = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x007c  */
    public he(int r5, int r6) {
        String str;
        this.j = r5;
        float[] fArr = o;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f6972a = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.f6972a.position(0);
        short[] sArr = n;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect2.asShortBuffer();
        this.c = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.c.position(0);
        float[] fArr2 = p;
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(fArr2.length * 4);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect3.asFloatBuffer();
        this.b = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr2);
        this.b.position(0);
        int r7 = a(35633, "attribute vec4 vPosition;\nuniform mat4 uMVPMatrix;uniform mat4 uTextureMatrix;\nattribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main()\n{\n  gl_Position = uMVPMatrix * vPosition;\n  textureCoordinate = (uTextureMatrix * inputTextureCoordinate).xy;\n}");
        if (r6 == 0) {
            str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}";
        } else if (r6 == 1) {
            str = "precision mediump float;\nuniform sampler2D s_texture;\nvarying vec2 textureCoordinate;\nvoid main()\n{\n  gl_FragColor = texture2D(s_texture, textureCoordinate);\n}";
        } else if (r6 != 2) {
            str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}";
        } else {
            str = "precision mediump float;\nuniform sampler2D s_texture;\nvarying vec2 textureCoordinate;\nvoid main()\n{\n  vec4 vCameraColor = texture2D(s_texture, textureCoordinate);\n  float fGrayColor = (0.3*vCameraColor.r + 0.59*vCameraColor.g + 0.11*vCameraColor.b);\n  gl_FragColor = vec4(fGrayColor, fGrayColor, fGrayColor, 1.0);\n}";
        }
        int r8 = a(35632, str);
        int r0 = GLES20.glCreateProgram();
        this.d = r0;
        GLES20.glAttachShader(r0, r7);
        GLES20.glAttachShader(r0, r8);
        GLES20.glLinkProgram(r0);
    }

    public final int a(int r1, String str) {
        int r2 = GLES20.glCreateShader(r1);
        GLES20.glShaderSource(r2, str);
        GLES20.glCompileShader(r2);
        return r2;
    }

    public void a(int r1, int r2) {
        this.k = r1;
        this.l = r2;
    }

    public void a(float[] fArr, float[] fArr2, int r12, int r13) {
        if (fArr == null) {
            fArr = m;
        }
        if (fArr2 == null) {
            fArr2 = m;
        }
        GLES20.glBindFramebuffer(36160, r13);
        GLES20.glViewport(0, 0, this.k, this.l);
        GLES20.glClear(16384);
        GLES20.glClearColor(1.0f, 1.0f, 0.0f, 1.0f);
        if (-1 == r12) {
            return;
        }
        GLES20.glUseProgram(this.d);
        this.g = GLES20.glGetUniformLocation(this.d, "uTextureMatrix");
        this.h = GLES20.glGetUniformLocation(this.d, "s_texture");
        this.i = GLES20.glGetUniformLocation(this.d, "uMVPMatrix");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.j, r12);
        GLES20.glUniform1i(this.h, 0);
        int r14 = this.i;
        if (r14 >= 0) {
            GLES20.glUniformMatrix4fv(r14, 1, false, fArr, 0);
        }
        int r10 = this.g;
        if (r10 >= 0) {
            GLES20.glUniformMatrix4fv(r10, 1, false, fArr2, 0);
        }
        int r11 = GLES20.glGetAttribLocation(this.d, "vPosition");
        this.e = r11;
        GLES20.glEnableVertexAttribArray(r11);
        GLES20.glVertexAttribPointer(this.e, 2, 5126, false, 8, (Buffer) this.f6972a);
        int r15 = GLES20.glGetAttribLocation(this.d, "inputTextureCoordinate");
        this.f = r15;
        GLES20.glEnableVertexAttribArray(r15);
        GLES20.glVertexAttribPointer(this.f, 2, 5126, false, 8, (Buffer) this.b);
        GLES20.glDrawElements(4, n.length, 5123, this.c);
        GLES20.glDisableVertexAttribArray(this.e);
        GLES20.glDisableVertexAttribArray(this.f);
        GLES20.glBindTexture(this.j, 0);
        GLES20.glUseProgram(0);
        GLES20.glBindFramebuffer(36160, 0);
    }
}
