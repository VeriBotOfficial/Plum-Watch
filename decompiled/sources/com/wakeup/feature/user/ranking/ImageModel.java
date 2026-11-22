package com.wakeup.feature.user.ranking;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class ImageModel implements Serializable {
    private int height;
    private String path;
    private int width;

    public ImageModel(String str, int i, int i2) {
        this.path = str;
        this.width = i;
        this.height = i2;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int i) {
        this.height = i;
    }
}
