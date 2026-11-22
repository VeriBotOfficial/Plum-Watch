package sg.bigo.ads.common.y;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f19797a = new AtomicInteger();

    public static int a() {
        return f19797a.incrementAndGet();
    }

    public static void a(int i) {
        f19797a.set(i);
    }
}
