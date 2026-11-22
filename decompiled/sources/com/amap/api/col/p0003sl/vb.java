package com.amap.api.col.p0003sl;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: MarkInfoManager.java */
/* loaded from: classes11.dex */
public class vb {

    /* compiled from: MarkInfoManager.java */
    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1938a;
        final /* synthetic */ Context b;

        a(String str, Context context) {
            this.f1938a = str;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (vb.class) {
                try {
                    String a2 = i9.a(m9.e(this.f1938a));
                    tb a3 = ub.a((WeakReference<tb>) null);
                    Context context = this.b;
                    int i = ga.c;
                    ub.a(context, a3, "j", 50, 102400, "10");
                    if (a3.e == null) {
                        a3.e = new za(new cb(new bb()));
                    }
                    ub.a(a2, m9.e(" \"timestamp\":\"" + m9.a(System.currentTimeMillis(), "yyyyMMdd HH:mm:ss") + "\",\"details\":" + this.f1938a), a3);
                } finally {
                }
            }
        }
    }

    public static void a(String str, Context context) {
        ja.b().submit(new a(str, context));
    }
}
