package com.otaliastudios.cameraview.filters;

import android.opengl.GLES20;
import com.otaliastudios.cameraview.filter.BaseFilter;
import com.otaliastudios.cameraview.filter.OneParameterFilter;
import com.otaliastudios.opengl.core.Egloo;

/* loaded from: classes17.dex */
public class HueFilter extends BaseFilter implements OneParameterFilter {
    private static final String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float hue;\nvoid main() {\n  vec4 kRGBToYPrime = vec4 (0.299, 0.587, 0.114, 0.0);\n  vec4 kRGBToI = vec4 (0.595716, -0.274453, -0.321263, 0.0);\n  vec4 kRGBToQ = vec4 (0.211456, -0.522591, 0.31135, 0.0);\n  vec4 kYIQToR = vec4 (1.0, 0.9563, 0.6210, 0.0);\n  vec4 kYIQToG = vec4 (1.0, -0.2721, -0.6474, 0.0);\n  vec4 kYIQToB = vec4 (1.0, -1.1070, 1.7046, 0.0);\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  float YPrime = dot(color, kRGBToYPrime);\n  float I = dot(color, kRGBToI);\n  float Q = dot(color, kRGBToQ);\n  float chroma = sqrt (I * I + Q * Q);\n  Q = chroma * sin (hue);\n  I = chroma * cos (hue);\n  vec4 yIQ = vec4 (YPrime, I, Q, 0.0);\n  color.r = dot (yIQ, kYIQToR);\n  color.g = dot (yIQ, kYIQToG);\n  color.b = dot (yIQ, kYIQToB);\n  gl_FragColor = color;\n}\n";
    private float hue = 0.0f;
    private int hueLocation = -1;

    public void setHue(float f) {
        this.hue = f % 360.0f;
    }

    public float getHue() {
        return this.hue;
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public void setParameter1(float f) {
        setHue(f * 360.0f);
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public float getParameter1() {
        return getHue() / 360.0f;
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public String getFragmentShader() {
        return FRAGMENT_SHADER;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onCreate(int i) {
        super.onCreate(i);
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, "hue");
        this.hueLocation = glGetUniformLocation;
        Egloo.checkGlProgramLocation(glGetUniformLocation, "hue");
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onDestroy() {
        super.onDestroy();
        this.hueLocation = -1;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter
    protected void onPreDraw(long j, float[] fArr) {
        super.onPreDraw(j, fArr);
        GLES20.glUniform1f(this.hueLocation, (((this.hue - 45.0f) / 45.0f) + 0.5f) * (-1.0f));
        Egloo.checkGlError("glUniform1f");
    }
}
