package com.otaliastudios.cameraview.filters;

import android.graphics.Color;
import android.opengl.GLES20;
import androidx.core.internal.view.SupportMenu;
import com.otaliastudios.cameraview.filter.BaseFilter;
import com.otaliastudios.cameraview.filter.OneParameterFilter;
import com.otaliastudios.opengl.core.Egloo;

/* loaded from: classes17.dex */
public class TintFilter extends BaseFilter implements OneParameterFilter {
    private static final String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform vec3 tint;\nvec3 color_ratio;\nvarying vec2 vTextureCoord;\nvoid main() {\n  color_ratio[0] = 0.21;\n  color_ratio[1] = 0.71;\n  color_ratio[2] = 0.07;\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  float avg_color = dot(color_ratio, color.rgb);\n  vec3 new_color = min(0.8 * avg_color + 0.2 * tint, 1.0);\n  gl_FragColor = vec4(new_color.rgb, color.a);\n}\n";
    private int tint = SupportMenu.CATEGORY_MASK;
    private int tintLocation = -1;

    public void setTint(int i) {
        this.tint = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
    }

    public int getTint() {
        return this.tint;
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public void setParameter1(float f) {
        setTint((int) (f * 1.6777215E7f));
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public float getParameter1() {
        int tint = getTint();
        return Color.argb(0, Color.red(tint), Color.green(tint), Color.blue(tint)) / 1.6777215E7f;
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public String getFragmentShader() {
        return FRAGMENT_SHADER;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onCreate(int i) {
        super.onCreate(i);
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, "tint");
        this.tintLocation = glGetUniformLocation;
        Egloo.checkGlProgramLocation(glGetUniformLocation, "tint");
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onDestroy() {
        super.onDestroy();
        this.tintLocation = -1;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter
    protected void onPreDraw(long j, float[] fArr) {
        super.onPreDraw(j, fArr);
        GLES20.glUniform3fv(this.tintLocation, 1, new float[]{Color.red(this.tint) / 255.0f, Color.green(this.tint) / 255.0f, Color.blue(this.tint) / 255.0f}, 0);
        Egloo.checkGlError("glUniform3fv");
    }
}
