package com.otaliastudios.cameraview.gesture;

import android.content.res.TypedArray;
import com.otaliastudios.cameraview.R;

/* loaded from: classes17.dex */
public class GestureParser {
    private int horizontalScrollAction;
    private int longTapAction;
    private int pinchAction;
    private int tapAction;
    private int verticalScrollAction;

    public GestureParser(TypedArray typedArray) {
        this.tapAction = typedArray.getInteger(R.styleable.CameraView_cameraGestureTap, GestureAction.DEFAULT_TAP.value());
        this.longTapAction = typedArray.getInteger(R.styleable.CameraView_cameraGestureLongTap, GestureAction.DEFAULT_LONG_TAP.value());
        this.pinchAction = typedArray.getInteger(R.styleable.CameraView_cameraGesturePinch, GestureAction.DEFAULT_PINCH.value());
        this.horizontalScrollAction = typedArray.getInteger(R.styleable.CameraView_cameraGestureScrollHorizontal, GestureAction.DEFAULT_SCROLL_HORIZONTAL.value());
        this.verticalScrollAction = typedArray.getInteger(R.styleable.CameraView_cameraGestureScrollVertical, GestureAction.DEFAULT_SCROLL_VERTICAL.value());
    }

    private GestureAction get(int i) {
        return GestureAction.fromValue(i);
    }

    public GestureAction getTapAction() {
        return get(this.tapAction);
    }

    public GestureAction getLongTapAction() {
        return get(this.longTapAction);
    }

    public GestureAction getPinchAction() {
        return get(this.pinchAction);
    }

    public GestureAction getHorizontalScrollAction() {
        return get(this.horizontalScrollAction);
    }

    public GestureAction getVerticalScrollAction() {
        return get(this.verticalScrollAction);
    }
}
