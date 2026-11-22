package com.huawei.hms.framework.network.grs.h;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, a> f10381a = new ConcurrentHashMap(16);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f10382a;
        private final long b;

        public a(long j, long j2) {
            this.f10382a = j;
            this.b = j2;
        }

        public boolean a() {
            return SystemClock.elapsedRealtime() - this.b <= this.f10382a;
        }
    }

    public static a a(String str) {
        StringBuilder sb = new StringBuilder("map size of get is before: ");
        Map<String, a> map = f10381a;
        Logger.v("RequestUtil", sb.append(map.size()).toString());
        a aVar = map.get(str);
        Logger.v("RequestUtil", "map size of get is after: " + map.size());
        return aVar;
    }

    public static void a(String str, a aVar) {
        StringBuilder sb = new StringBuilder("map size of put is before: ");
        Map<String, a> map = f10381a;
        Logger.v("RequestUtil", sb.append(map.size()).toString());
        map.put(str, aVar);
        Logger.v("RequestUtil", "map size of put is after: " + map.size());
    }
}
