package io.agora.rtc2.video;

import io.agora.base.VideoFrame;
import javax.microedition.khronos.egl.EGLContext;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class AgoraVideoFrame {
    public static final int BUFFER_TYPE_ARRAY = 2;
    public static final int BUFFER_TYPE_BUFFER = 1;
    public static final int BUFFER_TYPE_NONE = -1;
    public static final int BUFFER_TYPE_TEXTURE = 3;
    public static final int FORMAT_BGRA = 2;
    public static final int FORMAT_I420 = 1;
    public static final int FORMAT_I422 = 16;
    public static final int FORMAT_NONE = -1;
    public static final int FORMAT_NV21 = 3;
    public static final int FORMAT_RGBA = 4;
    public static final int FORMAT_TEXTURE_2D = 10;
    public static final int FORMAT_TEXTURE_OES = 11;
    public int format = 10;
    public long timeStamp = 0;
    public int stride = 0;
    public int height = 0;
    public int textureID = 0;
    public boolean syncMode = true;
    public float[] transform = null;
    public EGLContext eglContext10 = null;
    public android.opengl.EGLContext eglContext14 = null;
    public byte[] buf = null;
    public int cropLeft = 0;
    public int cropTop = 0;
    public int cropRight = 0;
    public int cropBottom = 0;
    public int rotation = 0;
    public VideoFrame.AlphaStitchMode alphaStitchMode = VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH;

    public String toString() {
        StringBuilder append = new StringBuilder("AgoraVideoFrame{format=").append(this.format).append(", timeStamp=").append(this.timeStamp).append(", stride=").append(this.stride).append(", height=").append(this.height).append(", textureID=").append(this.textureID).append(", buf.length=");
        byte[] bArr = this.buf;
        return append.append(bArr != null ? bArr.length : 0).append(", cropLeft=").append(this.cropLeft).append(", cropTop=").append(this.cropTop).append(", cropRight=").append(this.cropRight).append(", cropBottom=").append(this.cropBottom).append(", rotation=").append(this.rotation).append(", alphaStitchMode=").append(this.alphaStitchMode).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
