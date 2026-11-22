package com.xiaomi.push.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.gl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class af {

    /* renamed from: a, reason: collision with root package name */
    private static Context f14740a;

    /* renamed from: a, reason: collision with other field name */
    private static Object f995a;

    /* renamed from: a, reason: collision with other field name */
    private static WeakHashMap<Integer, af> f996a = new WeakHashMap<>();

    /* renamed from: a, reason: collision with other field name */
    private static boolean f997a;

    /* renamed from: a, reason: collision with other field name */
    private String f998a;
    private String b;

    private af(String str) {
        this.f998a = str;
    }

    /* renamed from: a, reason: collision with other method in class */
    public Context m12416a() {
        return f14740a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m12417a() {
        return this.f998a;
    }

    public String toString() {
        return "NotificationManagerHelper{" + this.f998a + "}";
    }

    public static af a(Context context, String str) {
        a(context);
        int hashCode = str.hashCode();
        af afVar = f996a.get(Integer.valueOf(hashCode));
        if (afVar != null) {
            return afVar;
        }
        af afVar2 = new af(str);
        f996a.put(Integer.valueOf(hashCode), afVar2);
        return afVar2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12413a(Context context) {
        a(context);
        return m12412a();
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String a2 = a("mipush|%s|%s", str2, "");
        return str.startsWith(a2) ? a("mipush_%s_%s", str2, str.replace(a2, "")) : str;
    }

    private static void a(Context context) {
        if (f14740a == null) {
            f14740a = context.getApplicationContext();
            NotificationManager a2 = a();
            Boolean bool = (Boolean) com.xiaomi.push.ax.a((Object) a2, "isSystemConditionProviderEnabled", "xmsf_fake_condition_provider_path");
            m12411a("fwk is support.init:" + bool);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            f997a = booleanValue;
            if (booleanValue) {
                f995a = com.xiaomi.push.ax.a((Object) a2, "getService", new Object[0]);
            }
        }
    }

    private static NotificationManager a() {
        return (NotificationManager) f14740a.getSystemService("notification");
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m12412a() {
        if (com.xiaomi.push.j.m12357a() && ah.a(f14740a).a(gl.NotificationBelongToAppSwitch.a(), true)) {
            return f997a;
        }
        return false;
    }

    private static int a(String str) {
        try {
            return f14740a.getPackageManager().getPackageUid(str, 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    private static Object a(List list) {
        return Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class).newInstance(list);
    }

    private static <T> T a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (T) obj.getClass().getMethod("getList", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return String.format(str, str2, str3);
    }

    public static String b(String str, String str2) {
        String str3;
        if (m12412a()) {
            str3 = "mipush|%s|%s";
        } else {
            str3 = "mipush_%s_%s";
        }
        return a(str3, str, str2);
    }

    private String b(String str) {
        return b(this.f998a, str);
    }

    String b() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = b("default");
        }
        return this.b;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12420a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(b(""));
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m12418a(String str) {
        if (TextUtils.isEmpty(str)) {
            return b();
        }
        return com.xiaomi.push.j.m12358a(m12416a()) ? b(str) : str;
    }

    String c(String str, String str2) {
        return m12412a() ? str : str2;
    }

    void a(NotificationChannel notificationChannel) {
        String str = this.f998a;
        try {
            if (m12412a()) {
                int a2 = a(str);
                if (a2 != -1) {
                    com.xiaomi.push.ax.b(f995a, "createNotificationChannelsForPackage", str, Integer.valueOf(a2), a(Arrays.asList(notificationChannel)));
                    return;
                }
                return;
            }
            a().createNotificationChannel(notificationChannel);
        } catch (Exception e) {
            m12411a("createNotificationChannel error" + e);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public NotificationChannel m12415a(String str) {
        try {
            if (m12412a()) {
                List<NotificationChannel> m12419a = m12419a();
                if (m12419a == null) {
                    return null;
                }
                for (NotificationChannel notificationChannel : m12419a) {
                    if (str.equals(notificationChannel.getId())) {
                        return notificationChannel;
                    }
                }
                return null;
            }
            return a().getNotificationChannel(str);
        } catch (Exception e) {
            m12411a("getNotificationChannel error" + e);
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* renamed from: a, reason: collision with other method in class */
    public List<NotificationChannel> m12419a() {
        String str;
        String str2 = this.f998a;
        List<NotificationChannel> list = null;
        try {
            if (m12412a()) {
                int a2 = a(str2);
                if (a2 != -1) {
                    List<NotificationChannel> list2 = (List) a(com.xiaomi.push.ax.a(f995a, "getNotificationChannelsForPackage", str2, Integer.valueOf(a2), false));
                    str = "mipush|%s|%s";
                    list = list2;
                } else {
                    str = null;
                }
            } else {
                list = a().getNotificationChannels();
                str = "mipush_%s_%s";
            }
            if (!com.xiaomi.push.j.m12357a() || list == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            String a3 = a(str, str2, "");
            for (NotificationChannel notificationChannel : list) {
                if (notificationChannel.getId().startsWith(a3)) {
                    arrayList.add(notificationChannel);
                }
            }
            return arrayList;
        } catch (Exception e) {
            m12411a("getNotificationChannels error " + e);
            return list;
        }
    }

    void a(NotificationChannel notificationChannel, boolean z) {
        String str = this.f998a;
        try {
            if (z) {
                int a2 = a(str);
                if (a2 != -1) {
                    com.xiaomi.push.ax.b(f995a, "updateNotificationChannelForPackage", str, Integer.valueOf(a2), notificationChannel);
                    return;
                }
                return;
            }
            a(notificationChannel);
        } catch (Exception e) {
            m12411a("updateNotificationChannel error " + e);
        }
    }

    public void a(int i, Notification notification) {
        String str = this.f998a;
        NotificationManager a2 = a();
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (m12412a()) {
                notification.extras.putString("xmsf_target_package", str);
                if (i2 >= 29) {
                    a2.notifyAsPackage(str, null, i, notification);
                    return;
                } else {
                    a2.notify(i, notification);
                    return;
                }
            }
            a2.notify(i, notification);
        } catch (Exception unused) {
        }
    }

    public void a(int i) {
        String str = this.f998a;
        try {
            if (m12412a()) {
                int a2 = com.xiaomi.push.i.a();
                String packageName = m12416a().getPackageName();
                if (Build.VERSION.SDK_INT >= 30) {
                    com.xiaomi.push.ax.b(f995a, "cancelNotificationWithTag", str, packageName, null, Integer.valueOf(i), Integer.valueOf(a2));
                } else {
                    com.xiaomi.push.ax.b(f995a, "cancelNotificationWithTag", str, null, Integer.valueOf(i), Integer.valueOf(a2));
                }
                m12411a("cancel succ:" + i);
                return;
            }
            a().cancel(i);
        } catch (Exception e) {
            m12411a("cancel error" + e);
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public List<StatusBarNotification> m12421b() {
        String str = this.f998a;
        NotificationManager a2 = a();
        ArrayList arrayList = null;
        try {
            if (m12412a()) {
                int a3 = com.xiaomi.push.i.a();
                if (a3 != -1) {
                    return (List) a(com.xiaomi.push.ax.a(f995a, "getAppActiveNotifications", str, Integer.valueOf(a3)));
                }
            } else {
                StatusBarNotification[] activeNotifications = a2.getActiveNotifications();
                if (activeNotifications != null && activeNotifications.length > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (StatusBarNotification statusBarNotification : activeNotifications) {
                            if (str.equals(ag.c(statusBarNotification.getNotification()))) {
                                arrayList2.add(statusBarNotification);
                            }
                        }
                        return arrayList2;
                    } catch (Throwable th) {
                        th = th;
                        arrayList = arrayList2;
                        m12411a("getActiveNotifications error " + th);
                        return arrayList;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private StatusBarNotification[] m12414a() {
        if (!com.xiaomi.push.j.m12358a(m12416a())) {
            return null;
        }
        try {
            Object a2 = com.xiaomi.push.ax.a(f995a, "getActiveNotifications", m12416a().getPackageName());
            if (a2 instanceof StatusBarNotification[]) {
                return (StatusBarNotification[]) a2;
            }
            return null;
        } catch (Throwable th) {
            m12411a("getAllNotifications error " + th);
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    static void m12411a(String str) {
        com.xiaomi.channel.commonutils.logger.b.m11781a("NMHelper:" + str);
    }
}
