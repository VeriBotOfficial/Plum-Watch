package io.agora.rtc2;

/* loaded from: classes6.dex */
public interface IH265Transcoder {
    int enableTranscode(String token, String channel, int uid);

    int queryChannel(String token, String channel, int uid);

    int registerTranscoderObserver(IH265TranscoderObserver observer);

    int triggerTranscode(String token, String channel, int uid);

    int unregisterTranscoderObserver(IH265TranscoderObserver observer);
}
