package com.wakeup.common.network.entity.map;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiMapSearchResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000e\u0010\u0013\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ2\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/network/entity/map/BaiMapSearchResult;", "T", "", "message", "", "status", "", "results", "<init>", "(Ljava/lang/String;ILjava/lang/Object;)V", "getMessage", "()Ljava/lang/String;", "getStatus", "()I", "getResults", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ILjava/lang/Object;)Lcom/wakeup/common/network/entity/map/BaiMapSearchResult;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BaiMapSearchResult<T> {
    private final String message;
    private final T results;
    private final int status;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaiMapSearchResult copy$default(BaiMapSearchResult baiMapSearchResult, String str, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = baiMapSearchResult.message;
        }
        if ((i2 & 2) != 0) {
            i = baiMapSearchResult.status;
        }
        if ((i2 & 4) != 0) {
            obj = baiMapSearchResult.results;
        }
        return baiMapSearchResult.copy(str, i, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final T component3() {
        return this.results;
    }

    public final BaiMapSearchResult<T> copy(String message, int status, T results) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new BaiMapSearchResult<>(message, status, results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaiMapSearchResult)) {
            return false;
        }
        BaiMapSearchResult baiMapSearchResult = (BaiMapSearchResult) other;
        return Intrinsics.areEqual(this.message, baiMapSearchResult.message) && this.status == baiMapSearchResult.status && Intrinsics.areEqual(this.results, baiMapSearchResult.results);
    }

    public int hashCode() {
        int hashCode = ((this.message.hashCode() * 31) + Integer.hashCode(this.status)) * 31;
        T t = this.results;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "BaiMapSearchResult(message=" + this.message + ", status=" + this.status + ", results=" + this.results + Separators.RPAREN;
    }

    public BaiMapSearchResult(String message, int i, T t) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.status = i;
        this.results = t;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatus() {
        return this.status;
    }

    public final T getResults() {
        return this.results;
    }
}
