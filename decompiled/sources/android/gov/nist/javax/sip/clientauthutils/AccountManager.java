package android.gov.nist.javax.sip.clientauthutils;

import android.javax.sip.ClientTransaction;

/* loaded from: classes.dex */
public interface AccountManager {
    UserCredentials getCredentials(ClientTransaction clientTransaction, String str);
}
