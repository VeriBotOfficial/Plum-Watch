package livekit.org.webrtc;

import android.content.Context;
import android.graphics.Matrix;
import android.view.WindowManager;
import livekit.org.webrtc.VideoFrame;

/* loaded from: classes8.dex */
interface CameraSession {

    public interface CreateSessionCallback {
        void onDone(CameraSession session);

        void onFailure(FailureType failureType, String error);
    }

    public interface Events {
        void onCameraClosed(CameraSession session);

        void onCameraDisconnected(CameraSession session);

        void onCameraError(CameraSession session, String error);

        void onCameraOpening();

        void onFrameCaptured(CameraSession session, VideoFrame frame);
    }

    public enum FailureType {
        ERROR,
        DISCONNECTED
    }

    void stop();

    static int getDeviceOrientation(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    static VideoFrame.TextureBuffer createTextureBufferWithModifiedTransformMatrix(TextureBufferImpl buffer, boolean mirror, int rotation) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (mirror) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(rotation);
        matrix.preTranslate(-0.5f, -0.5f);
        return buffer.applyTransformMatrix(matrix, buffer.getWidth(), buffer.getHeight());
    }
}
