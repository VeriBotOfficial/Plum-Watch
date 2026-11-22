package com.xmly.businesssdk.network.bean.sleep;

import com.xmly.businesssdk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomTrack.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/xmly/businesssdk/network/bean/sleep/CustomTrack;", "", "code", "", "msg", "", "data", "", "Lcom/xmly/businesssdk/network/bean/sleep/CustomTrackEntity;", "categoryId", "(ILjava/lang/String;Ljava/util/List;I)V", "getCategoryId", "()I", "setCategoryId", "(I)V", "getCode", "getData", "()Ljava/util/List;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CustomTrack {
    private int categoryId;
    private final int code;
    private final List<CustomTrackEntity> data;
    private final String msg;

    public CustomTrack() {
        this(0, null, null, 0, 15, null);
    }

    public CustomTrack(int i, String str, List<CustomTrackEntity> list, int i2) {
        this.code = i;
        this.msg = str;
        this.data = list;
        this.categoryId = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomTrack copy$default(CustomTrack customTrack, int i, String str, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = customTrack.code;
        }
        if ((i3 & 2) != 0) {
            str = customTrack.msg;
        }
        if ((i3 & 4) != 0) {
            list = customTrack.data;
        }
        if ((i3 & 8) != 0) {
            i2 = customTrack.categoryId;
        }
        return customTrack.copy(i, str, list, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final List<CustomTrackEntity> component3() {
        return this.data;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    public final CustomTrack copy(int code, String msg, List<CustomTrackEntity> data, int categoryId) {
        return new CustomTrack(code, msg, data, categoryId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomTrack)) {
            return false;
        }
        CustomTrack customTrack = (CustomTrack) other;
        return this.code == customTrack.code && Intrinsics.areEqual(this.msg, customTrack.msg) && Intrinsics.areEqual(this.data, customTrack.data) && this.categoryId == customTrack.categoryId;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final int getCode() {
        return this.code;
    }

    public final List<CustomTrackEntity> getData() {
        return this.data;
    }

    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        String str = this.msg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<CustomTrackEntity> list = this.data;
        return Integer.hashCode(this.categoryId) + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final void setCategoryId(int i) {
        this.categoryId = i;
    }

    public String toString() {
        return c.a("CustomTrack(code=").append(this.code).append(", msg=").append(this.msg).append(", data=").append(this.data).append(", categoryId=").append(this.categoryId).append(')').toString();
    }

    public /* synthetic */ CustomTrack(int i, String str, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : list, (i3 & 8) != 0 ? 0 : i2);
    }
}
