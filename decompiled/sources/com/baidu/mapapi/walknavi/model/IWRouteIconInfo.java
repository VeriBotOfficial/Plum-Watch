package com.baidu.mapapi.walknavi.model;

import android.graphics.drawable.Drawable;

/* loaded from: classes13.dex */
public class IWRouteIconInfo {

    /* renamed from: a, reason: collision with root package name */
    private Drawable f8224a;
    private String b;

    public IWRouteIconInfo(Drawable drawable, String str) {
        this.f8224a = drawable;
        this.b = str;
    }

    public Drawable getIconDrawable() {
        return this.f8224a;
    }

    public String getIconName() {
        return this.b;
    }

    public void setIconDrawable(Drawable drawable) {
        this.f8224a = drawable;
    }

    public void setIconName(String str) {
        this.b = str;
    }
}
