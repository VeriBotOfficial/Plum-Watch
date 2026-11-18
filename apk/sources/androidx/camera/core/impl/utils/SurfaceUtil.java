package androidx.camera.core.impl.utils;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceUtil {
    public static final String JNI_LIB_NAME = "surface_util_jni";
    private static final String TAG = "SurfaceUtil";

    public static class SurfaceInfo {
        public int format = 0;
        public int width = 0;
        public int height = 0;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);

    static {
        System.loadLibrary(JNI_LIB_NAME);
    }

    private SurfaceUtil() {
    }

    public static SurfaceInfo getSurfaceInfo(Surface surface) {
        int[] r2 = nativeGetSurfaceInfo(surface);
        SurfaceInfo surfaceInfo = new SurfaceInfo();
        surfaceInfo.format = r2[0];
        surfaceInfo.width = r2[1];
        surfaceInfo.height = r2[2];
        return surfaceInfo;
    }
}
