package com.anythink.basead.exoplayer.k;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes11.dex */
final class ab implements k {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f2665a;

    public ab(Handler handler) {
        this.f2665a = handler;
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Looper a() {
        return this.f2665a.getLooper();
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Message a(int i) {
        return this.f2665a.obtainMessage(i);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Message a(int i, Object obj) {
        return this.f2665a.obtainMessage(i, obj);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Message a(int i, int i2) {
        return this.f2665a.obtainMessage(i, i2, 0);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final Message a(int i, int i2, Object obj) {
        return this.f2665a.obtainMessage(0, i, i2, obj);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final boolean b(int i) {
        return this.f2665a.sendEmptyMessage(i);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final boolean a(long j) {
        return this.f2665a.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final void b() {
        this.f2665a.removeMessages(2);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final void a(Object obj) {
        this.f2665a.removeCallbacksAndMessages(obj);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final boolean a(Runnable runnable) {
        return this.f2665a.post(runnable);
    }

    @Override // com.anythink.basead.exoplayer.k.k
    public final boolean a(Runnable runnable, long j) {
        return this.f2665a.postDelayed(runnable, j);
    }
}
