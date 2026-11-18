package com.huawei.hms.push;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: CommonHandler.java */
/* JADX INFO: loaded from: classes11.dex */
public class e extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<a> f10476a;

    /* JADX INFO: compiled from: CommonHandler.java */
    public interface a {
        void a(Message message);
    }

    public e(a aVar) {
        this.f10476a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        a aVar = this.f10476a.get();
        if (aVar != null) {
            aVar.a(message);
        }
    }
}
