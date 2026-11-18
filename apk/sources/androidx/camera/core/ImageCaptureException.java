package androidx.camera.core;

/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureException extends Exception {
    private final int mImageCaptureError;

    public ImageCaptureException(int r1, String str, Throwable th) {
        super(str, th);
        this.mImageCaptureError = r1;
    }

    public int getImageCaptureError() {
        return this.mImageCaptureError;
    }
}
