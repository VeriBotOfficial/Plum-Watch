package com.alipay.sdk.m.h0;

/* loaded from: classes11.dex */
public class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f1388a;

    public c(b bVar) {
        this.f1388a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f1388a.a();
        } catch (Exception e) {
            d.a(e);
        }
    }
}
