package com.otaliastudios.cameraview.internal;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes2.dex */
public class Issue514Workaround {
    private final int textureId;

    public Issue514Workaround(int r1) {
        this.textureId = r1;
    }

    public void beforeOverlayUpdateTexImage() {
        bindTexture(this.textureId);
    }

    public void end() {
        bindTexture(0);
    }

    private void bindTexture(int r2) {
        GLES20.glBindTexture(36197, r2);
    }
}
