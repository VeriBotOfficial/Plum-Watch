package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LrcLine.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/feature/aimusic/model/LrcLine;", "", "timeMs", "", "text", "", "<init>", "(JLjava/lang/String;)V", "getTimeMs", "()J", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LrcLine {
    private final String text;
    private final long timeMs;

    public static /* synthetic */ LrcLine copy$default(LrcLine lrcLine, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = lrcLine.timeMs;
        }
        if ((i & 2) != 0) {
            str = lrcLine.text;
        }
        return lrcLine.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimeMs() {
        return this.timeMs;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final LrcLine copy(long timeMs, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new LrcLine(timeMs, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LrcLine)) {
            return false;
        }
        LrcLine lrcLine = (LrcLine) other;
        return this.timeMs == lrcLine.timeMs && Intrinsics.areEqual(this.text, lrcLine.text);
    }

    public int hashCode() {
        return (Long.hashCode(this.timeMs) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "LrcLine(timeMs=" + this.timeMs + ", text=" + this.text + Separators.RPAREN;
    }

    public LrcLine(long j, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.timeMs = j;
        this.text = text;
    }

    public final long getTimeMs() {
        return this.timeMs;
    }

    public final String getText() {
        return this.text;
    }
}
