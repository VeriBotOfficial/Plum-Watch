package com.wakeup.common.network.entity.healthGuidelines;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopicArticleBean.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eHÆ\u0003Jy\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eHÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u000bHÖ\u0001J\t\u0010?\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,¨\u0006@"}, d2 = {"Lcom/wakeup/common/network/entity/healthGuidelines/TopicArticleBean;", "Ljava/io/Serializable;", "id", "", "name", "", "icon", "backgroundImg", "thumbnail", "description", "viewCount", "", "articleSize", "articleIdList", "", "articleList", "Lcom/wakeup/common/network/entity/healthGuidelines/HeadLinesBean;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/List;)V", "getId", "()J", "setId", "(J)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getIcon", "setIcon", "getBackgroundImg", "setBackgroundImg", "getThumbnail", "setThumbnail", "getDescription", "setDescription", "getViewCount", "()I", "setViewCount", "(I)V", "getArticleSize", "setArticleSize", "getArticleIdList", "()Ljava/util/List;", "setArticleIdList", "(Ljava/util/List;)V", "getArticleList", "setArticleList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TopicArticleBean implements Serializable {
    private List<Long> articleIdList;
    private List<HeadLinesBean> articleList;
    private int articleSize;
    private String backgroundImg;
    private String description;
    private String icon;
    private long id;
    private String name;
    private String thumbnail;
    private int viewCount;

    public static /* synthetic */ TopicArticleBean copy$default(TopicArticleBean topicArticleBean, long j, String str, String str2, String str3, String str4, String str5, int i, int i2, List list, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = topicArticleBean.id;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            str = topicArticleBean.name;
        }
        return topicArticleBean.copy(j2, str, (i3 & 4) != 0 ? topicArticleBean.icon : str2, (i3 & 8) != 0 ? topicArticleBean.backgroundImg : str3, (i3 & 16) != 0 ? topicArticleBean.thumbnail : str4, (i3 & 32) != 0 ? topicArticleBean.description : str5, (i3 & 64) != 0 ? topicArticleBean.viewCount : i, (i3 & 128) != 0 ? topicArticleBean.articleSize : i2, (i3 & 256) != 0 ? topicArticleBean.articleIdList : list, (i3 & 512) != 0 ? topicArticleBean.articleList : list2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final List<HeadLinesBean> component10() {
        return this.articleList;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundImg() {
        return this.backgroundImg;
    }

    /* renamed from: component5, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component7, reason: from getter */
    public final int getViewCount() {
        return this.viewCount;
    }

    /* renamed from: component8, reason: from getter */
    public final int getArticleSize() {
        return this.articleSize;
    }

    public final List<Long> component9() {
        return this.articleIdList;
    }

    public final TopicArticleBean copy(long id2, String name, String icon, String backgroundImg, String thumbnail, String description, int viewCount, int articleSize, List<Long> articleIdList, List<HeadLinesBean> articleList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundImg, "backgroundImg");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(articleIdList, "articleIdList");
        Intrinsics.checkNotNullParameter(articleList, "articleList");
        return new TopicArticleBean(id2, name, icon, backgroundImg, thumbnail, description, viewCount, articleSize, articleIdList, articleList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopicArticleBean)) {
            return false;
        }
        TopicArticleBean topicArticleBean = (TopicArticleBean) other;
        return this.id == topicArticleBean.id && Intrinsics.areEqual(this.name, topicArticleBean.name) && Intrinsics.areEqual(this.icon, topicArticleBean.icon) && Intrinsics.areEqual(this.backgroundImg, topicArticleBean.backgroundImg) && Intrinsics.areEqual(this.thumbnail, topicArticleBean.thumbnail) && Intrinsics.areEqual(this.description, topicArticleBean.description) && this.viewCount == topicArticleBean.viewCount && this.articleSize == topicArticleBean.articleSize && Intrinsics.areEqual(this.articleIdList, topicArticleBean.articleIdList) && Intrinsics.areEqual(this.articleList, topicArticleBean.articleList);
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.backgroundImg.hashCode()) * 31) + this.thumbnail.hashCode()) * 31) + this.description.hashCode()) * 31) + Integer.hashCode(this.viewCount)) * 31) + Integer.hashCode(this.articleSize)) * 31) + this.articleIdList.hashCode()) * 31) + this.articleList.hashCode();
    }

    public String toString() {
        return "TopicArticleBean(id=" + this.id + ", name=" + this.name + ", icon=" + this.icon + ", backgroundImg=" + this.backgroundImg + ", thumbnail=" + this.thumbnail + ", description=" + this.description + ", viewCount=" + this.viewCount + ", articleSize=" + this.articleSize + ", articleIdList=" + this.articleIdList + ", articleList=" + this.articleList + Separators.RPAREN;
    }

    public TopicArticleBean(long j, String name, String icon, String backgroundImg, String thumbnail, String description, int i, int i2, List<Long> articleIdList, List<HeadLinesBean> articleList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundImg, "backgroundImg");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(articleIdList, "articleIdList");
        Intrinsics.checkNotNullParameter(articleList, "articleList");
        this.id = j;
        this.name = name;
        this.icon = icon;
        this.backgroundImg = backgroundImg;
        this.thumbnail = thumbnail;
        this.description = description;
        this.viewCount = i;
        this.articleSize = i2;
        this.articleIdList = articleIdList;
        this.articleList = articleList;
    }

    public final long getId() {
        return this.id;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final void setIcon(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }

    public final String getBackgroundImg() {
        return this.backgroundImg;
    }

    public final void setBackgroundImg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backgroundImg = str;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final void setThumbnail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thumbnail = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final int getViewCount() {
        return this.viewCount;
    }

    public final void setViewCount(int i) {
        this.viewCount = i;
    }

    public final int getArticleSize() {
        return this.articleSize;
    }

    public final void setArticleSize(int i) {
        this.articleSize = i;
    }

    public /* synthetic */ TopicArticleBean(long j, String str, String str2, String str3, String str4, String str5, int i, int i2, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, str5, i, i2, (i3 & 256) != 0 ? CollectionsKt.emptyList() : list, (i3 & 512) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final List<Long> getArticleIdList() {
        return this.articleIdList;
    }

    public final void setArticleIdList(List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.articleIdList = list;
    }

    public final List<HeadLinesBean> getArticleList() {
        return this.articleList;
    }

    public final void setArticleList(List<HeadLinesBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.articleList = list;
    }
}
