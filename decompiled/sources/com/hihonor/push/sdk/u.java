package com.hihonor.push.sdk;

import java.util.concurrent.Callable;

/* loaded from: classes11.dex */
public class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callable f10160a;
    public final /* synthetic */ HonorPushCallback b;
    public final /* synthetic */ x c;

    public u(x xVar, Callable callable, HonorPushCallback honorPushCallback) {
        this.c = xVar;
        this.f10160a = callable;
        this.b = honorPushCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        h e;
        x xVar;
        HonorPushCallback honorPushCallback;
        int i;
        try {
            Object call = this.f10160a.call();
            x xVar2 = this.c;
            xVar2.b.execute(new v(xVar2, this.b, call));
        } catch (h e2) {
            e = e2;
            xVar = this.c;
            honorPushCallback = this.b;
            i = e.f10138a;
            x.a(xVar, honorPushCallback, i, e.b);
        } catch (Exception e3) {
            if (!(e3.getCause() instanceof h)) {
                x xVar3 = this.c;
                HonorPushCallback honorPushCallback2 = this.b;
                l lVar = l.ERROR_INTERNAL_ERROR;
                x.a(xVar3, honorPushCallback2, 8003003, e3.getMessage());
                return;
            }
            e = (h) e3.getCause();
            xVar = this.c;
            honorPushCallback = this.b;
            i = e.f10138a;
            x.a(xVar, honorPushCallback, i, e.b);
        }
    }
}
