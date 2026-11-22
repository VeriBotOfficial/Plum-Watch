package com.baidu.ar;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes12.dex */
public class he {
    public static final float[] m;
    public static final short[] n = {0, 1, 2, 0, 2, 3};
    public static final float[] o = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
    public static final float[] p = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: a, reason: collision with root package name */
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

    public he(int i, int i2) {
        String str;
        this.j = i;
        float[] fArr = o;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f6972a = asFloatBuffer;
        asFloatBuffer.put(fArr);
        this.f6972a.position(0);
        short[] sArr = n;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(sArr.length * 2);
        allocateDirect2.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect2.asShortBuffer();
        this.c = asShortBuffer;
        asShortBuffer.put(sArr);
        this.c.position(0);
        float[] fArr2 = p;
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(fArr2.length * 4);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect3.asFloatBuffer();
        this.b = asFloatBuffer2;
        asFloatBuffer2.put(fArr2);
        this.b.position(0);
        int a2 = a(35633, "attribute vec4 vPosition;\nuniform mat4 uMVPMatrix;uniform mat4 uTextureMatrix;\nattribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main()\n{\n  gl_Position = uMVPMatrix * vPosition;\n  textureCoordinate = (uTextureMatrix * inputTextureCoordinate).xy;\n}");
        if (i2 != 0) {
            if (i2 == 1) {
                str = "precision mediump float;\nuniform sampler2D s_texture;\nvarying vec2 textureCoordinate;\nvoid main()\n{\n  gl_FragColor = texture2D(s_texture, textureCoordinate);\n}";
            } else if (i2 == 2) {
                str = "precision mediump float;\nuniform sampler2D s_texture;\nvarying vec2 textureCoordinate;\nvoid main()\n{\n  vec4 vCameraColor = texture2D(s_texture, textureCoordinate);\n  float fGrayColor = (0.3*vCameraColor.r + 0.59*vCameraColor.g + 0.11*vCameraColor.b);\n  gl_FragColor = vec4(fGrayColor, fGrayColor, fGrayColor, 1.0);\n}";
            }
            int a3 = a(35632, str);
            int glCreateProgram = GLES20.glCreateProgram();
            this.d = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glAttachShader(glCreateProgram, a3);
            GLES20.glLinkProgram(glCreateProgram);
        }
        str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 textureCoordinate;\nuniform samplerExternalOES s_texture;\nvoid main() {  gl_FragColor = texture2D( s_texture, textureCoordinate );\n}";
        int a32 = a(35632, str);
        int glCreateProgram2 = GLES20.glCreateProgram();
        this.d = glCreateProgram2;
        GLES20.glAttachShader(glCreateProgram2, a2);
        GLES20.glAttachShader(glCreateProgram2, a32);
        GLES20.glLinkProgram(glCreateProgram2);
    }

    public final int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    public void a(int i, int i2) {
        this.k = i;
        this.l = i2;
    }

    public void a(float[] fArr, float[] fArr2, int i, int i2) {
        if (fArr == null) {
            fArr = m;
        }
        if (fArr2 == null) {
            fArr2 = m;
        }
        GLES20.glBindFramebuffer(36160, i2);
        GLES20.glViewport(0, 0, this.k, this.l);
        GLES20.glClear(16384);
        GLES20.glClearColor(1.0f, 1.0f, 0.0f, 1.0f);
        if (-1 == i) {
            return;
        }
        GLES20.glUseProgram(this.d);
        this.g = GLES20.glGetUniformLocation(this.d, "uTextureMatrix");
        this.h = GLES20.glGetUniformLocation(this.d, "s_texture");
        this.i = GLES20.glGetUniformLocation(this.d, "uMVPMatrix");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.j, i);
        GLES20.glUniform1i(this.h, 0);
        int i3 = this.i;
        if (i3 >= 0) {
            GLES20.glUniformMatrix4fv(i3, 1, false, fArr, 0);
        }
        int i4 = this.g;
        if (i4 >= 0) {
            GLES20.glUniformMatrix4fv(i4, 1, false, fArr2, 0);
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.d, "vPosition");
        this.e = glGetAttribLocation;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(this.e, 2, 5126, false, 8, (Buffer) this.f6972a);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.d, "inputTextureCoordinate");
        this.f = glGetAttribLocation2;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        GLES20.glVertexAttribPointer(this.f, 2, 5126, false, 8, (Buffer) this.b);
        GLES20.glDrawElements(4, n.length, 5123, this.c);
        GLES20.glDisableVertexAttribArray(this.e);
        GLES20.glDisableVertexAttribArray(this.f);
        GLES20.glBindTexture(this.j, 0);
        GLES20.glUseProgram(0);
        GLES20.glBindFramebuffer(36160, 0);
    }
}
