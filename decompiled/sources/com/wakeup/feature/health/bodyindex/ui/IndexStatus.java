package com.wakeup.feature.health.bodyindex.ui;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthIndexUiMapper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/ui/IndexStatus;", "", "emoji", "", "text", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmoji", "()Ljava/lang/String;", "getText", "getDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IndexStatus {
    public static final int $stable = 0;
    private final String desc;
    private final String emoji;
    private final String text;

    public static /* synthetic */ IndexStatus copy$default(IndexStatus indexStatus, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = indexStatus.emoji;
        }
        if ((i & 2) != 0) {
            str2 = indexStatus.text;
        }
        if ((i & 4) != 0) {
            str3 = indexStatus.desc;
        }
        return indexStatus.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    public final IndexStatus copy(String emoji, String text, String desc) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new IndexStatus(emoji, text, desc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexStatus)) {
            return false;
        }
        IndexStatus indexStatus = (IndexStatus) other;
        return Intrinsics.areEqual(this.emoji, indexStatus.emoji) && Intrinsics.areEqual(this.text, indexStatus.text) && Intrinsics.areEqual(this.desc, indexStatus.desc);
    }

    public int hashCode() {
        return (((this.emoji.hashCode() * 31) + this.text.hashCode()) * 31) + this.desc.hashCode();
    }

    public String toString() {
        return "IndexStatus(emoji=" + this.emoji + ", text=" + this.text + ", desc=" + this.desc + Separators.RPAREN;
    }

    public IndexStatus(String emoji, String text, String desc) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.emoji = emoji;
        this.text = text;
        this.desc = desc;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getText() {
        return this.text;
    }

    public final String getDesc() {
        return this.desc;
    }
}
