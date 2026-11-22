package com.hihonor.push.sdk;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.hihonor.push.sdk.r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class CallableC2965r implements Callable<List<HonorPushDataMsg>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f10154a;

    public CallableC2965r(s sVar) {
        this.f10154a = sVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [TResult, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public List<HonorPushDataMsg> call() {
        s sVar = this.f10154a;
        o0 o0Var = new o0(sVar.a());
        v0 v0Var = new v0();
        try {
            ?? call = o0Var.call();
            synchronized (v0Var.f10163a) {
                if (!v0Var.b) {
                    v0Var.b = true;
                    v0Var.c = call;
                    v0Var.f10163a.notifyAll();
                    v0Var.a();
                }
            }
        } catch (Exception e) {
            try {
                synchronized (v0Var.f10163a) {
                    if (!v0Var.b) {
                        v0Var.b = true;
                        v0Var.d = e;
                        v0Var.f10163a.notifyAll();
                        v0Var.a();
                    }
                }
            } catch (Exception e2) {
                synchronized (v0Var.f10163a) {
                    if (!v0Var.b) {
                        v0Var.b = true;
                        v0Var.d = e2;
                        v0Var.f10163a.notifyAll();
                        v0Var.a();
                    }
                }
            }
        }
        return (List) s.a(sVar, v0Var);
    }
}
