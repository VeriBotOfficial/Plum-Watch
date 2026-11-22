package com.xmly.businesssdk.network.bean.sleep;

import com.xmly.businesssdk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomTrackCategory.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xmly/businesssdk/network/bean/sleep/CustomTrackCategory;", "", "code", "", "msg", "", "data", "", "Lcom/xmly/businesssdk/network/bean/sleep/CustomTrackCategoryEntity;", "(ILjava/lang/String;Ljava/util/List;)V", "getCode", "()I", "getData", "()Ljava/util/List;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CustomTrackCategory {
    private final int code;
    private final List<CustomTrackCategoryEntity> data;
    private final String msg;

    public CustomTrackCategory() {
        this(0, null, null, 7, null);
    }

    public CustomTrackCategory(int i, String str, List<CustomTrackCategoryEntity> list) {
        this.code = i;
        this.msg = str;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomTrackCategory copy$default(CustomTrackCategory customTrackCategory, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = customTrackCategory.code;
        }
        if ((i2 & 2) != 0) {
            str = customTrackCategory.msg;
        }
        if ((i2 & 4) != 0) {
            list = customTrackCategory.data;
        }
        return customTrackCategory.copy(i, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final List<CustomTrackCategoryEntity> component3() {
        return this.data;
    }

    public final CustomTrackCategory copy(int code, String msg, List<CustomTrackCategoryEntity> data) {
        return new CustomTrackCategory(code, msg, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomTrackCategory)) {
            return false;
        }
        CustomTrackCategory customTrackCategory = (CustomTrackCategory) other;
        return this.code == customTrackCategory.code && Intrinsics.areEqual(this.msg, customTrackCategory.msg) && Intrinsics.areEqual(this.data, customTrackCategory.data);
    }

    public final int getCode() {
        return this.code;
    }

    public final List<CustomTrackCategoryEntity> getData() {
        return this.data;
    }

    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        String str = this.msg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<CustomTrackCategoryEntity> list = this.data;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return c.a("CustomTrackCategory(code=").append(this.code).append(", msg=").append(this.msg).append(", data=").append(this.data).append(')').toString();
    }

    public /* synthetic */ CustomTrackCategory(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : list);
    }
}
