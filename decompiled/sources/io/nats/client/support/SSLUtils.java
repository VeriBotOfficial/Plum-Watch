package io.nats.client.support;

import io.nats.client.Options;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes6.dex */
public class SSLUtils {
    public static final String DEFAULT_KEYSTORE_TYPE = "JKS";
    public static final String DEFAULT_TLS_ALGORITHM = "SunX509";
    private static final TrustManager[] TRUST_ALL_CERTS = {new X509TrustManager() { // from class: io.nats.client.support.SSLUtils.1
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }};

    public static SSLContext createOpenTLSContext() {
        try {
            return createTrustAllTlsContext();
        } catch (Exception unused) {
            return null;
        }
    }

    public static SSLContext createTrustAllTlsContext() throws GeneralSecurityException {
        SSLContext sSLContext = SSLContext.getInstance(Options.DEFAULT_SSL_PROTOCOL);
        sSLContext.init(null, TRUST_ALL_CERTS, RandomUtils.SRAND);
        return sSLContext;
    }

    public static KeyStore loadKeystore(String str, char[] cArr) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance(DEFAULT_KEYSTORE_TYPE);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(Paths.get(str, new String[0]), new OpenOption[0]));
        try {
            keyStore.load(bufferedInputStream, cArr);
            bufferedInputStream.close();
            return keyStore;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static KeyManager[] createKeyManagers(String str, char[] cArr) throws GeneralSecurityException, IOException {
        return createKeyManagers(str, cArr, DEFAULT_TLS_ALGORITHM);
    }

    public static KeyManager[] createKeyManagers(String str, char[] cArr, String str2) throws GeneralSecurityException, IOException {
        KeyStore loadKeystore = loadKeystore(str, cArr);
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(str2);
        keyManagerFactory.init(loadKeystore, cArr);
        return keyManagerFactory.getKeyManagers();
    }

    public static TrustManager[] createTrustManagers(String str, char[] cArr) throws GeneralSecurityException, IOException {
        return createTrustManagers(str, cArr, DEFAULT_TLS_ALGORITHM);
    }

    public static TrustManager[] createTrustManagers(String str, char[] cArr, String str2) throws GeneralSecurityException, IOException {
        KeyStore loadKeystore = loadKeystore(str, cArr);
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(str2);
        trustManagerFactory.init(loadKeystore);
        return trustManagerFactory.getTrustManagers();
    }

    public static SSLContext createSSLContext(String str, char[] cArr, String str2, char[] cArr2) throws GeneralSecurityException, IOException {
        return createSSLContext(str, cArr, str2, cArr2, DEFAULT_TLS_ALGORITHM);
    }

    public static SSLContext createSSLContext(String str, char[] cArr, String str2, char[] cArr2, String str3) throws GeneralSecurityException, IOException {
        SSLContext sSLContext = SSLContext.getInstance(Options.DEFAULT_SSL_PROTOCOL);
        sSLContext.init(createKeyManagers(str, cArr, str3), createTrustManagers(str2, cArr2, str3), RandomUtils.SRAND);
        return sSLContext;
    }
}
