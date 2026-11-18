package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes15.dex */
public final class GooglePlayServicesNotAvailableException extends Exception {
    public final int errorCode;

    public GooglePlayServicesNotAvailableException(int r1) {
        this.errorCode = r1;
    }
}
