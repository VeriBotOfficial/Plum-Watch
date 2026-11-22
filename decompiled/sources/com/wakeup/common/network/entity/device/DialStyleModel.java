package com.wakeup.common.network.entity.device;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class DialStyleModel implements Serializable {
    private String color;
    private int font;

    /* renamed from: id, reason: collision with root package name */
    private int f14202id;
    private String imgUrl;
    private boolean isSelect;
    private int sourceType;

    public int getId() {
        return this.f14202id;
    }

    public void setId(int id2) {
        this.f14202id = id2;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public int getFont() {
        return this.font;
    }

    public void setFont(int font) {
        this.font = font;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setSelect(boolean select) {
        this.isSelect = select;
    }
}
