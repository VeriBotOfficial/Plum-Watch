package com.applovin.impl.adview;

import android.content.Context;
import android.widget.VideoView;

/* JADX INFO: loaded from: classes16.dex */
public class AppLovinVideoView extends VideoView {
    public AppLovinVideoView(Context context) {
        super(context, null, 0);
    }

    public void setVideoSize(int r2, int r3) {
        getHolder().setFixedSize(r2, r3);
        requestLayout();
        invalidate();
    }
}
