package com.otaliastudios.cameraview.engine.action;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes17.dex */
public abstract class BaseAction implements Action {
    private final List<ActionCallback> callbacks = new ArrayList();
    private ActionHolder holder;
    private boolean needsOnStart;
    private int state;

    protected void onAbort(ActionHolder actionHolder) {
    }

    @Override // com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureCompleted(ActionHolder actionHolder, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
    }

    @Override // com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureProgressed(ActionHolder actionHolder, CaptureRequest captureRequest, CaptureResult captureResult) {
    }

    protected void onCompleted(ActionHolder actionHolder) {
    }

    @Override // com.otaliastudios.cameraview.engine.action.Action
    public final int getState() {
        return this.state;
    }

    @Override // com.otaliastudios.cameraview.engine.action.Action
    public final void start(ActionHolder actionHolder) {
        this.holder = actionHolder;
        actionHolder.addAction(this);
        if (actionHolder.getLastResult(this) != null) {
            onStart(actionHolder);
        } else {
            this.needsOnStart = true;
        }
    }

    @Override // com.otaliastudios.cameraview.engine.action.Action
    public final void abort(ActionHolder actionHolder) {
        actionHolder.removeAction(this);
        if (!isCompleted()) {
            onAbort(actionHolder);
            setState(Integer.MAX_VALUE);
        }
        this.needsOnStart = false;
    }

    protected void onStart(ActionHolder actionHolder) {
        this.holder = actionHolder;
    }

    @Override // com.otaliastudios.cameraview.engine.action.Action
    public void onCaptureStarted(ActionHolder actionHolder, CaptureRequest captureRequest) {
        if (this.needsOnStart) {
            onStart(actionHolder);
            this.needsOnStart = false;
        }
    }

    protected final void setState(int i) {
        if (i != this.state) {
            this.state = i;
            Iterator<ActionCallback> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onActionStateChanged(this, this.state);
            }
            if (this.state == Integer.MAX_VALUE) {
                this.holder.removeAction(this);
                onCompleted(this.holder);
            }
        }
    }

    public boolean isCompleted() {
        return this.state == Integer.MAX_VALUE;
    }

    protected ActionHolder getHolder() {
        return this.holder;
    }

    protected <T> T readCharacteristic(CameraCharacteristics.Key<T> key, T t) {
        T t2 = (T) this.holder.getCharacteristics(this).get(key);
        return t2 == null ? t : t2;
    }

    @Override // com.otaliastudios.cameraview.engine.action.Action
    public void addCallback(ActionCallback actionCallback) {
        if (this.callbacks.contains(actionCallback)) {
            return;
        }
        this.callbacks.add(actionCallback);
        actionCallback.onActionStateChanged(this, getState());
    }

    @Override // com.otaliastudios.cameraview.engine.action.Action
    public void removeCallback(ActionCallback actionCallback) {
        this.callbacks.remove(actionCallback);
    }
}
