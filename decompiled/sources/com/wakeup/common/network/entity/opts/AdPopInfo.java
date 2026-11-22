package com.wakeup.common.network.entity.opts;

import android.gov.nist.core.Separators;
import com.facebook.hermes.intl.Constants;
import com.tencent.open.SocialConstants;
import com.wakeup.howear.rn.api.burypoint.RnBuryPointApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdInfo.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\bR\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bó\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J©\u0002\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u0003HÆ\u0001J\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020\u0003HÖ\u0001J\t\u0010[\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!¨\u0006\\"}, d2 = {"Lcom/wakeup/common/network/entity/opts/AdPopInfo;", "", "id", "", "advName", "", "advPopupPositionId", "advPopupPositionName", "title", "introduce", SocialConstants.PARAM_IMG_URL, "platform", "jumpType", "jumpInfo", "url", RnBuryPointApi.KEY_PAGE_ID, "screenId", "screenName", "extendInfo", "countryCodeStr", "productId", "popFrequency", "popCount", "language", "languageId", "applicableVersion", "obsoleteVersion", "onlineTime", "offlineTime", Constants.SORT, "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "getAdvName", "()Ljava/lang/String;", "getAdvPopupPositionId", "getAdvPopupPositionName", "getTitle", "getIntroduce", "getImg", "getPlatform", "getJumpType", "getJumpInfo", "getUrl", "getPageId", "getScreenId", "getScreenName", "getExtendInfo", "getCountryCodeStr", "getProductId", "getPopFrequency", "getPopCount", "getLanguage", "getLanguageId", "getApplicableVersion", "getObsoleteVersion", "getOnlineTime", "getOfflineTime", "getSort", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdPopInfo {
    private final String advName;
    private final int advPopupPositionId;
    private final String advPopupPositionName;
    private final int applicableVersion;
    private final String countryCodeStr;
    private final String extendInfo;
    private final int id;
    private final String img;
    private final String introduce;
    private final String jumpInfo;
    private final String jumpType;
    private final String language;
    private final int languageId;
    private final int obsoleteVersion;
    private final String offlineTime;
    private final String onlineTime;
    private final int pageId;
    private final int platform;
    private final int popCount;
    private final int popFrequency;
    private final int productId;
    private final int screenId;
    private final String screenName;
    private final int sort;
    private final String title;
    private final String url;

    public static /* synthetic */ AdPopInfo copy$default(AdPopInfo adPopInfo, int i, String str, int i2, String str2, String str3, String str4, String str5, int i3, String str6, String str7, String str8, int i4, int i5, String str9, String str10, String str11, int i6, int i7, int i8, String str12, int i9, int i10, int i11, String str13, String str14, int i12, int i13, Object obj) {
        int i14;
        String str15;
        int i15 = (i13 & 1) != 0 ? adPopInfo.id : i;
        String str16 = (i13 & 2) != 0 ? adPopInfo.advName : str;
        int i16 = (i13 & 4) != 0 ? adPopInfo.advPopupPositionId : i2;
        String str17 = (i13 & 8) != 0 ? adPopInfo.advPopupPositionName : str2;
        String str18 = (i13 & 16) != 0 ? adPopInfo.title : str3;
        String str19 = (i13 & 32) != 0 ? adPopInfo.introduce : str4;
        String str20 = (i13 & 64) != 0 ? adPopInfo.img : str5;
        int i17 = (i13 & 128) != 0 ? adPopInfo.platform : i3;
        String str21 = (i13 & 256) != 0 ? adPopInfo.jumpType : str6;
        String str22 = (i13 & 512) != 0 ? adPopInfo.jumpInfo : str7;
        String str23 = (i13 & 1024) != 0 ? adPopInfo.url : str8;
        int i18 = (i13 & 2048) != 0 ? adPopInfo.pageId : i4;
        int i19 = (i13 & 4096) != 0 ? adPopInfo.screenId : i5;
        String str24 = (i13 & 8192) != 0 ? adPopInfo.screenName : str9;
        int i20 = i15;
        String str25 = (i13 & 16384) != 0 ? adPopInfo.extendInfo : str10;
        String str26 = (i13 & 32768) != 0 ? adPopInfo.countryCodeStr : str11;
        int i21 = (i13 & 65536) != 0 ? adPopInfo.productId : i6;
        int i22 = (i13 & 131072) != 0 ? adPopInfo.popFrequency : i7;
        int i23 = (i13 & 262144) != 0 ? adPopInfo.popCount : i8;
        String str27 = (i13 & 524288) != 0 ? adPopInfo.language : str12;
        int i24 = (i13 & 1048576) != 0 ? adPopInfo.languageId : i9;
        int i25 = (i13 & 2097152) != 0 ? adPopInfo.applicableVersion : i10;
        int i26 = (i13 & 4194304) != 0 ? adPopInfo.obsoleteVersion : i11;
        String str28 = (i13 & 8388608) != 0 ? adPopInfo.onlineTime : str13;
        String str29 = (i13 & 16777216) != 0 ? adPopInfo.offlineTime : str14;
        if ((i13 & 33554432) != 0) {
            str15 = str29;
            i14 = adPopInfo.sort;
        } else {
            i14 = i12;
            str15 = str29;
        }
        return adPopInfo.copy(i20, str16, i16, str17, str18, str19, str20, i17, str21, str22, str23, i18, i19, str24, str25, str26, i21, i22, i23, str27, i24, i25, i26, str28, str15, i14);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getJumpInfo() {
        return this.jumpInfo;
    }

    /* renamed from: component11, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component12, reason: from getter */
    public final int getPageId() {
        return this.pageId;
    }

    /* renamed from: component13, reason: from getter */
    public final int getScreenId() {
        return this.screenId;
    }

    /* renamed from: component14, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    /* renamed from: component15, reason: from getter */
    public final String getExtendInfo() {
        return this.extendInfo;
    }

    /* renamed from: component16, reason: from getter */
    public final String getCountryCodeStr() {
        return this.countryCodeStr;
    }

    /* renamed from: component17, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    /* renamed from: component18, reason: from getter */
    public final int getPopFrequency() {
        return this.popFrequency;
    }

    /* renamed from: component19, reason: from getter */
    public final int getPopCount() {
        return this.popCount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAdvName() {
        return this.advName;
    }

    /* renamed from: component20, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component21, reason: from getter */
    public final int getLanguageId() {
        return this.languageId;
    }

    /* renamed from: component22, reason: from getter */
    public final int getApplicableVersion() {
        return this.applicableVersion;
    }

    /* renamed from: component23, reason: from getter */
    public final int getObsoleteVersion() {
        return this.obsoleteVersion;
    }

    /* renamed from: component24, reason: from getter */
    public final String getOnlineTime() {
        return this.onlineTime;
    }

    /* renamed from: component25, reason: from getter */
    public final String getOfflineTime() {
        return this.offlineTime;
    }

    /* renamed from: component26, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAdvPopupPositionId() {
        return this.advPopupPositionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAdvPopupPositionName() {
        return this.advPopupPositionName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIntroduce() {
        return this.introduce;
    }

    /* renamed from: component7, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: component8, reason: from getter */
    public final int getPlatform() {
        return this.platform;
    }

    /* renamed from: component9, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    public final AdPopInfo copy(int id2, String advName, int advPopupPositionId, String advPopupPositionName, String title, String introduce, String img, int platform, String jumpType, String jumpInfo, String url, int pageId, int screenId, String screenName, String extendInfo, String countryCodeStr, int productId, int popFrequency, int popCount, String language, int languageId, int applicableVersion, int obsoleteVersion, String onlineTime, String offlineTime, int sort) {
        return new AdPopInfo(id2, advName, advPopupPositionId, advPopupPositionName, title, introduce, img, platform, jumpType, jumpInfo, url, pageId, screenId, screenName, extendInfo, countryCodeStr, productId, popFrequency, popCount, language, languageId, applicableVersion, obsoleteVersion, onlineTime, offlineTime, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdPopInfo)) {
            return false;
        }
        AdPopInfo adPopInfo = (AdPopInfo) other;
        return this.id == adPopInfo.id && Intrinsics.areEqual(this.advName, adPopInfo.advName) && this.advPopupPositionId == adPopInfo.advPopupPositionId && Intrinsics.areEqual(this.advPopupPositionName, adPopInfo.advPopupPositionName) && Intrinsics.areEqual(this.title, adPopInfo.title) && Intrinsics.areEqual(this.introduce, adPopInfo.introduce) && Intrinsics.areEqual(this.img, adPopInfo.img) && this.platform == adPopInfo.platform && Intrinsics.areEqual(this.jumpType, adPopInfo.jumpType) && Intrinsics.areEqual(this.jumpInfo, adPopInfo.jumpInfo) && Intrinsics.areEqual(this.url, adPopInfo.url) && this.pageId == adPopInfo.pageId && this.screenId == adPopInfo.screenId && Intrinsics.areEqual(this.screenName, adPopInfo.screenName) && Intrinsics.areEqual(this.extendInfo, adPopInfo.extendInfo) && Intrinsics.areEqual(this.countryCodeStr, adPopInfo.countryCodeStr) && this.productId == adPopInfo.productId && this.popFrequency == adPopInfo.popFrequency && this.popCount == adPopInfo.popCount && Intrinsics.areEqual(this.language, adPopInfo.language) && this.languageId == adPopInfo.languageId && this.applicableVersion == adPopInfo.applicableVersion && this.obsoleteVersion == adPopInfo.obsoleteVersion && Intrinsics.areEqual(this.onlineTime, adPopInfo.onlineTime) && Intrinsics.areEqual(this.offlineTime, adPopInfo.offlineTime) && this.sort == adPopInfo.sort;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.advName;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.advPopupPositionId)) * 31;
        String str2 = this.advPopupPositionName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.introduce;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.img;
        int hashCode6 = (((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.platform)) * 31;
        String str6 = this.jumpType;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.jumpInfo;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.url;
        int hashCode9 = (((((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + Integer.hashCode(this.pageId)) * 31) + Integer.hashCode(this.screenId)) * 31;
        String str9 = this.screenName;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.extendInfo;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.countryCodeStr;
        int hashCode12 = (((((((hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31) + Integer.hashCode(this.productId)) * 31) + Integer.hashCode(this.popFrequency)) * 31) + Integer.hashCode(this.popCount)) * 31;
        String str12 = this.language;
        int hashCode13 = (((((((hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31) + Integer.hashCode(this.languageId)) * 31) + Integer.hashCode(this.applicableVersion)) * 31) + Integer.hashCode(this.obsoleteVersion)) * 31;
        String str13 = this.onlineTime;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.offlineTime;
        return ((hashCode14 + (str14 != null ? str14.hashCode() : 0)) * 31) + Integer.hashCode(this.sort);
    }

    public String toString() {
        return "AdPopInfo(id=" + this.id + ", advName=" + this.advName + ", advPopupPositionId=" + this.advPopupPositionId + ", advPopupPositionName=" + this.advPopupPositionName + ", title=" + this.title + ", introduce=" + this.introduce + ", img=" + this.img + ", platform=" + this.platform + ", jumpType=" + this.jumpType + ", jumpInfo=" + this.jumpInfo + ", url=" + this.url + ", pageId=" + this.pageId + ", screenId=" + this.screenId + ", screenName=" + this.screenName + ", extendInfo=" + this.extendInfo + ", countryCodeStr=" + this.countryCodeStr + ", productId=" + this.productId + ", popFrequency=" + this.popFrequency + ", popCount=" + this.popCount + ", language=" + this.language + ", languageId=" + this.languageId + ", applicableVersion=" + this.applicableVersion + ", obsoleteVersion=" + this.obsoleteVersion + ", onlineTime=" + this.onlineTime + ", offlineTime=" + this.offlineTime + ", sort=" + this.sort + Separators.RPAREN;
    }

    public AdPopInfo(int i, String str, int i2, String str2, String str3, String str4, String str5, int i3, String str6, String str7, String str8, int i4, int i5, String str9, String str10, String str11, int i6, int i7, int i8, String str12, int i9, int i10, int i11, String str13, String str14, int i12) {
        this.id = i;
        this.advName = str;
        this.advPopupPositionId = i2;
        this.advPopupPositionName = str2;
        this.title = str3;
        this.introduce = str4;
        this.img = str5;
        this.platform = i3;
        this.jumpType = str6;
        this.jumpInfo = str7;
        this.url = str8;
        this.pageId = i4;
        this.screenId = i5;
        this.screenName = str9;
        this.extendInfo = str10;
        this.countryCodeStr = str11;
        this.productId = i6;
        this.popFrequency = i7;
        this.popCount = i8;
        this.language = str12;
        this.languageId = i9;
        this.applicableVersion = i10;
        this.obsoleteVersion = i11;
        this.onlineTime = str13;
        this.offlineTime = str14;
        this.sort = i12;
    }

    public final int getId() {
        return this.id;
    }

    public final String getAdvName() {
        return this.advName;
    }

    public final int getAdvPopupPositionId() {
        return this.advPopupPositionId;
    }

    public final String getAdvPopupPositionName() {
        return this.advPopupPositionName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getIntroduce() {
        return this.introduce;
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

    public final String getExtendInfo() {
        return this.extendInfo;
    }

    public final String getCountryCodeStr() {
        return this.countryCodeStr;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final int getPopFrequency() {
        return this.popFrequency;
    }

    public final int getPopCount() {
        return this.popCount;
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
