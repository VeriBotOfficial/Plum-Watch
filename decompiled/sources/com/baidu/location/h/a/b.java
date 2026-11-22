package com.baidu.location.h.a;

import android.os.Handler;
import android.os.Message;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, C0351b> f7696a = new ConcurrentHashMap();
    private Handler b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static b f7698a = new b();
    }

    /* renamed from: com.baidu.location.h.a.b$b, reason: collision with other inner class name */
    private static class C0351b {

        /* renamed from: a, reason: collision with root package name */
        Object f7699a;
        com.baidu.location.h.a.a b;
    }

    public static b a() {
        return a.f7698a;
    }

    public static void a(final int i, final String str) {
        C0351b c0351b;
        b a2 = a();
        Map<Integer, C0351b> map = a2.f7696a;
        if (!map.containsKey(Integer.valueOf(i)) || (c0351b = map.get(Integer.valueOf(i))) == null || c0351b.f7699a == null) {
            return;
        }
        Object obj = c0351b.f7699a;
        if (obj instanceof Handler) {
            Handler handler = (Handler) obj;
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = str;
            handler.sendMessage(obtainMessage);
            return;
        }
        if (obj instanceof c) {
            final c cVar = (c) obj;
            Handler handler2 = a2.b;
            if (c0351b.b != com.baidu.location.h.a.a.MAIN || handler2 == null) {
                cVar.a(i, str);
            } else {
                handler2.post(new Runnable() { // from class: com.baidu.location.h.a.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.a(i, str);
                    }
                });
            }
        }
    }

    public void b() {
        this.b = new Handler();
    }
}
