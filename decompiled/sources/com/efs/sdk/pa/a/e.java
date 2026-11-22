package com.efs.sdk.pa.a;

import android.gov.nist.core.Separators;
import android.os.SystemClock;
import android.util.Printer;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes14.dex */
final class e implements Printer {
    private long f;
    private boolean b = false;
    private String c = null;
    private long d = -1;
    private long e = -1;

    /* renamed from: a, reason: collision with root package name */
    Vector<d> f9969a = new Vector<>();

    e() {
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(Separators.GREATER_THAN)) {
            this.d = SystemClock.elapsedRealtime();
            this.e = SystemClock.currentThreadTimeMillis();
            this.c = str;
            this.b = true;
            Iterator<d> it = this.f9969a.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        if (this.b && str.startsWith(Separators.LESS_THAN)) {
            this.b = false;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
            if (elapsedRealtime > this.f) {
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.e;
                Iterator<d> it2 = this.f9969a.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.c, elapsedRealtime, currentThreadTimeMillis);
                }
            }
        }
    }
}
