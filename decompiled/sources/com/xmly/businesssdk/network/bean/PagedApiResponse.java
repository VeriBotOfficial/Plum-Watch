package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.config.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003JA\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\f¨\u0006\""}, d2 = {"Lcom/xmly/businesssdk/network/bean/PagedApiResponse;", "T", "", "data", "", "code", "", "msg", "", "total", "(Ljava/util/List;ILjava/lang/String;I)V", "getCode", "()I", "getData", "()Ljava/util/List;", "dataSize", "getDataSize", "hasData", "", "getHasData", "()Z", "isSuccess", "getMsg", "()Ljava/lang/String;", "getTotal", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PagedApiResponse<T> {

    @SerializedName("code")
    private final int code;

    @SerializedName("data")
    private final List<T> data;

    @SerializedName("msg")
    private final String msg;

    @SerializedName("total")
    private final int total;

    public PagedApiResponse() {
        this(null, 0, null, 0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagedApiResponse(List<? extends T> list, int i, String str, int i2) {
        this.data = list;
        this.code = i;
        this.msg = str;
        this.total = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PagedApiResponse copy$default(PagedApiResponse pagedApiResponse, List list, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = pagedApiResponse.data;
        }
        if ((i3 & 2) != 0) {
            i = pagedApiResponse.code;
        }
        if ((i3 & 4) != 0) {
            str = pagedApiResponse.msg;
        }
        if ((i3 & 8) != 0) {
            i2 = pagedApiResponse.total;
        }
        return pagedApiResponse.copy(list, i, str, i2);
    }

    public final List<T> component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final PagedApiResponse<T> copy(List<? extends T> data, int code, String msg, int total) {
        return new PagedApiResponse<>(data, code, msg, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PagedApiResponse)) {
            return false;
        }
        PagedApiResponse pagedApiResponse = (PagedApiResponse) other;
        return Intrinsics.areEqual(this.data, pagedApiResponse.data) && this.code == pagedApiResponse.code && Intrinsics.areEqual(this.msg, pagedApiResponse.msg) && this.total == pagedApiResponse.total;
    }

    public final int getCode() {
        return this.code;
    }

    public final List<T> getData() {
        return this.data;
    }

    public final int getDataSize() {
        List<T> list = this.data;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final boolean getHasData() {
        List<T> list = this.data;
        return !(list == null || list.isEmpty());
    }

    public final String getMsg() {
        return this.msg;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        List<T> list = this.data;
        int a2 = b.a(this.code, (list == null ? 0 : list.hashCode()) * 31, 31);
        String str = this.msg;
        return Integer.hashCode(this.total) + ((a2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean isSuccess() {
        return this.code == 0;
    }

    public String toString() {
        return c.a("PagedApiResponse(data=").append(this.data).append(", code=").append(this.code).append(", msg=").append(this.msg).append(", total=").append(this.total).append(')').toString();
    }

    public /* synthetic */ PagedApiResponse(List list, int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? 0 : i2);
    }
}
