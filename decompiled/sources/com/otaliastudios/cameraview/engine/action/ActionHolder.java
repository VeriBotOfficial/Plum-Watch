package com.otaliastudios.cameraview.engine.action;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes17.dex */
public interface ActionHolder {
    void addAction(Action action);

    void applyBuilder(Action action);

    void applyBuilder(Action action, CaptureRequest.Builder builder) throws CameraAccessException;

    CaptureRequest.Builder getBuilder(Action action);

    CameraCharacteristics getCharacteristics(Action action);

    TotalCaptureResult getLastResult(Action action);

    void removeAction(Action action);
}
