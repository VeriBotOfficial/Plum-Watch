package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.iflytek.cloud.SpeechUtility;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.config.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u0010\u0010\u0019\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016JN\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016¨\u0006$"}, d2 = {"Lcom/xmly/businesssdk/network/bean/ApiResponse;", "T", "", "data", "code", "", SpeechUtility.TAG_RESOURCE_RET, "msg", "", "total", "(Ljava/lang/Object;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getCode", "()I", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "isSuccess", "", "()Z", "getMsg", "()Ljava/lang/String;", "getRet", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotal", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Object;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/xmly/businesssdk/network/bean/ApiResponse;", "equals", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ApiResponse<T> {

    @SerializedName("code")
    private final int code;

    @SerializedName("data")
    private final T data;

    @SerializedName("msg")
    private final String msg;

    @SerializedName(SpeechUtility.TAG_RESOURCE_RET)
    private final Integer ret;

    @SerializedName("total")
    private final Integer total;

    public ApiResponse() {
        this(null, 0, null, null, null, 31, null);
    }

    public ApiResponse(T t, int i, Integer num, String str, Integer num2) {
        this.data = t;
        this.code = i;
        this.ret = num;
        this.msg = str;
        this.total = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResponse copy$default(ApiResponse apiResponse, Object obj, int i, Integer num, String str, Integer num2, int i2, Object obj2) {
        T t = obj;
        if ((i2 & 1) != 0) {
            t = apiResponse.data;
        }
        if ((i2 & 2) != 0) {
            i = apiResponse.code;
        }
        if ((i2 & 4) != 0) {
            num = apiResponse.ret;
        }
        if ((i2 & 8) != 0) {
            str = apiResponse.msg;
        }
        if ((i2 & 16) != 0) {
            num2 = apiResponse.total;
        }
        Integer num3 = num2;
        Integer num4 = num;
        return apiResponse.copy(t, i, num4, str, num3);
    }

    public final T component1() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getRet() {
        return this.ret;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getTotal() {
        return this.total;
    }

    public final ApiResponse<T> copy(T data, int code, Integer ret, String msg, Integer total) {
        return new ApiResponse<>(data, code, ret, msg, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiResponse)) {
            return false;
        }
        ApiResponse apiResponse = (ApiResponse) other;
        return Intrinsics.areEqual(this.data, apiResponse.data) && this.code == apiResponse.code && Intrinsics.areEqual(this.ret, apiResponse.ret) && Intrinsics.areEqual(this.msg, apiResponse.msg) && Intrinsics.areEqual(this.total, apiResponse.total);
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final Integer getRet() {
        return this.ret;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        T t = this.data;
        int a2 = b.a(this.code, (t == null ? 0 : t.hashCode()) * 31, 31);
        Integer num = this.ret;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.msg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.total;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean isSuccess() {
        return this.code == 0;
    }

    public String toString() {
        return c.a("ApiResponse(data=").append(this.data).append(", code=").append(this.code).append(", ret=").append(this.ret).append(", msg=").append(this.msg).append(", total=").append(this.total).append(')').toString();
    }

    public /* synthetic */ ApiResponse(Object obj, int i, Integer num, String str, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : obj, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num2);
    }
}
