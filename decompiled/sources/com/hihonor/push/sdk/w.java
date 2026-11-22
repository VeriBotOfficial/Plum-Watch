package com.hihonor.push.sdk;

/* loaded from: classes11.dex */
public class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HonorPushCallback f10164a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public w(x xVar, HonorPushCallback honorPushCallback, int i, String str) {
        this.f10164a = honorPushCallback;
        this.b = i;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        HonorPushCallback honorPushCallback = this.f10164a;
        if (honorPushCallback != null) {
            honorPushCallback.onFailure(this.b, this.c);
        }
    }
}
