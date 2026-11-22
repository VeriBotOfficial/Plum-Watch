package org.opencv.videoio;

/* loaded from: classes7.dex */
public class IStreamReader {
    protected final long nativeObj;

    private static native void delete(long j);

    protected IStreamReader(long j) {
        this.nativeObj = j;
    }

    public long getNativeObjAddr() {
        return this.nativeObj;
    }

    public static IStreamReader __fromPtr__(long j) {
        return new IStreamReader(j);
    }

    protected void finalize() throws Throwable {
        delete(this.nativeObj);
    }
}
