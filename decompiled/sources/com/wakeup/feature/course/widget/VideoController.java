package com.wakeup.feature.course.widget;

import android.content.Context;
import android.util.AttributeSet;
import xyz.doikki.videoplayer.controller.GestureVideoController;

/* loaded from: classes2.dex */
public class VideoController extends GestureVideoController {
    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    protected int getLayoutId() {
        return 0;
    }

    public VideoController(Context context) {
        super(context);
    }

    public VideoController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoController(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
