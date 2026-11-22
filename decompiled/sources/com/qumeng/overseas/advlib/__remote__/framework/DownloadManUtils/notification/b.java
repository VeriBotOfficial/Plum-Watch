package com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12923a = "下载状态栏";
    public static final String b = "QM_CHANNEL_ID";
    private static final Map<String, c> c = new ConcurrentHashMap();
    private static int d = 16779946;

    static {
        ((NotificationManager) com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getSystemService("notification")).createNotificationChannel(new NotificationChannel(b, f12923a, 3));
    }

    public static synchronized int a() {
        int i;
        synchronized (b.class) {
            i = d + 1;
            d = i;
        }
        return i;
    }

    public static void b(String str) {
        c cVar;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, c> map = c;
        if (map.containsKey(str) && (cVar = map.get(str)) != null) {
            cVar.onInstalled(str);
        }
    }

    public static void c(String str) {
        c remove;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, c> map = c;
        if (map.containsKey(str) && (remove = map.remove(str)) != null) {
            remove.cancel();
        }
    }

    public static void a(String str, c cVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c.put(str, cVar);
    }

    public static c a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, c> map = c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }
}
