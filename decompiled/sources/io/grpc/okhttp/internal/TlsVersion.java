package io.grpc.okhttp.internal;

import io.nats.client.Options;

/* loaded from: classes6.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2(Options.DEFAULT_SSL_PROTOCOL),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    final String javaName;

    TlsVersion(String str) {
        this.javaName = str;
    }

    public static TlsVersion forJavaName(String str) {
        if ("TLSv1.3".equals(str)) {
            return TLS_1_3;
        }
        if (Options.DEFAULT_SSL_PROTOCOL.equals(str)) {
            return TLS_1_2;
        }
        if ("TLSv1.1".equals(str)) {
            return TLS_1_1;
        }
        if ("TLSv1".equals(str)) {
            return TLS_1_0;
        }
        if ("SSLv3".equals(str)) {
            return SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: " + str);
    }

    public String javaName() {
        return this.javaName;
    }
}
