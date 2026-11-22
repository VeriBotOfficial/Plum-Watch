package com.otaliastudios.cameraview.filters;

import android.opengl.GLES20;
import com.otaliastudios.cameraview.filter.BaseFilter;
import com.otaliastudios.cameraview.filter.OneParameterFilter;
import com.otaliastudios.opengl.core.Egloo;

/* loaded from: classes17.dex */
public class BrightnessFilter extends BaseFilter implements OneParameterFilter {
    private static final String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float brightness;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = brightness * color;\n}\n";
    private float brightness = 2.0f;
    private int brightnessLocation = -1;

    public void setBrightness(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        this.brightness = f;
    }

    public float getBrightness() {
        return this.brightness;
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public void setParameter1(float f) {
        setBrightness(f + 1.0f);
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public float getParameter1() {
        return getBrightness() - 1.0f;
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public String getFragmentShader() {
        return FRAGMENT_SHADER;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onCreate(int i) {
        super.onCreate(i);
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, "brightness");
        this.brightnessLocation = glGetUniformLocation;
        Egloo.checkGlProgramLocation(glGetUniformLocation, "brightness");
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onDestroy() {
        super.onDestroy();
        this.brightnessLocation = -1;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter
    protected void onPreDraw(long j, float[] fArr) {
        super.onPreDraw(j, fArr);
        GLES20.glUniform1f(this.brightnessLocation, this.brightness);
        Egloo.checkGlError("glUniform1f");
    }
}
