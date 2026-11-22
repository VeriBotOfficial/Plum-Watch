package com.baidu.ar.baidumap;

import android.opengl.EGLContext;
import com.baidu.ar.obr.OBRConfig;

/* loaded from: classes12.dex */
public class MapDuMixParams {

    /* renamed from: a, reason: collision with root package name */
    public String f6820a;
    public double[] b;
    public String c;
    public boolean d = false;
    public EGLContext e = null;
    public OBRConfig f = null;
    public int g;
    public int h;

    public String getBuildingId() {
        return this.c;
    }

    public String getCuid() {
        return this.f6820a;
    }

    public int getHeight() {
        return this.h;
    }

    public double[] getInitGPSInfo() {
        return this.b;
    }

    public OBRConfig getOBRConfig() {
        return this.f;
    }

    public EGLContext getShareContext() {
        return this.e;
    }

    public int getWidth() {
        return this.g;
    }

    public boolean isUseTextureIO() {
        return this.d;
    }

    public void setBuildingId(String str) {
        this.c = str;
    }

    public void setCuid(String str) {
        this.f6820a = str;
    }

    public void setHeight(int i) {
        this.h = i;
    }

    public void setInitGPSInfo(double[] dArr) {
        this.b = dArr;
    }

    public void setOBRConfig(OBRConfig oBRConfig) {
        this.f = oBRConfig;
    }

    public void setShareContext(EGLContext eGLContext) {
        this.e = eGLContext;
    }

    public void setUseTextureIO(boolean z) {
        this.d = z;
    }

    public void setWidth(int i) {
        this.g = i;
    }
}
