package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public Executor f10166a;
    public Executor b;

    public static void a(x xVar, HonorPushCallback honorPushCallback, int i, String str) {
        xVar.b.execute(new w(xVar, honorPushCallback, i, str));
    }
}
