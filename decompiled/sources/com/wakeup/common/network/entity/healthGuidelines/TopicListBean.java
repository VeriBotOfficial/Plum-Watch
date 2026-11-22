package com.wakeup.common.network.entity.healthGuidelines;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopicListBean.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JU\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00062"}, d2 = {"Lcom/wakeup/common/network/entity/healthGuidelines/TopicListBean;", "Ljava/io/Serializable;", "id", "", "name", "", "icon", "backgroundImg", "thumbnail", "description", "articleList", "", "Lcom/wakeup/common/network/entity/healthGuidelines/HeadLinesBean;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()J", "setId", "(J)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getIcon", "setIcon", "getBackgroundImg", "setBackgroundImg", "getThumbnail", "setThumbnail", "getDescription", "setDescription", "getArticleList", "()Ljava/util/List;", "setArticleList", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TopicListBean implements Serializable {
    private List<HeadLinesBean> articleList;
    private String backgroundImg;
    private String description;
    private String icon;
    private long id;
    private String name;
    private String thumbnail;

    public static /* synthetic */ TopicListBean copy$default(TopicListBean topicListBean, long j, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = topicListBean.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = topicListBean.name;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = topicListBean.icon;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = topicListBean.backgroundImg;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = topicListBean.thumbnail;
        }
        return topicListBean.copy(j2, str6, str7, str8, str4, (i & 32) != 0 ? topicListBean.description : str5, (i & 64) != 0 ? topicListBean.articleList : list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
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

    public final List<HeadLinesBean> component7() {
        return this.articleList;
    }

    public final TopicListBean copy(long id2, String name, String icon, String backgroundImg, String thumbnail, String description, List<HeadLinesBean> articleList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundImg, "backgroundImg");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(articleList, "articleList");
        return new TopicListBean(id2, name, icon, backgroundImg, thumbnail, description, articleList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopicListBean)) {
            return false;
        }
        TopicListBean topicListBean = (TopicListBean) other;
        return this.id == topicListBean.id && Intrinsics.areEqual(this.name, topicListBean.name) && Intrinsics.areEqual(this.icon, topicListBean.icon) && Intrinsics.areEqual(this.backgroundImg, topicListBean.backgroundImg) && Intrinsics.areEqual(this.thumbnail, topicListBean.thumbnail) && Intrinsics.areEqual(this.description, topicListBean.description) && Intrinsics.areEqual(this.articleList, topicListBean.articleList);
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.backgroundImg.hashCode()) * 31) + this.thumbnail.hashCode()) * 31) + this.description.hashCode()) * 31) + this.articleList.hashCode();
    }

    public String toString() {
        return "TopicListBean(id=" + this.id + ", name=" + this.name + ", icon=" + this.icon + ", backgroundImg=" + this.backgroundImg + ", thumbnail=" + this.thumbnail + ", description=" + this.description + ", articleList=" + this.articleList + Separators.RPAREN;
    }

    public TopicListBean(long j, String name, String icon, String backgroundImg, String thumbnail, String description, List<HeadLinesBean> articleList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundImg, "backgroundImg");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(articleList, "articleList");
        this.id = j;
        this.name = name;
        this.icon = icon;
        this.backgroundImg = backgroundImg;
        this.thumbnail = thumbnail;
        this.description = description;
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

    public /* synthetic */ TopicListBean(long j, String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, str4, str5, (i & 64) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<HeadLinesBean> getArticleList() {
        return this.articleList;
    }

    public final void setArticleList(List<HeadLinesBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.articleList = list;
    }
}
