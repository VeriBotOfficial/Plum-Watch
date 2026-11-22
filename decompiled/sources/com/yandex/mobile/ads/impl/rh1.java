package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qq0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* loaded from: classes5.dex */
public class rh1 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile rh1 f16765a;
    private static final Logger b;
    public static final /* synthetic */ int c = 0;

    static {
        boolean z;
        rh1 rq0Var;
        rh1 a2;
        boolean z2;
        boolean z3;
        if (Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"))) {
            rd.a();
            z2 = od.e;
            a2 = z2 ? new od() : null;
            if (a2 == null) {
                z3 = td.f;
                rq0Var = z3 ? new td() : null;
                Intrinsics.checkNotNull(rq0Var);
                a2 = rq0Var;
            }
        } else {
            z = rq0.d;
            rq0Var = z ? new rq0() : null;
            if (rq0Var == null) {
                a2 = qq0.b.a();
                if (a2 == null) {
                    a2 = new rh1();
                }
            }
            a2 = rq0Var;
        }
        f16765a = a2;
        b = Logger.getLogger(fe1.class.getName());
    }

    public static SSLSocketFactory c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(...)");
            sSLContext.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public void a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public k72 b(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "getAcceptedIssuers(...)");
        return new yk((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public eo a(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new wk(b(trustManager));
    }

    public static final class a {
        public static ArrayList a(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((mm1) obj) != mm1.d) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((mm1) it.next()).toString());
            }
            return arrayList2;
        }

        public static byte[] b(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            Buffer buffer = new Buffer();
            Iterator it = a(protocols).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }

        public static boolean b() {
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
        }

        @JvmStatic
        public static rh1 a() {
            return rh1.f16765a;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    public static X509TrustManager c() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        throw new IllegalStateException(("Unexpected default trust managers: " + arrays).toString());
    }

    public void a(SSLSocket sslSocket, String str, List<mm1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public void a(Socket socket, InetSocketAddress address, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i);
    }

    public String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public Object b() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public boolean a(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public static void a(int i, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        b.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void a(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        a(5, message, (Throwable) obj);
    }
}
