package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzapy;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class ti2 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f16972a = Log.isLoggable(zzapy.zza, 2);

    static class a {
        public static final boolean c = ti2.f16972a;

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f16973a = new ArrayList();
        private boolean b = false;

        a() {
        }

        /* renamed from: com.yandex.mobile.ads.impl.ti2$a$a, reason: collision with other inner class name */
        private static class C0985a {

            /* renamed from: a, reason: collision with root package name */
            public final String f16974a;
            public final long b;
            public final long c;

            public C0985a(String str, long j, long j2) {
                this.f16974a = str;
                this.b = j;
                this.c = j2;
            }
        }

        public final synchronized void a(String str, long j) {
            if (!this.b) {
                this.f16973a.add(new C0985a(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        protected final void finalize() throws Throwable {
            if (this.b) {
                return;
            }
            a("Request on the loose");
            sp0.b(new Object[0]);
        }

        public final synchronized void a(String str) {
            long j;
            this.b = true;
            if (this.f16973a.size() == 0) {
                j = 0;
            } else {
                long j2 = ((C0985a) this.f16973a.get(0)).c;
                ArrayList arrayList = this.f16973a;
                j = ((C0985a) arrayList.get(arrayList.size() - 1)).c - j2;
            }
            if (j <= 0) {
                return;
            }
            long j3 = ((C0985a) this.f16973a.get(0)).c;
            sp0.a(Long.valueOf(j), str);
            Iterator it = this.f16973a.iterator();
            while (it.hasNext()) {
                C0985a c0985a = (C0985a) it.next();
                long j4 = c0985a.c;
                sp0.a(Long.valueOf(j4 - j3), Long.valueOf(c0985a.b), c0985a.f16974a);
                j3 = j4;
            }
        }
    }
}
