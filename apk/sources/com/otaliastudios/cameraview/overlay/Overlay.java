package com.otaliastudios.cameraview.overlay;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes2.dex */
public interface Overlay {

    public enum Target {
        PREVIEW,
        PICTURE_SNAPSHOT,
        VIDEO_SNAPSHOT
    }

    void drawOn(Target target, Canvas canvas);

    boolean drawsOn(Target target);

    boolean getHardwareCanvasEnabled();

    void setHardwareCanvasEnabled(boolean z);
}
