package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes6.dex */
public final class Tk {

    /* renamed from: a, reason: collision with root package name */
    public final Ic f18085a;
    public final Hc b;

    public Tk(PublicLogger publicLogger, String str) {
        this(new Ic(str, publicLogger), new Hc(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(Lc lc, String str, String str2) {
        int size = lc.size();
        int i = this.f18085a.c.f17809a;
        if (size >= i && (i != lc.size() || !lc.containsKey(str))) {
            Ic ic = this.f18085a;
            ic.d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", ic.e, Integer.valueOf(ic.c.f17809a), str);
            return false;
        }
        this.b.getClass();
        int i2 = lc.f17956a;
        if (str2 != null) {
            i2 += str2.length();
        }
        if (lc.containsKey(str)) {
            String str3 = (String) lc.get(str);
            if (str3 != null) {
                i2 -= str3.length();
            }
        } else {
            i2 += str.length();
        }
        if (i2 <= 4500) {
            lc.put(str, str2);
            return true;
        }
        Hc hc = this.b;
        hc.b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", hc.f17886a, 4500, str);
        return false;
    }

    public final boolean b(Lc lc, String str, String str2) {
        if (lc == null) {
            return false;
        }
        String a2 = this.f18085a.f17905a.a(str);
        String a3 = this.f18085a.b.a(str2);
        if (!lc.containsKey(a2)) {
            if (a3 != null) {
                return a(lc, a2, a3);
            }
            return false;
        }
        String str3 = (String) lc.get(a2);
        if (a3 == null || !a3.equals(str3)) {
            return a(lc, a2, a3);
        }
        return false;
    }

    public Tk(Ic ic, Hc hc) {
        this.f18085a = ic;
        this.b = hc;
    }
}
