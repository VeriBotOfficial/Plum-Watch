package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.iflytek.cloud.SpeechUtility;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.config.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonSubscribeResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/xmly/businesssdk/network/bean/CommonSubscribeResponse;", "", "code", "", SpeechUtility.TAG_RESOURCE_RET, "total", "data", "", "Lcom/xmly/businesssdk/network/bean/AlbumInfo;", "(IIILjava/util/List;)V", "getCode", "()I", "getData", "()Ljava/util/List;", "getRet", "getTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommonSubscribeResponse {

    @SerializedName("code")
    private final int code;

    @SerializedName("data")
    private final List<AlbumInfo> data;

    @SerializedName(SpeechUtility.TAG_RESOURCE_RET)
    private final int ret;

    @SerializedName("total")
    private final int total;

    public CommonSubscribeResponse() {
        this(0, 0, 0, null, 15, null);
    }

    public CommonSubscribeResponse(int i, int i2, int i3, List<AlbumInfo> list) {
        this.code = i;
        this.ret = i2;
        this.total = i3;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonSubscribeResponse copy$default(CommonSubscribeResponse commonSubscribeResponse, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = commonSubscribeResponse.code;
        }
        if ((i4 & 2) != 0) {
            i2 = commonSubscribeResponse.ret;
        }
        if ((i4 & 4) != 0) {
            i3 = commonSubscribeResponse.total;
        }
        if ((i4 & 8) != 0) {
            list = commonSubscribeResponse.data;
        }
        return commonSubscribeResponse.copy(i, i2, i3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRet() {
        return this.ret;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final List<AlbumInfo> component4() {
        return this.data;
    }

    public final CommonSubscribeResponse copy(int code, int ret, int total, List<AlbumInfo> data) {
        return new CommonSubscribeResponse(code, ret, total, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonSubscribeResponse)) {
            return false;
        }
        CommonSubscribeResponse commonSubscribeResponse = (CommonSubscribeResponse) other;
        return this.code == commonSubscribeResponse.code && this.ret == commonSubscribeResponse.ret && this.total == commonSubscribeResponse.total && Intrinsics.areEqual(this.data, commonSubscribeResponse.data);
    }

    public final int getCode() {
        return this.code;
    }

    public final List<AlbumInfo> getData() {
        return this.data;
    }

    public final int getRet() {
        return this.ret;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        int a2 = b.a(this.total, b.a(this.ret, Integer.hashCode(this.code) * 31, 31), 31);
        List<AlbumInfo> list = this.data;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return c.a("CommonSubscribeResponse(code=").append(this.code).append(", ret=").append(this.ret).append(", total=").append(this.total).append(", data=").append(this.data).append(')').toString();
    }

    public /* synthetic */ CommonSubscribeResponse(int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : list);
    }
}
