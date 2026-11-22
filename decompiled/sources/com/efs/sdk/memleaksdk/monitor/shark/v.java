package com.efs.sdk.memleaksdk.monitor.shark;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes14.dex */
public interface v extends Closeable {
    long b(l lVar, long j) throws IOException;

    void close() throws IOException;
}
