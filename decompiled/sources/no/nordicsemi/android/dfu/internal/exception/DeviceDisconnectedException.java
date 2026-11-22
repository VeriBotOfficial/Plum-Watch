package no.nordicsemi.android.dfu.internal.exception;

import android.gov.nist.core.Separators;

/* loaded from: classes8.dex */
public class DeviceDisconnectedException extends Exception {
    private static final long serialVersionUID = -6901728550661937942L;
    private final int mError;

    public DeviceDisconnectedException(String str, int i) {
        super(str);
        this.mError = i;
    }

    public int getErrorNumber() {
        return this.mError;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + " (error " + (this.mError & (-32769)) + Separators.RPAREN;
    }
}
