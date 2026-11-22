package com.baidu.ar;

import com.baidu.ar.recg.IOnDeviceIRResult;

/* loaded from: classes12.dex */
public class va implements IOnDeviceIRResult {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7258a;
    public String b;
    public int c;
    public String d;

    @Override // com.baidu.ar.recg.IOnDeviceIRResult
    public String getARKey() {
        return this.b;
    }

    @Override // com.baidu.ar.recg.IOnDeviceIRResult
    public int getARType() {
        return this.c;
    }

    @Override // com.baidu.ar.recg.IOnDeviceIRResult
    public String getMessage() {
        return this.d;
    }

    @Override // com.baidu.ar.recg.IOnDeviceIRResult
    public boolean isSuccess() {
        return this.f7258a;
    }
}
