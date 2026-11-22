package com.otaliastudios.cameraview.engine.meter;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;
import com.otaliastudios.cameraview.engine.action.ActionHolder;
import com.otaliastudios.cameraview.engine.action.BaseAction;

/* loaded from: classes17.dex */
public abstract class BaseReset extends BaseAction {
    private boolean resetArea;

    protected abstract void onStarted(ActionHolder actionHolder, MeteringRectangle meteringRectangle);

    protected BaseReset(boolean z) {
        this.resetArea = z;
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction
    protected final void onStart(ActionHolder actionHolder) {
        super.onStart(actionHolder);
        onStarted(actionHolder, this.resetArea ? new MeteringRectangle((Rect) readCharacteristic(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE, new Rect()), 0) : null);
    }
}
