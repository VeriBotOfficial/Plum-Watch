package livekit.org.webrtc;

/* loaded from: classes8.dex */
class DynamicBitrateAdjuster extends BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    DynamicBitrateAdjuster() {
    }

    @Override // livekit.org.webrtc.BaseBitrateAdjuster, livekit.org.webrtc.BitrateAdjuster
    public void setTargets(int targetBitrateBps, double targetFramerateFps) {
        if (this.targetBitrateBps > 0 && targetBitrateBps < this.targetBitrateBps) {
            this.deviationBytes = (this.deviationBytes * targetBitrateBps) / this.targetBitrateBps;
        }
        super.setTargets(targetBitrateBps, targetFramerateFps);
    }

    @Override // livekit.org.webrtc.BaseBitrateAdjuster, livekit.org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int size) {
        if (this.targetFramerateFps == 0.0d) {
            return;
        }
        this.deviationBytes += size - ((this.targetBitrateBps / BITS_PER_BYTE) / this.targetFramerateFps);
        this.timeSinceLastAdjustmentMs += 1000.0d / this.targetFramerateFps;
        double d = this.targetBitrateBps / BITS_PER_BYTE;
        double d2 = 3.0d * d;
        double min = Math.min(this.deviationBytes, d2);
        this.deviationBytes = min;
        double max = Math.max(min, -d2);
        this.deviationBytes = max;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (max > d) {
            int i = this.bitrateAdjustmentScaleExp - ((int) ((max / d) + 0.5d));
            this.bitrateAdjustmentScaleExp = i;
            this.bitrateAdjustmentScaleExp = Math.max(i, -20);
            this.deviationBytes = d;
        } else {
            double d3 = -d;
            if (max < d3) {
                int i2 = this.bitrateAdjustmentScaleExp + ((int) (((-max) / d) + 0.5d));
                this.bitrateAdjustmentScaleExp = i2;
                this.bitrateAdjustmentScaleExp = Math.min(i2, 20);
                this.deviationBytes = d3;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    private double getBitrateAdjustmentScale() {
        return Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, this.bitrateAdjustmentScaleExp / 20.0d);
    }

    @Override // livekit.org.webrtc.BaseBitrateAdjuster, livekit.org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return (int) (this.targetBitrateBps * getBitrateAdjustmentScale());
    }
}
