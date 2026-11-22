package com.xiaomi.push;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class go implements hr<go, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f604a;

    /* renamed from: a, reason: collision with other field name */
    public gi f605a;

    /* renamed from: a, reason: collision with other field name */
    public String f606a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f607a = new BitSet(1);

    /* renamed from: a, reason: collision with other field name */
    private static final ig f603a = new ig("DataCollectionItem");

    /* renamed from: a, reason: collision with root package name */
    private static final hy f14630a = new hy("", (byte) 10, 1);
    private static final hy b = new hy("", (byte) 8, 2);
    private static final hy c = new hy("", (byte) 11, 3);

    public int hashCode() {
        return 0;
    }

    public go a(long j) {
        this.f604a = j;
        a(true);
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12206a() {
        return this.f607a.get(0);
    }

    public void a(boolean z) {
        this.f607a.set(0, z);
    }

    public go a(gi giVar) {
        this.f605a = giVar;
        return this;
    }

    public boolean b() {
        return this.f605a != null;
    }

    public String a() {
        return this.f606a;
    }

    public go a(String str) {
        this.f606a = str;
        return this;
    }

    public boolean c() {
        return this.f606a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof go)) {
            return m12207a((go) obj);
        }
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12207a(go goVar) {
        if (goVar == null || this.f604a != goVar.f604a) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = goVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f605a.equals(goVar.f605a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = goVar.c();
        if (c2 || c3) {
            return c2 && c3 && this.f606a.equals(goVar.f606a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(go goVar) {
        int a2;
        int a3;
        int a4;
        if (!getClass().equals(goVar.getClass())) {
            return getClass().getName().compareTo(goVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m12206a()).compareTo(Boolean.valueOf(goVar.m12206a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m12206a() && (a4 = hs.a(this.f604a, goVar.f604a)) != 0) {
            return a4;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(goVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a3 = hs.a(this.f605a, goVar.f605a)) != 0) {
            return a3;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(goVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!c() || (a2 = hs.a(this.f606a, goVar.f606a)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.hr
    public void a(ib ibVar) {
        ibVar.mo12339a();
        while (true) {
            hy mo12335a = ibVar.mo12335a();
            if (mo12335a.f14670a == 0) {
                break;
            }
            short s = mo12335a.f915a;
            if (s != 1) {
                if (s != 2) {
                    if (s == 3) {
                        if (mo12335a.f14670a == 11) {
                            this.f606a = ibVar.mo12340a();
                        } else {
                            ie.a(ibVar, mo12335a.f14670a);
                        }
                    } else {
                        ie.a(ibVar, mo12335a.f14670a);
                    }
                } else if (mo12335a.f14670a == 8) {
                    this.f605a = gi.a(ibVar.mo12333a());
                } else {
                    ie.a(ibVar, mo12335a.f14670a);
                }
            } else if (mo12335a.f14670a == 10) {
                this.f604a = ibVar.mo12334a();
                a(true);
            } else {
                ie.a(ibVar, mo12335a.f14670a);
            }
            ibVar.g();
        }
        ibVar.f();
        if (!m12206a()) {
            throw new ic("Required field 'collectedAt' was not found in serialized data! Struct: " + toString());
        }
        m12205a();
    }

    @Override // com.xiaomi.push.hr
    public void b(ib ibVar) {
        m12205a();
        ibVar.a(f603a);
        ibVar.a(f14630a);
        ibVar.a(this.f604a);
        ibVar.b();
        if (this.f605a != null) {
            ibVar.a(b);
            ibVar.mo12344a(this.f605a.a());
            ibVar.b();
        }
        if (this.f606a != null) {
            ibVar.a(c);
            ibVar.a(this.f606a);
            ibVar.b();
        }
        ibVar.c();
        ibVar.mo12343a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionItem(collectedAt:");
        sb.append(this.f604a);
        sb.append(", ");
        sb.append("collectionType:");
        gi giVar = this.f605a;
        if (giVar == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(giVar);
        }
        sb.append(", ");
        sb.append("content:");
        String str = this.f606a;
        if (str == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else {
            sb.append(str);
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12205a() {
        if (this.f605a == null) {
            throw new ic("Required field 'collectionType' was not present! Struct: " + toString());
        }
        if (this.f606a == null) {
            throw new ic("Required field 'content' was not present! Struct: " + toString());
        }
    }
}
