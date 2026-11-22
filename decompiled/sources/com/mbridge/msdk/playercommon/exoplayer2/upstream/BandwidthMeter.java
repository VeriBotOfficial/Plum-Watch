package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* loaded from: classes17.dex */
public interface BandwidthMeter {

    public interface EventListener {
        void onBandwidthSample(int i, long j, long j2);
    }

    long getBitrateEstimate();
}
