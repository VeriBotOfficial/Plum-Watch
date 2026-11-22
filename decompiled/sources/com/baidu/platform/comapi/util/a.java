package com.baidu.platform.comapi.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: BMEventBus.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8672a = new a();
    private final Map<Class<?>, CopyOnWriteArraySet<b>> b = new HashMap();
    private final Map<Class<?>, Object> c = new HashMap();

    /* compiled from: BMEventBus.java */
    /* renamed from: com.baidu.platform.comapi.util.a$a, reason: collision with other inner class name */
    class RunnableC0403a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f8674a;
        final /* synthetic */ Object b;

        RunnableC0403a(b bVar, Object obj) {
            this.f8674a = bVar;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f8674a, this.b);
        }
    }

    /* compiled from: BMEventBus.java */
    private class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final c f8676a;

        @Override // com.baidu.platform.comapi.util.a.c
        public void a(Object obj) {
            this.f8676a.a(obj);
        }

        public boolean equals(Object obj) {
            return this.f8676a.equals(obj);
        }
    }

    /* compiled from: BMEventBus.java */
    public interface c {
        void a(Object obj);
    }

    private a() {
    }

    public static a a() {
        return f8672a;
    }

    public void a(Object obj) {
        CopyOnWriteArraySet<b> copyOnWriteArraySet;
        if (this.b.containsKey(obj.getClass())) {
            synchronized (this) {
                copyOnWriteArraySet = this.b.get(obj.getClass());
            }
            Iterator<b> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                MapTaskManager.postToMainThread(new RunnableC0403a(it.next(), obj), 0L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Object obj) {
        cVar.a(obj);
    }
}
