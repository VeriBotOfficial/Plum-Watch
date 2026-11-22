package com.qumeng.overseas.advlib.__remote__.ui.incite;

import java.util.Observable;
import java.util.Observer;

/* loaded from: classes17.dex */
public class c {
    private static c b;

    /* renamed from: a, reason: collision with root package name */
    private a f13151a = new a();

    static class a extends Observable {
        a() {
        }

        @Override // java.util.Observable
        public synchronized void setChanged() {
            super.setChanged();
        }
    }

    private c() {
    }

    public static c a() {
        if (b == null) {
            b = new c();
        }
        return b;
    }

    public void b(Observer observer) {
        this.f13151a.deleteObserver(observer);
    }

    public void a(Observer observer) {
        this.f13151a.addObserver(observer);
    }

    public void a(d dVar) {
        if (dVar != null) {
            this.f13151a.setChanged();
            this.f13151a.notifyObservers(dVar);
            return;
        }
        throw new NullPointerException("event msg can not null");
    }
}
