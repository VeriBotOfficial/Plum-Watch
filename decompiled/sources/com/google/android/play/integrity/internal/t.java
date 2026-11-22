package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes16.dex */
public abstract class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f10062a;

    t() {
        this.f10062a = null;
    }

    public t(TaskCompletionSource taskCompletionSource) {
        this.f10062a = taskCompletionSource;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f10062a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void b();

    final TaskCompletionSource c() {
        return this.f10062a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }
}
