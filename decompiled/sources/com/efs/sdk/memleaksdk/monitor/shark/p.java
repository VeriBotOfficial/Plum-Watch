package com.efs.sdk.memleaksdk.monitor.shark;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f9918a = Logger.getLogger(p.class.getName());

    private p() {
    }

    public static n a(v vVar) {
        return new q(vVar);
    }

    public static v a(InputStream inputStream) {
        return a(inputStream, new w());
    }

    private static v a(final InputStream inputStream, final w wVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (wVar == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new v() { // from class: com.efs.sdk.memleaksdk.monitor.internal.p.1
            @Override // com.efs.sdk.memleaksdk.monitor.shark.v
            public long b(l lVar, long j) throws IOException {
                if (j < 0) {
                    throw new IllegalArgumentException("byteCount < 0: " + j);
                }
                if (j == 0) {
                    return 0L;
                }
                try {
                    w.this.a();
                    r a2 = lVar.a(1);
                    int read = inputStream.read(a2.f9921a, a2.c, (int) Math.min(j, 8192 - a2.c));
                    if (read == -1) {
                        return -1L;
                    }
                    a2.c += read;
                    long j2 = read;
                    lVar.b += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (p.a(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }

            @Override // com.efs.sdk.memleaksdk.monitor.shark.v, java.lang.AutoCloseable, java.nio.channels.Channel
            public void close() throws IOException {
                inputStream.close();
            }

            public String toString() {
                return "source(" + inputStream + Separators.RPAREN;
            }
        };
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
