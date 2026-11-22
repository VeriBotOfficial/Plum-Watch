package com.xiaomi.push;

import java.util.LinkedList;

/* loaded from: classes4.dex */
public class ay {

    /* renamed from: a, reason: collision with root package name */
    private LinkedList<a> f14448a = new LinkedList<>();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final ay f14449a = new ay();

        /* renamed from: a, reason: collision with other field name */
        public int f218a;

        /* renamed from: a, reason: collision with other field name */
        public Object f219a;

        /* renamed from: a, reason: collision with other field name */
        public String f220a;

        a(int i, Object obj) {
            this.f218a = i;
            this.f219a = obj;
        }
    }

    public static ay a() {
        return a.f14449a;
    }

    public synchronized void a(Object obj) {
        this.f14448a.add(new a(0, obj));
        m11891a();
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m11891a() {
        if (this.f14448a.size() > 100) {
            this.f14448a.removeFirst();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized int m11892a() {
        return this.f14448a.size();
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized LinkedList<a> m11893a() {
        LinkedList<a> linkedList;
        linkedList = this.f14448a;
        this.f14448a = new LinkedList<>();
        return linkedList;
    }
}
