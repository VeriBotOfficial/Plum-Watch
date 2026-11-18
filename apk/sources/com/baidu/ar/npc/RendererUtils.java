package com.baidu.ar.npc;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.media3.common.C;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes16.dex */
public class RendererUtils {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final String FRAGMENT_SHADER = "precision mediump float;\nuniform sampler2D tex_sampler;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler, v_texcoord);\n}\n";
    private static final String VERTEX_SHADER = "attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n";
    private static final float[] TEX_VERTICES = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    private static final float[] POS_VERTICES = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    public static class RenderContext {
        private int posCoordHandle;
        private FloatBuffer posVertices;
        private int shaderProgram;
        private int texCoordHandle;
        private int texSamplerHandle;
        private FloatBuffer texVertices;
    }

    public static int createFBO(int r5, int r6, int r7, int r8) {
        int[] r1 = new int[1];
        GLES20.glGenRenderbuffers(1, r1, 0);
        GLES20.glBindRenderbuffer(36161, r1[0]);
        GLES20.glRenderbufferStorage(36161, r8, r6, r7);
        int[] r9 = new int[1];
        GLES20.glGenFramebuffers(1, r9, 0);
        GLES20.glBindFramebuffer(36160, r9[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, r5, 0);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, r1[0]);
        GLES20.glBindFramebuffer(36160, 0);
        return r9[0];
    }

    public static RenderContext createProgram() {
        int r2;
        int r0 = loadShader(35633, VERTEX_SHADER);
        if (r0 == 0 || (r2 = loadShader(35632, FRAGMENT_SHADER)) == 0) {
            return null;
        }
        int r1 = GLES20.glCreateProgram();
        if (r1 != 0) {
            GLES20.glAttachShader(r1, r0);
            GLES20.glAttachShader(r1, r2);
            GLES20.glLinkProgram(r1);
            int[] r3 = new int[1];
            GLES20.glGetProgramiv(r1, 35714, r3, 0);
            if (r3[0] != 1) {
                String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(r1);
                GLES20.glDeleteProgram(r1);
                throw new RuntimeException("Could not link program: " + strGlGetProgramInfoLog);
            }
        }
        RenderContext renderContext = new RenderContext();
        renderContext.texSamplerHandle = GLES20.glGetUniformLocation(r1, "tex_sampler");
        renderContext.texCoordHandle = GLES20.glGetAttribLocation(r1, "a_texcoord");
        renderContext.posCoordHandle = GLES20.glGetAttribLocation(r1, "a_position");
        renderContext.texVertices = createVerticesBuffer(TEX_VERTICES);
        renderContext.posVertices = createVerticesBuffer(POS_VERTICES);
        renderContext.shaderProgram = r1;
        return renderContext;
    }

    public static int createTexture() {
        int[] r1 = new int[1];
        GLES20.glGenTextures(1, r1, 0);
        return r1[0];
    }

    private static FloatBuffer createVerticesBuffer(float[] fArr) {
        if (fArr.length != 8) {
            throw new RuntimeException("Number of vertices should be four.");
        }
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr).position(0);
        return floatBufferAsFloatBuffer;
    }

    private static int loadShader(int r3, String str) {
        int r0 = GLES20.glCreateShader(r3);
        if (r0 != 0) {
            GLES20.glShaderSource(r0, str);
            GLES20.glCompileShader(r0);
            int[] r4 = new int[1];
            GLES20.glGetShaderiv(r0, 35713, r4, 0);
            if (r4[0] == 0) {
                String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(r0);
                GLES20.glDeleteShader(r0);
                throw new RuntimeException("Could not compile shader " + r3 + ":" + strGlGetShaderInfoLog);
            }
        }
        return r0;
    }

    public static void renderTexture(RenderContext renderContext, int r8, int r9, int r10) {
        GLES20.glViewport(0, 0, r9, r10);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glUseProgram(renderContext.shaderProgram);
        GLES20.glDisable(2929);
        GLES20.glDisable(3042);
        GLES20.glVertexAttribPointer(renderContext.texCoordHandle, 2, 5126, false, 0, (Buffer) renderContext.texVertices);
        GLES20.glEnableVertexAttribArray(renderContext.texCoordHandle);
        GLES20.glVertexAttribPointer(renderContext.posCoordHandle, 2, 5126, false, 0, (Buffer) renderContext.posVertices);
        GLES20.glEnableVertexAttribArray(renderContext.posCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, r8);
        GLES20.glUniform1i(renderContext.texSamplerHandle, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public static int createTexture(Bitmap bitmap) {
        int r0 = createTexture();
        GLES20.glBindTexture(3553, r0);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        GLES20.glTexParameteri(3553, 10240, C.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexParameteri(3553, 10241, C.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return r0;
    }

    public static int createTexture(int r13, int r14) {
        int r0 = createTexture();
        GLES20.glBindTexture(3553, r0);
        GLES20.glTexParameteri(3553, 10240, C.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexParameteri(3553, 10241, C.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, r13, r14, 0, 6408, 5121, null);
        return r0;
    }
}
