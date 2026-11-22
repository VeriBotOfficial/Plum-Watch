package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import com.iflytek.cloud.SpeechUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u0012\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J2\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/GeWechatResult;", "T", "", SpeechUtility.TAG_RESOURCE_RET, "", "data", "msg", "", "<init>", "(ILjava/lang/Object;Ljava/lang/String;)V", "getRet", "()I", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/Object;Ljava/lang/String;)Lcom/wakeup/common/network/entity/wechat/GeWechatResult;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GeWechatResult<T> {
    private final T data;
    private final String msg;
    private final int ret;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GeWechatResult copy$default(GeWechatResult geWechatResult, int i, Object obj, String str, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = geWechatResult.ret;
        }
        if ((i2 & 2) != 0) {
            obj = geWechatResult.data;
        }
        if ((i2 & 4) != 0) {
            str = geWechatResult.msg;
        }
        return geWechatResult.copy(i, obj, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRet() {
        return this.ret;
    }

    public final T component2() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final GeWechatResult<T> copy(int ret, T data, String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new GeWechatResult<>(ret, data, msg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeWechatResult)) {
            return false;
        }
        GeWechatResult geWechatResult = (GeWechatResult) other;
        return this.ret == geWechatResult.ret && Intrinsics.areEqual(this.data, geWechatResult.data) && Intrinsics.areEqual(this.msg, geWechatResult.msg);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.ret) * 31;
        T t = this.data;
        return ((hashCode + (t == null ? 0 : t.hashCode())) * 31) + this.msg.hashCode();
    }

    public String toString() {
        return "GeWechatResult(ret=" + this.ret + ", data=" + this.data + ", msg=" + this.msg + Separators.RPAREN;
    }

    public GeWechatResult(int i, T t, String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.ret = i;
        this.data = t;
        this.msg = msg;
    }

    public final int getRet() {
        return this.ret;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMsg() {
        return this.msg;
    }
}
