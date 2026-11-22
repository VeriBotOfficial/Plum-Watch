package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechConstant;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes4.dex */
public class bm {
    public static String a() {
        return Build.VERSION.RELEASE + Constants.ACCEPT_TIME_SEPARATOR_SERVER + j.e();
    }

    public static byte[] a(String str) {
        byte[] copyOf = Arrays.copyOf(az.m11894a(str), 16);
        copyOf[0] = BuiltinOptions.FillOptions;
        copyOf[15] = BuiltinOptions.CosOptions;
        return copyOf;
    }

    public static String a(Context context) {
        String a2 = bn.a(context).a("sp_client_report_status", "sp_client_report_key", "");
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String a3 = bc.a(20);
        bn.a(context).m11921a("sp_client_report_status", "sp_client_report_key", a3);
        return a3;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m11917a(Context context) {
        return context.getApplicationContext().getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode >= 108;
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.xmsf.push.XMSF_UPLOAD_ACTIVE");
        intent.putExtra("pkgname", context.getPackageName());
        intent.putExtra(SpeechConstant.ISE_CATEGORY, "category_client_report_data");
        intent.putExtra("name", "quality_support");
        intent.putExtra("data", str);
        context.sendBroadcast(intent, "com.xiaomi.xmsf.permission.USE_XMSF_UPLOAD");
    }

    public static void a(Context context, List<String> list) {
        if (list == null || list.size() <= 0 || !m11917a(context)) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                a(context, str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f9, code lost:
    
        if (r7 == null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bm.a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m11918a(Context context, String str) {
        File file = new File(str);
        long maxFileLength = com.xiaomi.clientreport.manager.a.a(context).m11790a().getMaxFileLength();
        if (file.exists()) {
            try {
                return file.length() <= maxFileLength;
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
                return false;
            }
        }
        x.m12499a(file);
        return true;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static File[] m11919a(Context context, String str) {
        return new File(context.getFilesDir(), str).listFiles(new FilenameFilter() { // from class: com.xiaomi.push.bm.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                return (TextUtils.isEmpty(str2) || str2.toLowerCase().endsWith(".lock")) ? false : true;
            }
        });
    }
}
