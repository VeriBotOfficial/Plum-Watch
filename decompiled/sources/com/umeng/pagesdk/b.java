package com.umeng.pagesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f14017a = false;
    private static Context b;
    private InterfaceC0925b c;
    private BroadcastReceiver d;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f14019a = new b(0);
    }

    /* renamed from: com.umeng.pagesdk.b$b, reason: collision with other inner class name */
    public interface InterfaceC0925b {
        void a(com.umeng.pagesdk.a aVar);
    }

    private b() {
        this.d = new BroadcastReceiver() { // from class: com.umeng.pagesdk.b.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
                        int i = 0;
                        int intExtra = intent.getIntExtra("level", 0);
                        int intExtra2 = intent.getIntExtra("voltage", 0);
                        int intExtra3 = intent.getIntExtra("temperature", 0);
                        int intExtra4 = intent.getIntExtra("status", 0);
                        int i2 = -1;
                        if (intExtra4 != 1) {
                            if (intExtra4 == 2) {
                                i2 = 1;
                            } else if (intExtra4 == 4) {
                                i2 = 0;
                            } else if (intExtra4 == 5) {
                                i2 = 2;
                            }
                        }
                        int intExtra5 = intent.getIntExtra("plugged", 0);
                        if (intExtra5 == 1) {
                            i = 1;
                        } else if (intExtra5 == 2) {
                            i = 2;
                        }
                        com.umeng.pagesdk.a aVar = new com.umeng.pagesdk.a();
                        aVar.f14016a = intExtra;
                        aVar.b = intExtra2;
                        aVar.d = i2;
                        aVar.c = intExtra3;
                        aVar.e = i;
                        aVar.f = System.currentTimeMillis();
                        if (b.this.c != null) {
                            b.this.c.a(aVar);
                        }
                        b.this.b();
                    }
                } catch (Throwable unused) {
                }
            }
        };
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public static b a(Context context) {
        if (b == null && context != null) {
            b = context.getApplicationContext();
        }
        return a.f14019a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        try {
            b.unregisterReceiver(this.d);
            f14017a = false;
        } catch (Throwable unused) {
        }
    }

    public final synchronized com.umeng.pagesdk.a a() {
        com.umeng.pagesdk.a aVar;
        com.umeng.pagesdk.a aVar2 = null;
        try {
            Intent registerReceiver = b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i = 0;
            int intExtra = registerReceiver.getIntExtra("level", 0);
            int intExtra2 = registerReceiver.getIntExtra("voltage", 0);
            int intExtra3 = registerReceiver.getIntExtra("temperature", 0);
            int intExtra4 = registerReceiver.getIntExtra("status", 0);
            int i2 = -1;
            if (intExtra4 != 1) {
                if (intExtra4 == 2) {
                    i2 = 1;
                } else if (intExtra4 == 4) {
                    i2 = 0;
                } else if (intExtra4 == 5) {
                    i2 = 2;
                }
            }
            int intExtra5 = registerReceiver.getIntExtra("plugged", 0);
            if (intExtra5 == 1) {
                i = 1;
            } else if (intExtra5 == 2) {
                i = 2;
            }
            aVar = new com.umeng.pagesdk.a();
            try {
                aVar.f14016a = intExtra;
                aVar.b = intExtra2;
                aVar.d = i2;
                aVar.c = intExtra3;
                aVar.e = i;
                aVar.f = System.currentTimeMillis();
            } catch (Throwable unused) {
                aVar2 = aVar;
                aVar = aVar2;
                return aVar;
            }
        } catch (Throwable unused2) {
        }
        return aVar;
    }

    public final synchronized void a(InterfaceC0925b interfaceC0925b) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            b.registerReceiver(this.d, intentFilter);
            f14017a = true;
            this.c = interfaceC0925b;
        } catch (Throwable unused) {
        }
    }
}
