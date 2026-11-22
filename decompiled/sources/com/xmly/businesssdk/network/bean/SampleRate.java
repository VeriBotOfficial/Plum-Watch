package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SampleRate.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/xmly/businesssdk/network/bean/SampleRate;", "", "is22kbps", "", "kind", "", "id", "", "(ZLjava/lang/String;J)V", "getId", "()J", "()Z", "getKind", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SampleRate {
    private final long id;

    @SerializedName("is_22kbps")
    private final boolean is22kbps;
    private final String kind;

    public SampleRate(boolean z, String str, long j) {
        this.is22kbps = z;
        this.kind = str;
        this.id = j;
    }

    public static /* synthetic */ SampleRate copy$default(SampleRate sampleRate, boolean z, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sampleRate.is22kbps;
        }
        if ((i & 2) != 0) {
            str = sampleRate.kind;
        }
        if ((i & 4) != 0) {
            j = sampleRate.id;
        }
        return sampleRate.copy(z, str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIs22kbps() {
        return this.is22kbps;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component3, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final SampleRate copy(boolean is22kbps, String kind, long id2) {
        return new SampleRate(is22kbps, kind, id2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SampleRate)) {
            return false;
        }
        SampleRate sampleRate = (SampleRate) other;
        return this.is22kbps == sampleRate.is22kbps && Intrinsics.areEqual(this.kind, sampleRate.kind) && this.id == sampleRate.id;
    }

    public final long getId() {
        return this.id;
    }

    public final String getKind() {
        return this.kind;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        boolean z = this.is22kbps;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.kind;
        return Long.hashCode(this.id) + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean is22kbps() {
        return this.is22kbps;
    }

    public String toString() {
        return c.a("SampleRate(is22kbps=").append(this.is22kbps).append(", kind=").append(this.kind).append(", id=").append(this.id).append(')').toString();
    }

    public /* synthetic */ SampleRate(boolean z, String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, j);
    }
}
