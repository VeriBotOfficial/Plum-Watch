package com.applovin.impl;

import android.gov.nist.core.Separators;
import com.applovin.sdk.AppLovinSdkConfiguration;

/* loaded from: classes12.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography f6300a;

    public k0(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.f6300a = consentFlowUserGeography;
    }

    protected boolean a(Object obj) {
        return obj instanceof k0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (!k0Var.a(this)) {
            return false;
        }
        AppLovinSdkConfiguration.ConsentFlowUserGeography a2 = a();
        AppLovinSdkConfiguration.ConsentFlowUserGeography a3 = k0Var.a();
        return a2 != null ? a2.equals(a3) : a3 == null;
    }

    public int hashCode() {
        AppLovinSdkConfiguration.ConsentFlowUserGeography a2 = a();
        return (a2 == null ? 43 : a2.hashCode()) + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + a() + Separators.RPAREN;
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography a() {
        return this.f6300a;
    }
}
