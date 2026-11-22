package livekit.org.webrtc;

/* loaded from: classes8.dex */
class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int DEFAULT_FRAMERATE_FPS = 30;

    FramerateBitrateAdjuster() {
    }

    @Override // livekit.org.webrtc.BaseBitrateAdjuster, livekit.org.webrtc.BitrateAdjuster
    public void setTargets(int targetBitrateBps, double targetFramerateFps) {
        this.targetFramerateFps = 30.0d;
        this.targetBitrateBps = (int) ((targetBitrateBps * 30) / targetFramerateFps);
    }
}
