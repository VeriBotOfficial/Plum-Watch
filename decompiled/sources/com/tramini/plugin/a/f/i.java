package com.tramini.plugin.a.f;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class i extends f {
    public static com.tramini.plugin.a.d.a a(JSONObject jSONObject, com.tramini.plugin.a.d.c cVar, String str) {
        return a(a(jSONObject.optString("in_na"), str), "", jSONObject.optString("pre"), jSONObject.optString("mena"), jSONObject.optString("agu"), jSONObject, cVar.e);
    }

    private static com.tramini.plugin.a.d.a a(Object obj, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONArray jSONArray) {
        com.tramini.plugin.a.d.a a2;
        Object obj2;
        Object invoke;
        Object obj3 = obj;
        if (obj3 == null) {
            return null;
        }
        String str5 = str2;
        if (!obj3.getClass().getName().startsWith(str5)) {
            return null;
        }
        String str6 = str + obj3.getClass().getName() + ",";
        try {
            ArrayList arrayList = new ArrayList();
            a(obj3.getClass(), arrayList);
            int size = arrayList.size();
            Field[] fieldArr = new Field[size];
            arrayList.toArray(fieldArr);
            if (size == 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Field field = fieldArr[i2];
                boolean z = true;
                field.setAccessible(true);
                Object obj4 = field.get(obj3);
                Method[] c = c(obj4, str3);
                if (obj4 != null && c != null) {
                    int length = c.length;
                    int i3 = i;
                    while (i3 < length) {
                        Method method = c[i3];
                        method.setAccessible(z);
                        try {
                            invoke = method.invoke(obj4, new Object[i]);
                        } catch (Throwable unused) {
                        }
                        if (invoke instanceof JSONObject) {
                            if (((JSONObject) invoke).has(str4)) {
                                JSONObject jSONObject2 = new JSONObject();
                                while (i < jSONArray.length()) {
                                    try {
                                        String optString = jSONArray.optString(i);
                                        int i4 = i;
                                        obj2 = obj4;
                                        try {
                                            String optString2 = jSONObject.optString(optString);
                                            if (TextUtils.equals(optString2, "all")) {
                                                jSONObject2.put(optString, invoke.toString());
                                            } else {
                                                jSONObject2.put(optString, a(optString2, (JSONObject) invoke));
                                            }
                                            i = i4 + 1;
                                            obj4 = obj2;
                                        } catch (Throwable unused2) {
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                }
                                obj2 = obj4;
                                com.tramini.plugin.a.d.a aVar = new com.tramini.plugin.a.d.a();
                                aVar.f13714a = jSONObject2;
                                return aVar;
                            }
                            obj2 = obj4;
                            i3++;
                            obj4 = obj2;
                            i = 0;
                            z = true;
                        }
                        obj2 = obj4;
                        i3++;
                        obj4 = obj2;
                        i = 0;
                        z = true;
                    }
                } else if (obj4 != null && !str6.contains(obj4.getClass().getName()) && (a2 = a(obj4, str6, str5, str3, str4, jSONObject, jSONArray)) != null) {
                    return a2;
                }
                i2++;
                obj3 = obj;
                str5 = str2;
                i = 0;
            }
            return null;
        } catch (Throwable unused4) {
            return null;
        }
    }

    private static Method[] c(Object obj, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            for (Method method : obj.getClass().getDeclaredMethods()) {
                if (method.getGenericReturnType().toString().contains(str)) {
                    arrayList.add(method);
                }
            }
            return (Method[]) arrayList.toArray(new Method[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(String str, JSONObject jSONObject) {
        String[] split;
        int i;
        try {
            split = str.split(":");
            i = 0;
        } catch (Throwable unused) {
            return "";
        }
        while (i < split.length) {
            int i2 = i + 1;
            if (i2 == split.length) {
                return jSONObject.optString(split[i]);
            }
            try {
                jSONObject = new JSONObject(jSONObject.optString(split[i]));
            } catch (JSONException unused2) {
                jSONObject = new JSONArray(jSONObject.optString(split[i])).getJSONObject(0);
            }
            i = i2;
            return "";
        }
        return "";
    }
}
