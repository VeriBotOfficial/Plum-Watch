package com.wakeup.howear;

import com.anythink.core.api.ATAdInfo;
import com.anythink.core.express.b.a;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdExtendInfo.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\bU\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\bJ\b\u0010l\u001a\u00020\u0007H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\"\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001c\u0010%\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R\u001c\u0010(\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R\u001c\u0010+\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0011\"\u0004\b-\u0010\u0013R\u001c\u0010.\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0011\"\u0004\b0\u0010\u0013R\u001c\u00101\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0011\"\u0004\b3\u0010\u0013R\u001a\u00104\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\f\"\u0004\b6\u0010\u000eR\u001a\u00107\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000eR\u001c\u0010:\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0011\"\u0004\b<\u0010\u0013R\u001c\u0010=\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0011\"\u0004\b?\u0010\u0013R\u001a\u0010@\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\f\"\u0004\bB\u0010\u000eR\u001c\u0010C\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0011\"\u0004\bE\u0010\u0013R\u001c\u0010F\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0011\"\u0004\bH\u0010\u0013R\u001c\u0010I\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0011\"\u0004\bK\u0010\u0013R\u001c\u0010L\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0011\"\u0004\bN\u0010\u0013R\u001c\u0010O\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0011\"\u0004\bQ\u0010\u0013R\u001a\u0010R\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\f\"\u0004\bT\u0010\u000eR\u001a\u0010U\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\f\"\u0004\bW\u0010\u000eR\u001a\u0010X\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\f\"\u0004\bZ\u0010\u000eR\u001c\u0010[\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0011\"\u0004\b]\u0010\u0013R\u001a\u0010^\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u001a\"\u0004\b`\u0010\u001cR\u001c\u0010a\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0011\"\u0004\bc\u0010\u0013R\u001a\u0010d\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\f\"\u0004\bf\u0010\u000eR\u001c\u0010g\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0011\"\u0004\bi\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0011\"\u0004\bk\u0010\u0013¨\u0006m"}, d2 = {"Lcom/wakeup/howear/TopOnAdInfo;", "", "<init>", "()V", "adInfo", "Lcom/anythink/core/api/ATAdInfo;", WiseOpenHianalyticsData.UNION_COSTTIME, "", "(Lcom/anythink/core/api/ATAdInfo;Ljava/lang/String;)V", "networkFirmId", "", "getNetworkFirmId", "()I", "setNetworkFirmId", "(I)V", "adsourceId", "getAdsourceId", "()Ljava/lang/String;", "setAdsourceId", "(Ljava/lang/String;)V", "adsourceIndex", "getAdsourceIndex", "setAdsourceIndex", "eCPM", "", "getECPM", "()D", "setECPM", "(D)V", "isHeaderBiddingAdsource", "setHeaderBiddingAdsource", "showId", "getShowId", "setShowId", "publisherRevenue", "getPublisherRevenue", "setPublisherRevenue", "currency", "getCurrency", "setCurrency", "country", "getCountry", "setCountry", "ecpmPrecision", "getEcpmPrecision", "setEcpmPrecision", "adNetworkType", "getAdNetworkType", "setAdNetworkType", "networkPlacementId", "getNetworkPlacementId", "setNetworkPlacementId", "ecpmLevel", "getEcpmLevel", "setEcpmLevel", "segmentId", "getSegmentId", "setSegmentId", "scenarioId", "getScenarioId", "setScenarioId", "scenarioRewardName", "getScenarioRewardName", "setScenarioRewardName", "scenarioRewardNumber", "getScenarioRewardNumber", "setScenarioRewardNumber", "subChannel", "getSubChannel", "setSubChannel", "channel", "getChannel", "setChannel", "customRule", "getCustomRule", "setCustomRule", "rewardUserCustomData", "getRewardUserCustomData", "setRewardUserCustomData", "tpBidId", "getTpBidId", "setTpBidId", "aBTestId", "getABTestId", "setABTestId", "dismissType", "getDismissType", "setDismissType", a.f4549a, "getPlacementType", "setPlacementType", "sharedPlacementId", "getSharedPlacementId", "setSharedPlacementId", "bidFloor", "getBidFloor", "setBidFloor", "waterfallId", "getWaterfallId", "setWaterfallId", "adSourceAdType", "getAdSourceAdType", "setAdSourceAdType", "adSourceCustomExt", "getAdSourceCustomExt", "setAdSourceCustomExt", "getCostTime", "setCostTime", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TopOnAdInfo {
    private int aBTestId;
    private String adNetworkType;
    private int adSourceAdType;
    private String adSourceCustomExt;
    private String adsourceId;
    private int adsourceIndex;
    private double bidFloor;
    private String channel;
    private String costTime;
    private String country;
    private String currency;
    private String customRule;
    private int dismissType;
    private double eCPM;
    private int ecpmLevel;
    private String ecpmPrecision;
    private int isHeaderBiddingAdsource;
    private int networkFirmId;
    private String networkPlacementId;
    private int placementType;
    private double publisherRevenue;
    private String rewardUserCustomData;
    private String scenarioId;
    private String scenarioRewardName;
    private int scenarioRewardNumber;
    private int segmentId;
    private String sharedPlacementId;
    private String showId;
    private String subChannel;
    private String tpBidId;
    private String waterfallId;

    public TopOnAdInfo() {
        this.costTime = "";
    }

    public final int getNetworkFirmId() {
        return this.networkFirmId;
    }

    public final void setNetworkFirmId(int i) {
        this.networkFirmId = i;
    }

    public final String getAdsourceId() {
        return this.adsourceId;
    }

    public final void setAdsourceId(String str) {
        this.adsourceId = str;
    }

    public final int getAdsourceIndex() {
        return this.adsourceIndex;
    }

    public final void setAdsourceIndex(int i) {
        this.adsourceIndex = i;
    }

    public final double getECPM() {
        return this.eCPM;
    }

    public final void setECPM(double d) {
        this.eCPM = d;
    }

    /* renamed from: isHeaderBiddingAdsource, reason: from getter */
    public final int getIsHeaderBiddingAdsource() {
        return this.isHeaderBiddingAdsource;
    }

    public final void setHeaderBiddingAdsource(int i) {
        this.isHeaderBiddingAdsource = i;
    }

    public final String getShowId() {
        return this.showId;
    }

    public final void setShowId(String str) {
        this.showId = str;
    }

    public final double getPublisherRevenue() {
        return this.publisherRevenue;
    }

    public final void setPublisherRevenue(double d) {
        this.publisherRevenue = d;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final String getCountry() {
        return this.country;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final String getEcpmPrecision() {
        return this.ecpmPrecision;
    }

    public final void setEcpmPrecision(String str) {
        this.ecpmPrecision = str;
    }

    public final String getAdNetworkType() {
        return this.adNetworkType;
    }

    public final void setAdNetworkType(String str) {
        this.adNetworkType = str;
    }

    public final String getNetworkPlacementId() {
        return this.networkPlacementId;
    }

    public final void setNetworkPlacementId(String str) {
        this.networkPlacementId = str;
    }

    public final int getEcpmLevel() {
        return this.ecpmLevel;
    }

    public final void setEcpmLevel(int i) {
        this.ecpmLevel = i;
    }

    public final int getSegmentId() {
        return this.segmentId;
    }

    public final void setSegmentId(int i) {
        this.segmentId = i;
    }

    public final String getScenarioId() {
        return this.scenarioId;
    }

    public final void setScenarioId(String str) {
        this.scenarioId = str;
    }

    public final String getScenarioRewardName() {
        return this.scenarioRewardName;
    }

    public final void setScenarioRewardName(String str) {
        this.scenarioRewardName = str;
    }

    public final int getScenarioRewardNumber() {
        return this.scenarioRewardNumber;
    }

    public final void setScenarioRewardNumber(int i) {
        this.scenarioRewardNumber = i;
    }

    public final String getSubChannel() {
        return this.subChannel;
    }

    public final void setSubChannel(String str) {
        this.subChannel = str;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final void setChannel(String str) {
        this.channel = str;
    }

    public final String getCustomRule() {
        return this.customRule;
    }

    public final void setCustomRule(String str) {
        this.customRule = str;
    }

    public final String getRewardUserCustomData() {
        return this.rewardUserCustomData;
    }

    public final void setRewardUserCustomData(String str) {
        this.rewardUserCustomData = str;
    }

    public final String getTpBidId() {
        return this.tpBidId;
    }

    public final void setTpBidId(String str) {
        this.tpBidId = str;
    }

    public final int getABTestId() {
        return this.aBTestId;
    }

    public final void setABTestId(int i) {
        this.aBTestId = i;
    }

    public final int getDismissType() {
        return this.dismissType;
    }

    public final void setDismissType(int i) {
        this.dismissType = i;
    }

    public final int getPlacementType() {
        return this.placementType;
    }

    public final void setPlacementType(int i) {
        this.placementType = i;
    }

    public final String getSharedPlacementId() {
        return this.sharedPlacementId;
    }

    public final void setSharedPlacementId(String str) {
        this.sharedPlacementId = str;
    }

    public final double getBidFloor() {
        return this.bidFloor;
    }

    public final void setBidFloor(double d) {
        this.bidFloor = d;
    }

    public final String getWaterfallId() {
        return this.waterfallId;
    }

    public final void setWaterfallId(String str) {
        this.waterfallId = str;
    }

    public final int getAdSourceAdType() {
        return this.adSourceAdType;
    }

    public final void setAdSourceAdType(int i) {
        this.adSourceAdType = i;
    }

    public final String getAdSourceCustomExt() {
        return this.adSourceCustomExt;
    }

    public final void setAdSourceCustomExt(String str) {
        this.adSourceCustomExt = str;
    }

    public final String getCostTime() {
        return this.costTime;
    }

    public final void setCostTime(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.costTime = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopOnAdInfo(ATAdInfo adInfo, String costTime) {
        this();
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(costTime, "costTime");
        this.networkFirmId = adInfo.getNetworkFirmId();
        this.adsourceId = adInfo.getAdsourceId();
        this.adsourceIndex = adInfo.getAdsourceIndex();
        this.eCPM = adInfo.getEcpm();
        this.isHeaderBiddingAdsource = adInfo.isHeaderBiddingAdsource();
        this.showId = adInfo.getShowId();
        this.publisherRevenue = adInfo.getPublisherRevenue().doubleValue();
        this.currency = adInfo.getCurrency();
        this.country = adInfo.getCountry();
        this.ecpmPrecision = adInfo.getEcpmPrecision();
        this.adNetworkType = adInfo.getAdNetworkType();
        this.networkPlacementId = adInfo.getNetworkPlacementId();
        this.ecpmLevel = adInfo.getEcpmLevel();
        this.segmentId = adInfo.getSegmentId();
        this.scenarioId = adInfo.getScenarioId();
        this.scenarioRewardName = adInfo.getScenarioRewardName();
        this.scenarioRewardNumber = adInfo.getScenarioRewardNumber();
        this.subChannel = adInfo.getSubChannel();
        this.channel = adInfo.getChannel();
        this.customRule = adInfo.getCustomRule();
        this.rewardUserCustomData = adInfo.getRewardUserCustomData();
        this.tpBidId = adInfo.getTpBidId();
        this.aBTestId = adInfo.getABTestId();
        this.dismissType = adInfo.getDismissType();
        this.placementType = adInfo.getPlacementType();
        this.sharedPlacementId = adInfo.getSharedPlacementId();
        this.bidFloor = adInfo.getBidFloor();
        this.waterfallId = adInfo.getWaterfallId();
        this.adSourceAdType = adInfo.getAdSourceAdType();
        this.adSourceCustomExt = adInfo.getAdSourceCustomExt();
        this.costTime = costTime;
    }

    public /* synthetic */ TopOnAdInfo(ATAdInfo aTAdInfo, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aTAdInfo, (i & 2) != 0 ? "" : str);
    }

    public String toString() {
        return "{networkFirmId=" + this.networkFirmId + ", adsourceId=" + this.adsourceId + ", adsourceIndex=" + this.adsourceIndex + ", eCPM=" + this.eCPM + ", isHeaderBiddingAdsource=" + this.isHeaderBiddingAdsource + ", showId=" + this.showId + ", publisherRevenue=" + this.publisherRevenue + ", currency=" + this.currency + ", country=" + this.country + ", ecpmPrecision=" + this.ecpmPrecision + ", adNetworkType=" + this.adNetworkType + ", networkPlacementId=" + this.networkPlacementId + ", ecpmLevel=" + this.ecpmLevel + ", segmentId=" + this.segmentId + ", scenarioId=" + this.scenarioId + ", scenarioRewardName=" + this.scenarioRewardName + ", scenarioRewardNumber=" + this.scenarioRewardNumber + ", subChannel=" + this.subChannel + ", channel=" + this.channel + ", customRule=" + this.customRule + ", rewardUserCustomData=" + this.rewardUserCustomData + ", tpBidId=" + this.tpBidId + ", aBTestId=" + this.aBTestId + ", dismissType=" + this.dismissType + ", placementType=" + this.placementType + ", sharedPlacementId=" + this.sharedPlacementId + ", bidFloor=" + this.bidFloor + ", waterfallId=" + this.waterfallId + ", adSourceAdType=" + this.adSourceAdType + ", adSourceCustomExt=" + this.adSourceCustomExt + "}";
    }
}
