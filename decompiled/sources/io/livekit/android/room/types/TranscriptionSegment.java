package io.livekit.android.room.types;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TranscriptionSegment.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, d2 = {"Lio/livekit/android/room/types/TranscriptionSegment;", "", "id", "", "text", "language", "final", "", "firstReceivedTime", "", "lastReceivedTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJ)V", "getFinal", "()Z", "getFirstReceivedTime", "()J", "getId", "()Ljava/lang/String;", "getLanguage", "getLastReceivedTime", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TranscriptionSegment {
    private final boolean final;
    private final long firstReceivedTime;
    private final String id;
    private final String language;
    private final long lastReceivedTime;
    private final String text;

    public static /* synthetic */ TranscriptionSegment copy$default(TranscriptionSegment transcriptionSegment, String str, String str2, String str3, boolean z, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transcriptionSegment.id;
        }
        if ((i & 2) != 0) {
            str2 = transcriptionSegment.text;
        }
        if ((i & 4) != 0) {
            str3 = transcriptionSegment.language;
        }
        if ((i & 8) != 0) {
            z = transcriptionSegment.final;
        }
        if ((i & 16) != 0) {
            j = transcriptionSegment.firstReceivedTime;
        }
        if ((i & 32) != 0) {
            j2 = transcriptionSegment.lastReceivedTime;
        }
        long j3 = j2;
        long j4 = j;
        return transcriptionSegment.copy(str, str2, str3, z, j4, j3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getFinal() {
        return this.final;
    }

    /* renamed from: component5, reason: from getter */
    public final long getFirstReceivedTime() {
        return this.firstReceivedTime;
    }

    /* renamed from: component6, reason: from getter */
    public final long getLastReceivedTime() {
        return this.lastReceivedTime;
    }

    public final TranscriptionSegment copy(String id2, String text, String language, boolean r14, long firstReceivedTime, long lastReceivedTime) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(language, "language");
        return new TranscriptionSegment(id2, text, language, r14, firstReceivedTime, lastReceivedTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranscriptionSegment)) {
            return false;
        }
        TranscriptionSegment transcriptionSegment = (TranscriptionSegment) other;
        return Intrinsics.areEqual(this.id, transcriptionSegment.id) && Intrinsics.areEqual(this.text, transcriptionSegment.text) && Intrinsics.areEqual(this.language, transcriptionSegment.language) && this.final == transcriptionSegment.final && this.firstReceivedTime == transcriptionSegment.firstReceivedTime && this.lastReceivedTime == transcriptionSegment.lastReceivedTime;
    }

    public String toString() {
        return "TranscriptionSegment(id=" + this.id + ", text=" + this.text + ", language=" + this.language + ", final=" + this.final + ", firstReceivedTime=" + this.firstReceivedTime + ", lastReceivedTime=" + this.lastReceivedTime + ')';
    }

    public TranscriptionSegment(String id2, String text, String language, boolean z, long j, long j2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(language, "language");
        this.id = id2;
        this.text = text;
        this.language = language;
        this.final = z;
        this.firstReceivedTime = j;
        this.lastReceivedTime = j2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final boolean getFinal() {
        return this.final;
    }

    public /* synthetic */ TranscriptionSegment(String str, String str2, String str3, boolean z, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, (i & 16) != 0 ? new Date().getTime() : j, (i & 32) != 0 ? new Date().getTime() : j2);
    }

    public final long getFirstReceivedTime() {
        return this.firstReceivedTime;
    }

    public final long getLastReceivedTime() {
        return this.lastReceivedTime;
    }

    public int hashCode() {
        return this.id.hashCode();
    }
}
