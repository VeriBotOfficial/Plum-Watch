package com.xmly.businesssdk.network.bean.sleep;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.config.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomTrackCategory.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/xmly/businesssdk/network/bean/sleep/CustomTrackCategoryEntity;", "", "categoryId", "", "trackName", "", "(ILjava/lang/String;)V", "getCategoryId", "()I", "getTrackName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CustomTrackCategoryEntity {

    @SerializedName("category_id")
    private final int categoryId;

    @SerializedName("category_name")
    private final String trackName;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomTrackCategoryEntity() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public CustomTrackCategoryEntity(int i, String str) {
        this.categoryId = i;
        this.trackName = str;
    }

    public static /* synthetic */ CustomTrackCategoryEntity copy$default(CustomTrackCategoryEntity customTrackCategoryEntity, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = customTrackCategoryEntity.categoryId;
        }
        if ((i2 & 2) != 0) {
            str = customTrackCategoryEntity.trackName;
        }
        return customTrackCategoryEntity.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTrackName() {
        return this.trackName;
    }

    public final CustomTrackCategoryEntity copy(int categoryId, String trackName) {
        return new CustomTrackCategoryEntity(categoryId, trackName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomTrackCategoryEntity)) {
            return false;
        }
        CustomTrackCategoryEntity customTrackCategoryEntity = (CustomTrackCategoryEntity) other;
        return this.categoryId == customTrackCategoryEntity.categoryId && Intrinsics.areEqual(this.trackName, customTrackCategoryEntity.trackName);
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final String getTrackName() {
        return this.trackName;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.categoryId) * 31;
        String str = this.trackName;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("CustomTrackCategoryEntity(categoryId=").append(this.categoryId).append(", trackName="), this.trackName, ')');
    }

    public /* synthetic */ CustomTrackCategoryEntity(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str);
    }
}
