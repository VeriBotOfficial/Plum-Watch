package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.bx;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class bq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private String f14468a;

    /* renamed from: a, reason: collision with other field name */
    private WeakReference<Context> f243a;

    public bq(String str, WeakReference<Context> weakReference) {
        this.f14468a = str;
        this.f243a = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        WeakReference<Context> weakReference = this.f243a;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        if (cb.a(this.f14468a) > bp.f241a) {
            bt a2 = bt.a(this.f14468a);
            bs a3 = bs.a(this.f14468a);
            a2.a(a3);
            a3.a(br.a(context, this.f14468a, 1000));
            bx.a(context).a((bx.a) a2);
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.b("=====> do not need clean db");
    }
}
