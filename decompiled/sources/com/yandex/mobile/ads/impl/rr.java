package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.impl.po;
import com.yandex.mobile.ads.impl.q52;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rr {
    public static final rr e;
    public static final rr f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16790a;
    private final boolean b;
    private final String[] c;
    private final String[] d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f16791a;
        private String[] b;
        private String[] c;
        private boolean d;

        public a(rr connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f16791a = connectionSpec.a();
            this.b = connectionSpec.c;
            this.c = connectionSpec.d;
            this.d = connectionSpec.b();
        }

        public final a a(po... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f16791a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (po poVar : cipherSuites) {
                arrayList.add(poVar.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return a((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        public final a b() {
            if (!this.f16791a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.d = true;
            return this;
        }

        public final a b(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (this.f16791a) {
                if (!(tlsVersions.length == 0)) {
                    this.c = (String[]) tlsVersions.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(boolean z) {
            this.f16791a = z;
        }

        public final a a(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (this.f16791a) {
                if (!(cipherSuites.length == 0)) {
                    this.b = (String[]) cipherSuites.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        public final a a(q52... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (this.f16791a) {
                ArrayList arrayList = new ArrayList(tlsVersions.length);
                for (q52 q52Var : tlsVersions) {
                    arrayList.add(q52Var.a());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public final rr a() {
            return new rr(this.f16791a, this.d, this.b, this.c);
        }
    }

    static {
        po poVar = po.r;
        po poVar2 = po.s;
        po poVar3 = po.t;
        po poVar4 = po.l;
        po poVar5 = po.n;
        po poVar6 = po.m;
        po poVar7 = po.o;
        po poVar8 = po.f16588q;
        po poVar9 = po.p;
        po[] poVarArr = {poVar, poVar2, poVar3, poVar4, poVar5, poVar6, poVar7, poVar8, poVar9, po.j, po.k, po.h, po.i, po.f, po.g, po.e};
        a a2 = new a(true).a((po[]) Arrays.copyOf(new po[]{poVar, poVar2, poVar3, poVar4, poVar5, poVar6, poVar7, poVar8, poVar9}, 9));
        q52 q52Var = q52.d;
        q52 q52Var2 = q52.e;
        a2.a(q52Var, q52Var2).b().a();
        e = new a(true).a((po[]) Arrays.copyOf(poVarArr, 16)).a(q52Var, q52Var2).b().a();
        new a(true).a((po[]) Arrays.copyOf(poVarArr, 16)).a(q52Var, q52Var2, q52.f, q52.g).b().a();
        f = new a(false).a();
    }

    public rr(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f16790a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sslSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        po.a comparator;
        List list;
        po.a aVar;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.c != null) {
            String[] enabledCipherSuites2 = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites2, "getEnabledCipherSuites(...)");
            String[] strArr = this.c;
            aVar = po.c;
            enabledCipherSuites = g92.b(enabledCipherSuites2, strArr, aVar);
        } else {
            enabledCipherSuites = sslSocket.getEnabledCipherSuites();
        }
        if (this.d != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = g92.b(enabledProtocols2, this.d, (Comparator<? super String>) ComparisonsKt.naturalOrder());
        } else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNull(supportedCipherSuites);
        comparator = po.c;
        byte[] bArr = g92.f15568a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (comparator.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            Intrinsics.checkNotNull(enabledCipherSuites);
            String value = supportedCipherSuites[i];
            Intrinsics.checkNotNullExpressionValue(value, "get(...)");
            Intrinsics.checkNotNullParameter(enabledCipherSuites, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[ArraysKt.getLastIndex(enabledCipherSuites)] = value;
        }
        a aVar2 = new a(this);
        Intrinsics.checkNotNull(enabledCipherSuites);
        a a2 = aVar2.a((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        Intrinsics.checkNotNull(enabledProtocols);
        rr a3 = a2.b((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
        String[] strArr2 = a3.d;
        List list2 = null;
        if (strArr2 != null) {
            ArrayList arrayList = new ArrayList(strArr2.length);
            for (String str : strArr2) {
                q52.c.getClass();
                arrayList.add(q52.a.a(str));
            }
            list = CollectionsKt.toList(arrayList);
        } else {
            list = null;
        }
        if (list != null) {
            sslSocket.setEnabledProtocols(a3.d);
        }
        String[] strArr3 = a3.c;
        if (strArr3 != null) {
            ArrayList arrayList2 = new ArrayList(strArr3.length);
            for (String str2 : strArr3) {
                arrayList2.add(po.b.a(str2));
            }
            list2 = CollectionsKt.toList(arrayList2);
        }
        if (list2 != null) {
            sslSocket.setEnabledCipherSuites(a3.c);
        }
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rr)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f16790a;
        rr rrVar = (rr) obj;
        if (z != rrVar.f16790a) {
            return false;
        }
        return !z || (Arrays.equals(this.c, rrVar.c) && Arrays.equals(this.d, rrVar.d) && this.b == rrVar.b);
    }

    public final int hashCode() {
        if (!this.f16790a) {
            return 17;
        }
        String[] strArr = this.c;
        int hashCode = ((strArr != null ? Arrays.hashCode(strArr) : 0) + 527) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        List list;
        if (!this.f16790a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.c;
        List list2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(po.b.a(str));
            }
            list = CollectionsKt.toList(arrayList);
        } else {
            list = null;
        }
        String objects = Objects.toString(list, "[all enabled]");
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                q52.c.getClass();
                arrayList2.add(q52.a.a(str2));
            }
            list2 = CollectionsKt.toList(arrayList2);
        }
        return "ConnectionSpec(cipherSuites=" + objects + ", tlsVersions=" + Objects.toString(list2, "[all enabled]") + ", supportsTlsExtensions=" + this.b + Separators.RPAREN;
    }

    public final boolean a(SSLSocket socket) {
        po.a aVar;
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f16790a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !g92.a(strArr, socket.getEnabledProtocols(), (Comparator<? super String>) ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = socket.getEnabledCipherSuites();
        aVar = po.c;
        return g92.a(strArr2, enabledCipherSuites, aVar);
    }

    public final boolean a() {
        return this.f16790a;
    }
}
