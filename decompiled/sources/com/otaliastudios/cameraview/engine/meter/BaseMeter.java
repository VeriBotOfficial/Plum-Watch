package com.otaliastudios.cameraview.engine.meter;

import android.hardware.camera2.params.MeteringRectangle;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.action.ActionHolder;
import com.otaliastudios.cameraview.engine.action.BaseAction;
import java.util.List;

/* loaded from: classes17.dex */
public abstract class BaseMeter extends BaseAction {
    private final List<MeteringRectangle> areas;
    private boolean isSuccessful;
    private boolean skipIfPossible;
    private static final String TAG = "BaseMeter";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    protected abstract boolean checkIsSupported(ActionHolder actionHolder);

    protected abstract boolean checkShouldSkip(ActionHolder actionHolder);

    protected abstract void onStarted(ActionHolder actionHolder, List<MeteringRectangle> list);

    protected BaseMeter(List<MeteringRectangle> list, boolean z) {
        this.areas = list;
        this.skipIfPossible = z;
    }

    @Override // com.otaliastudios.cameraview.engine.action.BaseAction
    protected final void onStart(ActionHolder actionHolder) {
        super.onStart(actionHolder);
        boolean z = this.skipIfPossible && checkShouldSkip(actionHolder);
        if (!checkIsSupported(actionHolder) || z) {
            LOG.i("onStart:", "not supported or skipped. Dispatching COMPLETED state.");
            setSuccessful(true);
            setState(Integer.MAX_VALUE);
        } else {
            LOG.i("onStart:", "supported and not skipped. Dispatching onStarted.");
            onStarted(actionHolder, this.areas);
        }
    }

    protected void setSuccessful(boolean z) {
        this.isSuccessful = z;
    }

    public boolean isSuccessful() {
        return this.isSuccessful;
    }
}
