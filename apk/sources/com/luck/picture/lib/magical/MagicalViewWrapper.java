package com.luck.picture.lib.magical;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;

/* JADX INFO: loaded from: classes2.dex */
public class MagicalViewWrapper {
    private final ViewGroup.MarginLayoutParams params;
    private final View viewWrapper;

    public MagicalViewWrapper(View view) {
        this.viewWrapper = view;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.params = marginLayoutParams;
        if (marginLayoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) marginLayoutParams).gravity = GravityCompat.START;
        }
    }

    public int getWidth() {
        return this.params.width;
    }

    public int getHeight() {
        return this.params.height;
    }

    public void setWidth(float f) {
        this.params.width = Math.round(f);
        this.viewWrapper.setLayoutParams(this.params);
    }

    public void setHeight(float f) {
        this.params.height = Math.round(f);
        this.viewWrapper.setLayoutParams(this.params);
    }

    public void setMarginTop(int r2) {
        this.params.topMargin = r2;
        this.viewWrapper.setLayoutParams(this.params);
    }

    public void setMarginBottom(int r2) {
        this.params.bottomMargin = r2;
        this.viewWrapper.setLayoutParams(this.params);
    }

    public int getMarginTop() {
        return this.params.topMargin;
    }

    public void setMarginRight(int r2) {
        this.params.rightMargin = r2;
        this.viewWrapper.setLayoutParams(this.params);
    }

    public void setMarginLeft(int r2) {
        this.params.leftMargin = r2;
        this.viewWrapper.setLayoutParams(this.params);
    }

    public int getMarginRight() {
        return this.params.rightMargin;
    }

    public int getMarginLeft() {
        return this.params.leftMargin;
    }

    public int getMarginBottom() {
        return this.params.bottomMargin;
    }
}
