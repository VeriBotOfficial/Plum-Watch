package com.efs.sdk.base.custommapping;

/* JADX INFO: loaded from: classes11.dex */
public interface IUMPerfCallback {
    void onCallback(PerfType perfType);

    public enum PerfType {
        PERF_TYPE_START(1),
        PERF_TYPE_POWER(2);

        int mType;

        PerfType(int r3) {
            this.mType = r3;
        }

        public final int getType() {
            return this.mType;
        }
    }
}
