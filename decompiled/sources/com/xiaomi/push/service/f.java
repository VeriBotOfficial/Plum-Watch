package com.xiaomi.push.service;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.xiaomi.push.service.ag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<ag.a<String, String, String>> f14784a;

    /* renamed from: a, reason: collision with other field name */
    private static final int[] f1059a = {1, 2, 4, 8, 16};
    private static final SparseArray<Integer> b;

    private static boolean a(int i, int i2) {
        return i >= 4 || (i2 & 2) > 0 || (i2 & 1) > 0 || (i2 & 8) > 0 || (i2 & 16) > 0;
    }

    static {
        int i = 5;
        f14784a = new SparseArray<ag.a<String, String, String>>(i) { // from class: com.xiaomi.push.service.f.1
            {
                put(1, ag.b);
                put(2, ag.c);
                put(4, ag.d);
                put(8, ag.f);
                put(16, ag.e);
            }
        };
        b = new SparseArray<Integer>(i) { // from class: com.xiaomi.push.service.f.2
            {
                put(1, 32);
                put(2, 16);
                put(4, 8);
                put(8, 4);
                put(16, 2);
            }
        };
    }

    static int a(String str, String str2) {
        int i = m12450a(str, str2, 8) ? 8 : 0;
        if (m12450a(str, str2, 16)) {
            i |= 16;
        }
        if (m12450a(str, str2, 1)) {
            i |= 1;
        }
        if (m12450a(str, str2, 2)) {
            i |= 2;
        }
        return m12450a(str, str2, 4) ? i | 4 : i;
    }

    static void a(Context context, String str, String str2, int i, String str3, boolean z, int i2) {
        if (com.xiaomi.push.j.m12358a(context) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            int a2 = com.xiaomi.push.t.a(str3, 0);
            boolean a3 = a(i, a2);
            if (z) {
                a(str, str2, a2, i2);
                if (a3) {
                    synchronized (f.class) {
                        a(a(context), a2, str2);
                    }
                    return;
                }
                return;
            }
            synchronized (f.class) {
                SharedPreferences a4 = a(context);
                if (a3 || a4.contains(str2)) {
                    a(a4, a2, str, str2, i2);
                    if (a3) {
                        a(a4, a2, str2);
                    } else {
                        a(a4, str2);
                    }
                }
            }
            return;
        }
        if (com.xiaomi.push.j.m12358a(context)) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("ChannelPC: can`t setup permission with permissionCode:" + String.valueOf(str3) + " channelId:" + String.valueOf(str2) + " targetPkg:" + str);
        }
    }

    static void a(Context context, String str) {
        List<NotificationChannel> m12419a;
        if (!com.xiaomi.push.j.m12358a(context) || TextUtils.isEmpty(str) || (m12419a = af.a(context, str).m12419a()) == null) {
            return;
        }
        synchronized (f.class) {
            SharedPreferences a2 = a(context);
            ArrayList arrayList = new ArrayList();
            Iterator<NotificationChannel> it = m12419a.iterator();
            while (it.hasNext()) {
                String str2 = (String) com.xiaomi.push.ax.a(it.next(), "mId");
                if (!TextUtils.isEmpty(str2) && a2.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.size() > 0) {
                a(a2, arrayList);
            }
        }
    }

    static void a(String str, String str2, int i, int i2) {
        for (int i3 : f1059a) {
            if ((b.get(i3).intValue() & i2) == 0) {
                a(str, str2, i3, (i & i3) > 0);
            } else {
                com.xiaomi.channel.commonutils.logger.b.m11781a("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i3 + "> :stoped by userLock");
            }
        }
    }

    private static void a(String str, String str2, int i, boolean z) {
        com.xiaomi.channel.commonutils.logger.b.m11781a("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i + "=" + z + "> :" + ag.a(com.xiaomi.push.s.m12370a(), str, str2, f14784a.get(i), z));
    }

    public static int a(String str, String str2, int i) {
        return ag.a(com.xiaomi.push.s.m12370a(), str, str2, f14784a.get(i));
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Bundle m12449a(String str, String str2) {
        return ag.a(com.xiaomi.push.s.m12370a(), str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m12450a(String str, String str2, int i) {
        boolean z = ag.a(com.xiaomi.push.s.m12370a(), str, str2, f14784a.get(i)) == 1;
        com.xiaomi.channel.commonutils.logger.b.m11781a("ChannelPermissions.checkPermission:" + str + ":" + str2 + ": <" + i + "=" + z + Separators.GREATER_THAN);
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0078, code lost:
    
        if (r1 == 0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r5, java.lang.String r6, android.app.NotificationChannel r7) {
        /*
            if (r5 == 0) goto La5
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto La5
            if (r7 == 0) goto La5
            int r5 = r7.getImportance()
            r0 = 1
            if (r5 == 0) goto L13
            r5 = r0
            goto L14
        L13:
            r5 = 2
        L14:
            boolean r1 = com.xiaomi.push.service.ag.a()
            r2 = 16
            r3 = 4
            r4 = 8
            if (r1 == 0) goto L65
            java.lang.String r0 = r7.getId()
            android.os.Bundle r6 = m12449a(r6, r0)
            com.xiaomi.push.service.ag$a<java.lang.String, java.lang.String, java.lang.String> r0 = com.xiaomi.push.service.ag.f
            T r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L48
            com.xiaomi.push.service.ag$a<java.lang.String, java.lang.String, java.lang.String> r0 = com.xiaomi.push.service.ag.f
            T r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r6.getBoolean(r0)
            if (r0 == 0) goto L46
            int r0 = r7.getImportance()
            if (r0 < r3) goto L46
            goto L47
        L46:
            r3 = r4
        L47:
            r5 = r5 | r3
        L48:
            com.xiaomi.push.service.ag$a<java.lang.String, java.lang.String, java.lang.String> r0 = com.xiaomi.push.service.ag.e
            T r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L8d
            com.xiaomi.push.service.ag$a<java.lang.String, java.lang.String, java.lang.String> r0 = com.xiaomi.push.service.ag.e
            T r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            boolean r6 = r6.getBoolean(r0)
            if (r6 == 0) goto L61
            goto L63
        L61:
            r2 = 32
        L63:
            r5 = r5 | r2
            goto L8d
        L65:
            java.lang.String r1 = r7.getId()
            int r1 = a(r6, r1, r4)
            if (r1 != r0) goto L78
            int r1 = r7.getImportance()
            if (r1 < r3) goto L7a
            r5 = r5 | 4
            goto L7c
        L78:
            if (r1 != 0) goto L7c
        L7a:
            r5 = r5 | 8
        L7c:
            java.lang.String r1 = r7.getId()
            int r6 = a(r6, r1, r2)
            if (r6 != r0) goto L89
            r5 = r5 | 16
            goto L8d
        L89:
            if (r6 != 0) goto L8d
            r5 = r5 | 32
        L8d:
            android.net.Uri r6 = r7.getSound()
            if (r6 == 0) goto L96
            r5 = r5 | 64
            goto L98
        L96:
            r5 = r5 | 128(0x80, float:1.8E-43)
        L98:
            boolean r6 = r7.shouldVibrate()
            if (r6 == 0) goto La1
            r6 = 256(0x100, float:3.59E-43)
            goto La3
        La1:
            r6 = 512(0x200, float:7.17E-43)
        La3:
            r5 = r5 | r6
            return r5
        La5:
            java.lang.String r5 = "context|packageName|channel must not be null "
            com.xiaomi.channel.commonutils.logger.b.m11781a(r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.f.a(android.content.Context, java.lang.String, android.app.NotificationChannel):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r1 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            if (r3 == 0) goto L5e
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L5e
            com.xiaomi.push.service.af r3 = com.xiaomi.push.service.af.a(r3, r4)
            if (r3 == 0) goto L58
            java.lang.String r5 = r3.m12418a(r5)
            android.app.NotificationChannel r3 = r3.m12415a(r5)
            if (r3 == 0) goto L52
            int r5 = r3.getImportance()
            r0 = 1
            if (r5 == 0) goto L22
            r5 = r0
            goto L23
        L22:
            r5 = 2
        L23:
            java.lang.String r1 = r3.getId()
            r2 = 8
            int r1 = a(r4, r1, r2)
            if (r1 != r0) goto L39
            int r1 = r3.getImportance()
            r2 = 4
            if (r1 < r2) goto L3b
            r5 = r5 | 4
            goto L3d
        L39:
            if (r1 != 0) goto L3d
        L3b:
            r5 = r5 | 8
        L3d:
            java.lang.String r3 = r3.getId()
            r1 = 16
            int r3 = a(r4, r3, r1)
            if (r3 != r0) goto L4c
            r3 = r5 | 16
            return r3
        L4c:
            if (r3 != 0) goto L51
            r3 = r5 | 32
            return r3
        L51:
            return r5
        L52:
            java.lang.String r3 = "Channel must not be null"
            com.xiaomi.channel.commonutils.logger.b.m11781a(r3)
            return r0
        L58:
            java.lang.String r3 = "create NMHelper error"
            com.xiaomi.channel.commonutils.logger.b.m11781a(r3)
            return r0
        L5e:
            java.lang.String r3 = "Must greater than or equal android O and context|packageName not be null"
            com.xiaomi.channel.commonutils.logger.b.m11781a(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.f.a(android.content.Context, java.lang.String, java.lang.String):int");
    }

    private static void a(SharedPreferences sharedPreferences, int i, String str, String str2, int i2) {
        if (sharedPreferences.getInt(str2, 0) != i) {
            a(str, str2, i, i2);
        }
    }

    private static void a(SharedPreferences sharedPreferences, int i, String str) {
        sharedPreferences.edit().putInt(str, i).commit();
    }

    private static void a(SharedPreferences sharedPreferences, String str) {
        a(sharedPreferences, new ArrayList<String>(str) { // from class: com.xiaomi.push.service.f.3

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f14785a;

            {
                this.f14785a = str;
                add(str);
            }
        });
    }

    private static void a(SharedPreferences sharedPreferences, List<String> list) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            edit.remove(it.next());
        }
        edit.commit();
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("ch_permission_cache_file", 0);
    }
}
