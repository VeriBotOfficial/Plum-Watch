package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.gj;
import com.xiaomi.push.gk;
import com.xiaomi.push.gq;
import com.xiaomi.push.hf;
import com.xiaomi.push.hq;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public class az {

    /* renamed from: a, reason: collision with root package name */
    private static String f14773a;

    /* renamed from: a, reason: collision with other field name */
    private static SimpleDateFormat f1043a;

    /* renamed from: a, reason: collision with other field name */
    private static AtomicLong f1044a = new AtomicLong(0);

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f1043a = simpleDateFormat;
        f14773a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static synchronized String a() {
        String str;
        synchronized (az.class) {
            String format = f1043a.format(Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.equals(f14773a, format)) {
                f1044a.set(0L);
                f14773a = format;
            }
            str = format + Constants.ACCEPT_TIME_SEPARATOR_SERVER + f1044a.incrementAndGet();
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.xiaomi.push.hf> a(java.util.List<com.xiaomi.push.gk> r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r0 = 0
            if (r11 != 0) goto L9
            java.lang.String r11 = "requests can not be null in TinyDataHelper.transToThriftObj()."
            com.xiaomi.channel.commonutils.logger.b.d(r11)
            return r0
        L9:
            int r1 = r11.size()
            if (r1 != 0) goto L15
            java.lang.String r11 = "requests.length is 0 in TinyDataHelper.transToThriftObj()."
            com.xiaomi.channel.commonutils.logger.b.d(r11)
            return r0
        L15:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.xiaomi.push.gj r2 = new com.xiaomi.push.gj
            r2.<init>()
            r3 = 0
            r4 = r3
            r5 = r4
        L22:
            int r6 = r11.size()
            if (r4 >= r6) goto Lab
            java.lang.Object r6 = r11.get(r4)
            com.xiaomi.push.gk r6 = (com.xiaomi.push.gk) r6
            if (r6 != 0) goto L32
            goto La7
        L32:
            java.util.Map r7 = r6.m12196a()
            if (r7 == 0) goto L71
            java.util.Map r7 = r6.m12196a()
            java.lang.String r8 = "item_size"
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L71
            java.util.Map r7 = r6.m12196a()
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L59
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L59
            goto L5a
        L59:
            r7 = r3
        L5a:
            java.util.Map r9 = r6.m12196a()
            int r9 = r9.size()
            r10 = 1
            if (r9 != r10) goto L69
            r6.a(r0)
            goto L72
        L69:
            java.util.Map r9 = r6.m12196a()
            r9.remove(r8)
            goto L72
        L71:
            r7 = r3
        L72:
            if (r7 > 0) goto L79
            byte[] r7 = com.xiaomi.push.hq.a(r6)
            int r7 = r7.length
        L79:
            if (r7 <= r14) goto L92
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "TinyData is too big, ignore upload request item:"
            r7.<init>(r8)
            java.lang.String r6 = r6.d()
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r6)
            goto La7
        L92:
            int r8 = r5 + r7
            if (r8 <= r14) goto La3
            com.xiaomi.push.hf r2 = a(r12, r13, r2)
            r1.add(r2)
            com.xiaomi.push.gj r2 = new com.xiaomi.push.gj
            r2.<init>()
            r5 = r3
        La3:
            r2.a(r6)
            int r5 = r5 + r7
        La7:
            int r4 = r4 + 1
            goto L22
        Lab:
            int r11 = r2.a()
            if (r11 == 0) goto Lb8
            com.xiaomi.push.hf r11 = a(r12, r13, r2)
            r1.add(r11)
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.az.a(java.util.List, java.lang.String, java.lang.String, int):java.util.ArrayList");
    }

    private static hf a(String str, String str2, gj gjVar) {
        return new hf("-1", false).d(str).b(str2).a(com.xiaomi.push.x.a(hq.a(gjVar))).c(gq.UploadTinyData.f614a);
    }

    public static boolean a(gk gkVar, boolean z) {
        if (gkVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("item is null, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!z && TextUtils.isEmpty(gkVar.f586a)) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("item.channel is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(gkVar.f593d)) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("item.category is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(gkVar.f592c)) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("item.name is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!com.xiaomi.push.bc.m11910a(gkVar.f593d)) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("item.category can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!com.xiaomi.push.bc.m11910a(gkVar.f592c)) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("item.name can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (gkVar.f591b == null || gkVar.f591b.length() <= 30720) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.m11781a("item.data is too large(" + gkVar.f591b.length() + "), max size for data is 30720 , verfiy ClientUploadDataItem failed.");
        return true;
    }

    public static void a(Context context, String str, String str2, long j, String str3) {
        gk gkVar = new gk();
        gkVar.d(str);
        gkVar.c(str2);
        gkVar.a(j);
        gkVar.b(str3);
        gkVar.a("push_sdk_channel");
        gkVar.g(context.getPackageName());
        gkVar.e(context.getPackageName());
        gkVar.a(true);
        gkVar.b(System.currentTimeMillis());
        gkVar.f(a());
        ba.a(context, gkVar);
    }

    public static boolean a(String str) {
        return !com.xiaomi.push.s.m12374b() || Constants.HYBRID_PACKAGE_NAME.equals(str);
    }
}
