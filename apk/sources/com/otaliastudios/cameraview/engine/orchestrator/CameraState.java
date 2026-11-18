package com.otaliastudios.cameraview.engine.orchestrator;

/* JADX INFO: loaded from: classes2.dex */
public enum CameraState {
    OFF(0),
    ENGINE(1),
    BIND(2),
    PREVIEW(3);

    private int mState;

    CameraState(int r3) {
        this.mState = r3;
    }

    public boolean isAtLeast(CameraState cameraState) {
        return this.mState >= cameraState.mState;
    }
}
