package com.baidu.mapapi.map;

import com.baidu.mapapi.map.BackgroundDrawMapView;

/* loaded from: classes13.dex */
interface IBackgroundDrawLayer {
    void onCreate();

    void onDestroy();

    void onDraw(BackgroundDrawMapView.CanvasProxy canvasProxy);

    void onSizeChanged(int i, int i2);

    void onUpdated();
}
