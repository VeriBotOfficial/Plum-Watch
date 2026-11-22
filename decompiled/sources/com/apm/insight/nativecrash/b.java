package com.apm.insight.nativecrash;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.ICommonParams;
import com.apm.insight.runtime.j;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: NativeFileParser.java */
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private Context f6086a;
    private ICommonParams b;
    private ICommonParams c;

    /* compiled from: NativeFileParser.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        protected File f6087a;
        protected String b;
        protected String c;
        protected int d;

        public c(File file) {
            this.f6087a = file;
        }

        public final int a() {
            int i;
            Throwable th;
            if (!this.f6087a.exists() || !this.f6087a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f6087a));
                int i2 = -1;
                do {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        i2 = a(readLine);
                    } catch (Throwable th2) {
                        th = th2;
                        i = i2;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a();
                            j.a(th, "NPTH_CATCH");
                            return i;
                        } finally {
                            if (bufferedReader != null) {
                                com.apm.insight.a.a((Closeable) bufferedReader);
                            }
                        }
                    }
                } while (i2 == -1);
                com.apm.insight.a.a((Closeable) bufferedReader2);
                return i2;
            } catch (Throwable th3) {
                i = -1;
                th = th3;
            }
        }

        private int a(String str) {
            int i = this.d;
            if (!str.startsWith(this.b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.c)[1].trim());
            } catch (NumberFormatException e) {
                com.apm.insight.c.a();
                j.a(e, "NPTH_CATCH");
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* compiled from: NativeFileParser.java */
    /* renamed from: com.apm.insight.nativecrash.b$b, reason: collision with other inner class name */
    public static class C0298b extends c {
        C0298b(File file) {
            super(file);
            this.b = "VmSize:";
            this.c = "\\s+";
            this.d = -1;
        }
    }

    /* compiled from: NativeFileParser.java */
    public static class f extends c {
        f(File file) {
            super(file);
            this.b = "Total Threads Count:";
            this.c = ":";
            this.d = -2;
        }
    }

    /* compiled from: NativeFileParser.java */
    public static class a extends c {
        a(File file) {
            super(file);
            this.b = "Total FD Count:";
            this.c = ":";
            this.d = -2;
        }
    }

    /* compiled from: NativeFileParser.java */
    public static class d extends c {
        d(File file) {
            super(file);
        }

        public final HashMap<String, List<String>> b() {
            String str;
            HashMap<String, List<String>> hashMap = new HashMap<>();
            try {
                JSONArray a2 = com.apm.insight.l.f.a(this.f6087a.getAbsolutePath());
                if (a2 != null) {
                    for (int i = 0; i < a2.length(); i++) {
                        String optString = a2.optString(i);
                        if (!TextUtils.isEmpty(optString) && optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                            int indexOf = optString.indexOf("[routine:0x");
                            int i2 = indexOf + 11;
                            int indexOf2 = optString.indexOf(93, i2);
                            if (indexOf > 0) {
                                str = optString.substring(i2, indexOf2);
                            } else {
                                str = "unknown addr";
                            }
                            List<String> list = hashMap.get(str);
                            if (list == null) {
                                list = new ArrayList<>();
                                hashMap.put(str, list);
                            }
                            list.add(optString);
                        }
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                com.apm.insight.c.a();
                j.a(th, "NPTH_CATCH");
            }
            return hashMap;
        }
    }

    /* compiled from: NativeFileParser.java */
    public static class e extends c {
        e(File file) {
            super(file);
        }

        public final JSONArray a(HashMap<String, List<String>> hashMap) {
            int indexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (!hashMap.isEmpty()) {
                try {
                    JSONArray a2 = com.apm.insight.l.f.a(this.f6087a.getAbsolutePath());
                    if (a2 != null) {
                        for (int i = 0; i < a2.length(); i++) {
                            String optString = a2.optString(i);
                            if (!TextUtils.isEmpty(optString) && (indexOf = optString.indexOf(":")) > 2) {
                                String substring = optString.substring(2, indexOf);
                                if (hashMap.containsKey(substring) && (list = hashMap.get(substring)) != null) {
                                    Iterator<String> it = list.iterator();
                                    while (it.hasNext()) {
                                        jSONArray.put(it.next() + " " + optString);
                                    }
                                    hashMap.remove(substring);
                                }
                            }
                        }
                        Iterator<List<String>> it2 = hashMap.values().iterator();
                        while (it2.hasNext()) {
                            Iterator<String> it3 = it2.next().iterator();
                            while (it3.hasNext()) {
                                jSONArray.put(it3.next() + "  0x000000:unknown");
                            }
                        }
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    j.a(th, "NPTH_CATCH");
                }
            }
            return jSONArray;
        }
    }

    public static JSONArray a(File file, File file2) {
        return new e(file2).a(new d(file).b());
    }

    public static int a(String str) {
        return new a(com.apm.insight.l.j.b(str)).a();
    }

    public static int b(String str) {
        return new f(com.apm.insight.l.j.c(str)).a();
    }

    public static int c(String str) {
        return new C0298b(com.apm.insight.l.j.d(str)).a();
    }

    public b(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    public b(Context context, ICommonParams iCommonParams, b bVar) {
        this.f6086a = context;
        this.b = iCommonParams;
        this.c = bVar == null ? null : bVar.b;
    }

    public final Map<String, Object> a() {
        Object obj;
        Map<String, Object> b = b();
        if (((b == null || (obj = b.get("aid")) == null) ? null : String.valueOf(obj)) == null) {
            b.put("aid", 4444);
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> b() {
        /*
            r9 = this;
            java.lang.String r0 = "version_name"
            java.lang.String r1 = "update_version_code"
            java.lang.String r2 = "version_code"
            r3 = 0
            com.apm.insight.ICommonParams r4 = r9.c     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L10
            java.util.Map r4 = r4.getCommonParams()     // Catch: java.lang.Throwable -> L25
            goto L15
        L10:
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L25
            r4.<init>()     // Catch: java.lang.Throwable -> L25
        L15:
            com.apm.insight.ICommonParams r5 = r9.b     // Catch: java.lang.Throwable -> L20
            java.util.Map r5 = r5.getCommonParams()     // Catch: java.lang.Throwable -> L20
            r4.putAll(r5)     // Catch: java.lang.Throwable -> L20
            r5 = r3
            goto L2a
        L20:
            r5 = move-exception
            r8 = r5
            r5 = r4
            r4 = r8
            goto L27
        L25:
            r4 = move-exception
            r5 = r3
        L27:
            r8 = r5
            r5 = r4
            r4 = r8
        L2a:
            if (r4 != 0) goto L3d
            java.util.HashMap r4 = new java.util.HashMap
            r6 = 4
            r4.<init>(r6)
            if (r5 == 0) goto L3d
            java.lang.String r6 = "err_info"
            java.lang.String r5 = com.apm.insight.l.m.a(r5)     // Catch: java.lang.Throwable -> L3d
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L3d
        L3d:
            boolean r5 = a(r4)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 == 0) goto La7
            android.content.Context r5 = r9.f6086a     // Catch: java.lang.Throwable -> L83
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L83
            android.content.Context r7 = r9.f6086a     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = r7.getPackageName()     // Catch: java.lang.Throwable -> L83
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r7, r6)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r5.versionName     // Catch: java.lang.Throwable -> L83
            r4.put(r0, r6)     // Catch: java.lang.Throwable -> L83
            int r6 = r5.versionCode     // Catch: java.lang.Throwable -> L83
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L83
            r4.put(r2, r6)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r6 = r4.get(r1)     // Catch: java.lang.Throwable -> L83
            if (r6 != 0) goto Lef
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo     // Catch: java.lang.Throwable -> L83
            android.os.Bundle r6 = r6.metaData     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L79
            android.content.pm.ApplicationInfo r3 = r5.applicationInfo     // Catch: java.lang.Throwable -> L83
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = "UPDATE_VERSION_CODE"
            java.lang.Object r3 = r3.get(r5)     // Catch: java.lang.Throwable -> L83
        L79:
            if (r3 != 0) goto L7f
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> L83
        L7f:
            r4.put(r1, r3)     // Catch: java.lang.Throwable -> L83
            goto Lef
        L83:
            android.content.Context r3 = r9.f6086a
            java.lang.String r3 = com.apm.insight.l.a.c(r3)
            r4.put(r0, r3)
            android.content.Context r0 = r9.f6086a
            int r0 = com.apm.insight.l.a.d(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r2, r0)
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto Lef
            java.lang.Object r0 = r4.get(r2)
            r4.put(r1, r0)
            goto Lef
        La7:
            android.content.Context r0 = r9.f6086a     // Catch: java.lang.Throwable -> Lef
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> Lef
            android.content.Context r1 = r9.f6086a     // Catch: java.lang.Throwable -> Lef
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> Lef
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r6)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Throwable -> Lef
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lef
            r1.<init>()     // Catch: java.lang.Throwable -> Lef
            android.content.Context r2 = r9.f6086a     // Catch: java.lang.Throwable -> Lef
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> Lef
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r2 = ".BuildConfig"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lef
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r2 = "VERSION_NAME"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> Lef
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> Lef
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lef
            if (r0 == 0) goto Lef
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lef
            if (r1 != 0) goto Lef
            java.lang.String r1 = "manifest_version"
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lef
        Lef:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.b.b():java.util.Map");
    }

    public static boolean a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return ((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code")) ? false : true;
    }

    public final ICommonParams c() {
        return this.b;
    }

    public final String d() {
        try {
            return this.b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String e() {
        try {
            return String.valueOf(this.b.getCommonParams().get("aid"));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    public final long f() {
        try {
            return this.b.getUserId();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
