package com.vivo.push;

import android.content.Context;
import com.autonavi.aps.amapapi.config.Const;

/* compiled from: PushClientTask.java */
/* loaded from: classes2.dex */
public abstract class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected Context f14137a;
    private int b;
    private v c;

    protected abstract void a(v vVar);

    public s(v vVar) {
        this.b = -1;
        this.c = vVar;
        int b = vVar.b();
        this.b = b;
        if (b < 0) {
            throw new IllegalArgumentException("PushTask need a > 0 task id.");
        }
        this.f14137a = m.a().h();
    }

    public final int a() {
        return this.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f14137a;
        if (context != null && !(this.c instanceof com.vivo.push.b.n)) {
            com.vivo.push.util.t.a(context, "[执行指令]" + this.c);
        }
        a(this.c);
    }

    public String toString() {
        StringBuilder append = new StringBuilder().append(getClass().getSimpleName()).append(Const.STR_MART_JSON_BEGIN);
        v vVar = this.c;
        return append.append(vVar == null ? "[null]" : vVar.toString()).append("}").toString();
    }
}
