package com.wakeup.howear.model.entity.other;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BusCodeModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006$"}, d2 = {"Lcom/wakeup/howear/model/entity/other/BusCodeParams;", "", "code", "", "data", "", "trackId", "cmdIdentifier", "message", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getTrackId", "setTrackId", "getCmdIdentifier", "setCmdIdentifier", "getMessage", "setMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BusCodeParams {
    private String cmdIdentifier;
    private int code;
    private String data;
    private String message;
    private String trackId;

    public static /* synthetic */ BusCodeParams copy$default(BusCodeParams busCodeParams, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = busCodeParams.code;
        }
        if ((i2 & 2) != 0) {
            str = busCodeParams.data;
        }
        if ((i2 & 4) != 0) {
            str2 = busCodeParams.trackId;
        }
        if ((i2 & 8) != 0) {
            str3 = busCodeParams.cmdIdentifier;
        }
        if ((i2 & 16) != 0) {
            str4 = busCodeParams.message;
        }
        String str5 = str4;
        String str6 = str2;
        return busCodeParams.copy(i, str, str6, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCmdIdentifier() {
        return this.cmdIdentifier;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final BusCodeParams copy(int code, String data, String trackId, String cmdIdentifier, String message) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        Intrinsics.checkNotNullParameter(cmdIdentifier, "cmdIdentifier");
        Intrinsics.checkNotNullParameter(message, "message");
        return new BusCodeParams(code, data, trackId, cmdIdentifier, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BusCodeParams)) {
            return false;
        }
        BusCodeParams busCodeParams = (BusCodeParams) other;
        return this.code == busCodeParams.code && Intrinsics.areEqual(this.data, busCodeParams.data) && Intrinsics.areEqual(this.trackId, busCodeParams.trackId) && Intrinsics.areEqual(this.cmdIdentifier, busCodeParams.cmdIdentifier) && Intrinsics.areEqual(this.message, busCodeParams.message);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.code) * 31) + this.data.hashCode()) * 31) + this.trackId.hashCode()) * 31) + this.cmdIdentifier.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "BusCodeParams(code=" + this.code + ", data=" + this.data + ", trackId=" + this.trackId + ", cmdIdentifier=" + this.cmdIdentifier + ", message=" + this.message + Separators.RPAREN;
    }

    public BusCodeParams(int i, String data, String trackId, String cmdIdentifier, String message) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        Intrinsics.checkNotNullParameter(cmdIdentifier, "cmdIdentifier");
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = i;
        this.data = data;
        this.trackId = trackId;
        this.cmdIdentifier = cmdIdentifier;
        this.message = message;
    }

    public final int getCode() {
        return this.code;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final String getData() {
        return this.data;
    }

    public final void setData(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final void setTrackId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.trackId = str;
    }

    public final String getCmdIdentifier() {
        return this.cmdIdentifier;
    }

    public final void setCmdIdentifier(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cmdIdentifier = str;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }
}
