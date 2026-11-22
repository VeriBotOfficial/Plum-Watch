package com.otaliastudios.cameraview.filters;

import android.opengl.GLES20;
import com.otaliastudios.cameraview.filter.BaseFilter;
import com.otaliastudios.cameraview.filter.OneParameterFilter;
import com.otaliastudios.opengl.core.Egloo;

/* loaded from: classes17.dex */
public class SharpnessFilter extends BaseFilter implements OneParameterFilter {
    private static final String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float scale;\nuniform float stepsizeX;\nuniform float stepsizeY;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec3 nbr_color = vec3(0.0, 0.0, 0.0);\n  vec2 coord;\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  coord.x = vTextureCoord.x - 0.5 * stepsizeX;\n  coord.y = vTextureCoord.y - stepsizeY;\n  nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n  coord.x = vTextureCoord.x - stepsizeX;\n  coord.y = vTextureCoord.y + 0.5 * stepsizeY;\n  nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n  coord.x = vTextureCoord.x + stepsizeX;\n  coord.y = vTextureCoord.y - 0.5 * stepsizeY;\n  nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n  coord.x = vTextureCoord.x + stepsizeX;\n  coord.y = vTextureCoord.y + 0.5 * stepsizeY;\n  nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n  gl_FragColor = vec4(color.rgb - 2.0 * scale * nbr_color, color.a);\n}\n";
    private float scale = 0.5f;
    private int width = 1;
    private int height = 1;
    private int scaleLocation = -1;
    private int stepSizeXLocation = -1;
    private int stepSizeYLocation = -1;

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void setSize(int i, int i2) {
        super.setSize(i, i2);
        this.width = i;
        this.height = i2;
    }

    public void setSharpness(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.scale = f;
    }

    public float getSharpness() {
        return this.scale;
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public void setParameter1(float f) {
        setSharpness(f);
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public float getParameter1() {
        return getSharpness();
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public String getFragmentShader() {
        return FRAGMENT_SHADER;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onCreate(int i) {
        super.onCreate(i);
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, "scale");
        this.scaleLocation = glGetUniformLocation;
        Egloo.checkGlProgramLocation(glGetUniformLocation, "scale");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "stepsizeX");
        this.stepSizeXLocation = glGetUniformLocation2;
        Egloo.checkGlProgramLocation(glGetUniformLocation2, "stepsizeX");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(i, "stepsizeY");
        this.stepSizeYLocation = glGetUniformLocation3;
        Egloo.checkGlProgramLocation(glGetUniformLocation3, "stepsizeY");
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onDestroy() {
        super.onDestroy();
        this.scaleLocation = -1;
        this.stepSizeXLocation = -1;
        this.stepSizeYLocation = -1;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter
    protected void onPreDraw(long j, float[] fArr) {
        super.onPreDraw(j, fArr);
        GLES20.glUniform1f(this.scaleLocation, this.scale);
        Egloo.checkGlError("glUniform1f");
        GLES20.glUniform1f(this.stepSizeXLocation, 1.0f / this.width);
        Egloo.checkGlError("glUniform1f");
        GLES20.glUniform1f(this.stepSizeYLocation, 1.0f / this.height);
        Egloo.checkGlError("glUniform1f");
    }
}
