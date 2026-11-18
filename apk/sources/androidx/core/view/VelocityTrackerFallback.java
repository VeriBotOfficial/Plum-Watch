package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes8.dex */
class VelocityTrackerFallback {
    private static final long ASSUME_POINTER_STOPPED_MS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final long RANGE_MS = 100;
    private final float[] mMovements = new float[20];
    private final long[] mEventTimes = new long[20];
    private float mLastComputedVelocity = 0.0f;
    private int mDataPointsBufferSize = 0;
    private int mDataPointsBufferLastUsedIndex = 0;

    VelocityTrackerFallback() {
    }

    void addMovement(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.mDataPointsBufferSize != 0 && eventTime - this.mEventTimes[this.mDataPointsBufferLastUsedIndex] > ASSUME_POINTER_STOPPED_MS) {
            clear();
        }
        int r2 = (this.mDataPointsBufferLastUsedIndex + 1) % 20;
        this.mDataPointsBufferLastUsedIndex = r2;
        int r4 = this.mDataPointsBufferSize;
        if (r4 != 20) {
            this.mDataPointsBufferSize = r4 + 1;
        }
        this.mMovements[r2] = motionEvent.getAxisValue(26);
        this.mEventTimes[this.mDataPointsBufferLastUsedIndex] = eventTime;
    }

    void computeCurrentVelocity(int r2) {
        computeCurrentVelocity(r2, Float.MAX_VALUE);
    }

    void computeCurrentVelocity(int r2, float f) {
        float currentVelocity = getCurrentVelocity() * r2;
        this.mLastComputedVelocity = currentVelocity;
        if (currentVelocity < (-Math.abs(f))) {
            this.mLastComputedVelocity = -Math.abs(f);
        } else if (this.mLastComputedVelocity > Math.abs(f)) {
            this.mLastComputedVelocity = Math.abs(f);
        }
    }

    float getAxisVelocity(int r2) {
        if (r2 != 26) {
            return 0.0f;
        }
        return this.mLastComputedVelocity;
    }

    private void clear() {
        this.mDataPointsBufferSize = 0;
        this.mLastComputedVelocity = 0.0f;
    }

    private float getCurrentVelocity() {
        long[] jArr;
        long j;
        int r0 = this.mDataPointsBufferSize;
        if (r0 < 2) {
            return 0.0f;
        }
        int r3 = this.mDataPointsBufferLastUsedIndex;
        int r4 = ((r3 + 20) - (r0 - 1)) % 20;
        long j2 = this.mEventTimes[r3];
        while (true) {
            jArr = this.mEventTimes;
            j = jArr[r4];
            if (j2 - j <= 100) {
                break;
            }
            this.mDataPointsBufferSize--;
            r4 = (r4 + 1) % 20;
        }
        int r5 = this.mDataPointsBufferSize;
        if (r5 < 2) {
            return 0.0f;
        }
        if (r5 == 2) {
            int r6 = (r4 + 1) % 20;
            long j3 = jArr[r6];
            if (j == j3) {
                return 0.0f;
            }
            return this.mMovements[r6] / (j3 - j);
        }
        float fAbs = 0.0f;
        int r1 = 0;
        for (int r2 = 0; r2 < this.mDataPointsBufferSize - 1; r2++) {
            int r7 = r2 + r4;
            long[] jArr2 = this.mEventTimes;
            long j4 = jArr2[r7 % 20];
            int r8 = (r7 + 1) % 20;
            if (jArr2[r8] != j4) {
                r1++;
                float fKineticEnergyToVelocity = kineticEnergyToVelocity(fAbs);
                float f = this.mMovements[r8] / (this.mEventTimes[r8] - j4);
                fAbs += (f - fKineticEnergyToVelocity) * Math.abs(f);
                if (r1 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return kineticEnergyToVelocity(fAbs);
    }

    private static float kineticEnergyToVelocity(float f) {
        return (f < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }
}
