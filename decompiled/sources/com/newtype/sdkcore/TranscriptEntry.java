package com.newtype.sdkcore;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewTypeModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/newtype/sdkcore/TranscriptEntry;", "", "id", "", "speaker", "text", "meta", "streaming", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getSpeaker", "getText", "getMeta", "getStreaming", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TranscriptEntry {
    private final String id;
    private final String meta;
    private final String speaker;
    private final boolean streaming;
    private final String text;

    public static /* synthetic */ TranscriptEntry copy$default(TranscriptEntry transcriptEntry, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transcriptEntry.id;
        }
        if ((i & 2) != 0) {
            str2 = transcriptEntry.speaker;
        }
        if ((i & 4) != 0) {
            str3 = transcriptEntry.text;
        }
        if ((i & 8) != 0) {
            str4 = transcriptEntry.meta;
        }
        if ((i & 16) != 0) {
            z = transcriptEntry.streaming;
        }
        boolean z2 = z;
        String str5 = str3;
        return transcriptEntry.copy(str, str2, str5, str4, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSpeaker() {
        return this.speaker;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMeta() {
        return this.meta;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getStreaming() {
        return this.streaming;
    }

    public final TranscriptEntry copy(String id2, String speaker, String text, String meta, boolean streaming) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(speaker, "speaker");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(meta, "meta");
        return new TranscriptEntry(id2, speaker, text, meta, streaming);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranscriptEntry)) {
            return false;
        }
        TranscriptEntry transcriptEntry = (TranscriptEntry) other;
        return Intrinsics.areEqual(this.id, transcriptEntry.id) && Intrinsics.areEqual(this.speaker, transcriptEntry.speaker) && Intrinsics.areEqual(this.text, transcriptEntry.text) && Intrinsics.areEqual(this.meta, transcriptEntry.meta) && this.streaming == transcriptEntry.streaming;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.speaker.hashCode()) * 31) + this.text.hashCode()) * 31) + this.meta.hashCode()) * 31) + Boolean.hashCode(this.streaming);
    }

    public String toString() {
        return "TranscriptEntry(id=" + this.id + ", speaker=" + this.speaker + ", text=" + this.text + ", meta=" + this.meta + ", streaming=" + this.streaming + Separators.RPAREN;
    }

    public TranscriptEntry(String id2, String speaker, String text, String meta, boolean z) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(speaker, "speaker");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.id = id2;
        this.speaker = speaker;
        this.text = text;
        this.meta = meta;
        this.streaming = z;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSpeaker() {
        return this.speaker;
    }

    public final String getText() {
        return this.text;
    }

    public /* synthetic */ TranscriptEntry(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z);
    }

    public final String getMeta() {
        return this.meta;
    }

    public final boolean getStreaming() {
        return this.streaming;
    }
}
