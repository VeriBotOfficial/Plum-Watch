package com.baidu.ar;

import android.graphics.SurfaceTexture;

/* loaded from: classes12.dex */
public class DuMixSource {

    /* renamed from: a, reason: collision with root package name */
    public String f6743a;
    public int b;
    public String c;
    public double[] d;
    public String e;
    public boolean f;
    public SurfaceTexture g;
    public int h;
    public int i;
    public boolean j;
    public BusinessType k;

    public DuMixSource(SurfaceTexture surfaceTexture, int i, int i2) {
        this(surfaceTexture, i, i2, BusinessType.CAMEXP);
    }

    public DuMixSource(SurfaceTexture surfaceTexture, int i, int i2, BusinessType businessType) {
        this.b = -1;
        this.c = "";
        this.f = false;
        this.h = 0;
        this.i = 0;
        this.j = true;
        BusinessType businessType2 = BusinessType.CAMEXP;
        this.g = surfaceTexture;
        this.h = i;
        this.i = i2;
        this.k = businessType;
    }

    public DuMixSource(DuMixSource duMixSource) {
        this.b = -1;
        this.c = "";
        this.f = false;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.k = BusinessType.CAMEXP;
        this.f6743a = duMixSource.getArKey();
        this.b = duMixSource.getArType();
        this.c = duMixSource.getResFilePath();
        this.g = duMixSource.getCameraSource();
        this.h = duMixSource.getSourceWidth();
        this.i = duMixSource.getSourceHeight();
        this.d = duMixSource.getGPSInfo();
        this.j = duMixSource.isNeedDrawBackground();
        this.k = duMixSource.k;
    }

    public String getArKey() {
        return this.f6743a;
    }

    public int getArType() {
        return this.b;
    }

    public String getBaiduMapCuid() {
        return this.e;
    }

    public BusinessType getBusinessType() {
        return this.k;
    }

    public SurfaceTexture getCameraSource() {
        return this.g;
    }

    public double[] getGPSInfo() {
        return this.d;
    }

    public String getResFilePath() {
        return this.c;
    }

    public int getSourceHeight() {
        return this.i;
    }

    public int getSourceWidth() {
        return this.h;
    }

    public boolean isFrontCamera() {
        return this.f;
    }

    public boolean isNeedDrawBackground() {
        return this.j;
    }

    public void setArKey(String str) {
        this.f6743a = str;
    }

    public void setArType(int i) {
        this.b = i;
    }

    public void setBaiduMapCuid(String str) {
        this.e = str;
    }

    public void setCameraSource(SurfaceTexture surfaceTexture) {
        this.g = surfaceTexture;
    }

    public void setFrontCamera(boolean z) {
        this.f = z;
    }

    public void setGPSInfo(double[] dArr) {
        this.d = dArr;
    }

    public void setNeedDrawBackground(boolean z) {
        this.j = z;
    }

    public void setResFilePath(String str) {
        this.c = str;
    }

    public void setSourceHeight(int i) {
        this.i = i;
    }

    public void setSourceWidth(int i) {
        this.h = i;
    }
}
