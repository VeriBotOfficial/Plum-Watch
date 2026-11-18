package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public interface BandwidthMeter {

    public interface EventListener {
        void onBandwidthSample(int r1, long j, long j2);
    }

    long getBitrateEstimate();
}
