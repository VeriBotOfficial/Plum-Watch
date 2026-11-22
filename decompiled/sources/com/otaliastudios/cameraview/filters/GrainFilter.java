package com.otaliastudios.cameraview.filters;

import android.opengl.GLES20;
import com.otaliastudios.cameraview.filter.BaseFilter;
import com.otaliastudios.cameraview.filter.OneParameterFilter;
import com.otaliastudios.opengl.core.Egloo;
import java.util.Random;

/* loaded from: classes17.dex */
public class GrainFilter extends BaseFilter implements OneParameterFilter {
    private static final String FRAGMENT_SHADER;
    private static final Random RANDOM;
    private float strength = 0.5f;
    private int width = 1;
    private int height = 1;
    private int strengthLocation = -1;
    private int stepXLocation = -1;
    private int stepYLocation = -1;

    static {
        Random random = new Random();
        RANDOM = random;
        FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvec2 seed;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES tex_sampler_0;\nuniform samplerExternalOES tex_sampler_1;\nuniform float scale;\nuniform float stepX;\nuniform float stepY;\nfloat rand(vec2 loc) {\n  float theta1 = dot(loc, vec2(0.9898, 0.233));\n  float theta2 = dot(loc, vec2(12.0, 78.0));\n  float value = cos(theta1) * sin(theta2) + sin(theta1) * cos(theta2);\n  float temp = mod(197.0 * value, 1.0) + value;\n  float part1 = mod(220.0 * temp, 1.0) + temp;\n  float part2 = value * 0.5453;\n  float part3 = cos(theta1 + theta2) * 0.43758;\n  float sum = (part1 + part2 + part3);\n  return fract(sum)*scale;\n}\nvoid main() {\n  seed[0] = " + random.nextFloat() + ";\n  seed[1] = " + random.nextFloat() + ";\n  float noise = texture2D(tex_sampler_1, vTextureCoord + vec2(-stepX, -stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, vTextureCoord + vec2(-stepX, stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, vTextureCoord + vec2(stepX, -stepY)).r * 0.224;\n  noise += texture2D(tex_sampler_1, vTextureCoord + vec2(stepX, stepY)).r * 0.224;\n  noise += 0.4448;\n  noise *= scale;\n  vec4 color = texture2D(tex_sampler_0, vTextureCoord);\n  float energy = 0.33333 * color.r + 0.33333 * color.g + 0.33333 * color.b;\n  float mask = (1.0 - sqrt(energy));\n  float weight = 1.0 - 1.333 * mask * noise;\n  gl_FragColor = vec4(color.rgb * weight, color.a);\n  gl_FragColor = gl_FragColor+vec4(rand(vTextureCoord + seed), rand(vTextureCoord + seed),rand(vTextureCoord + seed),1);\n}\n";
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void setSize(int i, int i2) {
        super.setSize(i, i2);
        this.width = i;
        this.height = i2;
    }

    public void setStrength(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.strength = f;
    }

    public float getStrength() {
        return this.strength;
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public void setParameter1(float f) {
        setStrength(f);
    }

    @Override // com.otaliastudios.cameraview.filter.OneParameterFilter
    public float getParameter1() {
        return getStrength();
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public String getFragmentShader() {
        return FRAGMENT_SHADER;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onCreate(int i) {
        super.onCreate(i);
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, "scale");
        this.strengthLocation = glGetUniformLocation;
        Egloo.checkGlProgramLocation(glGetUniformLocation, "scale");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "stepX");
        this.stepXLocation = glGetUniformLocation2;
        Egloo.checkGlProgramLocation(glGetUniformLocation2, "stepX");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(i, "stepY");
        this.stepYLocation = glGetUniformLocation3;
        Egloo.checkGlProgramLocation(glGetUniformLocation3, "stepY");
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onDestroy() {
        super.onDestroy();
        this.strengthLocation = -1;
        this.stepXLocation = -1;
        this.stepYLocation = -1;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter
    protected void onPreDraw(long j, float[] fArr) {
        super.onPreDraw(j, fArr);
        GLES20.glUniform1f(this.strengthLocation, this.strength);
        Egloo.checkGlError("glUniform1f");
        GLES20.glUniform1f(this.stepXLocation, 0.5f / this.width);
        Egloo.checkGlError("glUniform1f");
        GLES20.glUniform1f(this.stepYLocation, 0.5f / this.height);
        Egloo.checkGlError("glUniform1f");
    }
}
