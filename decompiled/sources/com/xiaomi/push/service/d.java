package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static List<a> f14782a = new CopyOnWriteArrayList();

    protected static void a(Context context, StatusBarNotification statusBarNotification, int i) {
        if (!com.xiaomi.push.j.m12358a(context) || i <= 0 || statusBarNotification == null) {
            return;
        }
        a(new a(statusBarNotification.getKey(), SystemClock.elapsedRealtime(), i, ag.m12424a(statusBarNotification.getNotification())));
    }

    private static void a(a aVar) {
        f14782a.add(aVar);
        a();
    }

    private static void a() {
        for (int size = f14782a.size() - 1; size >= 0; size--) {
            a aVar = f14782a.get(size);
            if (SystemClock.elapsedRealtime() - aVar.f1056a > 5000) {
                f14782a.remove(aVar);
            }
        }
        if (f14782a.size() > 10) {
            f14782a.remove(0);
        }
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14783a;

        /* renamed from: a, reason: collision with other field name */
        public final long f1056a;

        /* renamed from: a, reason: collision with other field name */
        public final String f1057a;

        /* renamed from: a, reason: collision with other field name */
        public final Notification.Action[] f1058a;

        a(String str, long j, int i, Notification.Action[] actionArr) {
            this.f1057a = str;
            this.f1056a = j;
            this.f14783a = i;
            this.f1058a = actionArr;
        }
    }
}
