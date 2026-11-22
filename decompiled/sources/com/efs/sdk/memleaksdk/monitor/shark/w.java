package com.efs.sdk.memleaksdk.monitor.shark;

import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes14.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f9923a = new w() { // from class: com.efs.sdk.memleaksdk.monitor.internal.w.1
        @Override // com.efs.sdk.memleaksdk.monitor.shark.w
        public void a() throws IOException {
        }
    };
    private boolean b;
    private long c;

    public void a() throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.b && this.c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
