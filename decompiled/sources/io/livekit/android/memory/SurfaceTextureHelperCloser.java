package io.livekit.android.memory;

import java.io.Closeable;
import kotlin.Metadata;
import livekit.org.webrtc.SurfaceTextureHelper;

/* compiled from: SurfaceTextureHelperCloser.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/livekit/android/memory/SurfaceTextureHelperCloser;", "Ljava/io/Closeable;", "surfaceTextureHelper", "Llivekit/org/webrtc/SurfaceTextureHelper;", "(Llivekit/org/webrtc/SurfaceTextureHelper;)V", "isClosed", "", "close", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SurfaceTextureHelperCloser implements Closeable {
    private boolean isClosed;
    private final SurfaceTextureHelper surfaceTextureHelper;

    public SurfaceTextureHelperCloser(SurfaceTextureHelper surfaceTextureHelper) {
        this.surfaceTextureHelper = surfaceTextureHelper;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.stopListening();
        }
        SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
        if (surfaceTextureHelper2 != null) {
            surfaceTextureHelper2.dispose();
        }
    }
}
