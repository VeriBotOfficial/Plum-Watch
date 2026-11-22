package com.hihonor.push.sdk;

/* loaded from: classes11.dex */
public class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HonorPushCallback f10162a;
    public final /* synthetic */ Object b;

    public v(x xVar, HonorPushCallback honorPushCallback, Object obj) {
        this.f10162a = honorPushCallback;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        HonorPushCallback honorPushCallback = this.f10162a;
        if (honorPushCallback != null) {
            honorPushCallback.onSuccess(this.b);
        }
    }
}
