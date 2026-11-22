package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yj1 extends SSLSocketFactory {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f17427a;

    public yj1(SSLSocketFactory delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f17427a = delegate;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String arg0, int i) throws IOException {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Socket createSocket = this.f17427a.createSocket(arg0, i);
        String[] a2 = a.a(this.f17427a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a2);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return a.a(this.f17427a);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return a.b(this.f17427a);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String arg0, int i, InetAddress arg2, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(arg2, "arg2");
        Socket createSocket = this.f17427a.createSocket(arg0, i, arg2, i2);
        String[] a2 = a.a(this.f17427a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a2);
        return createSocket;
    }

    public static final class a {
        public static final String[] a(SSLSocketFactory sSLSocketFactory) {
            int i = yj1.b;
            String[] defaultCipherSuites = sSLSocketFactory.getDefaultCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(defaultCipherSuites, defaultCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            return (String[]) arrayList.toArray(new String[0]);
        }

        public static final String[] b(SSLSocketFactory sSLSocketFactory) {
            int i = yj1.b;
            String[] supportedCipherSuites = sSLSocketFactory.getSupportedCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(supportedCipherSuites, supportedCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            return (String[]) arrayList.toArray(new String[0]);
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress arg0, int i) throws IOException {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Socket createSocket = this.f17427a.createSocket(arg0, i);
        String[] a2 = a.a(this.f17427a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a2);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress arg0, int i, InetAddress arg2, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(arg2, "arg2");
        Socket createSocket = this.f17427a.createSocket(arg0, i, arg2, i2);
        String[] a2 = a.a(this.f17427a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a2);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket arg0, String arg1, int i, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(arg1, "arg1");
        Socket createSocket = this.f17427a.createSocket(arg0, arg1, i, z);
        String[] a2 = a.a(this.f17427a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a2);
        return createSocket;
    }
}
