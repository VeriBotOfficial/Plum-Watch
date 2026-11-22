package com.xiaomi.push;

import android.util.Pair;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class dz {

    /* renamed from: a, reason: collision with root package name */
    private static Vector<Pair<String, Long>> f14547a = new Vector<>();

    /* renamed from: a, reason: collision with other field name */
    private static ConcurrentHashMap<String, Long> f433a = new ConcurrentHashMap<>();

    public static String a() {
        StringBuilder sb = new StringBuilder();
        synchronized (f14547a) {
            for (int i = 0; i < f14547a.size(); i++) {
                Pair<String, Long> elementAt = f14547a.elementAt(i);
                sb.append((String) elementAt.first).append(":").append(elementAt.second);
                if (i < f14547a.size() - 1) {
                    sb.append(";");
                }
            }
            f14547a.clear();
        }
        return sb.toString();
    }
}
