package livekit.org.webrtc;

/* loaded from: classes8.dex */
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();

    void reportEncodedFrame(int size);

    void setTargets(int targetBitrateBps, double targetFramerateFps);
}
