package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import com.anythink.core.d.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomepageChannelList.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\\\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006("}, d2 = {"Lcom/wakeup/common/network/entity/video/HomepageChannelList;", "", "id", "", "name", "", "categoryLevelId", "locale", "Lcom/wakeup/common/network/entity/video/Locale;", "sceneId", "createTime", l.a.ac, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/wakeup/common/network/entity/video/Locale;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getCategoryLevelId", "getLocale", "()Lcom/wakeup/common/network/entity/video/Locale;", "getSceneId", "()I", "getCreateTime", "getUpdateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/wakeup/common/network/entity/video/Locale;ILjava/lang/String;Ljava/lang/String;)Lcom/wakeup/common/network/entity/video/HomepageChannelList;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HomepageChannelList {
    private final Integer categoryLevelId;
    private final String createTime;
    private final Integer id;
    private final Locale locale;
    private final String name;
    private final int sceneId;
    private final String updateTime;

    public static /* synthetic */ HomepageChannelList copy$default(HomepageChannelList homepageChannelList, Integer num, String str, Integer num2, Locale locale, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = homepageChannelList.id;
        }
        if ((i2 & 2) != 0) {
            str = homepageChannelList.name;
        }
        if ((i2 & 4) != 0) {
            num2 = homepageChannelList.categoryLevelId;
        }
        if ((i2 & 8) != 0) {
            locale = homepageChannelList.locale;
        }
        if ((i2 & 16) != 0) {
            i = homepageChannelList.sceneId;
        }
        if ((i2 & 32) != 0) {
            str2 = homepageChannelList.createTime;
        }
        if ((i2 & 64) != 0) {
            str3 = homepageChannelList.updateTime;
        }
        String str4 = str2;
        String str5 = str3;
        int i3 = i;
        Integer num3 = num2;
        return homepageChannelList.copy(num, str, num3, locale, i3, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getCategoryLevelId() {
        return this.categoryLevelId;
    }

    /* renamed from: component4, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSceneId() {
        return this.sceneId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final HomepageChannelList copy(Integer id2, String name, Integer categoryLevelId, Locale locale, int sceneId, String createTime, String updateTime) {
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        return new HomepageChannelList(id2, name, categoryLevelId, locale, sceneId, createTime, updateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomepageChannelList)) {
            return false;
        }
        HomepageChannelList homepageChannelList = (HomepageChannelList) other;
        return Intrinsics.areEqual(this.id, homepageChannelList.id) && Intrinsics.areEqual(this.name, homepageChannelList.name) && Intrinsics.areEqual(this.categoryLevelId, homepageChannelList.categoryLevelId) && Intrinsics.areEqual(this.locale, homepageChannelList.locale) && this.sceneId == homepageChannelList.sceneId && Intrinsics.areEqual(this.createTime, homepageChannelList.createTime) && Intrinsics.areEqual(this.updateTime, homepageChannelList.updateTime);
    }

    public int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.categoryLevelId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Locale locale = this.locale;
        return ((((((hashCode3 + (locale != null ? locale.hashCode() : 0)) * 31) + Integer.hashCode(this.sceneId)) * 31) + this.createTime.hashCode()) * 31) + this.updateTime.hashCode();
    }

    public String toString() {
        return "HomepageChannelList(id=" + this.id + ", name=" + this.name + ", categoryLevelId=" + this.categoryLevelId + ", locale=" + this.locale + ", sceneId=" + this.sceneId + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + Separators.RPAREN;
    }

    public HomepageChannelList(Integer num, String str, Integer num2, Locale locale, int i, String createTime, String updateTime) {
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        this.id = num;
        this.name = str;
        this.categoryLevelId = num2;
        this.locale = locale;
        this.sceneId = i;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getCategoryLevelId() {
        return this.categoryLevelId;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final int getSceneId() {
        return this.sceneId;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }
}
