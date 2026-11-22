package org.repackage.a.a.a.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import org.repackage.a.a.a.a;

/* compiled from: OpenIDHelper.java */
/* loaded from: classes7.dex */
public class b implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f18844a;

    public b(c cVar) {
        this.f18844a = cVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f18844a.f18845a = a.AbstractBinderC1010a.a(iBinder);
        synchronized (this.f18844a.d) {
            this.f18844a.d.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f18844a.f18845a = null;
    }
}
