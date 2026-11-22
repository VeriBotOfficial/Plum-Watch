package com.pgl.ssdk;

import com.pgl.ssdk.a2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes17.dex */
public class a3<T extends a2> {

    /* renamed from: a, reason: collision with root package name */
    private int f12727a;
    private BlockingQueue<T> b = new LinkedBlockingQueue();

    private a3(int i) {
        this.f12727a = i;
    }

    public static a3 a(int i) {
        return new a3(i);
    }

    public T a() {
        return this.b.poll();
    }
}
