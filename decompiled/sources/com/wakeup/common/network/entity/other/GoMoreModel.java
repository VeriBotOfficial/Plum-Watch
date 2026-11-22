package com.wakeup.common.network.entity.other;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoMoreModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/other/GoMoreModel;", "", "status", "", "key", "", "hash", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getStatus", "()I", "getKey", "()Ljava/lang/String;", "getHash", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GoMoreModel {
    private final String hash;
    private final String key;
    private final int status;

    public static /* synthetic */ GoMoreModel copy$default(GoMoreModel goMoreModel, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = goMoreModel.status;
        }
        if ((i2 & 2) != 0) {
            str = goMoreModel.key;
        }
        if ((i2 & 4) != 0) {
            str2 = goMoreModel.hash;
        }
        return goMoreModel.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    public final GoMoreModel copy(int status, String key, String hash) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(hash, "hash");
        return new GoMoreModel(status, key, hash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoMoreModel)) {
            return false;
        }
        GoMoreModel goMoreModel = (GoMoreModel) other;
        return this.status == goMoreModel.status && Intrinsics.areEqual(this.key, goMoreModel.key) && Intrinsics.areEqual(this.hash, goMoreModel.hash);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.status) * 31) + this.key.hashCode()) * 31) + this.hash.hashCode();
    }

    public String toString() {
        return "GoMoreModel(status=" + this.status + ", key=" + this.key + ", hash=" + this.hash + Separators.RPAREN;
    }

    public GoMoreModel(int i, String key, String hash) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(hash, "hash");
        this.status = i;
        this.key = key;
        this.hash = hash;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getHash() {
        return this.hash;
    }
}
