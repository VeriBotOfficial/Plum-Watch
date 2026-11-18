package androidx.media3.common;

import android.view.SurfaceView;

/* JADX INFO: loaded from: classes8.dex */
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new DebugViewProvider() { // from class: androidx.media3.common.DebugViewProvider$$ExternalSyntheticLambda0
        @Override // androidx.media3.common.DebugViewProvider
        public final SurfaceView getDebugPreviewSurfaceView(int r1, int r2) {
            return DebugViewProvider.lambda$static$0(r1, r2);
        }
    };

    static /* synthetic */ SurfaceView lambda$static$0(int r0, int r1) {
        return null;
    }

    SurfaceView getDebugPreviewSurfaceView(int r1, int r2);
}
