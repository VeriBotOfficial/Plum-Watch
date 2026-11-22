package com.wakeup.common.network.entity.baidu;

import android.gov.nist.core.Separators;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiduAiBean.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/baidu/DcsDirective;", "", "header", "Lcom/wakeup/common/network/entity/baidu/DcsDirectiveHeader;", "payload", "Lcom/google/gson/JsonObject;", "<init>", "(Lcom/wakeup/common/network/entity/baidu/DcsDirectiveHeader;Lcom/google/gson/JsonObject;)V", "getHeader", "()Lcom/wakeup/common/network/entity/baidu/DcsDirectiveHeader;", "getPayload", "()Lcom/google/gson/JsonObject;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DcsDirective {
    private final DcsDirectiveHeader header;
    private final JsonObject payload;

    public static /* synthetic */ DcsDirective copy$default(DcsDirective dcsDirective, DcsDirectiveHeader dcsDirectiveHeader, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            dcsDirectiveHeader = dcsDirective.header;
        }
        if ((i & 2) != 0) {
            jsonObject = dcsDirective.payload;
        }
        return dcsDirective.copy(dcsDirectiveHeader, jsonObject);
    }

    /* renamed from: component1, reason: from getter */
    public final DcsDirectiveHeader getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final JsonObject getPayload() {
        return this.payload;
    }

    public final DcsDirective copy(DcsDirectiveHeader header, JsonObject payload) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new DcsDirective(header, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DcsDirective)) {
            return false;
        }
        DcsDirective dcsDirective = (DcsDirective) other;
        return Intrinsics.areEqual(this.header, dcsDirective.header) && Intrinsics.areEqual(this.payload, dcsDirective.payload);
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.payload.hashCode();
    }

    public String toString() {
        return "DcsDirective(header=" + this.header + ", payload=" + this.payload + Separators.RPAREN;
    }

    public DcsDirective(DcsDirectiveHeader header, JsonObject payload) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.header = header;
        this.payload = payload;
    }

    public final DcsDirectiveHeader getHeader() {
        return this.header;
    }

    public final JsonObject getPayload() {
        return this.payload;
    }
}
