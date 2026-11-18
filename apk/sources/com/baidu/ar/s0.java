package com.baidu.ar;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public interface s0 {
    void onAudioFrameAvailable(ByteBuffer byteBuffer, int r2, long j);

    void onAudioRelease();

    void onAudioSetup(boolean z);

    void onAudioStart(boolean z);

    void onAudioStop(boolean z);
}
