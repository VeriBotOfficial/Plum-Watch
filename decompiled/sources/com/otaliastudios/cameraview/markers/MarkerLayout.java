package com.otaliastudios.cameraview.markers;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* loaded from: classes17.dex */
public class MarkerLayout extends FrameLayout {
    public static final int TYPE_AUTOFOCUS = 1;
    private final HashMap<Integer, View> mViews;

    public MarkerLayout(Context context) {
        super(context);
        this.mViews = new HashMap<>();
    }

    public void onMarker(int i, Marker marker) {
        View onAttach;
        View view = this.mViews.get(Integer.valueOf(i));
        if (view != null) {
            removeView(view);
        }
        if (marker == null || (onAttach = marker.onAttach(getContext(), this)) == null) {
            return;
        }
        this.mViews.put(Integer.valueOf(i), onAttach);
        addView(onAttach);
    }

    public void onEvent(int i, PointF[] pointFArr) {
        View view = this.mViews.get(Integer.valueOf(i));
        if (view == null) {
            return;
        }
        view.clearAnimation();
        if (i == 1) {
            PointF pointF = pointFArr[0];
            float width = (int) (pointF.x - (view.getWidth() / 2));
            float height = (int) (pointF.y - (view.getHeight() / 2));
            view.setTranslationX(width);
            view.setTranslationY(height);
        }
    }
}
