package com.otaliastudios.cameraview.internal;

import android.opengl.GLES20;

/* loaded from: classes17.dex */
public class Issue514Workaround {
    private final int textureId;

    public Issue514Workaround(int i) {
        this.textureId = i;
    }

    public void beforeOverlayUpdateTexImage() {
        bindTexture(this.textureId);
    }

    public void end() {
        bindTexture(0);
    }

    private void bindTexture(int i) {
        GLES20.glBindTexture(36197, i);
    }
}
