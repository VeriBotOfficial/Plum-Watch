package com.vivo.push.sdk;

import android.content.Intent;
import android.os.Message;
import com.vivo.push.ab;
import com.vivo.push.util.g;
import com.vivo.push.util.t;

/* compiled from: CommandWorker.java */
/* loaded from: classes2.dex */
public final class a extends ab {
    private static a c;
    private String d = "";

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
            aVar = c;
        }
        return aVar;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final String b() {
        return this.d;
    }

    public final void a(Intent intent) {
        if (intent == null || this.f14039a == null) {
            t.d("CommandWorker", " sendMessage error: intent : " + intent + ", mContext: " + this.f14039a);
            return;
        }
        Message obtain = Message.obtain();
        obtain.obj = intent;
        a(obtain);
    }

    @Override // com.vivo.push.ab
    public final void b(Message message) {
        Intent intent = (Intent) message.obj;
        if (intent == null || this.f14039a == null) {
            t.d("CommandWorker", " handleMessage error: intent : " + intent + ", mContext: " + this.f14039a);
            return;
        }
        com.vivo.push.restructure.a.b bVar = new com.vivo.push.restructure.a.b(intent);
        try {
            t.d("CommandWorker", "received msg : ".concat(String.valueOf(bVar.a())));
            g.a().execute(new b(this, bVar));
        } catch (Exception e) {
            t.a("CommandWorker", "handle message err : " + e.getMessage());
        }
    }
}
