package com.baidu.ar;

import android.opengl.EGLContext;
import com.baidu.ar.obr.OBRConfig;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class DefaultParams {

    /* renamed from: a, reason: collision with root package name */
    public String f6730a;
    public String b;
    public String n;
    public boolean o;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public boolean f = true;
    public boolean g = false;
    public EGLContext h = null;
    public String i = null;
    public JSONObject j = null;
    public boolean k = true;
    public boolean l = false;
    public boolean m = true;
    public boolean p = true;

    /* renamed from: q, reason: collision with root package name */
    public String f6731q = "wss://dusee.baidu.com/digitalhuman-ws";
    public String r = "i-kgqiz7g0gv22a";
    public String s = "app_key";
    public OBRConfig t = null;

    public void enableLog(boolean z) {
        this.k = z;
    }

    public String get3dShaderDBPath() {
        return this.n;
    }

    public String getDigitalSocketUrl() {
        return this.f6731q;
    }

    public String getDigitalUnitAppId() {
        return this.r;
    }

    public String getDigitalUnitAppKey() {
        return this.s;
    }

    public String getFaceAlgoModelPath() {
        return this.f6730a;
    }

    public JSONObject getGradingConfig() {
        return this.j;
    }

    public String getMdlAlgoModelPath() {
        return this.b;
    }

    public OBRConfig getOBRConfig() {
        return this.t;
    }

    public String getRenderPipeline() {
        return this.i;
    }

    public EGLContext getShareContext() {
        return this.h;
    }

    public boolean isDigitalArEnable() {
        return this.o;
    }

    public boolean isDigitalSocketEnable() {
        return this.p;
    }

    public boolean isLogEnable() {
        return this.k;
    }

    public boolean isRecordAutoCrop() {
        return this.m;
    }

    public boolean isUseBeautyFilter() {
        return this.d;
    }

    public boolean isUseFaceFilter() {
        return this.e;
    }

    public boolean isUseInputSizeInEngine() {
        return this.c;
    }

    public boolean isUseMakeupFilter() {
        return this.f;
    }

    public boolean isUseTextureIO() {
        return this.g;
    }

    public boolean isUserPlayAudio() {
        return this.l;
    }

    public void set3dShaderPath(String str) {
        this.n = str;
    }

    public void setDigitalArEnable(boolean z) {
        this.o = z;
    }

    public void setDigitalSocketEnable(boolean z) {
        this.p = z;
    }

    public void setDigitalSocketUrl(String str) {
        this.f6731q = str;
    }

    public void setDigitalUnitAppId(String str) {
        this.r = str;
    }

    public void setDigitalUnitAppKey(String str) {
        this.s = str;
    }

    public void setFaceAlgoModelPath(String str) {
        this.f6730a = str;
    }

    public void setGradingConfig(JSONObject jSONObject) {
        this.j = jSONObject;
    }

    public void setMdlAlgoModelPath(String str) {
        this.b = str;
    }

    public void setOBRConfig(OBRConfig oBRConfig) {
        this.t = oBRConfig;
    }

    public void setRecordAutoCrop(boolean z) {
        this.m = z;
    }

    public void setRenderPipeline(String str) {
        this.i = str;
    }

    public void setShareContext(EGLContext eGLContext) {
        this.h = eGLContext;
    }

    public void setUseBeautyFilter(boolean z) {
        this.d = z;
    }

    public void setUseFaceFilter(boolean z) {
        this.e = z;
    }

    public void setUseInputSizeInEngine(boolean z) {
        this.c = z;
    }

    public void setUseMakeupFilter(boolean z) {
        this.f = z;
    }

    public void setUseTextureIO(boolean z) {
        this.g = z;
    }

    public void setUserPlayAudio(boolean z) {
        this.l = z;
    }
}
