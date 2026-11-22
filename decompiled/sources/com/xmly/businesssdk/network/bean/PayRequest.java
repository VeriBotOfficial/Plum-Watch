package com.xmly.businesssdk.network.bean;

import com.xmly.businesssdk.config.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pay.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/xmly/businesssdk/network/bean/PayRequest;", "", "url", "", "postParams", "payType", "payContent", "albumId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlbumId", "()Ljava/lang/String;", "getPayContent", "getPayType", "getPostParams", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PayRequest {
    private final String albumId;
    private final String payContent;
    private final String payType;
    private final String postParams;
    private final String url;

    public PayRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public PayRequest(String str, String str2, String str3, String str4, String str5) {
        this.url = str;
        this.postParams = str2;
        this.payType = str3;
        this.payContent = str4;
        this.albumId = str5;
    }

    public static /* synthetic */ PayRequest copy$default(PayRequest payRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payRequest.url;
        }
        if ((i & 2) != 0) {
            str2 = payRequest.postParams;
        }
        if ((i & 4) != 0) {
            str3 = payRequest.payType;
        }
        if ((i & 8) != 0) {
            str4 = payRequest.payContent;
        }
        if ((i & 16) != 0) {
            str5 = payRequest.albumId;
        }
        String str6 = str5;
        String str7 = str3;
        return payRequest.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPostParams() {
        return this.postParams;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPayType() {
        return this.payType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPayContent() {
        return this.payContent;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAlbumId() {
        return this.albumId;
    }

    public final PayRequest copy(String url, String postParams, String payType, String payContent, String albumId) {
        return new PayRequest(url, postParams, payType, payContent, albumId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayRequest)) {
            return false;
        }
        PayRequest payRequest = (PayRequest) other;
        return Intrinsics.areEqual(this.url, payRequest.url) && Intrinsics.areEqual(this.postParams, payRequest.postParams) && Intrinsics.areEqual(this.payType, payRequest.payType) && Intrinsics.areEqual(this.payContent, payRequest.payContent) && Intrinsics.areEqual(this.albumId, payRequest.albumId);
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final String getPayContent() {
        return this.payContent;
    }

    public final String getPayType() {
        return this.payType;
    }

    public final String getPostParams() {
        return this.postParams;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.postParams;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.payContent;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.albumId;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("PayRequest(url=").append(this.url).append(", postParams=").append(this.postParams).append(", payType=").append(this.payType).append(", payContent=").append(this.payContent).append(", albumId="), this.albumId, ')');
    }

    public /* synthetic */ PayRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
