package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiSearchBean.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\bB\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010?\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008a\u0002\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020\u0006HÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010!\u001a\u0004\b)\u0010 R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010'\u001a\u0004\b*\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010!\u001a\u0004\b,\u0010 R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010!\u001a\u0004\b-\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010!\u001a\u0004\b1\u0010 R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001dR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001d¨\u0006S"}, d2 = {"Lcom/wakeup/common/network/entity/ai/AiSearchHotInfoBean;", "Ljava/io/Serializable;", "categoryLevel1", "", "categoryLevel2", "click", "", "coverUrl", "expIds", "itemId", "itemTime", "", "mobileUrl", "predictScore", "publishTime", "publisherName", "recallFrom", "recallScore", "sceneId", "show", "source", "strategyId", "tag", "title", "traceId", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategoryLevel1", "()Ljava/lang/String;", "getCategoryLevel2", "getClick", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCoverUrl", "getExpIds", "getItemId", "getItemTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMobileUrl", "getPredictScore", "getPublishTime", "getPublisherName", "getRecallFrom", "getRecallScore", "getSceneId", "getShow", "getSource", "getStrategyId", "getTag", "getTitle", "getTraceId", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/wakeup/common/network/entity/ai/AiSearchHotInfoBean;", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiSearchHotInfoBean implements Serializable {
    private final String categoryLevel1;
    private final String categoryLevel2;
    private final Integer click;
    private final String coverUrl;
    private final String expIds;
    private final String itemId;
    private final Long itemTime;
    private final String mobileUrl;
    private final Integer predictScore;
    private final Long publishTime;
    private final String publisherName;
    private final Integer recallFrom;
    private final Integer recallScore;
    private final String sceneId;
    private final String show;
    private final String source;
    private final Integer strategyId;
    private final String tag;
    private final String title;
    private final String traceId;
    private final String url;

    public static /* synthetic */ AiSearchHotInfoBean copy$default(AiSearchHotInfoBean aiSearchHotInfoBean, String str, String str2, Integer num, String str3, String str4, String str5, Long l, String str6, Integer num2, Long l2, String str7, Integer num3, Integer num4, String str8, String str9, String str10, Integer num5, String str11, String str12, String str13, String str14, int i, Object obj) {
        String str15;
        String str16;
        String str17 = (i & 1) != 0 ? aiSearchHotInfoBean.categoryLevel1 : str;
        String str18 = (i & 2) != 0 ? aiSearchHotInfoBean.categoryLevel2 : str2;
        Integer num6 = (i & 4) != 0 ? aiSearchHotInfoBean.click : num;
        String str19 = (i & 8) != 0 ? aiSearchHotInfoBean.coverUrl : str3;
        String str20 = (i & 16) != 0 ? aiSearchHotInfoBean.expIds : str4;
        String str21 = (i & 32) != 0 ? aiSearchHotInfoBean.itemId : str5;
        Long l3 = (i & 64) != 0 ? aiSearchHotInfoBean.itemTime : l;
        String str22 = (i & 128) != 0 ? aiSearchHotInfoBean.mobileUrl : str6;
        Integer num7 = (i & 256) != 0 ? aiSearchHotInfoBean.predictScore : num2;
        Long l4 = (i & 512) != 0 ? aiSearchHotInfoBean.publishTime : l2;
        String str23 = (i & 1024) != 0 ? aiSearchHotInfoBean.publisherName : str7;
        Integer num8 = (i & 2048) != 0 ? aiSearchHotInfoBean.recallFrom : num3;
        Integer num9 = (i & 4096) != 0 ? aiSearchHotInfoBean.recallScore : num4;
        String str24 = (i & 8192) != 0 ? aiSearchHotInfoBean.sceneId : str8;
        String str25 = str17;
        String str26 = (i & 16384) != 0 ? aiSearchHotInfoBean.show : str9;
        String str27 = (i & 32768) != 0 ? aiSearchHotInfoBean.source : str10;
        Integer num10 = (i & 65536) != 0 ? aiSearchHotInfoBean.strategyId : num5;
        String str28 = (i & 131072) != 0 ? aiSearchHotInfoBean.tag : str11;
        String str29 = (i & 262144) != 0 ? aiSearchHotInfoBean.title : str12;
        String str30 = (i & 524288) != 0 ? aiSearchHotInfoBean.traceId : str13;
        if ((i & 1048576) != 0) {
            str16 = str30;
            str15 = aiSearchHotInfoBean.url;
        } else {
            str15 = str14;
            str16 = str30;
        }
        return aiSearchHotInfoBean.copy(str25, str18, num6, str19, str20, str21, l3, str22, num7, l4, str23, num8, num9, str24, str26, str27, num10, str28, str29, str16, str15);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCategoryLevel1() {
        return this.categoryLevel1;
    }

    /* renamed from: component10, reason: from getter */
    public final Long getPublishTime() {
        return this.publishTime;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPublisherName() {
        return this.publisherName;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getRecallFrom() {
        return this.recallFrom;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getRecallScore() {
        return this.recallScore;
    }

    /* renamed from: component14, reason: from getter */
    public final String getSceneId() {
        return this.sceneId;
    }

    /* renamed from: component15, reason: from getter */
    public final String getShow() {
        return this.show;
    }

    /* renamed from: component16, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component17, reason: from getter */
    public final Integer getStrategyId() {
        return this.strategyId;
    }

    /* renamed from: component18, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component19, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCategoryLevel2() {
        return this.categoryLevel2;
    }

    /* renamed from: component20, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component21, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getClick() {
        return this.click;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExpIds() {
        return this.expIds;
    }

    /* renamed from: component6, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getItemTime() {
        return this.itemTime;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMobileUrl() {
        return this.mobileUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getPredictScore() {
        return this.predictScore;
    }

    public final AiSearchHotInfoBean copy(String categoryLevel1, String categoryLevel2, Integer click, String coverUrl, String expIds, String itemId, Long itemTime, String mobileUrl, Integer predictScore, Long publishTime, String publisherName, Integer recallFrom, Integer recallScore, String sceneId, String show, String source, Integer strategyId, String tag, String title, String traceId, String url) {
        return new AiSearchHotInfoBean(categoryLevel1, categoryLevel2, click, coverUrl, expIds, itemId, itemTime, mobileUrl, predictScore, publishTime, publisherName, recallFrom, recallScore, sceneId, show, source, strategyId, tag, title, traceId, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiSearchHotInfoBean)) {
            return false;
        }
        AiSearchHotInfoBean aiSearchHotInfoBean = (AiSearchHotInfoBean) other;
        return Intrinsics.areEqual(this.categoryLevel1, aiSearchHotInfoBean.categoryLevel1) && Intrinsics.areEqual(this.categoryLevel2, aiSearchHotInfoBean.categoryLevel2) && Intrinsics.areEqual(this.click, aiSearchHotInfoBean.click) && Intrinsics.areEqual(this.coverUrl, aiSearchHotInfoBean.coverUrl) && Intrinsics.areEqual(this.expIds, aiSearchHotInfoBean.expIds) && Intrinsics.areEqual(this.itemId, aiSearchHotInfoBean.itemId) && Intrinsics.areEqual(this.itemTime, aiSearchHotInfoBean.itemTime) && Intrinsics.areEqual(this.mobileUrl, aiSearchHotInfoBean.mobileUrl) && Intrinsics.areEqual(this.predictScore, aiSearchHotInfoBean.predictScore) && Intrinsics.areEqual(this.publishTime, aiSearchHotInfoBean.publishTime) && Intrinsics.areEqual(this.publisherName, aiSearchHotInfoBean.publisherName) && Intrinsics.areEqual(this.recallFrom, aiSearchHotInfoBean.recallFrom) && Intrinsics.areEqual(this.recallScore, aiSearchHotInfoBean.recallScore) && Intrinsics.areEqual(this.sceneId, aiSearchHotInfoBean.sceneId) && Intrinsics.areEqual(this.show, aiSearchHotInfoBean.show) && Intrinsics.areEqual(this.source, aiSearchHotInfoBean.source) && Intrinsics.areEqual(this.strategyId, aiSearchHotInfoBean.strategyId) && Intrinsics.areEqual(this.tag, aiSearchHotInfoBean.tag) && Intrinsics.areEqual(this.title, aiSearchHotInfoBean.title) && Intrinsics.areEqual(this.traceId, aiSearchHotInfoBean.traceId) && Intrinsics.areEqual(this.url, aiSearchHotInfoBean.url);
    }

    public int hashCode() {
        String str = this.categoryLevel1;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.categoryLevel2;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.click;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.coverUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expIds;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.itemId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.itemTime;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        String str6 = this.mobileUrl;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.predictScore;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.publishTime;
        int hashCode10 = (hashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str7 = this.publisherName;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num3 = this.recallFrom;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.recallScore;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.sceneId;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.show;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.source;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num5 = this.strategyId;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str11 = this.tag;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.title;
        int hashCode19 = (hashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.traceId;
        int hashCode20 = (hashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.url;
        return hashCode20 + (str14 != null ? str14.hashCode() : 0);
    }

    public String toString() {
        return "AiSearchHotInfoBean(categoryLevel1=" + this.categoryLevel1 + ", categoryLevel2=" + this.categoryLevel2 + ", click=" + this.click + ", coverUrl=" + this.coverUrl + ", expIds=" + this.expIds + ", itemId=" + this.itemId + ", itemTime=" + this.itemTime + ", mobileUrl=" + this.mobileUrl + ", predictScore=" + this.predictScore + ", publishTime=" + this.publishTime + ", publisherName=" + this.publisherName + ", recallFrom=" + this.recallFrom + ", recallScore=" + this.recallScore + ", sceneId=" + this.sceneId + ", show=" + this.show + ", source=" + this.source + ", strategyId=" + this.strategyId + ", tag=" + this.tag + ", title=" + this.title + ", traceId=" + this.traceId + ", url=" + this.url + Separators.RPAREN;
    }

    public AiSearchHotInfoBean(String str, String str2, Integer num, String str3, String str4, String str5, Long l, String str6, Integer num2, Long l2, String str7, Integer num3, Integer num4, String str8, String str9, String str10, Integer num5, String str11, String str12, String str13, String str14) {
        this.categoryLevel1 = str;
        this.categoryLevel2 = str2;
        this.click = num;
        this.coverUrl = str3;
        this.expIds = str4;
        this.itemId = str5;
        this.itemTime = l;
        this.mobileUrl = str6;
        this.predictScore = num2;
        this.publishTime = l2;
        this.publisherName = str7;
        this.recallFrom = num3;
        this.recallScore = num4;
        this.sceneId = str8;
        this.show = str9;
        this.source = str10;
        this.strategyId = num5;
        this.tag = str11;
        this.title = str12;
        this.traceId = str13;
        this.url = str14;
    }

    public final String getCategoryLevel1() {
        return this.categoryLevel1;
    }

    public final String getCategoryLevel2() {
        return this.categoryLevel2;
    }

    public final Integer getClick() {
        return this.click;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getExpIds() {
        return this.expIds;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Long getItemTime() {
        return this.itemTime;
    }

    public final String getMobileUrl() {
        return this.mobileUrl;
    }

    public final Integer getPredictScore() {
        return this.predictScore;
    }

    public final Long getPublishTime() {
        return this.publishTime;
    }

    public final String getPublisherName() {
        return this.publisherName;
    }

    public final Integer getRecallFrom() {
        return this.recallFrom;
    }

    public final Integer getRecallScore() {
        return this.recallScore;
    }

    public final String getSceneId() {
        return this.sceneId;
    }

    public final String getShow() {
        return this.show;
    }

    public final String getSource() {
        return this.source;
    }

    public final Integer getStrategyId() {
        return this.strategyId;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final String getUrl() {
        return this.url;
    }
}
