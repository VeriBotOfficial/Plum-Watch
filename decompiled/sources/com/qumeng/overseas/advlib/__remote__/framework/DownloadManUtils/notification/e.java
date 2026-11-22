package com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* loaded from: classes17.dex */
public class e extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12925a = "ACTION_CLICK_CANCEL";
    public static final String b = "ACTION_CLICK_CONTROL";
    public static final String c = "EXTRA_DOWNLOAD_PACKAGE";
    public static final String d = "EXTRA_DOWNLOAD_KEY";
    private static boolean e = false;
    private static BroadcastReceiver f;

    public static void b(Context context) {
        if (context == null || e) {
            return;
        }
        if (f == null) {
            f = new e();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f12925a);
        intentFilter.addAction(b);
        com.qumeng.overseas.advlib.__remote__.utils.d.a(context, f, intentFilter, 2);
        e = true;
    }

    public void a(Context context) {
        try {
            Object systemService = context.getSystemService("statusbar");
            if (systemService == null) {
                return;
            }
            Method method = Class.forName("android.app.StatusBarManager").getMethod("collapsePanels", new Class[0]);
            method.setAccessible(true);
            method.invoke(systemService, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        c a2;
        String stringExtra = intent.getStringExtra(c);
        String stringExtra2 = intent.getStringExtra(d);
        if (TextUtils.isEmpty(stringExtra2) || (a2 = b.a(stringExtra)) == null) {
            return;
        }
        String action = intent.getAction();
        if (f12925a.equals(action)) {
            b.c(stringExtra);
            com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.c downloadMan = com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.c.getDownloadMan(stringExtra2);
            if (downloadMan != null) {
                downloadMan.setPauseState();
                return;
            }
            return;
        }
        if (b.equals(action)) {
            if (com.qumeng.overseas.advlib.__remote__.core.proto.utils.b.b(context, stringExtra)) {
                a(context);
                b.c(stringExtra);
                com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a(context, stringExtra);
                return;
            }
            com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.c b2 = a2.b();
            if (b2 == null) {
                return;
            }
            int c2 = a2.c();
            if (c2 == 1 || c2 == 2) {
                b2.setPauseState();
                return;
            }
            if (c2 == 3 || c2 == 6) {
                b2.startDownload();
            } else {
                if (c2 != 7) {
                    return;
                }
                a(context);
                b2.onNotificationInstallClick();
            }
        }
    }
}
