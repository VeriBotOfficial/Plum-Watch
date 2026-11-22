package com.pgl.ssdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.luck.picture.lib.config.PictureMimeType;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static long f12758a = 28800;
    public static int b = 5;

    public static long a(long j, InputStream inputStream) throws IOException {
        if (j != -1) {
            return j;
        }
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j2;
            }
            j2 += read;
        }
    }

    public static long b() {
        Context b2 = z.b();
        if (b2 == null) {
            return 0L;
        }
        long a2 = ax.a(b2, "pgl_frt", 0L);
        if (a2 != 0) {
            return a2;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ax.b(b2, "pgl_frt", currentTimeMillis);
        return currentTimeMillis;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized void c() {
        synchronized (f.class) {
            if (d()) {
                String c = v.c();
                if (TextUtils.isEmpty(c)) {
                    return;
                }
                File file = new File(c);
                if (file.exists()) {
                    JSONObject a2 = a(file, true);
                    a2.put(com.anythink.expressad.foundation.d.j.cG, v.b());
                    a2.put("app_name", ab.d(z.b()));
                    PglSSManager pglSSManager = PglSSManager.getInstance();
                    if (pglSSManager == null) {
                        au.a(String.valueOf(a2));
                        return;
                    }
                    PglSSCallBack pglCallBack = pglSSManager.getPglCallBack();
                    if (pglCallBack != null) {
                        pglCallBack.reportSoftDecData("detailed_app_info", a2.toString());
                    }
                }
            }
        }
    }

    private static boolean d() {
        int a2 = ax.a(z.b(), "pgl_is_hit", 0);
        au.a("hitsTimes " + a2);
        if (a2 > 0) {
            return false;
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - b();
        au.a("runningTime ".concat(String.valueOf(currentTimeMillis)));
        if (currentTimeMillis < f12758a) {
            return false;
        }
        ax.b(z.b(), "pgl_is_hit", 1);
        return e();
    }

    private static boolean e() {
        boolean z = b == 100;
        return !z ? ((int) ((Math.random() * 100.0d) + 1.0d)) <= b : z;
    }

    public static void a(JSONObject jSONObject, String str, List<String> list, boolean z) {
        if (jSONObject == null || list == null || list.isEmpty()) {
            return;
        }
        if (z) {
            try {
                jSONObject.put(str + "_size", list.size());
            } catch (JSONException unused) {
                return;
            }
        }
        jSONObject.put(str, n.a(list));
    }

    private static JSONObject a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : list) {
            if (str.endsWith(PictureMimeType.PNG)) {
                arrayList2.add(str.substring(0, str.lastIndexOf(PictureMimeType.PNG)));
            } else if (str.endsWith(".xml")) {
                arrayList.add(str.substring(0, str.lastIndexOf(".xml")));
            } else {
                arrayList3.add(str);
            }
        }
        a(jSONObject, "xml", arrayList, true);
        a(jSONObject, "png", arrayList2, true);
        a(jSONObject, "other", arrayList3, true);
        return jSONObject;
    }

    public static JSONObject a() throws JSONException {
        String[] strArr;
        Context b2 = z.b();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (b2 != null) {
            ApplicationInfo applicationInfo = b2.getApplicationInfo();
            String str = applicationInfo.nativeLibraryDir;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null && listFiles.length > 0) {
                        for (File file2 : listFiles) {
                            arrayList.add(file2.getName());
                        }
                    }
                    if ("arm64".equals(file.getName())) {
                        a(jSONObject2, "v8a", arrayList, false);
                    } else {
                        a(jSONObject2, "v7a", arrayList, false);
                    }
                    if (jSONObject2.length() > 0) {
                        jSONObject.put("lib", jSONObject2);
                    }
                }
            }
            if (arrayList.isEmpty() && (strArr = applicationInfo.splitPublicSourceDirs) != null) {
                for (String str2 : strArr) {
                    if (str2.endsWith("armeabi-v7a.apk") || str2.endsWith("arm64_v8a.apk")) {
                        File file3 = new File(str2);
                        if (file3.exists()) {
                            return a(file3, false);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x019f, code lost:
    
        if (r8 != null) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject a(java.io.File r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.f.a(java.io.File, boolean):org.json.JSONObject");
    }
}
