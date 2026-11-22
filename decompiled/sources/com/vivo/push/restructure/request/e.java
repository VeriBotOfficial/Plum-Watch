package com.vivo.push.restructure.request;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.g;
import java.util.Map;

/* compiled from: RequestManager.java */
/* loaded from: classes2.dex */
final class e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f14135a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(d dVar, Looper looper) {
        super(looper);
        this.f14135a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Map map;
        Map map2;
        int i = message.what;
        map = this.f14135a.f14133a;
        if (map.containsKey(Integer.valueOf(i))) {
            map2 = this.f14135a.f14133a;
            g.a().execute(new f(this, (b) map2.remove(Integer.valueOf(i))));
        }
    }
}
