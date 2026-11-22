package com.otaliastudios.cameraview.filters;

import android.opengl.GLES20;
import com.otaliastudios.cameraview.filter.BaseFilter;
import com.otaliastudios.cameraview.filter.TwoParameterFilter;
import com.otaliastudios.opengl.core.Egloo;

/* loaded from: classes17.dex */
public class VignetteFilter extends BaseFilter implements TwoParameterFilter {
    private static final String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float range;\nuniform float inv_max_dist;\nuniform float shade;\nuniform vec2 scale;\nvarying vec2 vTextureCoord;\nvoid main() {\n  const float slope = 20.0;\n  vec2 coord = vTextureCoord - vec2(0.5, 0.5);\n  float dist = length(coord * scale);\n  float lumen = shade / (1.0 + exp((dist * inv_max_dist - range) * slope)) + (1.0 - shade);\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = vec4(color.rgb * lumen, color.a);\n}\n";
    private float mScale = 0.85f;
    private float mShade = 0.5f;
    private int mWidth = 1;
    private int mHeight = 1;
    private int mRangeLocation = -1;
    private int mMaxDistLocation = -1;
    private int mShadeLocation = -1;
    private int mScaleLocation = -1;

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void setSize(int i, int i2) {
        super.setSize(i, i2);
        this.mWidth = i;
        this.mHeight = i2;
    }

    public void setVignetteScale(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.mScale = f;
    }

    public void setVignetteShade(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.mShade = f;
    }

    public float getVignetteScale() {
        return this.mScale;
    }

    public float getVignetteShade() {
        return this.mShade;
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public void setParameter1(float f) {
        setVignetteScale(f);
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public float getParameter1() {
        return getVignetteScale();
    }

    @Override // com.otaliastudios.cameraview.filter.TwoParameterFilter
    public void setParameter2(float f) {
        setVignetteShade(f);
    }

    @Override // com.otaliastudios.cameraview.filter.TwoParameterFilter
    public float getParameter2() {
        return getVignetteShade();
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public String getFragmentShader() {
        return FRAGMENT_SHADER;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onCreate(int i) {
        super.onCreate(i);
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, "range");
        this.mRangeLocation = glGetUniformLocation;
        Egloo.checkGlProgramLocation(glGetUniformLocation, "range");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "inv_max_dist");
        this.mMaxDistLocation = glGetUniformLocation2;
        Egloo.checkGlProgramLocation(glGetUniformLocation2, "inv_max_dist");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(i, "shade");
        this.mShadeLocation = glGetUniformLocation3;
        Egloo.checkGlProgramLocation(glGetUniformLocation3, "shade");
        int glGetUniformLocation4 = GLES20.glGetUniformLocation(i, "scale");
        this.mScaleLocation = glGetUniformLocation4;
        Egloo.checkGlProgramLocation(glGetUniformLocation4, "scale");
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onDestroy() {
        super.onDestroy();
        this.mRangeLocation = -1;
        this.mMaxDistLocation = -1;
        this.mShadeLocation = -1;
        this.mScaleLocation = -1;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter
    protected void onPreDraw(long j, float[] fArr) {
        super.onPreDraw(j, fArr);
        float[] fArr2 = new float[2];
        int i = this.mWidth;
        int i2 = this.mHeight;
        if (i > i2) {
            fArr2[0] = 1.0f;
            fArr2[1] = i2 / i;
        } else {
            fArr2[0] = i / i2;
            fArr2[1] = 1.0f;
        }
        GLES20.glUniform2fv(this.mScaleLocation, 1, fArr2, 0);
        Egloo.checkGlError("glUniform2fv");
        float f = fArr2[0];
        float f2 = fArr2[1];
        GLES20.glUniform1f(this.mMaxDistLocation, 1.0f / (((float) Math.sqrt((f * f) + (f2 * f2))) * 0.5f));
        Egloo.checkGlError("glUniform1f");
        GLES20.glUniform1f(this.mShadeLocation, this.mShade);
        Egloo.checkGlError("glUniform1f");
        GLES20.glUniform1f(this.mRangeLocation, 1.3f - (((float) Math.sqrt(this.mScale)) * 0.7f));
        Egloo.checkGlError("glUniform1f");
    }
}
