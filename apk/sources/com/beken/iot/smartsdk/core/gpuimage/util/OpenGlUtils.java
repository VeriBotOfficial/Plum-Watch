package com.beken.iot.smartsdk.core.gpuimage.util;

import android.graphics.Bitmap;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes15.dex */
public class OpenGlUtils {
    public static final int NO_TEXTURE = -1;

    public static int loadTexture(Bitmap bitmap, int r2) {
        return loadTexture(bitmap, r2, true);
    }

    public static int loadTexture(Bitmap bitmap, int r6, boolean z) {
        int[] r1 = new int[1];
        if (r6 == -1) {
            GLES20.glGenTextures(1, r1, 0);
            GLES20.glBindTexture(3553, r1[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, r6);
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            r1[0] = r6;
        }
        if (z) {
            bitmap.recycle();
        }
        return r1[0];
    }

    public static int loadTexture(IntBuffer intBuffer, int r24, int r25, int r26) {
        int[] r2 = new int[1];
        if (r26 == -1) {
            GLES20.glGenTextures(1, r2, 0);
            GLES20.glBindTexture(3553, r2[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glTexImage2D(3553, 0, 6408, r24, r25, 0, 6408, 5121, intBuffer);
        } else {
            GLES20.glBindTexture(3553, r26);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, r24, r25, 6408, 5121, intBuffer);
            r2[0] = r26;
        }
        return r2[0];
    }

    public static int loadTextureAsBitmap(IntBuffer intBuffer, Camera.Size size, int r4) {
        return loadTexture(Bitmap.createBitmap(intBuffer.array(), size.width, size.height, Bitmap.Config.ARGB_8888), r4);
    }

    public static int loadShader(String str, int r3) {
        int[] r0 = new int[1];
        int r4 = GLES20.glCreateShader(r3);
        GLES20.glShaderSource(r4, str);
        GLES20.glCompileShader(r4);
        GLES20.glGetShaderiv(r4, 35713, r0, 0);
        if (r0[0] != 0) {
            return r4;
        }
        Log.d("Load Shader Failed", "Compilation\n" + GLES20.glGetShaderInfoLog(r4));
        return 0;
    }

    public static int loadProgram(String str, String str2) {
        int[] r0 = new int[1];
        int r5 = loadShader(str, 35633);
        if (r5 == 0) {
            Log.d("Load Program", "Vertex Shader Failed");
            return 0;
        }
        int r6 = loadShader(str2, 35632);
        if (r6 == 0) {
            Log.d("Load Program", "Fragment Shader Failed");
            return 0;
        }
        int r3 = GLES20.glCreateProgram();
        GLES20.glAttachShader(r3, r5);
        GLES20.glAttachShader(r3, r6);
        GLES20.glLinkProgram(r3);
        GLES20.glGetProgramiv(r3, 35714, r0, 0);
        if (r0[0] <= 0) {
            Log.d("Load Program", "Linking Failed");
            return 0;
        }
        GLES20.glDeleteShader(r5);
        GLES20.glDeleteShader(r6);
        return r3;
    }

    public static float rnd(float f, float f2) {
        return f + ((f2 - f) * ((float) Math.random()));
    }
}
