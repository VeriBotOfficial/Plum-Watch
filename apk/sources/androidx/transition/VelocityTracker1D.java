package androidx.transition;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
class VelocityTracker1D {
    private static final int ASSUME_POINTER_MOVE_STOPPED_MILLIS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final int HORIZON_MILLIS = 100;
    private float[] mDataSamples = new float[20];
    private int mIndex = 0;
    private long[] mTimeSamples;

    VelocityTracker1D() {
        long[] jArr = new long[20];
        this.mTimeSamples = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public void addDataPoint(long j, float f) {
        int r0 = (this.mIndex + 1) % 20;
        this.mIndex = r0;
        this.mTimeSamples[r0] = j;
        this.mDataSamples[r0] = f;
    }

    public void resetTracking() {
        this.mIndex = 0;
        Arrays.fill(this.mTimeSamples, Long.MIN_VALUE);
        Arrays.fill(this.mDataSamples, 0.0f);
    }

    float calculateVelocity() {
        float fKineticEnergyToVelocity;
        int r0 = this.mIndex;
        if (r0 == 0 && this.mTimeSamples[r0] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j = this.mTimeSamples[r0];
        int r4 = 0;
        long j2 = j;
        while (true) {
            long j3 = this.mTimeSamples[r0];
            if (j3 == Long.MIN_VALUE) {
                break;
            }
            float f = j - j3;
            float fAbs = Math.abs(j3 - j2);
            if (f > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (r0 == 0) {
                r0 = 20;
            }
            r0--;
            r4++;
            if (r4 >= 20) {
                break;
            }
            j2 = j3;
        }
        if (r4 < 2) {
            return 0.0f;
        }
        if (r4 == 2) {
            int r1 = this.mIndex;
            int r2 = r1 == 0 ? 19 : r1 - 1;
            long[] jArr = this.mTimeSamples;
            float f2 = jArr[r1] - jArr[r2];
            if (f2 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.mDataSamples;
            fKineticEnergyToVelocity = (fArr[r1] - fArr[r2]) / f2;
        } else {
            int r3 = this.mIndex;
            int r5 = ((r3 - r4) + 21) % 20;
            int r6 = (r3 + 21) % 20;
            long j4 = this.mTimeSamples[r5];
            float f3 = this.mDataSamples[r5];
            int r7 = r5 + 1;
            float fKineticEnergyToVelocity2 = 0.0f;
            for (int r8 = r7 % 20; r8 != r6; r8 = (r8 + 1) % 20) {
                long j5 = this.mTimeSamples[r8];
                float f4 = j5 - j4;
                if (f4 != 0.0f) {
                    float f5 = this.mDataSamples[r8];
                    float f6 = (f5 - f3) / f4;
                    fKineticEnergyToVelocity2 += (f6 - kineticEnergyToVelocity(fKineticEnergyToVelocity2)) * Math.abs(f6);
                    if (r8 == r7) {
                        fKineticEnergyToVelocity2 *= 0.5f;
                    }
                    f3 = f5;
                    j4 = j5;
                }
            }
            fKineticEnergyToVelocity = kineticEnergyToVelocity(fKineticEnergyToVelocity2);
        }
        return fKineticEnergyToVelocity * 1000.0f;
    }

    private float kineticEnergyToVelocity(float f) {
        return (float) (((double) Math.signum(f)) * Math.sqrt(Math.abs(f) * 2.0f));
    }
}
