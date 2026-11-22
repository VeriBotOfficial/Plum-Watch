package com.baidu.xclient.gdid.j;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.baidu.sec.privacy.f.g;
import com.wakeup.common.utils.AdvConstance;
import java.io.File;
import java.io.FileFilter;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static String f9064a = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.getName().matches("^cpu\\d+");
        }
    }

    public static JSONObject a(Context context, JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("1", d(context));
            jSONObject2.put("2", com.baidu.xclient.gdid.d.a().a(context));
            jSONObject2.put("3", b(context));
            jSONObject2.put("4", com.baidu.mshield.b.b.a.a(context));
            jSONObject2.put("5", str);
            jSONObject2.put("6", System.currentTimeMillis());
            jSONObject2.put("7", "");
            jSONObject2.put("8", com.baidu.xclient.gdid.d.c);
            jSONObject2.put("9", com.baidu.xclient.gdid.f.b);
            jSONObject2.put("10", com.baidu.xclient.gdid.f.c);
            jSONObject2.put("11", "");
            jSONObject2.put("12", "");
            jSONObject2.put("13", 1);
            jSONObject2.put("14", com.baidu.xclient.gdid.d.a().c("ws"));
            jSONObject2.put(AdvConstance.MINE_PAGE, com.baidu.mshield.b.b.a.c(context));
            jSONObject2.put("21", com.baidu.mshield.b.b.a.b(context));
            jSONObject2.put("22", "");
            jSONObject2.put("23", "");
            jSONObject2.put(AdvConstance.COURSE_PAGE, "");
            jSONObject2.put("module_section", jSONArray);
            return jSONObject2;
        } catch (Throwable th) {
            a(th);
            return null;
        }
    }

    public static void a(Throwable th) {
    }

    public static boolean a(Context context) {
        try {
            NetworkInfo a2 = com.baidu.mshield.b.e.b.a(context);
            if (a2 == null) {
                return false;
            }
            return a2.isConnected();
        } catch (Throwable th) {
            a(th);
            return false;
        }
    }

    public static byte[] a() {
        char[] cArr = new char[16];
        try {
            char[] charArray = f9064a.toCharArray();
            for (int i = 0; i < 16; i++) {
                int nextInt = new Random().nextInt(62);
                if (nextInt >= 0 && nextInt < charArray.length) {
                    cArr[i] = charArray[nextInt];
                }
            }
        } catch (Throwable th) {
            a(th);
        }
        return new String(cArr).getBytes();
    }

    public static String b() {
        try {
            return g.a("ro.build.fingerprint", "");
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }

    public static String b(Context context) {
        String str;
        String str2 = "";
        try {
            PackageInfo a2 = com.baidu.mshield.b.e.c.a(context, com.baidu.xclient.gdid.d.a().a(context), 0);
            str = a2 != null ? a2.versionName : "";
        } catch (Throwable th) {
            th = th;
        }
        try {
            return TextUtils.isEmpty(str) ? "" : str;
        } catch (Throwable th2) {
            str2 = str;
            th = th2;
            a(th);
            return str2;
        }
    }

    public static int c() {
        try {
            File file = new File("/sys/devices/system/cpu");
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles(new a());
                if (listFiles == null) {
                    return 0;
                }
                return listFiles.length;
            }
            return -1;
        } catch (Throwable th) {
            a(th);
            return -1;
        }
    }

    public static Pair<String, String> c(Context context) {
        Pair<String, String> c = com.baidu.sec.privacy.e.a.a(context).c();
        return c == null ? new Pair<>("", "") : c;
    }

    public static String d(Context context) {
        try {
            return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th) {
            a(th);
            return "";
        }
    }
}
