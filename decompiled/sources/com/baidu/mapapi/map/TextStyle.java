package com.baidu.mapapi.map;

import android.graphics.Typeface;
import com.baidu.platform.comapi.bmsdk.style.BmTextStyle;

/* loaded from: classes13.dex */
public class TextStyle {

    /* renamed from: a, reason: collision with root package name */
    private BmTextStyle f7993a;

    public TextStyle() {
        if (!OverlayUtil.isOverlayUpgrade()) {
            throw new NullPointerException("BDMapSDKException: TextStyle must be used in Overlay2.0");
        }
        this.f7993a = new BmTextStyle();
    }

    public BmTextStyle getBmTextStyle() {
        return this.f7993a;
    }

    public void setBorderColor(int i) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f7993a.a(i);
        }
    }

    public void setBorderWidth(int i) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f7993a.b(i);
        }
    }

    public void setFontOption(Typeface typeface) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f7993a.c(typeface.getStyle());
        }
    }

    public void setTextColor(int i) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f7993a.d(i);
        }
    }

    public void setTextSize(int i) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f7993a.e(i);
        }
    }
}
