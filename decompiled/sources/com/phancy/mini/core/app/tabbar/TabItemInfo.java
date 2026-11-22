package com.phancy.mini.core.app.tabbar;

import kotlin.Metadata;

/* compiled from: TabItemInfo.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/phancy/mini/core/app/tabbar/TabItemInfo;", "", "()V", "color", "", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "iconPath", "getIconPath", "setIconPath", "pagePath", "getPagePath", "setPagePath", "selectedColor", "getSelectedColor", "setSelectedColor", "selectedIconPath", "getSelectedIconPath", "setSelectedIconPath", "text", "getText", "setText", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TabItemInfo {
    private String color;
    private String iconPath;
    private String pagePath;
    private String selectedColor;
    private String selectedIconPath;
    private String text;

    public final String getColor() {
        return this.color;
    }

    public final void setColor(String str) {
        this.color = str;
    }

    public final String getSelectedColor() {
        return this.selectedColor;
    }

    public final void setSelectedColor(String str) {
        this.selectedColor = str;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public final void setIconPath(String str) {
        this.iconPath = str;
    }

    public final String getSelectedIconPath() {
        return this.selectedIconPath;
    }

    public final void setSelectedIconPath(String str) {
        this.selectedIconPath = str;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final String getPagePath() {
        return this.pagePath;
    }

    public final void setPagePath(String str) {
        this.pagePath = str;
    }
}
