package com.apm.insight.l;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.apm.insight.l.e;
import com.apm.insight.nativecrash.NativeImpl;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Stack.java */
/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f6079a = new StackTraceElement("", "", "", 0);

    public static String a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            a(stackTraceElement, sb);
        }
        return sb.toString();
    }

    public static StringBuilder a(StackTraceElement stackTraceElement, StringBuilder sb) {
        sb.append("  at ").append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append(Separators.LPAREN).append(stackTraceElement.getFileName()).append(":").append(stackTraceElement.getLineNumber()).append(")\n");
        return sb;
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            a(th, printWriter);
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            return stringWriter2;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    public static StackTraceElement[] b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        try {
            a(th, arrayList);
        } catch (Throwable unused) {
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }

    public static String a(Throwable th, PrintStream printStream, e.a aVar) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Throwable unused) {
            messageDigest = null;
        }
        e eVar = new e(printStream, messageDigest, aVar);
        try {
            a(th, eVar);
        } catch (Throwable unused2) {
        }
        eVar.close();
        if (messageDigest == null) {
            return null;
        }
        byte[] digest = messageDigest.digest();
        if (digest == null || digest.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[digest.length << 1];
        int i = 0;
        for (byte b : digest) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i += 2;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r8 = r0.exists()
            if (r8 != 0) goto L14
            return r1
        L14:
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 10
            r5 = 0
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5c
            java.io.FileReader r7 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5c
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L5c
            r0 = r5
        L31:
            java.lang.String r1 = r6.readLine()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L57
            r7 = 256(0x100, float:3.59E-43)
            if (r0 > r7) goto L46
            r8.add(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> L5b
            r1.append(r4)     // Catch: java.lang.Throwable -> L5b
            goto L54
        L46:
            r2.add(r1)     // Catch: java.lang.Throwable -> L5b
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L5b
            if (r1 <= r7) goto L54
            r2.poll()     // Catch: java.lang.Throwable -> L5b
            int r5 = r5 + 1
        L54:
            int r0 = r0 + 1
            goto L31
        L57:
            com.apm.insight.a.a(r6)
            goto L5f
        L5b:
            r1 = r6
        L5c:
            com.apm.insight.a.a(r1)
        L5f:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L8e
            if (r5 == 0) goto L76
            java.lang.String r8 = "\t... skip "
            java.lang.StringBuilder r8 = r3.append(r8)
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.String r0 = " lines\n"
            r8.append(r0)
        L76:
            java.util.Iterator r8 = r2.iterator()
        L7a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r0 = r3.append(r0)
            r0.append(r4)
            goto L7a
        L8e:
            java.lang.String r8 = r3.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.l.m.a(java.lang.String):java.lang.String");
    }

    public static JSONObject b(String str) {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            JSONObject jSONObject = new JSONObject();
            if (allStackTraces == null) {
                return null;
            }
            jSONObject.put("thread_all_count", allStackTraces.size());
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                Thread key = entry.getKey();
                String name = key.getName();
                if (!c(name) && (str == null || (!str.equals(name) && !name.startsWith(str) && !name.endsWith(str)))) {
                    jSONObject2.put(CrashHianalyticsData.THREAD_NAME, key.getName() + Separators.LPAREN + key.getId() + Separators.RPAREN);
                    StackTraceElement[] value = entry.getValue();
                    if (value != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (StackTraceElement stackTraceElement : value) {
                            jSONArray2.put(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + Separators.LPAREN + stackTraceElement.getLineNumber() + Separators.RPAREN);
                        }
                        jSONObject2.put("thread_stack", jSONArray2);
                        if (jSONArray2.length() > 0) {
                        }
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("thread_stacks", jSONArray);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean c(String str) {
        Set<String> a2 = g.a();
        if (a2.contains(str)) {
            return true;
        }
        for (String str2 : a2) {
            if (!TextUtils.isEmpty(str) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            if (th instanceof OutOfMemoryError) {
                return true;
            }
            if (i > 20) {
                return false;
            }
            i++;
            try {
                th = th.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean d(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            try {
                if ((th instanceof OutOfMemoryError) && (th.getMessage().contains("allocate") || th.getMessage().contains("thrown"))) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                th = th.getCause();
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    private static void b(Throwable th, int i) {
        th.getClass().getName();
        String localizedMessage = th.getLocalizedMessage();
        try {
            NativeImpl.a(i, th.getClass().getName());
            if (localizedMessage != null) {
                NativeImpl.a(i, ": ");
                NativeImpl.a(i, localizedMessage);
            }
            NativeImpl.a(i, "\n");
        } catch (Throwable unused) {
        }
    }

    private static void a(StackTraceElement stackTraceElement, int i) {
        try {
            NativeImpl.a(i, "\tat ");
            NativeImpl.a(i, stackTraceElement.getClassName());
            NativeImpl.a(i, ".");
            NativeImpl.a(i, stackTraceElement.getMethodName());
            if (!stackTraceElement.isNativeMethod()) {
                if (stackTraceElement.getFileName() != null) {
                    if (stackTraceElement.getLineNumber() >= 0) {
                        NativeImpl.a(i, Separators.LPAREN);
                        NativeImpl.a(i, stackTraceElement.getFileName());
                        NativeImpl.a(i, ":");
                        NativeImpl.a(i, String.valueOf(stackTraceElement.getLineNumber()));
                        NativeImpl.a(i, Separators.RPAREN);
                    } else {
                        NativeImpl.a(i, Separators.LPAREN);
                        NativeImpl.a(i, stackTraceElement.getFileName());
                        NativeImpl.a(i, Separators.RPAREN);
                    }
                } else if (stackTraceElement.getLineNumber() >= 0) {
                    NativeImpl.a(i, "(Unknown Source:");
                    NativeImpl.a(i, String.valueOf(stackTraceElement.getLineNumber()));
                    NativeImpl.a(i, Separators.RPAREN);
                } else {
                    NativeImpl.a(i, "(Unknown Source)");
                }
            } else {
                NativeImpl.a(i, "(Native Method)");
            }
            NativeImpl.a(i, "\n");
        } catch (Throwable unused) {
        }
    }

    private static void a(Throwable th, List<StackTraceElement> list) {
        if (th == null) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.add(th);
        list.add(f6079a);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > 384;
        int length = stackTrace.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (z && i2 > 256) {
                list.add(f6079a);
                break;
            } else {
                list.add(stackTraceElement);
                i2++;
                i++;
            }
        }
        if (z) {
            for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                list.add(stackTrace[length2]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            a(th2, list, Separators.HT, newSetFromMap, 128);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            a(cause, list, "", newSetFromMap, 128);
        }
    }

    private static void a(Throwable th, List<StackTraceElement> list, String str, Set<Throwable> set, int i) {
        while (!set.contains(th)) {
            set.add(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i2 = 0;
            boolean z = stackTrace.length > i;
            list.add(f6079a);
            int length = stackTrace.length;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i3];
                if (z && i4 > i) {
                    list.add(f6079a);
                    break;
                } else {
                    list.add(stackTraceElement);
                    i4++;
                    i3++;
                }
            }
            if (z) {
                for (int length2 = stackTrace.length - (i / 2); length2 < stackTrace.length; length2++) {
                    list.add(stackTrace[length2]);
                }
            }
            Throwable[] suppressed = th.getSuppressed();
            int length3 = suppressed.length;
            while (true) {
                int i5 = 10;
                if (i2 >= length3) {
                    break;
                }
                Throwable th2 = suppressed[i2];
                String str2 = str + Separators.HT;
                int i6 = i / 2;
                if (i6 > 10) {
                    i5 = i6;
                }
                a(th2, list, str2, set, i5);
                i2++;
            }
            th = th.getCause();
            if (th == null) {
                return;
            }
            i /= 2;
            if (i <= 10) {
                i = 10;
            }
        }
        list.add(f6079a);
    }

    private static void a(Throwable th, PrintWriter printWriter) {
        if (th == null) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.add(th);
        printWriter.println(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > 384;
        int length = stackTrace.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (z && i2 > 256) {
                printWriter.println("\t... skip " + ((stackTrace.length - i2) + com.alipay.sdk.m.p.a.g) + " lines");
                break;
            } else {
                printWriter.println("\tat ".concat(String.valueOf(stackTraceElement)));
                i2++;
                i++;
            }
        }
        if (z) {
            for (int length2 = stackTrace.length + com.alipay.sdk.m.p.a.g; length2 < stackTrace.length; length2++) {
                printWriter.println("\tat " + stackTrace[length2]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            a(th2, printWriter, "Suppressed: ", Separators.HT, newSetFromMap, 128);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            a(cause, printWriter, "Caused by: ", "", newSetFromMap, 128);
        }
    }

    private static void a(Throwable th, int i, String str, String str2) {
        while (true) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            try {
                NativeImpl.a(i, str2);
                NativeImpl.a(i, str);
            } catch (Throwable unused) {
            }
            b(th, i);
            for (StackTraceElement stackTraceElement : stackTrace) {
                a(stackTraceElement, i);
            }
            for (Throwable th2 : th.getSuppressed()) {
                a(th2, i, "Suppressed: ", str2 + Separators.HT);
            }
            th = th.getCause();
            if (th == null) {
                return;
            } else {
                str = "Caused by: ";
            }
        }
    }

    private static void a(Throwable th, PrintWriter printWriter, String str, String str2, Set<Throwable> set, int i) {
        while (!set.contains(th)) {
            set.add(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            boolean z = stackTrace.length > i;
            printWriter.println(str2 + str + th);
            int length = stackTrace.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (z && i3 > i) {
                    printWriter.println("\t... skip " + ((stackTrace.length - i3) - (i / 2)) + " lines");
                    break;
                } else {
                    printWriter.println("\tat ".concat(String.valueOf(stackTraceElement)));
                    i3++;
                    i2++;
                }
            }
            if (z) {
                for (int length2 = stackTrace.length - (i / 2); length2 < stackTrace.length; length2++) {
                    printWriter.println("\tat " + stackTrace[length2]);
                }
            }
            for (Throwable th2 : th.getSuppressed()) {
                int i4 = i / 2;
                a(th2, printWriter, "Suppressed: ", str2 + Separators.HT, set, i4 > 10 ? i4 : 10);
            }
            PrintWriter printWriter2 = printWriter;
            Set<Throwable> set2 = set;
            th = th.getCause();
            if (th == null) {
                return;
            }
            i /= 2;
            if (i <= 10) {
                i = 10;
            }
            str = "Caused by: ";
            printWriter = printWriter2;
            set = set2;
        }
        printWriter.println("\t[CIRCULAR REFERENCE:" + th + "]");
    }

    /* compiled from: Stack.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f6080a;
        public int b;

        public a(int i, int i2) {
            this.f6080a = i;
            this.b = i2;
        }

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("start", this.f6080a);
                jSONObject.put("end", this.b);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    private static boolean a(String str, String[] strArr) {
        if (strArr != null && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONArray a(StackTraceElement[] stackTraceElementArr, String[] strArr) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < stackTraceElementArr.length; i++) {
            if (aVar.f6080a == -1) {
                if (a(stackTraceElementArr[i].getClassName(), strArr)) {
                    aVar.f6080a = i;
                    aVar.b = i;
                }
            } else if (!a(stackTraceElementArr[i].getClassName(), strArr)) {
                aVar.b = i;
                jSONArray.put(aVar.a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f6080a != -1) {
            aVar.b = stackTraceElementArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    public static JSONArray a(String[] strArr, String[] strArr2) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < strArr.length; i++) {
            if (aVar.f6080a == -1) {
                if (a(strArr[i], strArr2)) {
                    aVar.f6080a = i;
                    aVar.b = i;
                }
            } else if (!a(strArr[i], strArr2)) {
                aVar.b = i;
                jSONArray.put(aVar.a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f6080a != -1) {
            aVar.b = strArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    public static void a(Throwable th, int i) {
        if (th == null || i <= 0) {
            return;
        }
        try {
            b(th, i);
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                a(stackTraceElement, i);
            }
            for (Throwable th2 : th.getSuppressed()) {
                a(th2, i, "Suppressed: ", Separators.HT);
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                a(cause, i, "Caused by: ", "");
            }
        } catch (Throwable unused) {
        }
    }
}
