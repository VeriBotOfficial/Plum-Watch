package com.baidu.mapapi.bikenavi.model;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes15.dex */
public class IBRouteIconInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f7840a;
    private String b;

    public IBRouteIconInfo(Drawable drawable, String str) {
        this.f7840a = drawable;
        this.b = str;
    }

    public Drawable getIconDrawable() {
        return this.f7840a;
    }

    public String getIconName() {
        return this.b;
    }

    public void setIconDrawable(Drawable drawable) {
        this.f7840a = drawable;
    }

    public void setIconName(String str) {
        this.b = str;
    }
}
