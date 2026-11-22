package com.xmly.businesssdk.network.bean;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.xmly.businesssdk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pay.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/xmly/businesssdk/network/bean/PayParam;", "", "url", "", "params", ParameterNames.COOKIE, "isGetMethod", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCookie", "()Ljava/lang/String;", "()Z", "getParams", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PayParam {
    private final String cookie;
    private final boolean isGetMethod;
    private final String params;
    private final String url;

    public PayParam() {
        this(null, null, null, false, 15, null);
    }

    public PayParam(String str, String str2, String str3, boolean z) {
        this.url = str;
        this.params = str2;
        this.cookie = str3;
        this.isGetMethod = z;
    }

    public static /* synthetic */ PayParam copy$default(PayParam payParam, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payParam.url;
        }
        if ((i & 2) != 0) {
            str2 = payParam.params;
        }
        if ((i & 4) != 0) {
            str3 = payParam.cookie;
        }
        if ((i & 8) != 0) {
            z = payParam.isGetMethod;
        }
        return payParam.copy(str, str2, str3, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getParams() {
        return this.params;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCookie() {
        return this.cookie;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsGetMethod() {
        return this.isGetMethod;
    }

    public final PayParam copy(String url, String params, String cookie, boolean isGetMethod) {
        return new PayParam(url, params, cookie, isGetMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayParam)) {
            return false;
        }
        PayParam payParam = (PayParam) other;
        return Intrinsics.areEqual(this.url, payParam.url) && Intrinsics.areEqual(this.params, payParam.params) && Intrinsics.areEqual(this.cookie, payParam.cookie) && this.isGetMethod == payParam.isGetMethod;
    }

    public final String getCookie() {
        return this.cookie;
    }

    public final String getParams() {
        return this.params;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.params;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cookie;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isGetMethod;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public final boolean isGetMethod() {
        return this.isGetMethod;
    }

    public String toString() {
        return c.a("PayParam(url=").append(this.url).append(", params=").append(this.params).append(", cookie=").append(this.cookie).append(", isGetMethod=").append(this.isGetMethod).append(')').toString();
    }

    public /* synthetic */ PayParam(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? true : z);
    }
}
