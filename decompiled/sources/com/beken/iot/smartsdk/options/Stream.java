package com.beken.iot.smartsdk.options;

import io.nats.client.support.ApiConstants;
import kotlin.Metadata;

/* compiled from: Params.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/beken/iot/smartsdk/options/Stream;", "", ApiConstants.STREAM, "", "(Ljava/lang/String;II)V", "getStream", "()I", "SINGLE_STREAM", "DUAL_STREAM", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public enum Stream {
    SINGLE_STREAM(0),
    DUAL_STREAM(1);

    private final int stream;

    Stream(int i) {
        this.stream = i;
    }

    public final int getStream() {
        return this.stream;
    }
}
