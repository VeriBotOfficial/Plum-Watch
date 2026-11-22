package com.otaliastudios.cameraview.gesture;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* loaded from: classes17.dex */
public abstract class GestureFinder {
    private static final int GRANULARITY = 50;
    private boolean mActive;
    private Controller mController;
    private PointF[] mPoints;
    Gesture mType;

    public interface Controller {
        Context getContext();

        int getHeight();

        int getWidth();
    }

    private static float capValue(float f, float f2, float f3, float f4) {
        if (f2 < f3) {
            f2 = f3;
        }
        if (f2 > f4) {
            f2 = f4;
        }
        float f5 = ((f4 - f3) / 50.0f) / 2.0f;
        return (f2 < f - f5 || f2 > f5 + f) ? f2 : f;
    }

    protected abstract float getValue(float f, float f2, float f3);

    protected abstract boolean handleTouchEvent(MotionEvent motionEvent);

    GestureFinder(Controller controller, int i) {
        this.mController = controller;
        this.mPoints = new PointF[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.mPoints[i2] = new PointF(0.0f, 0.0f);
        }
    }

    public void setActive(boolean z) {
        this.mActive = z;
    }

    public boolean isActive() {
        return this.mActive;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mActive) {
            return handleTouchEvent(motionEvent);
        }
        return false;
    }

    public final Gesture getGesture() {
        return this.mType;
    }

    protected final void setGesture(Gesture gesture) {
        this.mType = gesture;
    }

    public final PointF[] getPoints() {
        return this.mPoints;
    }

    protected final PointF getPoint(int i) {
        return this.mPoints[i];
    }

    public final float computeValue(float f, float f2, float f3) {
        return capValue(f, getValue(f, f2, f3), f2, f3);
    }

    protected Controller getController() {
        return this.mController;
    }
}
