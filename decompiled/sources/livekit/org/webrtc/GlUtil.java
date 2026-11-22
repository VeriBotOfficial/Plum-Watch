package livekit.org.webrtc;

import android.opengl.GLES20;
import android.opengl.GLException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes8.dex */
public class GlUtil {
    private GlUtil() {
    }

    public static class GlOutOfMemoryException extends GLException {
        public GlOutOfMemoryException(int error, String msg) {
            super(error, msg);
        }
    }

    public static void checkNoGLES2Error(String msg) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError == 1285) {
                throw new GlOutOfMemoryException(glGetError, msg);
            }
            throw new GLException(glGetError, msg + ": GLES20 error: " + glGetError);
        }
    }

    public static FloatBuffer createFloatBuffer(float[] coords) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(coords.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(coords);
        return asFloatBuffer;
    }

    public static int generateTexture(int target) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(target, i);
        GLES20.glTexParameterf(target, 10241, 9729.0f);
        GLES20.glTexParameterf(target, 10240, 9729.0f);
        GLES20.glTexParameterf(target, 10242, 33071.0f);
        GLES20.glTexParameterf(target, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i;
    }
}
