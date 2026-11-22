package com.monetization.ads.quality.base.model.configuration;

import android.gov.nist.core.Separators;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yandex.mobile.ads.impl.v3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0001HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0003Jy\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerificationAdConfiguration;", "", "verifiableAdNetwork", "Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifiableNetwork;", HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID, "", "adObject", "adType", "Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifierAdType;", "adContent", "adNetworkUnitId", "mediationId", "adNetworkCreativeId", "extraData", "", "(Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifiableNetwork;Ljava/lang/String;Ljava/lang/Object;Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifierAdType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAdContent", "()Ljava/lang/String;", "getAdNetworkCreativeId", "getAdNetworkUnitId", "getAdObject", "()Ljava/lang/Object;", "getAdType", "()Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifierAdType;", "getAdUnitId", "getExtraData", "()Ljava/util/Map;", "getMediationId", "getVerifiableAdNetwork", "()Lcom/monetization/ads/quality/base/model/configuration/AdQualityVerifiableNetwork;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdQualityVerificationAdConfiguration {
    private final String adContent;
    private final String adNetworkCreativeId;
    private final String adNetworkUnitId;
    private final Object adObject;
    private final AdQualityVerifierAdType adType;
    private final String adUnitId;
    private final Map<String, Object> extraData;
    private final String mediationId;
    private final AdQualityVerifiableNetwork verifiableAdNetwork;

    public AdQualityVerificationAdConfiguration(AdQualityVerifiableNetwork verifiableAdNetwork, String adUnitId, Object adObject, AdQualityVerifierAdType adType, String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(verifiableAdNetwork, "verifiableAdNetwork");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.verifiableAdNetwork = verifiableAdNetwork;
        this.adUnitId = adUnitId;
        this.adObject = adObject;
        this.adType = adType;
        this.adContent = str;
        this.adNetworkUnitId = str2;
        this.mediationId = str3;
        this.adNetworkCreativeId = str4;
        this.extraData = map;
    }

    public static /* synthetic */ AdQualityVerificationAdConfiguration copy$default(AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, AdQualityVerifiableNetwork adQualityVerifiableNetwork, String str, Object obj, AdQualityVerifierAdType adQualityVerifierAdType, String str2, String str3, String str4, String str5, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            adQualityVerifiableNetwork = adQualityVerificationAdConfiguration.verifiableAdNetwork;
        }
        if ((i & 2) != 0) {
            str = adQualityVerificationAdConfiguration.adUnitId;
        }
        if ((i & 4) != 0) {
            obj = adQualityVerificationAdConfiguration.adObject;
        }
        if ((i & 8) != 0) {
            adQualityVerifierAdType = adQualityVerificationAdConfiguration.adType;
        }
        if ((i & 16) != 0) {
            str2 = adQualityVerificationAdConfiguration.adContent;
        }
        if ((i & 32) != 0) {
            str3 = adQualityVerificationAdConfiguration.adNetworkUnitId;
        }
        if ((i & 64) != 0) {
            str4 = adQualityVerificationAdConfiguration.mediationId;
        }
        if ((i & 128) != 0) {
            str5 = adQualityVerificationAdConfiguration.adNetworkCreativeId;
        }
        if ((i & 256) != 0) {
            map = adQualityVerificationAdConfiguration.extraData;
        }
        String str6 = str5;
        Map map2 = map;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        Object obj3 = obj;
        return adQualityVerificationAdConfiguration.copy(adQualityVerifiableNetwork, str, obj3, adQualityVerifierAdType, str9, str7, str8, str6, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final AdQualityVerifiableNetwork getVerifiableAdNetwork() {
        return this.verifiableAdNetwork;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getAdObject() {
        return this.adObject;
    }

    /* renamed from: component4, reason: from getter */
    public final AdQualityVerifierAdType getAdType() {
        return this.adType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAdContent() {
        return this.adContent;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAdNetworkUnitId() {
        return this.adNetworkUnitId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMediationId() {
        return this.mediationId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAdNetworkCreativeId() {
        return this.adNetworkCreativeId;
    }

    public final Map<String, Object> component9() {
        return this.extraData;
    }

    public final AdQualityVerificationAdConfiguration copy(AdQualityVerifiableNetwork verifiableAdNetwork, String adUnitId, Object adObject, AdQualityVerifierAdType adType, String adContent, String adNetworkUnitId, String mediationId, String adNetworkCreativeId, Map<String, ? extends Object> extraData) {
        Intrinsics.checkNotNullParameter(verifiableAdNetwork, "verifiableAdNetwork");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(adType, "adType");
        return new AdQualityVerificationAdConfiguration(verifiableAdNetwork, adUnitId, adObject, adType, adContent, adNetworkUnitId, mediationId, adNetworkCreativeId, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdQualityVerificationAdConfiguration)) {
            return false;
        }
        AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration = (AdQualityVerificationAdConfiguration) other;
        return this.verifiableAdNetwork == adQualityVerificationAdConfiguration.verifiableAdNetwork && Intrinsics.areEqual(this.adUnitId, adQualityVerificationAdConfiguration.adUnitId) && Intrinsics.areEqual(this.adObject, adQualityVerificationAdConfiguration.adObject) && this.adType == adQualityVerificationAdConfiguration.adType && Intrinsics.areEqual(this.adContent, adQualityVerificationAdConfiguration.adContent) && Intrinsics.areEqual(this.adNetworkUnitId, adQualityVerificationAdConfiguration.adNetworkUnitId) && Intrinsics.areEqual(this.mediationId, adQualityVerificationAdConfiguration.mediationId) && Intrinsics.areEqual(this.adNetworkCreativeId, adQualityVerificationAdConfiguration.adNetworkCreativeId) && Intrinsics.areEqual(this.extraData, adQualityVerificationAdConfiguration.extraData);
    }

    public final String getAdContent() {
        return this.adContent;
    }

    public final String getAdNetworkCreativeId() {
        return this.adNetworkCreativeId;
    }

    public final String getAdNetworkUnitId() {
        return this.adNetworkUnitId;
    }

    public final Object getAdObject() {
        return this.adObject;
    }

    public final AdQualityVerifierAdType getAdType() {
        return this.adType;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getMediationId() {
        return this.mediationId;
    }

    public final AdQualityVerifiableNetwork getVerifiableAdNetwork() {
        return this.verifiableAdNetwork;
    }

    public int hashCode() {
        int hashCode = (this.adType.hashCode() + ((this.adObject.hashCode() + v3.a(this.adUnitId, this.verifiableAdNetwork.hashCode() * 31, 31)) * 31)) * 31;
        String str = this.adContent;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.adNetworkUnitId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mediationId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adNetworkCreativeId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, Object> map = this.extraData;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "AdQualityVerificationAdConfiguration(verifiableAdNetwork=" + this.verifiableAdNetwork + ", adUnitId=" + this.adUnitId + ", adObject=" + this.adObject + ", adType=" + this.adType + ", adContent=" + this.adContent + ", adNetworkUnitId=" + this.adNetworkUnitId + ", mediationId=" + this.mediationId + ", adNetworkCreativeId=" + this.adNetworkCreativeId + ", extraData=" + this.extraData + Separators.RPAREN;
    }

    public /* synthetic */ AdQualityVerificationAdConfiguration(AdQualityVerifiableNetwork adQualityVerifiableNetwork, String str, Object obj, AdQualityVerifierAdType adQualityVerifierAdType, String str2, String str3, String str4, String str5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adQualityVerifiableNetwork, str, obj, adQualityVerifierAdType, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : map);
    }
}
