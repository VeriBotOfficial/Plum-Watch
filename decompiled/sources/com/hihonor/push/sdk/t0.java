package com.hihonor.push.sdk;

import java.util.concurrent.CountDownLatch;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object, java.lang.Object<TResult>, com.hihonor.push.sdk.l0<TResult>] */
/* loaded from: classes11.dex */
public class t0<TResult> implements Object {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f10159a = new CountDownLatch(1);

    public final void a(v0<TResult> v0Var) {
        this.f10159a.countDown();
    }
}
