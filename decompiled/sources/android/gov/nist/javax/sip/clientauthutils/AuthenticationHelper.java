package android.gov.nist.javax.sip.clientauthutils;

import android.javax.sip.ClientTransaction;
import android.javax.sip.SipException;
import android.javax.sip.SipProvider;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;

/* loaded from: classes.dex */
public interface AuthenticationHelper {
    ClientTransaction handleChallenge(Response response, ClientTransaction clientTransaction, SipProvider sipProvider, int i) throws SipException, NullPointerException;

    ClientTransaction handleChallenge(Response response, ClientTransaction clientTransaction, SipProvider sipProvider, int i, boolean z) throws SipException, NullPointerException;

    void removeCachedAuthenticationHeaders(String str);

    void setAuthenticationHeaders(Request request);
}
