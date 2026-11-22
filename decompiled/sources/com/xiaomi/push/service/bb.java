package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.xiaomi.push.af;
import com.xiaomi.push.dw;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class bb {
    static void a(Context context, Map<String, String> map, dw dwVar, long j) {
        if (map == null || dwVar == null || !com.xiaomi.push.j.m12358a(context) || !m12448a(map)) {
            return;
        }
        int a2 = a(map);
        int b = b(map);
        if (a2 > 0 && b <= a2) {
            dwVar.setPriority(2);
            Bundle bundle = new Bundle();
            bundle.putLong("mipush_org_when", j);
            bundle.putBoolean("mipush_n_top_flag", true);
            if (b > 0) {
                bundle.putInt("mipush_n_top_fre", b);
            }
            bundle.putInt("mipush_n_top_prd", a2);
            dwVar.addExtras(bundle);
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.d("set top notification failed - period:" + a2 + " frequency:" + b);
    }

    /* renamed from: a, reason: collision with other method in class */
    static void m12447a(Context context, String str, int i, String str2, Notification notification) {
        if (com.xiaomi.push.j.m12358a(context) && notification != null && notification.extras.getBoolean("mipush_n_top_flag", false)) {
            c(context, str, i, str2, notification);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m12448a(Map<String, String> map) {
        String str = map.get("notification_top_repeat");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        com.xiaomi.channel.commonutils.logger.b.c("top notification' repeat is " + parseBoolean);
        return parseBoolean;
    }

    private static int a(Map<String, String> map) {
        return Math.max(0, com.xiaomi.push.t.a(map.get("notification_top_period"), 0));
    }

    private static int b(Map<String, String> map) {
        return Math.max(0, com.xiaomi.push.t.a(map.get("notification_top_frequency"), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str, int i, String str2, Notification notification) {
        af a2;
        Notification a3;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (a3 = a(notification, i, str2, (a2 = af.a(context, str)))) == null) {
            return;
        }
        boolean z = notification != null;
        if (a3.getGroupAlertBehavior() != 1) {
            com.xiaomi.push.ax.a((Object) a3, "mGroupAlertBehavior", (Object) 1);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = a3.extras.getLong("mipush_org_when", 0L);
        int i2 = a3.extras.getInt("mipush_n_top_fre", 0);
        int i3 = a3.extras.getInt("mipush_n_top_prd", 0);
        if (i3 <= 0 || i3 < i2) {
            return;
        }
        long j2 = j + (i3 * 1000);
        if (j >= currentTimeMillis || currentTimeMillis >= j2) {
            i3 = 0;
        } else if (i2 > 0) {
            i3 = (int) Math.min((j2 - currentTimeMillis) / 1000, i2);
        }
        if (!z) {
            if (i3 > 0) {
                a3.when = currentTimeMillis;
                com.xiaomi.channel.commonutils.logger.b.m11781a("update top notification: " + str2);
                a2.a(i, a3);
            } else {
                Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, a3);
                recoverBuilder.setPriority(0);
                recoverBuilder.setWhen(currentTimeMillis);
                Bundle extras = recoverBuilder.getExtras();
                if (extras != null) {
                    extras.remove("mipush_n_top_flag");
                    extras.remove("mipush_org_when");
                    extras.remove("mipush_n_top_fre");
                    extras.remove("mipush_n_top_prd");
                    recoverBuilder.setExtras(extras);
                }
                com.xiaomi.channel.commonutils.logger.b.m11781a("update top notification to common: " + str2);
                a2.a(i, recoverBuilder.build());
            }
        }
        if (i3 > 0) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("schedule top notification next update delay: " + i3);
            com.xiaomi.push.af.a(context).m11864a(b(i, str2));
            com.xiaomi.push.af.a(context).b(a(context, str, i, str2, (Notification) null), i3);
        }
    }

    private static Notification a(Notification notification, int i, String str, af afVar) {
        if (notification != null) {
            if (str.equals(notification.extras.getString(Constants.MessagePayloadKeys.MSGID_SERVER))) {
                return notification;
            }
            return null;
        }
        List<StatusBarNotification> m12421b = afVar.m12421b();
        if (m12421b == null) {
            return null;
        }
        for (StatusBarNotification statusBarNotification : m12421b) {
            Notification notification2 = statusBarNotification.getNotification();
            String string = notification2.extras.getString(Constants.MessagePayloadKeys.MSGID_SERVER);
            if (i == statusBarNotification.getId() && str.equals(string)) {
                return notification2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i, String str) {
        return "n_top_update_" + i + "_" + str;
    }

    private static af.a a(final Context context, final String str, final int i, final String str2, final Notification notification) {
        return new af.a() { // from class: com.xiaomi.push.service.bb.1
            @Override // com.xiaomi.push.af.a
            /* renamed from: a */
            public String mo11916a() {
                return bb.b(i, str2);
            }

            @Override // java.lang.Runnable
            public void run() {
                bb.c(context, str, i, str2, notification);
            }
        };
    }
}
