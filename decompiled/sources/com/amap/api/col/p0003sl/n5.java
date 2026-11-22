package com.amap.api.col.p0003sl;

import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.BaseOverlay;
import java.lang.ref.WeakReference;

/* compiled from: ContourLineOverlay.java */
/* loaded from: classes11.dex */
public class n5 extends BaseOverlay {
    public n5(IGlOverlayLayer iGlOverlayLayer, m5 m5Var, String str) {
        super(str);
        new WeakReference(iGlOverlayLayer);
    }
}
