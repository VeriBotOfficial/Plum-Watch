package com.anythink.basead.exoplayer.k;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2695a = new Object();
    private final PriorityQueue<Integer> b = new PriorityQueue<>(10, Collections.reverseOrder());
    private int c = Integer.MIN_VALUE;

    public static class a extends IOException {
        public a(int r3, int r4) {
            super("Priority too low [priority=" + r3 + ", highest=" + r4 + "]");
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

    private boolean b(int r3) {
        boolean z;
        synchronized (this.f2695a) {
            z = this.c == r3;
        }
        return z;
    }

    public final void a(int r4) {
        synchronized (this.f2695a) {
            if (this.c != r4) {
                throw new a(r4, this.c);
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
