package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rh1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class xd implements l12 {
    private static final wd f;
    public static final /* synthetic */ int g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Class<? super SSLSocket> f17328a;
    private final Method b;
    private final Method c;
    private final Method d;
    private final Method e;

    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static xd b(Class cls) {
            Class cls2 = cls;
            while (!Intrinsics.areEqual(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.checkNotNull(cls2);
            return new xd(cls2);
        }

        public static wd a() {
            return xd.f;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f = new wd();
    }

    public xd(Class<? super SSLSocket> sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f17328a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
        this.b = declaredMethod;
        this.c = sslSocketClass.getMethod("setHostname", String.class);
        this.d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // com.yandex.mobile.ads.impl.l12
    public final void a(SSLSocket sslSocket, String str, List<? extends mm1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.f17328a.isInstance(sslSocket)) {
            try {
                this.b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sslSocket, str);
                }
                Method method = this.e;
                int i = rh1.c;
                method.invoke(sslSocket, rh1.a.b(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.l12
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!this.f17328a.isInstance(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sslSocket, new Object[0]);
            if (bArr != null) {
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                return new String(bArr, UTF_8);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (NullPointerException e2) {
            if (!Intrinsics.areEqual(e2.getMessage(), "ssl == null")) {
                throw e2;
            }
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.l12
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f17328a.isInstance(sslSocket);
    }

    @Override // com.yandex.mobile.ads.impl.l12
    public final boolean a() {
        boolean z;
        int i = td.g;
        z = td.f;
        return z;
    }
}
