package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;

/* loaded from: classes10.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: id, reason: collision with root package name */
    public final String f1209id;

    public Id3Frame(String str) {
        this.f1209id = str;
    }

    public String toString() {
        return this.f1209id;
    }
}
