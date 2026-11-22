package com.otaliastudios.cameraview.filters;

import android.opengl.GLES20;
import com.otaliastudios.cameraview.filter.BaseFilter;
import com.otaliastudios.cameraview.filter.OneParameterFilter;
import com.otaliastudios.opengl.core.Egloo;

/* loaded from: classes17.dex */
public class GammaFilter extends BaseFilter implements OneParameterFilter {
    private static final String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float gamma;\nvoid main() {\n  vec4 textureColor = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = vec4(pow(textureColor.rgb, vec3(gamma)), textureColor.w);\n}\n";
    private float gamma = 2.0f;
    private int gammaLocation = -1;

    public void setGamma(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        this.gamma = f;
    }

    public float getGamma() {
        return this.gamma;
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public void setParameter1(float f) {
        setGamma(f * 2.0f);
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public float getParameter1() {
        return getGamma() / 2.0f;
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public String getFragmentShader() {
        return FRAGMENT_SHADER;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onCreate(int i) {
        super.onCreate(i);
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, "gamma");
        this.gammaLocation = glGetUniformLocation;
        Egloo.checkGlProgramLocation(glGetUniformLocation, "gamma");
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onDestroy() {
        super.onDestroy();
        this.gammaLocation = -1;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter
    protected void onPreDraw(long j, float[] fArr) {
        super.onPreDraw(j, fArr);
        GLES20.glUniform1f(this.gammaLocation, this.gamma);
        Egloo.checkGlError("glUniform1f");
    }
}
