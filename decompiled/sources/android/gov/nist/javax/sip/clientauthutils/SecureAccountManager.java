package android.gov.nist.javax.sip.clientauthutils;

import android.javax.sip.ClientTransaction;

/* loaded from: classes.dex */
public interface SecureAccountManager {
    UserCredentialHash getCredentialHash(ClientTransaction clientTransaction, String str);
}
