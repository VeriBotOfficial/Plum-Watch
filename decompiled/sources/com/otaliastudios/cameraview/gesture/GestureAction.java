package com.otaliastudios.cameraview.gesture;

/* loaded from: classes17.dex */
public enum GestureAction {
    NONE(0, GestureType.ONE_SHOT),
    AUTO_FOCUS(1, GestureType.ONE_SHOT),
    TAKE_PICTURE(2, GestureType.ONE_SHOT),
    TAKE_PICTURE_SNAPSHOT(3, GestureType.ONE_SHOT),
    ZOOM(4, GestureType.CONTINUOUS),
    EXPOSURE_CORRECTION(5, GestureType.CONTINUOUS),
    FILTER_CONTROL_1(6, GestureType.CONTINUOUS),
    FILTER_CONTROL_2(7, GestureType.CONTINUOUS);

    static final GestureAction DEFAULT_LONG_TAP;
    static final GestureAction DEFAULT_PINCH;
    static final GestureAction DEFAULT_SCROLL_HORIZONTAL;
    static final GestureAction DEFAULT_SCROLL_VERTICAL;
    static final GestureAction DEFAULT_TAP;
    private GestureType type;
    private int value;

    static {
        GestureAction gestureAction = NONE;
        DEFAULT_PINCH = gestureAction;
        DEFAULT_TAP = gestureAction;
        DEFAULT_LONG_TAP = gestureAction;
        DEFAULT_SCROLL_HORIZONTAL = gestureAction;
        DEFAULT_SCROLL_VERTICAL = gestureAction;
    }

    GestureAction(int i, GestureType gestureType) {
        this.value = i;
        this.type = gestureType;
    }

    int value() {
        return this.value;
    }

    GestureType type() {
        return this.type;
    }

    static GestureAction fromValue(int i) {
        for (GestureAction gestureAction : values()) {
            if (gestureAction.value() == i) {
                return gestureAction;
            }
        }
        return null;
    }
}
