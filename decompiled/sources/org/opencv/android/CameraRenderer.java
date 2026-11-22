package org.opencv.android;

import android.hardware.Camera;
import android.util.Log;

/* loaded from: classes7.dex */
public class CameraRenderer extends CameraGLRendererBase {
    public static final String LOGTAG = "CameraRenderer";
    private Camera mCamera;
    private boolean mPreviewStarted;

    CameraRenderer(CameraGLSurfaceView cameraGLSurfaceView) {
        super(cameraGLSurfaceView);
        this.mPreviewStarted = false;
    }

    @Override // org.opencv.android.CameraGLRendererBase
    protected synchronized void closeCamera() {
        Log.i(LOGTAG, "closeCamera");
        Camera camera = this.mCamera;
        if (camera != null) {
            camera.stopPreview();
            this.mPreviewStarted = false;
            this.mCamera.release();
            this.mCamera = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0143 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0019, B:9:0x0037, B:12:0x003c, B:14:0x0042, B:16:0x0060, B:19:0x0093, B:24:0x0069, B:26:0x013f, B:28:0x0143, B:32:0x014c, B:34:0x0156, B:36:0x015e, B:37:0x0163, B:39:0x0168, B:44:0x0171, B:47:0x0021, B:48:0x0096, B:50:0x00a0, B:51:0x00ac, B:53:0x00b2, B:55:0x00ba, B:60:0x00e1, B:62:0x00eb, B:63:0x00f3, B:65:0x0111, B:68:0x0119, B:70:0x00bd, B:72:0x00c1, B:73:0x00cd, B:75:0x00d3, B:77:0x00dc), top: B:3:0x0003, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014c A[Catch: all -> 0x018f, TRY_ENTER, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0019, B:9:0x0037, B:12:0x003c, B:14:0x0042, B:16:0x0060, B:19:0x0093, B:24:0x0069, B:26:0x013f, B:28:0x0143, B:32:0x014c, B:34:0x0156, B:36:0x015e, B:37:0x0163, B:39:0x0168, B:44:0x0171, B:47:0x0021, B:48:0x0096, B:50:0x00a0, B:51:0x00ac, B:53:0x00b2, B:55:0x00ba, B:60:0x00e1, B:62:0x00eb, B:63:0x00f3, B:65:0x0111, B:68:0x0119, B:70:0x00bd, B:72:0x00c1, B:73:0x00cd, B:75:0x00d3, B:77:0x00dc), top: B:3:0x0003, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1 A[Catch: all -> 0x018f, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0019, B:9:0x0037, B:12:0x003c, B:14:0x0042, B:16:0x0060, B:19:0x0093, B:24:0x0069, B:26:0x013f, B:28:0x0143, B:32:0x014c, B:34:0x0156, B:36:0x015e, B:37:0x0163, B:39:0x0168, B:44:0x0171, B:47:0x0021, B:48:0x0096, B:50:0x00a0, B:51:0x00ac, B:53:0x00b2, B:55:0x00ba, B:60:0x00e1, B:62:0x00eb, B:63:0x00f3, B:65:0x0111, B:68:0x0119, B:70:0x00bd, B:72:0x00c1, B:73:0x00cd, B:75:0x00d3, B:77:0x00dc), top: B:3:0x0003, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9  */
    @Override // org.opencv.android.CameraGLRendererBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected synchronized void openCamera(int r7) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.android.CameraRenderer.openCamera(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0108 A[Catch: all -> 0x012c, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0023, B:10:0x002c, B:12:0x0030, B:14:0x0034, B:15:0x0036, B:17:0x003a, B:19:0x003e, B:20:0x0040, B:22:0x0050, B:23:0x005a, B:25:0x0060, B:34:0x0094, B:49:0x00af, B:50:0x0104, B:52:0x0108, B:53:0x010f, B:54:0x00d2, B:55:0x0116), top: B:3:0x0003 }] */
    @Override // org.opencv.android.CameraGLRendererBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void setCameraPreviewSize(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.opencv.android.CameraRenderer.setCameraPreviewSize(int, int):void");
    }
}
