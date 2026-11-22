package com.baidu.mshield.x6.c;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.baidu.mshield.x6.f.f;
import com.baidu.platform.comapi.map.MapController;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: NetworkInfoUtils.java */
/* loaded from: classes13.dex */
public class a {
    public static String a(Context context) {
        return "";
    }

    /* JADX WARN: Finally extract failed */
    public static List<String> a(String str) {
        String str2;
        int i;
        String str3;
        String str4;
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                try {
                    str2 = String.valueOf(jSONObject.getInt("eid"));
                } catch (Throwable th) {
                    f.b(th);
                    str2 = null;
                }
                int i3 = -1;
                try {
                    i = jSONObject.getInt("pattern");
                } catch (Throwable th2) {
                    f.b(th2);
                    i = -1;
                }
                try {
                    str3 = jSONObject.getString(MapController.ITEM_LAYER_TAG);
                } catch (Throwable th3) {
                    f.b(th3);
                    str3 = null;
                }
                try {
                    i3 = jSONObject.getInt("type");
                } catch (Throwable th4) {
                    f.b(th4);
                }
                try {
                    str4 = jSONObject.getString("value");
                } catch (Throwable th5) {
                    f.b(th5);
                    str4 = null;
                }
                if (i3 == 0 && !TextUtils.isEmpty(str3)) {
                    a(i, str3, str2, str4, arrayList);
                } else if (i3 == 1 && !TextUtils.isEmpty(str3)) {
                    b(i, str3, str2, str4, arrayList);
                } else if (i3 == 2 && !TextUtils.isEmpty(str3)) {
                    e(i, str3, str2, str4, arrayList);
                } else if (i3 == 3 && !TextUtils.isEmpty(str3)) {
                    f(i, str3, str2, str4, arrayList);
                } else if (i3 == 4 && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                    try {
                        fileReader = new FileReader(new File("/proc/cpuinfo"));
                        try {
                            bufferedReader = new BufferedReader(fileReader);
                            while (true) {
                                try {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    if (readLine.contains(str3)) {
                                        String a2 = a(readLine, str3);
                                        if (!TextUtils.isEmpty(a2) && a2.startsWith(str4)) {
                                            if (!arrayList.contains(str2)) {
                                                arrayList.add(str2);
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    try {
                                        f.b(th);
                                        if (fileReader != null) {
                                            fileReader.close();
                                        }
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                    } catch (Throwable th7) {
                                        if (fileReader != null) {
                                            fileReader.close();
                                        }
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                        throw th7;
                                    }
                                }
                            }
                            fileReader.close();
                            bufferedReader.close();
                        } catch (Throwable th8) {
                            th = th8;
                            bufferedReader = null;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        fileReader = null;
                        bufferedReader = null;
                    }
                } else if (i3 == 13 && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                    c(i, str3, str2, str4, arrayList);
                } else if (i3 == 14 && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                    d(i, str3, str2, str4, arrayList);
                }
            }
            return arrayList;
        } catch (Throwable th10) {
            f.b(th10);
            return null;
        }
    }

    public static String b(Context context) {
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004f, code lost:
    
        if (r6.contains(r4) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0051, code lost:
    
        r6.add(r4);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.util.List<java.lang.String> r6) {
        /*
            r0 = 1
            if (r2 != r0) goto L13
            boolean r2 = f(r3)     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L83
            boolean r2 = r6.contains(r4)     // Catch: java.lang.Throwable -> L7f
            if (r2 != 0) goto L83
            r6.add(r4)     // Catch: java.lang.Throwable -> L7f
            return
        L13:
            r0 = 2
            if (r2 != r0) goto L26
            boolean r2 = f(r3)     // Catch: java.lang.Throwable -> L7f
            if (r2 != 0) goto L83
            boolean r2 = r6.contains(r4)     // Catch: java.lang.Throwable -> L7f
            if (r2 != 0) goto L83
            r6.add(r4)     // Catch: java.lang.Throwable -> L7f
            return
        L26:
            r0 = 3
            if (r2 != r0) goto L83
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L7f
            if (r2 != 0) goto L83
            r2 = 0
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Throwable -> L63
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L63
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L63
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L63
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L5f
        L3f:
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L54
            boolean r2 = r2.contains(r5)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L3f
            boolean r2 = r6.contains(r4)     // Catch: java.lang.Throwable -> L5b
            if (r2 != 0) goto L54
            r6.add(r4)     // Catch: java.lang.Throwable -> L5b
        L54:
            r0.close()     // Catch: java.lang.Throwable -> L7f
            r3.close()     // Catch: java.lang.Throwable -> L7f
            return
        L5b:
            r2 = move-exception
            r4 = r3
            r3 = r2
            goto L61
        L5f:
            r3 = move-exception
            r4 = r2
        L61:
            r2 = r0
            goto L65
        L63:
            r3 = move-exception
            r4 = r2
        L65:
            com.baidu.mshield.x6.f.f.b(r3)     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L6d
            r2.close()     // Catch: java.lang.Throwable -> L7f
        L6d:
            if (r4 == 0) goto L83
            r4.close()     // Catch: java.lang.Throwable -> L7f
            goto L83
        L73:
            r3 = move-exception
            if (r2 == 0) goto L79
            r2.close()     // Catch: java.lang.Throwable -> L7f
        L79:
            if (r4 == 0) goto L7e
            r4.close()     // Catch: java.lang.Throwable -> L7f
        L7e:
            throw r3     // Catch: java.lang.Throwable -> L7f
        L7f:
            r2 = move-exception
            com.baidu.mshield.x6.f.f.b(r2)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mshield.x6.c.a.b(int, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }

    public static void c(int i, String str, String str2, String str3, List<String> list) {
        try {
            com.baidu.mshield.b.c.a.b("hanldeEmulatorData13===" + i + ";" + str + ";" + str2 + ";" + str3);
            if (i == 0) {
                String[] split = str3.split("\\|");
                if (1 == a(str, split[0], split.length == 2 ? split[1].replace("$", "#") : null)) {
                    list.add(str2);
                }
            }
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public static void d(int i, String str, String str2, String str3, List<String> list) {
        try {
            com.baidu.mshield.b.c.a.b("hanldeEmulatorData14===" + i + ";" + str + ";" + str2 + ";" + str3);
            if (i == 0) {
                String[] split = str3.split("\\|");
                if (split.length != 2) {
                    return;
                }
                String str4 = (String) com.baidu.xclient.gdid.a.a(16, str, split[0], new long[]{Long.valueOf(split[1]).longValue(), c(str)});
                com.baidu.mshield.b.c.a.b("GH jniCtl ===" + str4);
                if ("1".equals(str4)) {
                    list.add(str2);
                }
            }
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public static void e(int i, String str, String str2, String str3, List<String> list) {
        try {
            if (i == 1) {
                if (!f(str) || list.contains(str2)) {
                    return;
                }
                list.add(str2);
                return;
            }
            if (i == 2) {
                if (f(str) || list.contains(str2)) {
                    return;
                }
                list.add(str2);
                return;
            }
            if (i != 6 || TextUtils.isEmpty(str3)) {
                return;
            }
            if (str.contains(Separators.QUESTION)) {
                if (!a(str, str3, 2) || list.contains(str2)) {
                    return;
                }
                list.add(str2);
                return;
            }
            File[] listFiles = new File(str).listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            for (File file : listFiles) {
                String name = file.getName();
                if (name != null && name.contains(str3)) {
                    if (list.contains(str2)) {
                        return;
                    }
                    list.add(str2);
                    return;
                }
            }
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public static void f(int i, String str, String str2, String str3, List<String> list) {
        try {
            if (i == 1) {
                if (TextUtils.isEmpty(d(str)) || list.contains(str2)) {
                    return;
                }
                list.add(str2);
                return;
            }
            if (i == 2) {
                if (!TextUtils.isEmpty(d(str)) || list.contains(str2)) {
                    return;
                }
                list.add(str2);
                return;
            }
            if (i == 3) {
                String d = d(str);
                if (TextUtils.isEmpty(d) || TextUtils.isEmpty(str3) || !d.contains(str3) || list.contains(str2)) {
                    return;
                }
                list.add(str2);
                return;
            }
            if (i != 4 || TextUtils.isEmpty(str)) {
                return;
            }
            String d2 = d(str);
            if (TextUtils.isEmpty(d2) || TextUtils.isEmpty(str3) || !d2.startsWith(str3) || list.contains(str2)) {
                return;
            }
            list.add(str2);
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public static long c(String str) {
        String readLine;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("proc/self/maps", "r");
            do {
                readLine = randomAccessFile.readLine();
                if (readLine == null) {
                    break;
                }
                readLine = readLine.trim();
            } while (!readLine.endsWith(str));
            long e = !TextUtils.isEmpty(readLine) ? e(readLine.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER)[0]) : 0L;
            randomAccessFile.close();
            return e;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static String d(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Throwable th) {
            f.b(th);
            return null;
        }
    }

    public static void d(int i, String str, String str2, String str3, JSONObject jSONObject) {
        try {
            com.baidu.mshield.b.c.a.b("hanldeEmulatorData9 item=" + str);
            String str4 = (String) com.baidu.xclient.gdid.a.a(10, str, str3, (Object) null);
            com.baidu.mshield.b.c.a.b("hanldeEmulatorData9 prop=" + str4);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put(str2, str4);
            } else {
                jSONObject.put(str2, "");
            }
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public static void c(int i, String str, String str2, String str3, JSONObject jSONObject) {
        try {
            com.baidu.mshield.b.c.a.b("hanldeEmulatorData20 item=" + str);
            if (i == 0) {
                String str4 = (String) com.baidu.xclient.gdid.a.a(24, str, str3, (Object) null);
                jSONObject.put(str2, str4);
                com.baidu.mshield.b.c.a.b("hanldeEmulatorData20 pat=0, jniRet=" + str4);
            } else if (i == 2) {
                String str5 = (String) com.baidu.xclient.gdid.a.a(25, str, str3, (Object) null);
                jSONObject.put(str2, str5);
                com.baidu.mshield.b.c.a.b("hanldeEmulatorData20 pat=2, jniRet=" + str5);
            } else if (i == 3) {
                String str6 = (String) com.baidu.xclient.gdid.a.a(26, str, str3, (Object) null);
                jSONObject.put(str2, str6);
                com.baidu.mshield.b.c.a.b("hanldeEmulatorData20 pat=3, jniRet=" + str6);
            }
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String a2 = com.baidu.xclient.gdid.a.a(str);
            com.baidu.mshield.b.c.a.b("GH getFileInode===" + a2);
            return !"-1".equals(new JSONObject(a2).optString("0"));
        } catch (Throwable th) {
            f.b(th);
            return false;
        }
    }

    public static long e(String str) {
        try {
            return Long.valueOf(str, 16).longValue();
        } catch (NumberFormatException e) {
            f.b(e);
            return -2147483648L;
        }
    }

    public static JSONObject b(String str) {
        String str2;
        int i;
        String str3;
        String str4;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                try {
                    str2 = String.valueOf(jSONObject2.getInt("eid"));
                } catch (Throwable th) {
                    f.b(th);
                    str2 = null;
                }
                int i3 = -1;
                try {
                    i = jSONObject2.getInt("pattern");
                } catch (Throwable th2) {
                    f.b(th2);
                    i = -1;
                }
                try {
                    str3 = jSONObject2.getString(MapController.ITEM_LAYER_TAG);
                } catch (Throwable th3) {
                    f.b(th3);
                    str3 = null;
                }
                try {
                    i3 = jSONObject2.getInt("type");
                } catch (Throwable th4) {
                    f.b(th4);
                }
                try {
                    str4 = jSONObject2.getString("value");
                } catch (Throwable th5) {
                    f.b(th5);
                    str4 = null;
                }
                if (i3 == 9 && !TextUtils.isEmpty(str3)) {
                    d(i, str3, str2, str4, jSONObject);
                } else if (i3 == 11 && !TextUtils.isEmpty(str3)) {
                    a(i, str3, str2, str4, jSONObject);
                } else if (i3 == 12 && !TextUtils.isEmpty(str3)) {
                    b(i, str3, str2, str4, jSONObject);
                } else if (i3 == 20 && !TextUtils.isEmpty(str3)) {
                    c(i, str3, str2, str4, jSONObject);
                }
            }
            return jSONObject;
        } catch (Throwable th6) {
            f.b(th6);
            return null;
        }
    }

    public static void a(int i, String str, String str2, String str3, List<String> list) {
        try {
            if (i == 1) {
                if (str.contains("/")) {
                    try {
                        Class.forName(str.replace("/", "."), false, ClassLoader.getSystemClassLoader());
                        list.add(str2);
                        return;
                    } catch (ClassNotFoundException e) {
                        f.b(e);
                        return;
                    }
                }
                return;
            }
            if (i == 2) {
                try {
                    Class.forName(str.replace("/", "."), false, ClassLoader.getSystemClassLoader());
                    return;
                } catch (ClassNotFoundException e2) {
                    f.b(e2);
                    list.add(str2);
                    return;
                }
            }
            return;
        } catch (Throwable th) {
            f.b(th);
        }
        f.b(th);
    }

    public static void b(int i, String str, String str2, String str3, JSONObject jSONObject) {
        try {
            com.baidu.mshield.b.c.a.b("hanldeEmulatorData12 item=" + str);
            com.baidu.mshield.b.c.a.b("hanldeEmulatorData12 value=" + str3);
            if (i == 0) {
                String str4 = (String) com.baidu.xclient.gdid.a.a(23, str, Integer.valueOf(Integer.parseInt(str3)), (Object) null);
                jSONObject.put(str2, str4);
                com.baidu.mshield.b.c.a.b("hanldeEmulatorData12 pat=0, jniRet=" + str4);
            }
        } catch (Throwable th) {
            f.b(th);
        }
    }

    public static boolean a(String str, String str2, int i) {
        int i2 = i - 1;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                String replaceAll = str.replaceAll("\\?", "");
                File[] listFiles = new File(replaceAll).listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    for (File file : listFiles) {
                        String name = file.getName();
                        if (name != null && name.contains(str2)) {
                            return true;
                        }
                        if ((name == null || !name.equals(".")) && ((name == null || !name.equals("..")) && i > 0)) {
                            File file2 = new File(replaceAll, file.getName());
                            if (file2.isDirectory()) {
                                return a(file2.getAbsolutePath(), str2, i2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                f.b(th);
            }
        }
        return false;
    }

    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(?i)" + str2 + "\t*: (.*)").matcher(str);
            if (matcher.matches()) {
                return matcher.group(1);
            }
            return null;
        } catch (Throwable th) {
            f.b(th);
            return null;
        }
    }

    public static int a(String str, String str2, String str3) {
        Method declaredMethod;
        com.baidu.mshield.b.c.a.b("getAPH===" + str + ";" + str2 + ";" + str3);
        try {
            Class<?> cls = Class.forName(str);
            if (!TextUtils.isEmpty(str3)) {
                String[] split = str3.split("#");
                if (split != null && split.length > 0) {
                    Class<?>[] clsArr = new Class[split.length];
                    for (int i = 0; i < split.length; i++) {
                        clsArr[i] = Class.forName(split[i]);
                    }
                    declaredMethod = cls.getDeclaredMethod(str2, clsArr);
                } else {
                    declaredMethod = cls.getDeclaredMethod(str2, new Class[0]);
                }
            } else {
                declaredMethod = cls.getDeclaredMethod(str2, new Class[0]);
            }
            if (declaredMethod != null) {
                if (Modifier.isNative(declaredMethod.getModifiers())) {
                    return 1;
                }
            }
        } catch (Throwable th) {
            f.b(th);
        }
        try {
            Field declaredField = Class.forName("de.robv.android.xposed.XposedHelpers", true, ClassLoader.getSystemClassLoader()).getDeclaredField("methodCache");
            declaredField.setAccessible(true);
            HashMap hashMap = (HashMap) declaredField.get(null);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append("#");
            stringBuffer.append(str2);
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).contains(stringBuffer.toString())) {
                    return 1;
                }
            }
        } catch (Throwable th2) {
            f.b(th2);
            com.baidu.mshield.b.c.a.b("getAPH exe===" + th2);
        }
        return 0;
    }

    public static void a(int i, String str, String str2, String str3, JSONObject jSONObject) {
        try {
            com.baidu.mshield.b.c.a.b("hanldeEmulatorData11 item=" + str);
            if (i == 0) {
                String str4 = (String) com.baidu.xclient.gdid.a.a(21, str, str3, (Object) null);
                jSONObject.put(str2, str4);
                com.baidu.mshield.b.c.a.b("hanldeEmulatorData11 pat=0, jniRet=" + str4);
            } else if (i == 1) {
                String str5 = (String) com.baidu.xclient.gdid.a.a(22, str, str3, (Object) null);
                jSONObject.put(str2, str5);
                com.baidu.mshield.b.c.a.b("hanldeEmulatorData11 pat=1, jniRet=" + str5);
            }
        } catch (Throwable th) {
            f.b(th);
        }
    }
}
