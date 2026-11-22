package com.qumeng.overseas.advlib.trdparty.unionset.apply.common;

import androidx.core.app.NotificationManagerCompat;

/* loaded from: classes17.dex */
public class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationManagerCompat f13351a;

    public d(NotificationManagerCompat notificationManagerCompat) {
        this.f13351a = notificationManagerCompat;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13351a.cancel(99);
    }
}
