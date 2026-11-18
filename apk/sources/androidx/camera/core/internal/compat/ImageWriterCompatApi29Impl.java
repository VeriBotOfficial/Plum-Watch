package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
final class ImageWriterCompatApi29Impl {
    static ImageWriter newInstance(Surface surface, int r1, int r2) {
        return ImageWriter.newInstance(surface, r1, r2);
    }

    private ImageWriterCompatApi29Impl() {
    }
}
