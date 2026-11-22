package com.otaliastudios.cameraview.gesture;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.gesture.GestureFinder;

/* loaded from: classes17.dex */
public class ScrollGestureFinder extends GestureFinder {
    private GestureDetector mDetector;
    private float mFactor;
    private boolean mNotify;
    private static final String TAG = "ScrollGestureFinder";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    public ScrollGestureFinder(final GestureFinder.Controller controller) {
        super(controller, 2);
        GestureDetector gestureDetector = new GestureDetector(controller.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.otaliastudios.cameraview.gesture.ScrollGestureFinder.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                ScrollGestureFinder.LOG.i("onScroll:", "distanceX=" + f, "distanceY=" + f2);
                boolean z = false;
                if (motionEvent == null || motionEvent2 == null) {
                    return false;
                }
                if (motionEvent.getX() != ScrollGestureFinder.this.getPoint(0).x || motionEvent.getY() != ScrollGestureFinder.this.getPoint(0).y) {
                    boolean z2 = Math.abs(f) >= Math.abs(f2);
                    ScrollGestureFinder.this.setGesture(z2 ? Gesture.SCROLL_HORIZONTAL : Gesture.SCROLL_VERTICAL);
                    ScrollGestureFinder.this.getPoint(0).set(motionEvent.getX(), motionEvent.getY());
                    z = z2;
                } else if (ScrollGestureFinder.this.getGesture() == Gesture.SCROLL_HORIZONTAL) {
                    z = true;
                }
                ScrollGestureFinder.this.getPoint(1).set(motionEvent2.getX(), motionEvent2.getY());
                ScrollGestureFinder.this.mFactor = z ? f / controller.getWidth() : f2 / controller.getHeight();
                ScrollGestureFinder scrollGestureFinder = ScrollGestureFinder.this;
                float f3 = scrollGestureFinder.mFactor;
                if (z) {
                    f3 = -f3;
                }
                scrollGestureFinder.mFactor = f3;
                ScrollGestureFinder.this.mNotify = true;
                return true;
            }
        });
        this.mDetector = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    @Override // com.otaliastudios.cameraview.gesture.GestureFinder
    protected boolean handleTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mNotify = false;
        }
        this.mDetector.onTouchEvent(motionEvent);
        if (this.mNotify) {
            LOG.i("Notifying a gesture of type", getGesture().name());
        }
        return this.mNotify;
    }

    @Override // com.otaliastudios.cameraview.gesture.GestureFinder
    public float getValue(float f, float f2, float f3) {
        return f + (getFactor() * (f3 - f2) * 2.0f);
    }

    protected float getFactor() {
        return this.mFactor;
    }
}
