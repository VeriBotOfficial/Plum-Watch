package com.efs.sdk.base.custommapping;

/* loaded from: classes14.dex */
public interface IUMPerfCallback {
    void onCallback(PerfType perfType);

    public enum PerfType {
        PERF_TYPE_START(1),
        PERF_TYPE_POWER(2);

        int mType;

        PerfType(int i) {
            this.mType = i;
        }

        public final int getType() {
            return this.mType;
        }
    }
}
