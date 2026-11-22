package com.wakeup.common.network.entity.opts;

import android.gov.nist.core.Separators;
import com.facebook.hermes.intl.Constants;
import com.tencent.open.SocialConstants;
import com.wakeup.howear.rn.api.burypoint.RnBuryPointApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdInfo.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\bF\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003Jû\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001J\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\u0003HÖ\u0001J\t\u0010O\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001d¨\u0006P"}, d2 = {"Lcom/wakeup/common/network/entity/opts/AdInfo;", "", "id", "", "name", "", "advertisingPositionId", "advertisingPositionName", SocialConstants.PARAM_IMG_URL, "platform", "jumpType", "jumpInfo", "extendInfo", "url", RnBuryPointApi.KEY_PAGE_ID, "screenId", "screenName", "countryCodeStr", "productId", "language", "languageId", "applicableVersion", "obsoleteVersion", "onlineTime", "offlineTime", Constants.SORT, "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getAdvertisingPositionId", "getAdvertisingPositionName", "getImg", "getPlatform", "getJumpType", "getJumpInfo", "getExtendInfo", "getUrl", "getPageId", "getScreenId", "getScreenName", "getCountryCodeStr", "getProductId", "getLanguage", "getLanguageId", "getApplicableVersion", "getObsoleteVersion", "getOnlineTime", "getOfflineTime", "getSort", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdInfo {
    private final int advertisingPositionId;
    private final String advertisingPositionName;
    private final int applicableVersion;
    private final String countryCodeStr;
    private final String extendInfo;
    private final int id;
    private final String img;
    private final String jumpInfo;
    private final String jumpType;
    private final String language;
    private final int languageId;
    private final String name;
    private final int obsoleteVersion;
    private final String offlineTime;
    private final String onlineTime;
    private final int pageId;
    private final int platform;
    private final int productId;
    private final int screenId;
    private final String screenName;
    private final int sort;
    private final String url;

    public static /* synthetic */ AdInfo copy$default(AdInfo adInfo, int i, String str, int i2, String str2, String str3, int i3, String str4, String str5, String str6, String str7, int i4, int i5, String str8, String str9, int i6, String str10, int i7, int i8, int i9, String str11, String str12, int i10, int i11, Object obj) {
        int i12;
        String str13;
        int i13 = (i11 & 1) != 0 ? adInfo.id : i;
        String str14 = (i11 & 2) != 0 ? adInfo.name : str;
        int i14 = (i11 & 4) != 0 ? adInfo.advertisingPositionId : i2;
        String str15 = (i11 & 8) != 0 ? adInfo.advertisingPositionName : str2;
        String str16 = (i11 & 16) != 0 ? adInfo.img : str3;
        int i15 = (i11 & 32) != 0 ? adInfo.platform : i3;
        String str17 = (i11 & 64) != 0 ? adInfo.jumpType : str4;
        String str18 = (i11 & 128) != 0 ? adInfo.jumpInfo : str5;
        String str19 = (i11 & 256) != 0 ? adInfo.extendInfo : str6;
        String str20 = (i11 & 512) != 0 ? adInfo.url : str7;
        int i16 = (i11 & 1024) != 0 ? adInfo.pageId : i4;
        int i17 = (i11 & 2048) != 0 ? adInfo.screenId : i5;
        String str21 = (i11 & 4096) != 0 ? adInfo.screenName : str8;
        String str22 = (i11 & 8192) != 0 ? adInfo.countryCodeStr : str9;
        int i18 = i13;
        int i19 = (i11 & 16384) != 0 ? adInfo.productId : i6;
        String str23 = (i11 & 32768) != 0 ? adInfo.language : str10;
        int i20 = (i11 & 65536) != 0 ? adInfo.languageId : i7;
        int i21 = (i11 & 131072) != 0 ? adInfo.applicableVersion : i8;
        int i22 = (i11 & 262144) != 0 ? adInfo.obsoleteVersion : i9;
        String str24 = (i11 & 524288) != 0 ? adInfo.onlineTime : str11;
        String str25 = (i11 & 1048576) != 0 ? adInfo.offlineTime : str12;
        if ((i11 & 2097152) != 0) {
            str13 = str25;
            i12 = adInfo.sort;
        } else {
            i12 = i10;
            str13 = str25;
        }
        return adInfo.copy(i18, str14, i14, str15, str16, i15, str17, str18, str19, str20, i16, i17, str21, str22, i19, str23, i20, i21, i22, str24, str13, i12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component11, reason: from getter */
    public final int getPageId() {
        return this.pageId;
    }

    /* renamed from: component12, reason: from getter */
    public final int getScreenId() {
        return this.screenId;
    }

    /* renamed from: component13, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    /* renamed from: component14, reason: from getter */
    public final String getCountryCodeStr() {
        return this.countryCodeStr;
    }

    /* renamed from: component15, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    /* renamed from: component16, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component17, reason: from getter */
    public final int getLanguageId() {
        return this.languageId;
    }

    /* renamed from: component18, reason: from getter */
    public final int getApplicableVersion() {
        return this.applicableVersion;
    }

    /* renamed from: component19, reason: from getter */
    public final int getObsoleteVersion() {
        return this.obsoleteVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component20, reason: from getter */
    public final String getOnlineTime() {
        return this.onlineTime;
    }

    /* renamed from: component21, reason: from getter */
    public final String getOfflineTime() {
        return this.offlineTime;
    }

    /* renamed from: component22, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAdvertisingPositionId() {
        return this.advertisingPositionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAdvertisingPositionName() {
        return this.advertisingPositionName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPlatform() {
        return this.platform;
    }

    /* renamed from: component7, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getJumpInfo() {
        return this.jumpInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final String getExtendInfo() {
        return this.extendInfo;
    }

    public final AdInfo copy(int id2, String name, int advertisingPositionId, String advertisingPositionName, String img, int platform, String jumpType, String jumpInfo, String extendInfo, String url, int pageId, int screenId, String screenName, String countryCodeStr, int productId, String language, int languageId, int applicableVersion, int obsoleteVersion, String onlineTime, String offlineTime, int sort) {
        Intrinsics.checkNotNullParameter(countryCodeStr, "countryCodeStr");
        return new AdInfo(id2, name, advertisingPositionId, advertisingPositionName, img, platform, jumpType, jumpInfo, extendInfo, url, pageId, screenId, screenName, countryCodeStr, productId, language, languageId, applicableVersion, obsoleteVersion, onlineTime, offlineTime, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdInfo)) {
            return false;
        }
        AdInfo adInfo = (AdInfo) other;
        return this.id == adInfo.id && Intrinsics.areEqual(this.name, adInfo.name) && this.advertisingPositionId == adInfo.advertisingPositionId && Intrinsics.areEqual(this.advertisingPositionName, adInfo.advertisingPositionName) && Intrinsics.areEqual(this.img, adInfo.img) && this.platform == adInfo.platform && Intrinsics.areEqual(this.jumpType, adInfo.jumpType) && Intrinsics.areEqual(this.jumpInfo, adInfo.jumpInfo) && Intrinsics.areEqual(this.extendInfo, adInfo.extendInfo) && Intrinsics.areEqual(this.url, adInfo.url) && this.pageId == adInfo.pageId && this.screenId == adInfo.screenId && Intrinsics.areEqual(this.screenName, adInfo.screenName) && Intrinsics.areEqual(this.countryCodeStr, adInfo.countryCodeStr) && this.productId == adInfo.productId && Intrinsics.areEqual(this.language, adInfo.language) && this.languageId == adInfo.languageId && this.applicableVersion == adInfo.applicableVersion && this.obsoleteVersion == adInfo.obsoleteVersion && Intrinsics.areEqual(this.onlineTime, adInfo.onlineTime) && Intrinsics.areEqual(this.offlineTime, adInfo.offlineTime) && this.sort == adInfo.sort;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.advertisingPositionId)) * 31;
        String str2 = this.advertisingPositionName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.img;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.platform)) * 31;
        String str4 = this.jumpType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpInfo;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.extendInfo;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.url;
        int hashCode8 = (((((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Integer.hashCode(this.pageId)) * 31) + Integer.hashCode(this.screenId)) * 31;
        String str8 = this.screenName;
        int hashCode9 = (((((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.countryCodeStr.hashCode()) * 31) + Integer.hashCode(this.productId)) * 31;
        String str9 = this.language;
        int hashCode10 = (((((((hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31) + Integer.hashCode(this.languageId)) * 31) + Integer.hashCode(this.applicableVersion)) * 31) + Integer.hashCode(this.obsoleteVersion)) * 31;
        String str10 = this.onlineTime;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.offlineTime;
        return ((hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31) + Integer.hashCode(this.sort);
    }

    public String toString() {
        return "AdInfo(id=" + this.id + ", name=" + this.name + ", advertisingPositionId=" + this.advertisingPositionId + ", advertisingPositionName=" + this.advertisingPositionName + ", img=" + this.img + ", platform=" + this.platform + ", jumpType=" + this.jumpType + ", jumpInfo=" + this.jumpInfo + ", extendInfo=" + this.extendInfo + ", url=" + this.url + ", pageId=" + this.pageId + ", screenId=" + this.screenId + ", screenName=" + this.screenName + ", countryCodeStr=" + this.countryCodeStr + ", productId=" + this.productId + ", language=" + this.language + ", languageId=" + this.languageId + ", applicableVersion=" + this.applicableVersion + ", obsoleteVersion=" + this.obsoleteVersion + ", onlineTime=" + this.onlineTime + ", offlineTime=" + this.offlineTime + ", sort=" + this.sort + Separators.RPAREN;
    }

    public AdInfo(int i, String str, int i2, String str2, String str3, int i3, String str4, String str5, String str6, String str7, int i4, int i5, String str8, String countryCodeStr, int i6, String str9, int i7, int i8, int i9, String str10, String str11, int i10) {
        Intrinsics.checkNotNullParameter(countryCodeStr, "countryCodeStr");
        this.id = i;
        this.name = str;
        this.advertisingPositionId = i2;
        this.advertisingPositionName = str2;
        this.img = str3;
        this.platform = i3;
        this.jumpType = str4;
        this.jumpInfo = str5;
        this.extendInfo = str6;
        this.url = str7;
        this.pageId = i4;
        this.screenId = i5;
        this.screenName = str8;
        this.countryCodeStr = countryCodeStr;
        this.productId = i6;
        this.language = str9;
        this.languageId = i7;
        this.applicableVersion = i8;
        this.obsoleteVersion = i9;
        this.onlineTime = str10;
        this.offlineTime = str11;
        this.sort = i10;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getAdvertisingPositionId() {
        return this.advertisingPositionId;
    }

    public final String getAdvertisingPositionName() {
        return this.advertisingPositionName;
    }

    public final String getImg() {
        return this.img;
    }

    public final int getPlatform() {
        return this.platform;
    }

    public final String getJumpType() {
        return this.jumpType;
    }

    public final String getJumpInfo() {
        return this.jumpInfo;
    }

    public final String getExtendInfo() {
        return this.extendInfo;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getPageId() {
        return this.pageId;
    }

    public final int getScreenId() {
        return this.screenId;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public final String getCountryCodeStr() {
        return this.countryCodeStr;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final int getLanguageId() {
        return this.languageId;
    }

    public final int getApplicableVersion() {
        return this.applicableVersion;
    }

    public final int getObsoleteVersion() {
        return this.obsoleteVersion;
    }

    public final String getOnlineTime() {
        return this.onlineTime;
    }

    public final String getOfflineTime() {
        return this.offlineTime;
    }

    public final int getSort() {
        return this.sort;
    }
}
