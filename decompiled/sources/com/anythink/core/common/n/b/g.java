package com.anythink.core.common.n.b;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f4182a = new a().a();
    private final Set<b> b;
    private final com.anythink.core.common.n.b.a.j.c c;

    g(Set<b> set, com.anythink.core.common.n.b.a.j.c cVar) {
        this.b = set;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Objects.equals(this.c, gVar.c) && this.b.equals(gVar.b);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.c) * 31) + this.b.hashCode();
    }

    private void a(String str, Certificate... certificateArr) {
        a(str, Arrays.asList(certificateArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        if (r7.regionMatches(false, r3 + 1, r2.b, 0, r2.b.length()) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.anythink.core.common.n.b.g.b> a(java.lang.String r14) {
        /*
            r13 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            java.util.Set<com.anythink.core.common.n.b.g$b> r1 = r13.b
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r1.next()
            com.anythink.core.common.n.b.g$b r2 = (com.anythink.core.common.n.b.g.b) r2
            java.lang.String r3 = r2.f4184a
            java.lang.String r4 = "*."
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L4c
            r3 = 46
            int r3 = r14.indexOf(r3)
            int r4 = r14.length()
            int r4 = r4 - r3
            r5 = 1
            int r4 = r4 - r5
            java.lang.String r6 = r2.b
            int r6 = r6.length()
            if (r4 != r6) goto L49
            int r9 = r3 + 1
            java.lang.String r10 = r2.b
            java.lang.String r3 = r2.b
            int r12 = r3.length()
            r8 = 0
            r11 = 0
            r7 = r14
            boolean r14 = r7.regionMatches(r8, r9, r10, r11, r12)
            if (r14 == 0) goto L4a
            goto L53
        L49:
            r7 = r14
        L4a:
            r5 = 0
            goto L53
        L4c:
            r7 = r14
            java.lang.String r14 = r2.b
            boolean r5 = r7.equals(r14)
        L53:
            if (r5 == 0) goto L63
            boolean r14 = r0.isEmpty()
            if (r14 == 0) goto L60
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L60:
            r0.add(r2)
        L63:
            r14 = r7
            goto La
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.n.b.g.a(java.lang.String):java.util.List");
    }

    final g a(com.anythink.core.common.n.b.a.j.c cVar) {
        return Objects.equals(this.c, cVar) ? this : new g(this.b, cVar);
    }

    public static String a(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + b((X509Certificate) certificate).b();
    }

    private static com.anythink.core.common.n.c.f a(X509Certificate x509Certificate) {
        return com.anythink.core.common.n.c.f.a(x509Certificate.getPublicKey().getEncoded()).d();
    }

    private static com.anythink.core.common.n.c.f b(X509Certificate x509Certificate) {
        return com.anythink.core.common.n.c.f.a(x509Certificate.getPublicKey().getEncoded()).e();
    }

    static final class b {
        private static final String e = "*.";

        /* renamed from: a, reason: collision with root package name */
        final String f4184a;
        final String b;
        final String c;
        final com.anythink.core.common.n.c.f d;

        b(String str, String str2) {
            String str3;
            this.f4184a = str;
            if (str.startsWith(e)) {
                str3 = v.d("http://" + str.substring(2)).m;
            } else {
                str3 = v.d("http://".concat(String.valueOf(str))).m;
            }
            this.b = str3;
            if (str2.startsWith("sha1/")) {
                this.c = "sha1/";
                this.d = com.anythink.core.common.n.c.f.b(str2.substring(5));
            } else if (str2.startsWith("sha256/")) {
                this.c = "sha256/";
                this.d = com.anythink.core.common.n.c.f.b(str2.substring(7));
            } else {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(String.valueOf(str2)));
            }
            if (this.d == null) {
                throw new IllegalArgumentException("pins must be base64: ".concat(String.valueOf(str2)));
            }
        }

        private boolean a(String str) {
            if (this.f4184a.startsWith(e)) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 != this.b.length()) {
                    return false;
                }
                String str2 = this.b;
                return str.regionMatches(false, indexOf + 1, str2, 0, str2.length());
            }
            return str.equals(this.b);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4184a.equals(bVar.f4184a) && this.c.equals(bVar.c) && this.d.equals(bVar.d);
        }

        public final int hashCode() {
            return ((((this.f4184a.hashCode() + 527) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public final String toString() {
            return this.c + this.d.b();
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<b> f4183a = new ArrayList();

        private a a(String str, String... strArr) {
            if (str == null) {
                throw new NullPointerException("pattern == null");
            }
            for (String str2 : strArr) {
                this.f4183a.add(new b(str, str2));
            }
            return this;
        }

        public final g a() {
            return new g(new LinkedHashSet(this.f4183a), null);
        }
    }

    public final void a(String str, List<Certificate> list) {
        int i;
        List emptyList = Collections.emptyList();
        Iterator<b> it = this.b.iterator();
        while (true) {
            r3 = false;
            boolean equals = false;
            if (!it.hasNext()) {
                break;
            }
            b next = it.next();
            if (next.f4184a.startsWith("*.")) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 == next.b.length() && str.regionMatches(false, indexOf + 1, next.b, 0, next.b.length())) {
                    equals = true;
                }
            } else {
                equals = str.equals(next.b);
            }
            if (equals) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                emptyList.add(next);
            }
        }
        if (emptyList.isEmpty()) {
            return;
        }
        com.anythink.core.common.n.b.a.j.c cVar = this.c;
        List<Certificate> a2 = cVar != null ? cVar.a(list, str) : list;
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            X509Certificate x509Certificate = (X509Certificate) a2.get(i2);
            int size2 = emptyList.size();
            com.anythink.core.common.n.c.f fVar = null;
            com.anythink.core.common.n.c.f fVar2 = null;
            for (int i3 = 0; i3 < size2; i3++) {
                b bVar = (b) emptyList.get(i3);
                if (bVar.c.equals("sha256/")) {
                    if (fVar == null) {
                        fVar = b(x509Certificate);
                    }
                    if (bVar.d.equals(fVar)) {
                        return;
                    }
                } else if (bVar.c.equals("sha1/")) {
                    if (fVar2 == null) {
                        fVar2 = com.anythink.core.common.n.c.f.a(x509Certificate.getPublicKey().getEncoded()).d();
                    }
                    if (bVar.d.equals(fVar2)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + bVar.c);
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = a2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            X509Certificate x509Certificate2 = (X509Certificate) a2.get(i4);
            sb.append("\n    ").append(a((Certificate) x509Certificate2)).append(": ").append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ").append(str).append(":");
        int size4 = emptyList.size();
        for (i = 0; i < size4; i++) {
            sb.append("\n    ").append((b) emptyList.get(i));
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }
}
