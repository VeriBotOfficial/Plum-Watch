package com.baidu.platform.comapi.wnplatform.tts;

/* compiled from: VoiceStatusHelper.java */
/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8967a = "c";
    private static c b;
    private boolean c = false;

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (b == null) {
                b = new c();
            }
            cVar = b;
        }
        return cVar;
    }

    public synchronized void a(boolean z) {
        com.baidu.platform.comapi.wnplatform.d.a.b(f8967a + "setBusy:" + z);
        this.c = z;
    }
}
