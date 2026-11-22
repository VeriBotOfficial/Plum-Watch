package com.wakeup.common.network.entity.gpt;

import android.gov.nist.core.Separators;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GptResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/gpt/GptResultData;", "", "status", "", "content", "", ViewProps.ROLE, "<init>", "(ILjava/lang/String;I)V", "getStatus", "()I", "getContent", "()Ljava/lang/String;", "getRole", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GptResultData {
    private final String content;
    private final int role;
    private final int status;

    public static /* synthetic */ GptResultData copy$default(GptResultData gptResultData, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = gptResultData.status;
        }
        if ((i3 & 2) != 0) {
            str = gptResultData.content;
        }
        if ((i3 & 4) != 0) {
            i2 = gptResultData.role;
        }
        return gptResultData.copy(i, str, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRole() {
        return this.role;
    }

    public final GptResultData copy(int status, String content, int role) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new GptResultData(status, content, role);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GptResultData)) {
            return false;
        }
        GptResultData gptResultData = (GptResultData) other;
        return this.status == gptResultData.status && Intrinsics.areEqual(this.content, gptResultData.content) && this.role == gptResultData.role;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.status) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.role);
    }

    public String toString() {
        return "GptResultData(status=" + this.status + ", content=" + this.content + ", role=" + this.role + Separators.RPAREN;
    }

    public GptResultData(int i, String content, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.status = i;
        this.content = content;
        this.role = i2;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getRole() {
        return this.role;
    }
}
