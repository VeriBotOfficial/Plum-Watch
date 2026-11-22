package com.wakeup.common.network;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\r\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000e\u0010\u0015\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ2\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/BaseResult;", "T", "Lcom/wakeup/common/network/IBaseResponse;", "msg", "", "code", "", "data", "<init>", "(Ljava/lang/String;ILjava/lang/Object;)V", "getMsg", "()Ljava/lang/String;", "getCode", "()I", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "isSuccess", "", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ILjava/lang/Object;)Lcom/wakeup/common/network/BaseResult;", "equals", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BaseResult<T> implements IBaseResponse<T> {
    private final int code;
    private final T data;

    @SerializedName(alternate = {"message"}, value = "msg")
    private final String msg;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseResult copy$default(BaseResult baseResult, String str, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = baseResult.msg;
        }
        if ((i2 & 2) != 0) {
            i = baseResult.code;
        }
        if ((i2 & 4) != 0) {
            obj = baseResult.data;
        }
        return baseResult.copy(str, i, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final int component2() {
        return this.code;
    }

    public final T component3() {
        return this.data;
    }

    public final BaseResult<T> copy(String msg, int code, T data) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new BaseResult<>(msg, code, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseResult)) {
            return false;
        }
        BaseResult baseResult = (BaseResult) other;
        return Intrinsics.areEqual(this.msg, baseResult.msg) && this.code == baseResult.code && Intrinsics.areEqual(this.data, baseResult.data);
    }

    public int hashCode() {
        int hashCode = ((this.msg.hashCode() * 31) + Integer.hashCode(this.code)) * 31;
        T t = this.data;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "BaseResult(msg=" + this.msg + ", code=" + this.code + ", data=" + this.data + Separators.RPAREN;
    }

    public BaseResult(String msg, int i, T t) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.msg = msg;
        this.code = i;
        this.data = t;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    @Override // com.wakeup.common.network.IBaseResponse
    /* renamed from: code, reason: from getter */
    public int getCode() {
        return this.code;
    }

    @Override // com.wakeup.common.network.IBaseResponse
    public String msg() {
        return this.msg;
    }

    @Override // com.wakeup.common.network.IBaseResponse
    public T data() {
        return this.data;
    }

    @Override // com.wakeup.common.network.IBaseResponse
    public boolean isSuccess() {
        return this.code == 200;
    }
}
