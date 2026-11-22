package com.baidu.ar;

import com.baidu.ar.cloud.ICloudIRResult;

/* loaded from: classes12.dex */
public class h2 implements ICloudIRResult {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6957a;
    public String b;
    public int c;
    public String d;

    @Override // com.baidu.ar.cloud.ICloudIRResult
    public String getARKey() {
        return this.b;
    }

    @Override // com.baidu.ar.cloud.ICloudIRResult
    public int getARType() {
        return this.c;
    }

    @Override // com.baidu.ar.cloud.ICloudIRResult
    public String getMessage() {
        return this.d;
    }

    @Override // com.baidu.ar.cloud.ICloudIRResult
    public boolean isSuccess() {
        return this.f6957a;
    }
}
