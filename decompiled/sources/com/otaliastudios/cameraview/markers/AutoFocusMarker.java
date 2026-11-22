package com.otaliastudios.cameraview.markers;

import android.graphics.PointF;

/* loaded from: classes17.dex */
public interface AutoFocusMarker extends Marker {
    void onAutoFocusEnd(AutoFocusTrigger autoFocusTrigger, boolean z, PointF pointF);

    void onAutoFocusStart(AutoFocusTrigger autoFocusTrigger, PointF pointF);
}
