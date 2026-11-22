package com.wakeup.howear.model.entity.other;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BusCodeModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/wakeup/howear/model/entity/other/AliCheckAuth;", "", "sid", "", "data", "ver", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "(Ljava/lang/String;)V", "getSid", "()Ljava/lang/String;", "getData", "getVer", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AliCheckAuth {
    private final String data;
    private final String sid;
    private final int ver;

    public static /* synthetic */ AliCheckAuth copy$default(AliCheckAuth aliCheckAuth, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aliCheckAuth.sid;
        }
        if ((i2 & 2) != 0) {
            str2 = aliCheckAuth.data;
        }
        if ((i2 & 4) != 0) {
            i = aliCheckAuth.ver;
        }
        return aliCheckAuth.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVer() {
        return this.ver;
    }

    public final AliCheckAuth copy(String sid, String data, int ver) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(data, "data");
        return new AliCheckAuth(sid, data, ver);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AliCheckAuth)) {
            return false;
        }
        AliCheckAuth aliCheckAuth = (AliCheckAuth) other;
        return Intrinsics.areEqual(this.sid, aliCheckAuth.sid) && Intrinsics.areEqual(this.data, aliCheckAuth.data) && this.ver == aliCheckAuth.ver;
    }

    public int hashCode() {
        return (((this.sid.hashCode() * 31) + this.data.hashCode()) * 31) + Integer.hashCode(this.ver);
    }

    public String toString() {
        return "AliCheckAuth(sid=" + this.sid + ", data=" + this.data + ", ver=" + this.ver + Separators.RPAREN;
    }

    public AliCheckAuth(String sid, String data, int i) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(data, "data");
        this.sid = sid;
        this.data = data;
        this.ver = i;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getData() {
        return this.data;
    }

    public final int getVer() {
        return this.ver;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AliCheckAuth(String data) {
        this("FND", data, 1);
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
