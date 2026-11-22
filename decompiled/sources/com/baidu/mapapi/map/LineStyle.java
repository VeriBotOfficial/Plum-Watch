package com.baidu.mapapi.map;

import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyle;

/* loaded from: classes13.dex */
public class LineStyle {

    /* renamed from: a, reason: collision with root package name */
    BmLineStyle f7927a;
    int b;
    int c;
    TextureOption d;

    public LineStyle() {
        if (!OverlayUtil.isOverlayUpgrade()) {
            throw new NullPointerException("BDMapSDKException: LineStyle must be used in Overlay2.0");
        }
        this.f7927a = new BmLineStyle();
    }

    public void setBitmapResource(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null && OverlayUtil.isOverlayUpgrade()) {
            this.f7927a.a(new BmBitmapResource(bitmapDescriptor.getBitmap()));
        }
    }

    public void setColor(int i) {
        this.b = i;
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f7927a.a(i);
        }
    }

    public void setTextureOption(TextureOption textureOption) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.d = textureOption;
            this.f7927a.c(textureOption.ordinal());
        }
    }

    public void setWidth(int i) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.c = i / 2;
            this.f7927a.a(i);
        }
    }
}
