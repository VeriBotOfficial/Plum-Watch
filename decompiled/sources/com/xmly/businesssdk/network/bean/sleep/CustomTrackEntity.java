package com.xmly.businesssdk.network.bean.sleep;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomTrack.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006!"}, d2 = {"Lcom/xmly/businesssdk/network/bean/sleep/CustomTrackEntity;", "", "categoryId", "", "trackId", "", "title", "icon", "playUrl", "isSelected", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCategoryId", "()I", "getIcon", "()Ljava/lang/String;", "()Z", "setSelected", "(Z)V", "getPlayUrl", "getTitle", "getTrackId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CustomTrackEntity {

    @SerializedName("category_id")
    private final int categoryId;
    private final String icon;
    private boolean isSelected;

    @SerializedName("play_url")
    private final String playUrl;
    private final String title;
    private final String trackId;

    public CustomTrackEntity() {
        this(0, null, null, null, null, false, 63, null);
    }

    public CustomTrackEntity(int i, String str, String str2, String str3, String str4, boolean z) {
        this.categoryId = i;
        this.trackId = str;
        this.title = str2;
        this.icon = str3;
        this.playUrl = str4;
        this.isSelected = z;
    }

    public static /* synthetic */ CustomTrackEntity copy$default(CustomTrackEntity customTrackEntity, int i, String str, String str2, String str3, String str4, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = customTrackEntity.categoryId;
        }
        if ((i2 & 2) != 0) {
            str = customTrackEntity.trackId;
        }
        if ((i2 & 4) != 0) {
            str2 = customTrackEntity.title;
        }
        if ((i2 & 8) != 0) {
            str3 = customTrackEntity.icon;
        }
        if ((i2 & 16) != 0) {
            str4 = customTrackEntity.playUrl;
        }
        if ((i2 & 32) != 0) {
            z = customTrackEntity.isSelected;
        }
        String str5 = str4;
        boolean z2 = z;
        return customTrackEntity.copy(i, str, str2, str3, str5, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPlayUrl() {
        return this.playUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final CustomTrackEntity copy(int categoryId, String trackId, String title, String icon, String playUrl, boolean isSelected) {
        return new CustomTrackEntity(categoryId, trackId, title, icon, playUrl, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomTrackEntity)) {
            return false;
        }
        CustomTrackEntity customTrackEntity = (CustomTrackEntity) other;
        return this.categoryId == customTrackEntity.categoryId && Intrinsics.areEqual(this.trackId, customTrackEntity.trackId) && Intrinsics.areEqual(this.title, customTrackEntity.title) && Intrinsics.areEqual(this.icon, customTrackEntity.icon) && Intrinsics.areEqual(this.playUrl, customTrackEntity.playUrl) && this.isSelected == customTrackEntity.isSelected;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getPlayUrl() {
        return this.playUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.categoryId) * 31;
        String str = this.trackId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.playUrl;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode5 + i;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public String toString() {
        return c.a("CustomTrackEntity(categoryId=").append(this.categoryId).append(", trackId=").append(this.trackId).append(", title=").append(this.title).append(", icon=").append(this.icon).append(", playUrl=").append(this.playUrl).append(", isSelected=").append(this.isSelected).append(')').toString();
    }

    public /* synthetic */ CustomTrackEntity(int i, String str, String str2, String str3, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? false : z);
    }
}
