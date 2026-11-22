package com.applovin.impl.privacy.cmp;

import android.gov.nist.core.Separators;
import com.applovin.sdk.AppLovinCmpError;

/* loaded from: classes12.dex */
public class CmpErrorImpl implements AppLovinCmpError {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinCmpError.Code f6419a;
    private final String b;
    private final int c;
    private final String d;

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, "");
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.c;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getCmpMessage() {
        return this.d;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public AppLovinCmpError.Code getCode() {
        return this.f6419a;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getMessage() {
        return this.b;
    }

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + Separators.RPAREN;
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i, String str2) {
        this.f6419a = code;
        this.b = str;
        this.c = i;
        this.d = str2;
    }
}
