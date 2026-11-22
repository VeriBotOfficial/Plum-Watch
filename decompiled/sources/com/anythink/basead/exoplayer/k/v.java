package com.anythink.basead.exoplayer.k;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes11.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2695a = new Object();
    private final PriorityQueue<Integer> b = new PriorityQueue<>(10, Collections.reverseOrder());
    private int c = Integer.MIN_VALUE;

    public static class a extends IOException {
        public a(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + "]");
        }
    }

    public final void a() {
        synchronized (this.f2695a) {
            this.b.add(0);
            this.c = Math.max(this.c, 0);
        }
    }

    public final void b() {
        synchronized (this.f2695a) {
            while (this.c != 0) {
                this.f2695a.wait();
            }
        }
    }

    private boolean b(int i) {
        boolean z;
        synchronized (this.f2695a) {
            z = this.c == i;
        }
        return z;
    }

    public final void a(int i) {
        synchronized (this.f2695a) {
            if (this.c != i) {
                throw new a(i, this.c);
            }
        }
    }

    public final void c() {
        synchronized (this.f2695a) {
            this.b.remove(0);
            this.c = this.b.isEmpty() ? Integer.MIN_VALUE : this.b.peek().intValue();
            this.f2695a.notifyAll();
        }
    }
}
