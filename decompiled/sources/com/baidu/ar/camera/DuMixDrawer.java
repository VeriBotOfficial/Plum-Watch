package com.baidu.ar.camera;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes12.dex */
public class DuMixDrawer {
    public static float[] n = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
    public static float[] o = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: a, reason: collision with root package name */
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

    public DuMixDrawer(int i, int i2) {
        this.l = i;
        this.m = i2;
        a();
    }

    public final int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    public final void a() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(n.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.f6854a = asFloatBuffer;
        asFloatBuffer.put(n);
        this.f6854a.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(o.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.b = asFloatBuffer2;
        asFloatBuffer2.put(o);
        this.b.position(0);
        GLES20.glGenBuffers(1, this.c, 0);
        GLES20.glBindBuffer(34962, this.c[0]);
        GLES20.glBufferData(34962, (n.length * 4) + (o.length * 4), null, 35044);
        GLES20.glBufferSubData(34962, 0, n.length * 4, this.f6854a);
        GLES20.glBufferSubData(34962, n.length * 4, o.length * 4, this.b);
        GLES20.glBindBuffer(34962, 0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.k.length * 2);
        allocateDirect3.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect3.asShortBuffer();
        this.d = asShortBuffer;
        asShortBuffer.put(this.k);
        this.d.position(0);
        GLES20.glGenBuffers(1, this.e, 0);
        GLES20.glBindBuffer(34963, this.e[0]);
        GLES20.glBufferData(34963, this.k.length * 2, null, 35044);
        GLES20.glBufferSubData(34963, 0, this.k.length * 2, this.d);
        GLES20.glBindBuffer(34963, 0);
        int a2 = a(35633, "attribute vec4 vPosition;uniform mat4 uMVPMatrix;attribute vec2 inputTextureCoordinate;varying vec2 textureCoordinate;void main(){gl_Position = uMVPMatrix * vPosition;textureCoordinate = inputTextureCoordinate;}");
        int a3 = a(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 textureCoordinate;\nuniform samplerExternalOES inputTexture;\nvoid main() {  gl_FragColor = texture2D( inputTexture, textureCoordinate );\n}");
        int glCreateProgram = GLES20.glCreateProgram();
        this.f = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(this.f, a3);
        GLES20.glLinkProgram(this.f);
        GLES20.glUseProgram(this.f);
    }

    public void destroyGL() {
        GLES20.glUseProgram(0);
        GLES20.glFinish();
        GLES20.glDisableVertexAttribArray(this.g);
        GLES20.glDisableVertexAttribArray(this.h);
        int[] iArr = this.c;
        GLES20.glDeleteBuffers(iArr.length, iArr, 0);
        int[] iArr2 = this.e;
        GLES20.glDeleteBuffers(iArr2.length, iArr2, 0);
    }

    public void draw(float[] fArr) {
        if (this.j == -1) {
            this.j = GLES20.glGetUniformLocation(this.f, "inputTexture");
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(this.m, this.l);
            GLES20.glUniform1i(this.j, 0);
        }
        if (this.i == -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.f, "uMVPMatrix");
            this.i = glGetUniformLocation;
            GLES20.glUniformMatrix4fv(glGetUniformLocation, 1, false, fArr, 0);
        }
        if (this.g == -1 || this.h == -1) {
            GLES20.glBindBuffer(34962, this.c[0]);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f, "vPosition");
            this.g = glGetAttribLocation;
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 8, 0);
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f, "inputTextureCoordinate");
            this.h = glGetAttribLocation2;
            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
            GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 8, n.length * 4);
            GLES20.glBindBuffer(34962, 0);
        }
        GLES20.glBindBuffer(34963, this.e[0]);
        GLES20.glDrawElements(4, this.k.length, 5123, 0);
        GLES20.glBindBuffer(34963, 0);
    }
}
