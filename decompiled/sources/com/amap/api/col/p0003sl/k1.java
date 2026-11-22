package com.amap.api.col.p0003sl;

import android.graphics.Point;
import com.autonavi.amap.api.mapcore.IGLMapState;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;

/* compiled from: AbstractCameraScrollMessage.java */
/* loaded from: classes11.dex */
public class k1 extends AbstractCameraUpdateMessage {
    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public void mergeCameraUpdateDelegate(AbstractCameraUpdateMessage abstractCameraUpdateMessage) {
    }

    @Override // com.autonavi.amap.mapcore.AbstractCameraUpdateMessage
    public void runCameraUpdate(IGLMapState iGLMapState) {
        float f = this.xPixel;
        float f2 = (this.width / 2.0f) + f;
        float f3 = (this.height / 2.0f) + this.yPixel;
        iGLMapState.screenToP20Point((int) f2, (int) f3, new Point());
        iGLMapState.setMapGeoCenter(r1.x, r1.y);
    }
}
