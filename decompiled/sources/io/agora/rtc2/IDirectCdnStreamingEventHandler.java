package io.agora.rtc2;

/* loaded from: classes6.dex */
public interface IDirectCdnStreamingEventHandler {
    void onDirectCdnStreamingStateChanged(DirectCdnStreamingState state, DirectCdnStreamingReason reason, String message);

    void onDirectCdnStreamingStats(DirectCdnStreamingStats stats);
}
