package com.mbridge.msdk.playercommon.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public interface AudioProcessor {
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledFormatException extends Exception {
        public UnhandledFormatException(int r3, int r4, int r5) {
            super("Unhandled format: " + r3 + " Hz, " + r4 + " channels in encoding " + r5);
        }
    }

    boolean configure(int r1, int r2, int r3) throws UnhandledFormatException;

    void flush();

    ByteBuffer getOutput();

    int getOutputChannelCount();

    int getOutputEncoding();

    int getOutputSampleRateHz();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
