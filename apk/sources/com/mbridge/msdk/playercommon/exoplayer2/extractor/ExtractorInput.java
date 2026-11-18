package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface ExtractorInput {
    void advancePeekPosition(int r1) throws InterruptedException, IOException;

    boolean advancePeekPosition(int r1, boolean z) throws InterruptedException, IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int r2, int r3) throws InterruptedException, IOException;

    boolean peekFully(byte[] bArr, int r2, int r3, boolean z) throws InterruptedException, IOException;

    int read(byte[] bArr, int r2, int r3) throws InterruptedException, IOException;

    void readFully(byte[] bArr, int r2, int r3) throws InterruptedException, IOException;

    boolean readFully(byte[] bArr, int r2, int r3, boolean z) throws InterruptedException, IOException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable;

    int skip(int r1) throws InterruptedException, IOException;

    void skipFully(int r1) throws InterruptedException, IOException;

    boolean skipFully(int r1, boolean z) throws InterruptedException, IOException;
}
