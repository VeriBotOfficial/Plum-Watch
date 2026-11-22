package com.beken.iot.smartsdk.options;

import kotlin.Metadata;

/* compiled from: Params.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/beken/iot/smartsdk/options/AudioFormat;", "", "format", "", "(Ljava/lang/String;II)V", "getFormat", "()I", "G711A", "PCM", "G711U", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public enum AudioFormat {
    G711A(1),
    PCM(2),
    G711U(3);

    private final int format;

    AudioFormat(int i) {
        this.format = i;
    }

    public final int getFormat() {
        return this.format;
    }
}
