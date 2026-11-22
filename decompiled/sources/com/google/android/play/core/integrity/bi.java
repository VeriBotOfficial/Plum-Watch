package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes16.dex */
class bi extends com.google.android.play.integrity.internal.j {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f10028a;
    final /* synthetic */ bn b;

    bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.b = bnVar;
        this.f10028a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void b(Bundle bundle) throws RemoteException {
        this.b.f10030a.v(this.f10028a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void c(Bundle bundle) throws RemoteException {
        this.b.f10030a.v(this.f10028a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void d(Bundle bundle) throws RemoteException {
        this.b.f10030a.v(this.f10028a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void e(Bundle bundle) throws RemoteException {
        this.b.f10030a.v(this.f10028a);
    }
}
