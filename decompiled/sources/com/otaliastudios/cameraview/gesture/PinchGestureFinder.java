package com.otaliastudios.cameraview.gesture;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.otaliastudios.cameraview.gesture.GestureFinder;

/* loaded from: classes17.dex */
public class PinchGestureFinder extends GestureFinder {
    private static final float ADD_SENSITIVITY = 2.0f;
    private ScaleGestureDetector mDetector;
    private float mFactor;
    private boolean mNotify;

    public PinchGestureFinder(GestureFinder.Controller controller) {
        super(controller, 2);
        this.mFactor = 0.0f;
        setGesture(Gesture.PINCH);
        this.mDetector = new ScaleGestureDetector(controller.getContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.otaliastudios.cameraview.gesture.PinchGestureFinder.1
            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                PinchGestureFinder.this.mNotify = true;
                PinchGestureFinder.this.mFactor = (scaleGestureDetector.getScaleFactor() - 1.0f) * 2.0f;
                return true;
            }
        });
        this.mDetector.setQuickScaleEnabled(false);
    }

    @Override // com.otaliastudios.cameraview.gesture.GestureFinder
    protected boolean handleTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            this.mNotify = false;
        }
        this.mDetector.onTouchEvent(motionEvent);
        if (this.mNotify) {
            getPoint(0).x = motionEvent.getX(0);
            getPoint(0).y = motionEvent.getY(0);
            z = true;
            if (motionEvent.getPointerCount() > 1) {
                getPoint(1).x = motionEvent.getX(1);
                getPoint(1).y = motionEvent.getY(1);
            }
        }
        return z;
    }

    @Override // com.otaliastudios.cameraview.gesture.GestureFinder
    public float getValue(float f, float f2, float f3) {
        return f + (getFactor() * (f3 - f2));
    }

    protected float getFactor() {
        return this.mFactor;
    }
}
