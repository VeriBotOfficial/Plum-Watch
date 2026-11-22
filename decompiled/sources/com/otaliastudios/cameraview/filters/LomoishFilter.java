package com.otaliastudios.cameraview.filters;

import android.opengl.GLES20;
import com.otaliastudios.cameraview.filter.BaseFilter;
import com.otaliastudios.opengl.core.Egloo;
import java.util.Random;

/* loaded from: classes17.dex */
public class LomoishFilter extends BaseFilter {
    private static final String FRAGMENT_SHADER;
    private static final Random RANDOM;
    private int width = 1;
    private int height = 1;
    private int scaleLocation = -1;
    private int maxDistLocation = -1;
    private int stepSizeXLocation = -1;
    private int stepSizeYLocation = -1;

    static {
        Random random = new Random();
        RANDOM = random;
        FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float stepsizeX;\nuniform float stepsizeY;\nuniform vec2 scale;\nuniform float inv_max_dist;\nvec2 seed;\nfloat stepsize;\nvarying vec2 vTextureCoord;\nfloat rand(vec2 loc) {\n  float theta1 = dot(loc, vec2(0.9898, 0.233));\n  float theta2 = dot(loc, vec2(12.0, 78.0));\n  float value = cos(theta1) * sin(theta2) + sin(theta1) * cos(theta2);\n  float temp = mod(197.0 * value, 1.0) + value;\n  float part1 = mod(220.0 * temp, 1.0) + temp;\n  float part2 = value * 0.5453;\n  float part3 = cos(theta1 + theta2) * 0.43758;\n  return fract(part1 + part2 + part3);\n}\nvoid main() {\n  seed[0] = " + random.nextFloat() + ";\n  seed[1] = " + random.nextFloat() + ";\n  stepsize = 0.003921569;\n  vec3 nbr_color = vec3(0.0, 0.0, 0.0);\n  vec2 coord;\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  coord.x = vTextureCoord.x - 0.5 * stepsizeX;\n  coord.y = vTextureCoord.y - stepsizeY;\n  nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n  coord.x = vTextureCoord.x - stepsizeX;\n  coord.y = vTextureCoord.y + 0.5 * stepsizeY;\n  nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n  coord.x = vTextureCoord.x + stepsizeX;\n  coord.y = vTextureCoord.y - 0.5 * stepsizeY;\n  nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n  coord.x = vTextureCoord.x + stepsizeX;\n  coord.y = vTextureCoord.y + 0.5 * stepsizeY;\n  nbr_color += texture2D(sTexture, coord).rgb - color.rgb;\n  vec3 s_color = vec3(color.rgb + 0.3 * nbr_color);\n  vec3 c_color = vec3(0.0, 0.0, 0.0);\n  float value;\n  if (s_color.r < 0.5) {\n    value = s_color.r;\n  } else {\n    value = 1.0 - s_color.r;\n  }\n  float red = 4.0 * value * value * value;\n  if (s_color.r < 0.5) {\n    c_color.r = red;\n  } else {\n    c_color.r = 1.0 - red;\n  }\n  if (s_color.g < 0.5) {\n    value = s_color.g;\n  } else {\n    value = 1.0 - s_color.g;\n  }\n  float green = 2.0 * value * value;\n  if (s_color.g < 0.5) {\n    c_color.g = green;\n  } else {\n    c_color.g = 1.0 - green;\n  }\n  c_color.b = s_color.b * 0.5 + 0.25;\n  float dither = rand(vTextureCoord + seed);\n  vec3 xform = clamp((c_color.rgb - 0.15) * 1.53846, 0.0, 1.0);\n  vec3 temp = clamp((color.rgb + stepsize - 0.15) * 1.53846, 0.0, 1.0);\n  vec3 bw_color = clamp(xform + (temp - xform) * (dither - 0.5), 0.0, 1.0);\n  coord = vTextureCoord - vec2(0.5, 0.5);\n  float dist = length(coord * scale);\n  float lumen = 0.85 / (1.0 + exp((dist * inv_max_dist - 0.73) * 20.0)) + 0.15;\n  gl_FragColor = vec4(bw_color * lumen, color.a);\n}\n";
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void setSize(int i, int i2) {
        super.setSize(i, i2);
        this.width = i;
        this.height = i2;
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
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(i, "inv_max_dist");
        this.maxDistLocation = glGetUniformLocation2;
        Egloo.checkGlProgramLocation(glGetUniformLocation2, "inv_max_dist");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(i, "stepsizeX");
        this.stepSizeXLocation = glGetUniformLocation3;
        Egloo.checkGlProgramLocation(glGetUniformLocation3, "stepsizeX");
        int glGetUniformLocation4 = GLES20.glGetUniformLocation(i, "stepsizeY");
        this.stepSizeYLocation = glGetUniformLocation4;
        Egloo.checkGlProgramLocation(glGetUniformLocation4, "stepsizeY");
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter, com.otaliastudios.cameraview.filter.Filter
    public void onDestroy() {
        super.onDestroy();
        this.scaleLocation = -1;
        this.maxDistLocation = -1;
        this.stepSizeXLocation = -1;
        this.stepSizeYLocation = -1;
    }

    @Override // com.otaliastudios.cameraview.filter.BaseFilter
    protected void onPreDraw(long j, float[] fArr) {
        super.onPreDraw(j, fArr);
        float[] fArr2 = new float[2];
        int i = this.width;
        int i2 = this.height;
        if (i > i2) {
            fArr2[0] = 1.0f;
            fArr2[1] = i2 / i;
        } else {
            fArr2[0] = i / i2;
            fArr2[1] = 1.0f;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float sqrt = ((float) Math.sqrt((f * f) + (f2 * f2))) * 0.5f;
        GLES20.glUniform2fv(this.scaleLocation, 1, fArr2, 0);
        Egloo.checkGlError("glUniform2fv");
        GLES20.glUniform1f(this.maxDistLocation, 1.0f / sqrt);
        Egloo.checkGlError("glUniform1f");
        GLES20.glUniform1f(this.stepSizeXLocation, 1.0f / this.width);
        Egloo.checkGlError("glUniform1f");
        GLES20.glUniform1f(this.stepSizeYLocation, 1.0f / this.height);
        Egloo.checkGlError("glUniform1f");
    }
}
