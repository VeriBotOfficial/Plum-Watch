package com.amap.api.col.p0003sl;

import com.amap.api.location.ILogCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: LogManager.java */
/* loaded from: classes11.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static final List<ILogCallback> f1974a = new CopyOnWriteArrayList();
    public static final /* synthetic */ int b = 0;

    public static void a(ILogCallback iLogCallback) {
        List<ILogCallback> list = f1974a;
        if (list.contains(iLogCallback)) {
            return;
        }
        list.add(iLogCallback);
    }

    public static void b(ILogCallback iLogCallback) {
        f1974a.remove(iLogCallback);
    }
}
