package com.otaliastudios.cameraview.gesture;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.otaliastudios.cameraview.gesture.GestureFinder;

/* loaded from: classes17.dex */
public class TapGestureFinder extends GestureFinder {
    private GestureDetector mDetector;
    private boolean mNotify;

    @Override // com.otaliastudios.cameraview.gesture.GestureFinder
    public float getValue(float f, float f2, float f3) {
        return 0.0f;
    }

    public TapGestureFinder(GestureFinder.Controller controller) {
        super(controller, 1);
        GestureDetector gestureDetector = new GestureDetector(controller.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.otaliastudios.cameraview.gesture.TapGestureFinder.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                TapGestureFinder.this.mNotify = true;
                TapGestureFinder.this.setGesture(Gesture.TAP);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                TapGestureFinder.this.mNotify = true;
                TapGestureFinder.this.setGesture(Gesture.LONG_TAP);
            }
        });
        this.mDetector = gestureDetector;
        gestureDetector.setIsLongpressEnabled(true);
    }

    @Override // com.otaliastudios.cameraview.gesture.GestureFinder
    protected boolean handleTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mNotify = false;
        }
        this.mDetector.onTouchEvent(motionEvent);
        if (!this.mNotify) {
            return false;
        }
        getPoint(0).x = motionEvent.getX();
        getPoint(0).y = motionEvent.getY();
        return true;
    }
}
