package com.wakeup.feature.newsdaily.model;

import android.gov.nist.core.Separators;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsModels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/wakeup/feature/newsdaily/model/TranscriptLine;", "", ViewProps.ROLE, "", "text", "startMs", "", "endMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getRole", "()Ljava/lang/String;", "getText", "getStartMs", "()J", "getEndMs", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-newsdaily_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TranscriptLine {
    private final long endMs;
    private final String role;
    private final long startMs;
    private final String text;

    public TranscriptLine() {
        this(null, null, 0L, 0L, 15, null);
    }

    public static /* synthetic */ TranscriptLine copy$default(TranscriptLine transcriptLine, String str, String str2, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transcriptLine.role;
        }
        if ((i & 2) != 0) {
            str2 = transcriptLine.text;
        }
        if ((i & 4) != 0) {
            j = transcriptLine.startMs;
        }
        if ((i & 8) != 0) {
            j2 = transcriptLine.endMs;
        }
        long j3 = j2;
        return transcriptLine.copy(str, str2, j, j3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStartMs() {
        return this.startMs;
    }

    /* renamed from: component4, reason: from getter */
    public final long getEndMs() {
        return this.endMs;
    }

    public final TranscriptLine copy(String role, String text, long startMs, long endMs) {
        return new TranscriptLine(role, text, startMs, endMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranscriptLine)) {
            return false;
        }
        TranscriptLine transcriptLine = (TranscriptLine) other;
        return Intrinsics.areEqual(this.role, transcriptLine.role) && Intrinsics.areEqual(this.text, transcriptLine.text) && this.startMs == transcriptLine.startMs && this.endMs == transcriptLine.endMs;
    }

    public int hashCode() {
        String str = this.role;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.startMs)) * 31) + Long.hashCode(this.endMs);
    }

    public String toString() {
        return "TranscriptLine(role=" + this.role + ", text=" + this.text + ", startMs=" + this.startMs + ", endMs=" + this.endMs + Separators.RPAREN;
    }

    public TranscriptLine(String str, String str2, long j, long j2) {
        this.role = str;
        this.text = str2;
        this.startMs = j;
        this.endMs = j2;
    }

    public /* synthetic */ TranscriptLine(String str, String str2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2);
    }

    public final String getRole() {
        return this.role;
    }

    public final String getText() {
        return this.text;
    }

    public final long getStartMs() {
        return this.startMs;
    }

    public final long getEndMs() {
        return this.endMs;
    }
}
