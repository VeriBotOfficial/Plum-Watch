package android.javax.sip.header;

import android.javax.sip.SipException;

/* loaded from: classes.dex */
public class TooManyHopsException extends SipException {
    public TooManyHopsException() {
    }

    public TooManyHopsException(String str) {
        super(str);
    }

    public TooManyHopsException(String str, Throwable th) {
        super(str, th);
    }
}
