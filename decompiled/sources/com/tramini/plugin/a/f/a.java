package com.tramini.plugin.a.f;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.anythink.basead.c.b;
import com.luck.picture.lib.config.PictureMimeType;
import com.tramini.plugin.a.d.a;
import com.tramini.plugin.a.f.f;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    static final String f13721a = "naitve";
    static final String b = "html";
    static final String c = "html_background";
    static final String d = "html_play";
    static final String e = "html_css";
    static final String f = "html_x3d";
    static final String g = "html_doctype";
    static final String h = "html_doctype_write";
    static final String i = "html_unknow";
    static final String j = "0";
    static final String k = "1";
    static final String l = "2";
    static final String m = "3";
    static final String n = "4";
    static final String o = "5";
    static final String p = "6";

    /* renamed from: q, reason: collision with root package name */
    static final String f13722q = "7";
    static final String r = "8";
    static final String s = "9";
    private static final String t = JSONObject.class.getName();

    public static com.tramini.plugin.a.d.a a(JSONObject jSONObject, com.tramini.plugin.a.d.c cVar, String str, String str2) {
        return a(a(jSONObject.optString("in_na"), str), jSONObject.optString("pre"), a(jSONObject.optJSONArray("p_key")), jSONObject, cVar.e, str2);
    }

    private static com.tramini.plugin.a.d.a a(Object obj, String str, String[] strArr, JSONObject jSONObject, JSONArray jSONArray, String str2) {
        JSONObject a2;
        String str3;
        String str4;
        String str5;
        JSONObject jSONObject2 = new JSONObject();
        if (obj == null) {
            return null;
        }
        try {
            jSONArray.put(jSONArray.length(), b.a.A);
            HashSet hashSet = new HashSet();
            int i2 = 0;
            if (str2.hashCode() == 48 && str2.equals("0")) {
                a2 = a(obj, hashSet, strArr[1], str);
                String jSONObject3 = a2.toString();
                if (!TextUtils.isEmpty(jSONObject3)) {
                    String d2 = d(jSONObject3, f13721a);
                    str3 = "";
                    str4 = str3;
                    str5 = str4;
                    while (i2 < jSONArray.length()) {
                        try {
                            String optString = jSONArray.optString(i2);
                            String optString2 = jSONObject.optString(optString);
                            if (TextUtils.equals(optString2, b.a.A)) {
                                str3 = optString;
                            } else if (TextUtils.equals(optString2, "all")) {
                                str5 = optString;
                            } else if (!TextUtils.isEmpty(optString2)) {
                                String a3 = a(d2, f13721a, optString, jSONObject);
                                if (TextUtils.equals(optString, "i_lr")) {
                                    str4 = a3;
                                }
                                if (!TextUtils.isEmpty(a3)) {
                                    if (optString.equals(b.a.A) && !TextUtils.isEmpty(str3)) {
                                        jSONObject2.put(str3, a3);
                                    }
                                    jSONObject2.put(optString, a3);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        i2++;
                    }
                }
                str3 = "";
                str4 = str3;
                str5 = str4;
            } else {
                a2 = a(obj, hashSet, strArr[0], str);
                if (a2 != null) {
                    String optString3 = a2.optString(strArr[0]);
                    if (!TextUtils.isEmpty(optString3)) {
                        String str6 = i;
                        if (optString3.contains("div id=\"mys-wrapper\" class=\"mys-wrapper\">")) {
                            if (!optString3.contains("https://rr") && !optString3.contains(PictureMimeType.MP4)) {
                                str6 = c;
                            }
                            str6 = "html";
                        } else if (optString3.contains("html5AdData") && optString3.contains("google_template_data")) {
                            str6 = d;
                        } else if (optString3.contains("<link") && optString3.contains("type=\"text/css")) {
                            str6 = e;
                        } else if (optString3.contains("new videoInterstitial") && optString3.contains("x3c")) {
                            str6 = f;
                        } else if (optString3.contains("<!doctype html>")) {
                            if (optString3.contains("doc.write")) {
                                str6 = h;
                            } else {
                                str6 = g;
                            }
                        }
                        String d3 = d(optString3, str6);
                        str3 = "";
                        str4 = str3;
                        str5 = str4;
                        while (i2 < jSONArray.length()) {
                            try {
                                String optString4 = jSONArray.optString(i2);
                                String optString5 = jSONObject.optString(optString4);
                                if (TextUtils.equals(optString5, b.a.A)) {
                                    str3 = optString4;
                                } else if (TextUtils.equals(optString5, "all")) {
                                    str5 = optString4;
                                } else if (!TextUtils.isEmpty(optString5)) {
                                    String a4 = a(d3, str6, optString4, jSONObject);
                                    if (TextUtils.equals(optString4, "i_lr")) {
                                        str4 = a4;
                                    }
                                    if (!TextUtils.isEmpty(a4)) {
                                        if (optString4.equals(b.a.A) && !TextUtils.isEmpty(str3)) {
                                            jSONObject2.put(str3, a4);
                                        }
                                        jSONObject2.put(optString4, a4);
                                    }
                                }
                            } catch (Throwable unused2) {
                            }
                            i2++;
                        }
                    }
                }
                str3 = "";
                str4 = str3;
                str5 = str4;
            }
            com.tramini.plugin.a.d.a aVar = new com.tramini.plugin.a.d.a();
            if (jSONObject2.length() > 0) {
                if (!TextUtils.isEmpty(str3) && TextUtils.isEmpty(jSONObject2.optString(str3, "")) && !TextUtils.isEmpty(str4)) {
                    String b2 = b(str4);
                    if (!TextUtils.isEmpty(b2)) {
                        jSONObject2.put(str3, b2);
                    } else {
                        String a5 = a(str4);
                        if (!TextUtils.isEmpty(a5)) {
                            jSONObject2.put(str3, a5);
                        }
                    }
                }
                if (a2 != null && !TextUtils.isEmpty(str5)) {
                    jSONObject2.put(str5, com.tramini.plugin.a.h.c.a(a2.toString().getBytes()));
                }
                aVar.f13714a = jSONObject2;
            } else if (a2 == null) {
                aVar.b = new a.C0904a("1", "");
            } else {
                aVar.b = new a.C0904a("2", a2.toString());
            }
            return aVar;
        } catch (Throwable unused3) {
            return null;
        }
    }

    private static JSONObject a(Object obj, Set<Object> set, String str, String str2) {
        if (obj != null && !set.contains(obj)) {
            set.add(obj);
            Class<?> cls = obj.getClass();
            ArrayList<Field> arrayList = new ArrayList();
            do {
                arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
                cls = cls.getSuperclass();
            } while (cls.getName().startsWith(str2));
            for (Field field : arrayList) {
                field.setAccessible(true);
                try {
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        if (!field.getType().getName().equals("interface") && !obj2.getClass().getName().startsWith(str2)) {
                            if (field.getType().getName().equals(t)) {
                                JSONObject jSONObject = (JSONObject) obj2;
                                if (jSONObject.has(str)) {
                                    return jSONObject;
                                }
                            } else {
                                continue;
                            }
                        }
                        JSONObject a2 = a(obj2, set, str, str2);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    private static String[] a(JSONArray jSONArray) {
        try {
            int length = jSONArray.length();
            String[] strArr = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    strArr[i2] = jSONArray.getString(i2);
                } catch (JSONException unused) {
                    return strArr;
                }
            }
            return strArr;
        } catch (JSONException unused2) {
            return null;
        }
    }

    private static String e(String str) {
        if (str.contains("div id=\"mys-wrapper\" class=\"mys-wrapper\">")) {
            if (str.contains("https://rr") || str.contains(PictureMimeType.MP4)) {
                return "html";
            }
            return c;
        }
        if (str.contains("html5AdData") && str.contains("google_template_data")) {
            return d;
        }
        if (str.contains("<link") && str.contains("type=\"text/css")) {
            return e;
        }
        if (str.contains("new videoInterstitial") && str.contains("x3c")) {
            return f;
        }
        if (str.contains("<!doctype html>")) {
            if (str.contains("doc.write")) {
                return h;
            }
            return g;
        }
        return i;
    }

    private static String f(String str) {
        return str.replaceAll("&amp;", "&").replaceAll("&quot;", "\"");
    }

    private static String d(String str, String str2) {
        str2.hashCode();
        switch (str2) {
            case "html_play":
            case "html_x3d":
                return f(c(str.replace("\\\\\\\\x", Separators.PERCENT).replaceAll("\\\\x", Separators.PERCENT).replaceAll("\\\\n", "")));
            case "naitve":
                return str.replace("\\/", "/");
            case "html_doctype_write":
                return f(c(str.replace("x22", "\"").replace("x26", "&").replace("x27", Separators.QUOTE).replace("x3c", Separators.LESS_THAN).replace("x3d", "=").replace("x3e", Separators.GREATER_THAN)));
            default:
                return f(c(str));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static String a(String str, String str2, String str3, JSONObject jSONObject) {
        char c2;
        switch (str2.hashCode()) {
            case -1852354744:
                if (str2.equals(d)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1851164744:
                if (str2.equals(i)) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1747666366:
                if (str2.equals(c)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1052935859:
                if (str2.equals(f13721a)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -336860305:
                if (str2.equals(e)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -336842123:
                if (str2.equals(f)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3213227:
                if (str2.equals("html")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 45377598:
                if (str2.equals(h)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 562203614:
                if (str2.equals(g)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return e(jSONObject.optJSONObject(str3).optString("0"), str);
            case 1:
                return e(jSONObject.optJSONObject(str3).optString("1"), str);
            case 2:
                return e(jSONObject.optJSONObject(str3).optString("2"), str);
            case 3:
                return e(jSONObject.optJSONObject(str3).optString("5"), str);
            case 4:
                return e(jSONObject.optJSONObject(str3).optString("7"), str);
            case 5:
                String optString = jSONObject.optString("3");
                String optString2 = jSONObject.optString("4");
                String a2 = f.b.a(str, optString);
                if (!TextUtils.isEmpty(a2)) {
                    return e(jSONObject.optJSONObject(str3).optString("3"), d(a2));
                }
                return e(jSONObject.optJSONObject(str3).optString("4"), f.b.a(str, optString2));
            case 6:
                String a3 = f.b.a(str, jSONObject.optString("6"));
                if (!TextUtils.isEmpty(a3)) {
                    return e(jSONObject.optJSONObject(str3).optString("3"), d(a3));
                }
                return "";
            case 7:
                return e(jSONObject.optJSONObject(str3).optString("2"), f.b.a(str, jSONObject.optString("8")));
            default:
                return e(jSONObject.optJSONObject(str3).optString("9"), str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String e(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = ""
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L7e
            r6 = 0
            r2 = r0
        L9:
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L7e
            if (r6 >= r3) goto L7e
            org.json.JSONObject r3 = r1.optJSONObject(r6)     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L7b
            java.lang.String r4 = "action"
            r5 = -1
            int r4 = r3.optInt(r4, r5)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r5 = "param"
            java.lang.String r3 = r3.optString(r5, r0)     // Catch: java.lang.Throwable -> L7e
            r5 = 11
            if (r4 == r5) goto L6a
            r5 = 13
            if (r4 == r5) goto L5f
            r5 = 101(0x65, float:1.42E-43)
            if (r4 == r5) goto L54
            r5 = 102(0x66, float:1.43E-43)
            if (r4 == r5) goto L34
            goto L74
        L34:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7e
            if (r4 != 0) goto L7b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = "'"
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L7e
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = "'\\s*:\\s*'(.*?)'"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = com.tramini.plugin.a.f.f.c(r7, r2)     // Catch: java.lang.Throwable -> L7e
            goto L74
        L54:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7e
            if (r4 != 0) goto L7b
            java.lang.String r2 = com.tramini.plugin.a.f.f.b.a(r7, r3)     // Catch: java.lang.Throwable -> L7e
            goto L74
        L5f:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7e
            if (r4 != 0) goto L7b
            java.lang.String r2 = com.tramini.plugin.a.f.f.d.b(r7, r3)     // Catch: java.lang.Throwable -> L7e
            goto L74
        L6a:
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L7e
            if (r4 != 0) goto L7b
            java.lang.String r2 = com.tramini.plugin.a.f.f.d.a(r7, r3)     // Catch: java.lang.Throwable -> L7e
        L74:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L7e
            if (r3 != 0) goto L7b
            return r2
        L7b:
            int r6 = r6 + 1
            goto L9
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tramini.plugin.a.f.a.e(java.lang.String, java.lang.String):java.lang.String");
    }
}
