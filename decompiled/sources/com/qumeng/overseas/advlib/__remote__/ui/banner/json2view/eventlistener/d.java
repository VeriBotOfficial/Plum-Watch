package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.e;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes17.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static c f13054a;
    private static List<WeakReference<InterfaceC0825d>> b = new CopyOnWriteArrayList();
    private static volatile d c;

    public static class b implements InterfaceC0825d {
        @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d.InterfaceC0825d
        public void onHomePressed() {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d.InterfaceC0825d
        public void onScreenOff() {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d.InterfaceC0825d
        public void onScreenOn() {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d.InterfaceC0825d
        public void onUserPresent() {
        }
    }

    private class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (d.b.isEmpty()) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_ON".equals(action)) {
                for (WeakReference weakReference : d.b) {
                    if (weakReference != null && weakReference.get() != null) {
                        ((InterfaceC0825d) weakReference.get()).onScreenOn();
                    }
                }
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                for (WeakReference weakReference2 : d.b) {
                    if (weakReference2 != null && weakReference2.get() != null) {
                        ((InterfaceC0825d) weakReference2.get()).onScreenOff();
                    }
                }
                return;
            }
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                for (WeakReference weakReference3 : d.b) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        ((InterfaceC0825d) weakReference3.get()).onUserPresent();
                    }
                }
                return;
            }
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action) && "homekey".equals(intent.getStringExtra("reason"))) {
                for (WeakReference weakReference4 : d.b) {
                    if (weakReference4 != null && weakReference4.get() != null) {
                        ((InterfaceC0825d) weakReference4.get()).onHomePressed();
                    }
                }
            }
        }
    }

    /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d$d, reason: collision with other inner class name */
    public interface InterfaceC0825d {
        void onHomePressed();

        void onScreenOff();

        void onScreenOn();

        void onUserPresent();
    }

    public d() {
        f13054a = new c();
        c();
    }

    public static d b() {
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d();
                }
            }
        }
        return c;
    }

    public static void d() {
        try {
            if (f13054a != null) {
                e.a().unregisterReceiver(f13054a);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d.b.remove(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void c(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d.InterfaceC0825d r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List<java.lang.ref.WeakReference<com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d$d>> r0 = com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d.b     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2c
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2c
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L7
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L2c
            com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d$d r2 = (com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d.InterfaceC0825d) r2     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L7
            java.util.List<java.lang.ref.WeakReference<com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d$d>> r4 = com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d.b     // Catch: java.lang.Throwable -> L2c
            r4.remove(r1)     // Catch: java.lang.Throwable -> L2c
        L2a:
            monitor-exit(r3)
            return
        L2c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2c
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d.c(com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.eventlistener.d$d):void");
    }

    public void a(InterfaceC0825d interfaceC0825d) {
        for (WeakReference<InterfaceC0825d> weakReference : b) {
            if (weakReference.get() != null && weakReference.get().equals(interfaceC0825d)) {
                return;
            }
        }
        b.add(new WeakReference<>(interfaceC0825d));
        b(interfaceC0825d);
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        com.qumeng.overseas.advlib.__remote__.utils.d.a(e.a(), f13054a, intentFilter, 2);
    }

    private void b(InterfaceC0825d interfaceC0825d) {
        PowerManager powerManager = (PowerManager) e.a().getSystemService("power");
        if (powerManager == null || interfaceC0825d == null) {
            return;
        }
        if (powerManager.isScreenOn()) {
            interfaceC0825d.onScreenOn();
        } else {
            interfaceC0825d.onScreenOff();
        }
    }
}
