package com.xiaomi.push.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import com.xiaomi.push.gl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class ad {

    /* renamed from: a, reason: collision with root package name */
    private static ad f14734a = new ad();

    /* renamed from: a, reason: collision with other field name */
    private SpannableString f988a;

    /* renamed from: a, reason: collision with other method in class */
    private boolean m12407a() {
        return true;
    }

    public static ad a() {
        return f14734a;
    }

    private ad() {
    }

    private boolean a(Context context) {
        if (b(context) && af.m12413a(context)) {
            return ah.a(context).a(gl.LatestNotificationNotIntoGroupSwitch.a(), false);
        }
        return false;
    }

    private boolean b(Context context) {
        return ah.a(context).a(gl.NotificationAutoGroupSwitch.a(), true);
    }

    private String a(Notification notification) {
        if (notification == null || notification.extras == null) {
            return null;
        }
        return notification.extras.getString("push_src_group_name");
    }

    private String b(Notification notification) {
        if (notification == null) {
            return null;
        }
        return m12409b(notification) ? a(notification) : notification.getGroup();
    }

    /* renamed from: a, reason: collision with other method in class */
    private boolean m12408a(Notification notification) {
        if (notification == null) {
            return false;
        }
        Object a2 = com.xiaomi.push.ax.a((Object) notification, "isGroupSummary", (Object[]) null);
        if (a2 instanceof Boolean) {
            return ((Boolean) a2).booleanValue();
        }
        return false;
    }

    public String a(Context context, Notification.Builder builder, String str) {
        if (!m12407a() || !a(context)) {
            return str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle extras = builder.getExtras();
        extras.putString("push_src_group_name", str);
        extras.putLong("push_src_group_time", currentTimeMillis);
        return String.format("pushmask_%s_%s", Long.valueOf(currentTimeMillis), str);
    }

    /* renamed from: b, reason: collision with other method in class */
    private boolean m12409b(Notification notification) {
        if (notification == null || notification.getGroup() == null || notification.extras == null) {
            return false;
        }
        long j = notification.extras.getLong("push_src_group_time");
        return notification.getGroup().equals(String.format("pushmask_%s_%s", Long.valueOf(j), a(notification)));
    }

    public void a(Context context, int i, Notification notification) {
        if (m12407a()) {
            if (a(context)) {
                try {
                    b(context, i, notification);
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m11781a("group notify handle restore error " + e);
                }
            }
            if (b(context)) {
                try {
                    a(context, i, notification, true);
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.b.m11781a("group notify handle auto error " + e2);
                }
            }
        }
    }

    private void b(Context context, int i, Notification notification) {
        String c = ag.c(notification);
        if (TextUtils.isEmpty(c)) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("group restore not extract pkg from notification:" + i);
            return;
        }
        af a2 = af.a(context, c);
        List<StatusBarNotification> a3 = a(a2);
        if (a3 == null) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("group restore not get notifications");
            return;
        }
        for (StatusBarNotification statusBarNotification : a3) {
            Notification notification2 = statusBarNotification.getNotification();
            if (notification2 != null && m12409b(notification2) && statusBarNotification.getId() != i) {
                Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
                recoverBuilder.setGroup(a(notification2));
                ag.a(recoverBuilder, m12408a(notification2));
                a2.a(statusBarNotification.getId(), recoverBuilder.build());
                com.xiaomi.channel.commonutils.logger.b.b("group restore notification:" + statusBarNotification.getId());
            }
        }
    }

    private void a(Context context, int i, Notification notification, boolean z) {
        Notification notification2;
        String c = ag.c(notification);
        if (TextUtils.isEmpty(c)) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("group auto not extract pkg from notification:" + i);
            return;
        }
        List<StatusBarNotification> a2 = a(af.a(context, c));
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("group auto not get notifications");
            return;
        }
        String b2 = b(notification);
        HashMap hashMap = new HashMap();
        for (StatusBarNotification statusBarNotification : a2) {
            if (statusBarNotification.getNotification() != null && statusBarNotification.getId() != i) {
                a(hashMap, statusBarNotification);
            }
        }
        for (Map.Entry<String, a> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                a value = entry.getValue();
                if (z && key.equals(b2) && !m12409b(notification)) {
                    b bVar = new b(i, notification);
                    if (m12408a(notification)) {
                        value.b.add(bVar);
                    } else {
                        value.f989a.add(bVar);
                    }
                }
                int size = value.f989a.size();
                if (value.b.size() <= 0) {
                    if (z && size >= 2) {
                        a(context, c, key, value.f989a.get(0).f990a);
                    }
                } else if (size <= 0) {
                    a(context, c, key);
                } else if (ah.a(context).a(gl.NotificationGroupUpdateTimeSwitch.a(), false) && (notification2 = value.b.get(0).f990a) != null) {
                    notification2.when = System.currentTimeMillis();
                    a(context, c, key, notification2);
                }
            }
        }
    }

    private void a(Map<String, a> map, StatusBarNotification statusBarNotification) {
        String b2 = b(statusBarNotification.getNotification());
        a aVar = map.get(b2);
        if (aVar == null) {
            aVar = new a();
            map.put(b2, aVar);
        }
        b bVar = new b(statusBarNotification.getId(), statusBarNotification.getNotification());
        if (m12408a(statusBarNotification.getNotification())) {
            aVar.b.add(bVar);
        } else {
            aVar.f989a.add(bVar);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private SpannableString m12406a(Context context, String str) {
        Resources resources;
        DisplayMetrics displayMetrics;
        int max;
        if (this.f988a == null) {
            int i = (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null || (max = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels)) <= 0) ? 200 : max / 16;
            if (TextUtils.isEmpty(str)) {
                str = "新消息";
            }
            StringBuilder sb = new StringBuilder(str.length() + i + "GroupSummary".length());
            sb.append(str);
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(' ');
            }
            sb.append("GroupSummary");
            SpannableString spannableString = new SpannableString(sb.toString());
            spannableString.setSpan(new ForegroundColorSpan(0), str.length(), sb.length(), 33);
            this.f988a = spannableString;
        }
        return this.f988a;
    }

    private void a(Context context, String str, String str2, Notification notification) {
        try {
            if (TextUtils.isEmpty(str2)) {
                com.xiaomi.channel.commonutils.logger.b.m11781a("group show summary group is null");
                return;
            }
            int a2 = ag.a(context, str);
            if (a2 == 0) {
                com.xiaomi.channel.commonutils.logger.b.m11781a("group show summary not get icon from " + str);
                return;
            }
            af a3 = af.a(context, str);
            String c = a3.c(notification.getChannelId(), "groupSummary");
            NotificationChannel m12415a = a3.m12415a(c);
            if ("groupSummary".equals(c) && m12415a == null) {
                a3.a(new NotificationChannel(c, "group_summary", 3));
            }
            Notification.Builder builder = new Notification.Builder(context, c);
            ag.a(builder, true);
            Notification build = builder.setContentTitle(m12406a(context, "新消息")).setContentText("你有一条新消息").setSmallIcon(Icon.createWithResource(str, a2)).setAutoCancel(true).setGroup(str2).setGroupSummary(true).build();
            if (Build.VERSION.SDK_INT >= 31) {
                build.contentIntent = a(context, str);
            }
            if (!com.xiaomi.push.j.m12363c() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                ag.m12422a(build, str);
            }
            int a4 = a(str, str2);
            a3.a(a4, build);
            com.xiaomi.channel.commonutils.logger.b.b("group show summary notify:" + a4);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("group show summary error " + e);
        }
    }

    private PendingIntent a(Context context, String str) {
        if (context == null && TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("ctx or pkg must not be null in getting launch intent");
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                com.xiaomi.channel.commonutils.logger.b.m11781a("pm must not be null in getting launch intent");
                return null;
            }
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
            if (launchIntentForPackage == null) {
                com.xiaomi.channel.commonutils.logger.b.m11781a("targetIntent must not be null in getting launch intent");
                return null;
            }
            launchIntentForPackage.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 31) {
                return PendingIntent.getActivity(context, 0, launchIntentForPackage, 33554432);
            }
            return PendingIntent.getActivity(context, 0, launchIntentForPackage, 0);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.d("error occurred during getting launch pendingIntent. exception:" + th);
            return null;
        }
    }

    private void a(Context context, String str, String str2) {
        com.xiaomi.channel.commonutils.logger.b.b("group cancel summary:" + str2);
        af.a(context, str).a(a(str, str2));
    }

    private int a(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    private class a {

        /* renamed from: a, reason: collision with other field name */
        List<b> f989a;
        List<b> b;

        private a() {
            this.f989a = new ArrayList();
            this.b = new ArrayList();
        }
    }

    private class b {

        /* renamed from: a, reason: collision with root package name */
        int f14736a;

        /* renamed from: a, reason: collision with other field name */
        Notification f990a;

        public b(int i, Notification notification) {
            this.f14736a = i;
            this.f990a = notification;
        }

        public String toString() {
            return "id:" + this.f14736a;
        }
    }

    private List<StatusBarNotification> a(af afVar) {
        List<StatusBarNotification> m12421b = afVar != null ? afVar.m12421b() : null;
        if (m12421b == null || m12421b.size() == 0) {
            return null;
        }
        return m12421b;
    }
}
