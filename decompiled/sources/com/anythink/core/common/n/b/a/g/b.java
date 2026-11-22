package com.anythink.core.common.n.b.a.g;

import android.os.Build;
import android.util.Log;
import com.anythink.core.common.n.b.a.j.f;
import com.anythink.core.common.n.b.aa;
import com.anythink.core.common.n.b.ab;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes12.dex */
class b extends com.anythink.core.common.n.b.a.g.c {
    private static final int c = 4000;
    private final Class<?> d;
    private final Class<?> e;
    private final Method f;
    private final Method g;
    private final Method h;
    private final Method i;
    private final C0203b j = C0203b.a();

    b(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.d = cls;
        this.e = cls2;
        this.f = method;
        this.g = method2;
        this.h = method3;
        this.i = method4;
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!com.anythink.core.common.n.b.a.c.a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    protected final X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
        Object a2 = a(sSLSocketFactory, this.d, "sslParameters");
        if (a2 == null) {
            try {
                a2 = a(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.a(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) a(a2, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) a(a2, X509TrustManager.class, "trustManager");
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public void a(SSLSocket sSLSocket, String str, List<ab> list) {
        if (this.e.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f.invoke(sSLSocket, Boolean.TRUE);
                    this.g.invoke(sSLSocket, str);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new AssertionError(e);
                }
            }
            Method method = this.i;
            com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ab abVar = list.get(i);
                if (abVar != ab.HTTP_1_0) {
                    cVar.l(abVar.toString().length());
                    cVar.b(abVar.toString());
                }
            }
            method.invoke(sSLSocket, cVar.y());
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public String a(SSLSocket sSLSocket) {
        if (!this.e.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.h.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final void a(int i, String str, Throwable th) {
        int min;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, aa.f4155a, str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i3 = min;
                }
            }
            i3 = min + 1;
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final Object a(String str) {
        return this.j.a(str);
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final void a(String str, Object obj) {
        if (this.j.a(obj)) {
            return;
        }
        a(5, str, (Throwable) null);
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final boolean b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return a(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.b(str);
        } catch (IllegalAccessException e) {
            e = e;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    private boolean a(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return b(str, cls, obj);
        }
    }

    private boolean b(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.b(str);
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final com.anythink.core.common.n.b.a.j.c a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.a(x509TrustManager);
        }
    }

    public static com.anythink.core.common.n.b.a.g.c b() {
        if (!com.anythink.core.common.n.b.a.g.c.g()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            try {
                return new b(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", byte[].class));
            } catch (NoSuchMethodException unused) {
                throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
            }
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final f b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
        }
    }

    static final class a extends com.anythink.core.common.n.b.a.j.c {

        /* renamed from: a, reason: collision with root package name */
        private final Object f4134a;
        private final Method b;

        public final int hashCode() {
            return 0;
        }

        a(Object obj, Method method) {
            this.f4134a = obj;
            this.b = method;
        }

        @Override // com.anythink.core.common.n.b.a.j.c
        public final List<Certificate> a(List<Certificate> list, String str) {
            try {
                return (List) this.b.invoke(this.f4134a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: com.anythink.core.common.n.b.a.g.b$b, reason: collision with other inner class name */
    static final class C0203b {

        /* renamed from: a, reason: collision with root package name */
        private final Method f4135a;
        private final Method b;
        private final Method c;

        private C0203b(Method method, Method method2, Method method3) {
            this.f4135a = method;
            this.b = method2;
            this.c = method3;
        }

        final Object a(String str) {
            Method method = this.f4135a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        final boolean a(Object obj) {
            if (obj != null) {
                try {
                    this.c.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        static C0203b a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new C0203b(method, method3, method2);
        }
    }

    static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        private final X509TrustManager f4136a;
        private final Method b;

        c(X509TrustManager x509TrustManager, Method method) {
            this.b = method;
            this.f4136a = x509TrustManager;
        }

        @Override // com.anythink.core.common.n.b.a.j.f
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.b.invoke(this.f4136a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f4136a.equals(cVar.f4136a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.f4136a.hashCode() + (this.b.hashCode() * 31);
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final SSLContext c() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    static int d() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }
}
