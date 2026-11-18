package com.applovin.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6615a;
    private final List b;

    public z(Map map, List list) {
        this.f6615a = map;
        this.b = list;
    }

    protected boolean a(Object obj) {
        return obj instanceof z;
    }

    public List b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!zVar.a(this)) {
            return false;
        }
        Map mapA = a();
        Map mapA2 = zVar.a();
        if (mapA != null ? !mapA.equals(mapA2) : mapA2 != null) {
            return false;
        }
        List listB = b();
        List listB2 = zVar.b();
        return listB != null ? listB.equals(listB2) : listB2 == null;
    }

    public int hashCode() {
        Map mapA = a();
        int r0 = mapA == null ? 43 : mapA.hashCode();
        List listB = b();
        return ((r0 + 59) * 59) + (listB != null ? listB.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + a() + ", invalidEntries=" + b() + Separators.RPAREN;
    }

    public Map a() {
        return this.f6615a;
    }
}
