package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Message;
import com.yandex.mobile.ads.impl.hf0;
import java.util.ArrayList;

/* loaded from: classes5.dex */
final class a42 implements hf0 {
    private static final ArrayList b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f14972a;

    private static a d() {
        a aVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            aVar = arrayList.isEmpty() ? new a() : (a) arrayList.remove(arrayList.size() - 1);
        }
        return aVar;
    }

    @Override // com.yandex.mobile.ads.impl.hf0
    public final boolean b() {
        return this.f14972a.hasMessages(0);
    }

    @Override // com.yandex.mobile.ads.impl.hf0
    public final void c() {
        this.f14972a.removeMessages(2);
    }

    @Override // com.yandex.mobile.ads.impl.hf0
    public final hf0.a b(int i) {
        a d = d();
        d.f14973a = this.f14972a.obtainMessage(i);
        return d;
    }

    public a42(Handler handler) {
        this.f14972a = handler;
    }

    @Override // com.yandex.mobile.ads.impl.hf0
    public final boolean a(Runnable runnable) {
        return this.f14972a.post(runnable);
    }

    @Override // com.yandex.mobile.ads.impl.hf0
    public final void a() {
        this.f14972a.removeCallbacksAndMessages(null);
    }

    private static final class a implements hf0.a {

        /* renamed from: a, reason: collision with root package name */
        private Message f14973a;

        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.hf0.a
        public final void a() {
            Message message = this.f14973a;
            message.getClass();
            message.sendToTarget();
            b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f14973a = null;
            ArrayList arrayList = a42.b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.hf0
    public final boolean a(int i) {
        return this.f14972a.sendEmptyMessage(i);
    }

    @Override // com.yandex.mobile.ads.impl.hf0
    public final boolean a(long j) {
        return this.f14972a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.yandex.mobile.ads.impl.hf0
    public final boolean a(hf0.a aVar) {
        a aVar2 = (a) aVar;
        Handler handler = this.f14972a;
        Message message = aVar2.f14973a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        aVar2.b();
        return sendMessageAtFrontOfQueue;
    }

    @Override // com.yandex.mobile.ads.impl.hf0
    public final hf0.a a(int i, Object obj) {
        a d = d();
        d.f14973a = this.f14972a.obtainMessage(i, obj);
        return d;
    }

    @Override // com.yandex.mobile.ads.impl.hf0
    public final hf0.a a(int i, int i2) {
        a d = d();
        d.f14973a = this.f14972a.obtainMessage(1, i, i2);
        return d;
    }
}
