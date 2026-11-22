package org.apache.commons.net.util;

import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes8.dex */
public class SSLSocketUtils {
    public static boolean enableEndpointNameVerification(SSLSocket sSLSocket) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (sSLParameters == null) {
            return false;
        }
        sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
        sSLSocket.setSSLParameters(sSLParameters);
        return true;
    }

    private SSLSocketUtils() {
    }
}
