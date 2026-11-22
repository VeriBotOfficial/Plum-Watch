package com.otaliastudios.cameraview.engine.action;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes17.dex */
public interface Action {
    public static final int STATE_COMPLETED = Integer.MAX_VALUE;

    void abort(ActionHolder actionHolder);

    void addCallback(ActionCallback actionCallback);

    int getState();

    void onCaptureCompleted(ActionHolder actionHolder, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult);

    void onCaptureProgressed(ActionHolder actionHolder, CaptureRequest captureRequest, CaptureResult captureResult);

    void onCaptureStarted(ActionHolder actionHolder, CaptureRequest captureRequest);

    void removeCallback(ActionCallback actionCallback);

    void start(ActionHolder actionHolder);
}
