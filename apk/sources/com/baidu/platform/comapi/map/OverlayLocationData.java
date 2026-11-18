package com.baidu.platform.comapi.map;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes15.dex */
public class OverlayLocationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8618a;
    private String b;
    private Bitmap c;
    private int d;
    private int e;
    private String f;
    private float g;
    private float h;
    private int i;
    private int j;

    public float getArrowSize() {
        return this.h;
    }

    public String getGIFImgPath() {
        return this.f;
    }

    public Bitmap getImage() {
        return this.c;
    }

    public int getImgHeight() {
        return this.e;
    }

    public String getImgName() {
        return this.f8618a;
    }

    public String getImgType() {
        return this.b;
    }

    public int getImgWidth() {
        return this.d;
    }

    public float getMarkerSize() {
        return this.g;
    }

    public int isAnimation() {
        return this.j;
    }

    public int isRotation() {
        return this.i;
    }

    public void setAnimation(int r1) {
        this.j = r1;
    }

    public void setArrowSize(float f) {
        this.h = f;
    }

    public void setGIFImgPath(String str) {
        this.f = str;
    }

    public void setImage(Bitmap bitmap) {
        this.c = bitmap;
    }

    public void setImgHeight(int r1) {
        this.e = r1;
    }

    public void setImgName(String str) {
        this.f8618a = str;
    }

    public void setImgType(String str) {
        this.b = str;
    }

    public void setImgWidth(int r1) {
        this.d = r1;
    }

    public void setMarkerSize(float f) {
        this.g = f;
    }

    public void setRotation(int r1) {
        this.i = r1;
    }
}
