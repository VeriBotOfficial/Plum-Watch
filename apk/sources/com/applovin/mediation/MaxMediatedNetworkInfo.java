package com.applovin.mediation;

/* JADX INFO: loaded from: classes16.dex */
public interface MaxMediatedNetworkInfo {

    public enum InitializationStatus {
        NOT_INITIALIZED(-4),
        DOES_NOT_APPLY(-3),
        INITIALIZING(-2),
        INITIALIZED_UNKNOWN(-1),
        INITIALIZED_FAILURE(0),
        INITIALIZED_SUCCESS(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6631a;

        InitializationStatus(int r3) {
            this.f6631a = r3;
        }

        public static InitializationStatus fromCode(int r5) {
            for (InitializationStatus initializationStatus : values()) {
                if (initializationStatus.getCode() == r5) {
                    return initializationStatus;
                }
            }
            return NOT_INITIALIZED;
        }

        public int getCode() {
            return this.f6631a;
        }
    }

    String getAdapterClassName();

    String getAdapterVersion();

    InitializationStatus getInitializationStatus();

    String getName();

    String getSdkVersion();
}
