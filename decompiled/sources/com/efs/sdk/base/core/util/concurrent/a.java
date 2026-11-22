package com.efs.sdk.base.core.util.concurrent;

import android.os.HandlerThread;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static HandlerThread f9649a;

    static {
        HandlerThread handlerThread = new HandlerThread("efs-base", 10);
        f9649a = handlerThread;
        handlerThread.start();
    }
}
