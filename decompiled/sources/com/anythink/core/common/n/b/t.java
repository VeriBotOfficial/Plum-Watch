package com.anythink.core.common.n.b;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final ai f4200a;
    private final i b;
    private final List<Certificate> c;
    private final List<Certificate> d;

    private t(ai aiVar, i iVar, List<Certificate> list, List<Certificate> list2) {
        this.f4200a = aiVar;
        this.b = iVar;
        this.c = list;
        this.d = list2;
    }

    public static t a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List emptyList;
        List emptyList2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        i a2 = i.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (DialPromoBanner.NONE.equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        ai a3 = ai.a(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        if (certificateArr != null) {
            emptyList = com.anythink.core.common.n.b.a.c.a(certificateArr);
        } else {
            emptyList = Collections.emptyList();
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            emptyList2 = com.anythink.core.common.n.b.a.c.a(localCertificates);
        } else {
            emptyList2 = Collections.emptyList();
        }
        return new t(a3, a2, emptyList, emptyList2);
    }

    public static t a(ai aiVar, i iVar, List<Certificate> list, List<Certificate> list2) {
        if (aiVar == null) {
            throw new NullPointerException("tlsVersion == null");
        }
        if (iVar == null) {
            throw new NullPointerException("cipherSuite == null");
        }
        return new t(aiVar, iVar, com.anythink.core.common.n.b.a.c.a(list), com.anythink.core.common.n.b.a.c.a(list2));
    }

    public final ai a() {
        return this.f4200a;
    }

    public final i b() {
        return this.b;
    }

    public final List<Certificate> c() {
        return this.c;
    }

    private Principal e() {
        if (this.c.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.c.get(0)).getSubjectX500Principal();
    }

    public final List<Certificate> d() {
        return this.d;
    }

    private Principal f() {
        if (this.d.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.d.get(0)).getSubjectX500Principal();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f4200a.equals(tVar.f4200a) && this.b.equals(tVar.b) && this.c.equals(tVar.c) && this.d.equals(tVar.d);
    }

    public final int hashCode() {
        return ((((((this.f4200a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Handshake{tlsVersion=" + this.f4200a + " cipherSuite=" + this.b + " peerCertificates=" + a(this.c) + " localCertificates=" + a(this.d) + AbstractJsonLexerKt.END_OBJ;
    }

    private static List<String> a(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }
}
