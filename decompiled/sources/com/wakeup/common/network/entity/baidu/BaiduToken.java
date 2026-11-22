package com.wakeup.common.network.entity.baidu;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiduToken.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/baidu/BaiduToken;", "", "token", "", "outTime", "", "<init>", "(Ljava/lang/String;J)V", "getToken", "()Ljava/lang/String;", "getOutTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BaiduToken {
    private final long outTime;
    private final String token;

    public static /* synthetic */ BaiduToken copy$default(BaiduToken baiduToken, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baiduToken.token;
        }
        if ((i & 2) != 0) {
            j = baiduToken.outTime;
        }
        return baiduToken.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final long getOutTime() {
        return this.outTime;
    }

    public final BaiduToken copy(String token, long outTime) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new BaiduToken(token, outTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaiduToken)) {
            return false;
        }
        BaiduToken baiduToken = (BaiduToken) other;
        return Intrinsics.areEqual(this.token, baiduToken.token) && this.outTime == baiduToken.outTime;
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + Long.hashCode(this.outTime);
    }

    public String toString() {
        return "BaiduToken(token=" + this.token + ", outTime=" + this.outTime + Separators.RPAREN;
    }

    public BaiduToken(String token, long j) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.outTime = j;
    }

    public final String getToken() {
        return this.token;
    }

    public final long getOutTime() {
        return this.outTime;
    }
}
