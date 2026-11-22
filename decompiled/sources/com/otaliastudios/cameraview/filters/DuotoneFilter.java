package com.otaliastudios.cameraview.filters;

import android.graphics.Color;
import android.opengl.GLES20;
import androidx.core.view.InputDeviceCompat;
import com.autonavi.aps.amapapi.AMapLocationStaticsEntity;
import com.otaliastudios.cameraview.filter.BaseFilter;
import com.otaliastudios.cameraview.filter.TwoParameterFilter;
import com.otaliastudios.opengl.core.Egloo;

/* loaded from: classes17.dex */
public class DuotoneFilter extends BaseFilter implements TwoParameterFilter {
    private static final String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform vec3 first;\nuniform vec3 second;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  float energy = (color.r + color.g + color.b) * 0.3333;\n  vec3 new_color = (1.0 - energy) * first + energy * second;\n  gl_FragColor = vec4(new_color.rgb, color.a);\n}\n";
    private int mFirstColor = -65281;
    private int mSecondColor = InputDeviceCompat.SOURCE_ANY;
    private int mFirstColorLocation = -1;
    private int mSecondColorLocation = -1;

    public void setColors(int i, int i2) {
        setFirstColor(i);
        setSecondColor(i2);
    }

    public void setFirstColor(int i) {
        this.mFirstColor = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
    }

    public void setSecondColor(int i) {
        this.mSecondColor = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
    }

    public int getFirstColor() {
        return this.mFirstColor;
    }

    public int getSecondColor() {
        return this.mSecondColor;
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public void setParameter1(float f) {
        setFirstColor((int) (f * 1.6777215E7f));
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public float getParameter1() {
        int firstColor = getFirstColor();
        return Color.argb(0, Color.red(firstColor), Color.green(firstColor), Color.blue(firstColor)) / 1.6777215E7f;
    }

    @Override // com.otaliastudios.cameraview.filter.TwoParameterFilter
    public void setParameter2(float f) {
        setSecondColor((int) (f * 1.6777215E7f));
    }

    @Override // com.otaliastudios.cameraview.filter.TwoParameterFilter
    public float getParameter2() {
        int secondColor = getSecondColor();
        return Color.argb(0, Color.red(secondColor), Color.green(secondColor), Color.blue(secondColor)) / 1.6777215E7f;
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public String getFragmentShader() {
        return FRAGMENT_SHADER;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onCreate(int i) {
        super.onCreate(i);
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, AMapLocationStaticsEntity.FIRST_LOCATE);
        this.mFirstColorLocation = glGetUniformLocation;
        Egloo.checkGlProgramLocation(glGetUniformLocation, AMapLocationStaticsEntity.FIRST_LOCATE);
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "second");
        this.mSecondColorLocation = glGetUniformLocation2;
        Egloo.checkGlProgramLocation(glGetUniformLocation2, "second");
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter
    protected void onPreDraw(long j, float[] fArr) {
        super.onPreDraw(j, fArr);
        GLES20.glUniform3fv(this.mFirstColorLocation, 1, new float[]{Color.red(this.mFirstColor) / 255.0f, Color.green(this.mFirstColor) / 255.0f, Color.blue(this.mFirstColor) / 255.0f}, 0);
        Egloo.checkGlError("glUniform3fv");
        GLES20.glUniform3fv(this.mSecondColorLocation, 1, new float[]{Color.red(this.mSecondColor) / 255.0f, Color.green(this.mSecondColor) / 255.0f, Color.blue(this.mSecondColor) / 255.0f}, 0);
        Egloo.checkGlError("glUniform3fv");
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onDestroy() {
        super.onDestroy();
        this.mFirstColorLocation = -1;
        this.mSecondColorLocation = -1;
    }
}
