package livekit.org.webrtc;

/* loaded from: classes8.dex */
class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps;
    protected double targetFramerateFps;

    @Override // livekit.org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int size) {
    }

    BaseBitrateAdjuster() {
    }

    @Override // livekit.org.webrtc.BitrateAdjuster
    public void setTargets(int targetBitrateBps, double targetFramerateFps) {
        this.targetBitrateBps = targetBitrateBps;
        this.targetFramerateFps = targetFramerateFps;
    }

    @Override // livekit.org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override // livekit.org.webrtc.BitrateAdjuster
    public double getAdjustedFramerateFps() {
        return this.targetFramerateFps;
    }
}
