package com.otaliastudios.cameraview.filter;

import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.size.Size;
import com.otaliastudios.opengl.draw.GlDrawable;
import com.otaliastudios.opengl.draw.GlRect;
import com.otaliastudios.opengl.program.GlTextureProgram;

/* loaded from: classes17.dex */
public abstract class BaseFilter implements Filter {
    protected static final String DEFAULT_FRAGMENT_TEXTURE_COORDINATE_NAME = "vTextureCoord";
    protected static final String DEFAULT_VERTEX_MVP_MATRIX_NAME = "uMVPMatrix";
    protected static final String DEFAULT_VERTEX_POSITION_NAME = "aPosition";
    protected static final String DEFAULT_VERTEX_TEXTURE_COORDINATE_NAME = "aTextureCoord";
    protected static final String DEFAULT_VERTEX_TRANSFORM_MATRIX_NAME = "uTexMatrix";
    Size size;
    private static final String TAG = "BaseFilter";
    private static final CameraLogger LOG = CameraLogger.create(TAG);
    GlTextureProgram program = null;
    private GlDrawable programDrawable = null;
    protected String vertexPositionName = DEFAULT_VERTEX_POSITION_NAME;
    protected String vertexTextureCoordinateName = DEFAULT_VERTEX_TEXTURE_COORDINATE_NAME;
    protected String vertexModelViewProjectionMatrixName = DEFAULT_VERTEX_MVP_MATRIX_NAME;
    protected String vertexTransformMatrixName = DEFAULT_VERTEX_TRANSFORM_MATRIX_NAME;
    protected String fragmentTextureCoordinateName = "vTextureCoord";

    private static String createDefaultVertexShader(String str, String str2, String str3, String str4, String str5) {
        return "uniform mat4 " + str3 + ";\nuniform mat4 " + str4 + ";\nattribute vec4 " + str + ";\nattribute vec4 " + str2 + ";\nvarying vec2 " + str5 + ";\nvoid main() {\n    gl_Position = " + str3 + " * " + str + ";\n    " + str5 + " = (" + str4 + " * " + str2 + ").xy;\n}\n";
    }

    private static String createDefaultFragmentShader(String str) {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 " + str + ";\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, " + str + ");\n}\n";
    }

    protected String createDefaultVertexShader() {
        return createDefaultVertexShader(this.vertexPositionName, this.vertexTextureCoordinateName, this.vertexModelViewProjectionMatrixName, this.vertexTransformMatrixName, this.fragmentTextureCoordinateName);
    }

    protected String createDefaultFragmentShader() {
        return createDefaultFragmentShader(this.fragmentTextureCoordinateName);
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public void onCreate(int i) {
        this.program = new GlTextureProgram(i, this.vertexPositionName, this.vertexModelViewProjectionMatrixName, this.vertexTextureCoordinateName, this.vertexTransformMatrixName);
        this.programDrawable = new GlRect();
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public void onDestroy() {
        this.program.release();
        this.program = null;
        this.programDrawable = null;
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public String getVertexShader() {
        return createDefaultVertexShader();
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public void setSize(int i, int i2) {
        this.size = new Size(i, i2);
    }

    @Override // com.otaliastudios.cameraview.filter.Filter
    public void draw(long j, float[] fArr) {
        if (this.program == null) {
            LOG.w("Filter.draw() called after destroying the filter. This can happen rarely because of threading.");
            return;
        }
        onPreDraw(j, fArr);
        onDraw(j);
        onPostDraw(j);
    }

    protected void onPreDraw(long j, float[] fArr) {
        this.program.setTextureTransform(fArr);
        GlTextureProgram glTextureProgram = this.program;
        GlDrawable glDrawable = this.programDrawable;
        glTextureProgram.onPreDraw(glDrawable, glDrawable.getModelMatrix());
    }

    protected void onDraw(long j) {
        this.program.onDraw(this.programDrawable);
    }

    protected void onPostDraw(long j) {
        this.program.onPostDraw(this.programDrawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.otaliastudios.cameraview.filter.Filter
    public final BaseFilter copy() {
        BaseFilter onCopy = onCopy();
        Size size = this.size;
        if (size != null) {
            onCopy.setSize(size.getWidth(), this.size.getHeight());
        }
        if (this instanceof OneParameterFilter) {
            ((OneParameterFilter) onCopy).setParameter1(((OneParameterFilter) this).getParameter1());
        }
        if (this instanceof TwoParameterFilter) {
            ((TwoParameterFilter) onCopy).setParameter2(((TwoParameterFilter) this).getParameter2());
        }
        return onCopy;
    }

    protected BaseFilter onCopy() {
        try {
            return (BaseFilter) getClass().newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Filters should have a public no-arguments constructor.", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Filters should have a public no-arguments constructor.", e2);
        }
    }
}
