package com.wakeup.common.network.entity.wechat;

import android.gov.nist.core.Separators;
import com.iflytek.cloud.SpeechUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GeWechatResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/wechat/VerifyComplete;", "", SpeechUtility.TAG_RESOURCE_RET, "", "data", "", "runTime", "runInfo", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRet", "()I", "getData", "()Ljava/lang/String;", "getRunTime", "getRunInfo", "setRunInfo", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VerifyComplete {
    private final String data;
    private final int ret;
    private String runInfo;
    private final String runTime;

    public static /* synthetic */ VerifyComplete copy$default(VerifyComplete verifyComplete, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = verifyComplete.ret;
        }
        if ((i2 & 2) != 0) {
            str = verifyComplete.data;
        }
        if ((i2 & 4) != 0) {
            str2 = verifyComplete.runTime;
        }
        if ((i2 & 8) != 0) {
            str3 = verifyComplete.runInfo;
        }
        return verifyComplete.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRet() {
        return this.ret;
    }

    /* renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRunTime() {
        return this.runTime;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRunInfo() {
        return this.runInfo;
    }

    public final VerifyComplete copy(int ret, String data, String runTime, String runInfo) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(runTime, "runTime");
        return new VerifyComplete(ret, data, runTime, runInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyComplete)) {
            return false;
        }
        VerifyComplete verifyComplete = (VerifyComplete) other;
        return this.ret == verifyComplete.ret && Intrinsics.areEqual(this.data, verifyComplete.data) && Intrinsics.areEqual(this.runTime, verifyComplete.runTime) && Intrinsics.areEqual(this.runInfo, verifyComplete.runInfo);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.ret) * 31) + this.data.hashCode()) * 31) + this.runTime.hashCode()) * 31;
        String str = this.runInfo;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VerifyComplete(ret=" + this.ret + ", data=" + this.data + ", runTime=" + this.runTime + ", runInfo=" + this.runInfo + Separators.RPAREN;
    }

    public VerifyComplete(int i, String data, String runTime, String str) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(runTime, "runTime");
        this.ret = i;
        this.data = data;
        this.runTime = runTime;
        this.runInfo = str;
    }

    public final int getRet() {
        return this.ret;
    }

    public final String getData() {
        return this.data;
    }

    public final String getRunTime() {
        return this.runTime;
    }

    public final String getRunInfo() {
        return this.runInfo;
    }

    public final void setRunInfo(String str) {
        this.runInfo = str;
    }
}
