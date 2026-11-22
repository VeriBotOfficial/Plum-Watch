package com.tramini.plugin.a.f;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.tramini.plugin.a.f.f;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmind.core.INotes;

/* loaded from: classes2.dex */
public final class h extends f {
    public static com.tramini.plugin.a.d.a a(JSONObject jSONObject, com.tramini.plugin.a.d.c cVar, String str) {
        com.tramini.plugin.a.d.a aVar;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("pre1");
        String optString2 = jSONObject2.optString("pre2");
        String optString3 = jSONObject2.optString("clna");
        String optString4 = jSONObject2.optString("mena");
        String optString5 = jSONObject2.optString("adaptna");
        String optString6 = jSONObject2.optString("ctrlna");
        String optString7 = jSONObject2.optString("in_na");
        String optString8 = jSONObject2.optString("objna_arr");
        String optString9 = jSONObject2.optString("obj2na");
        String optString10 = jSONObject2.optString(INotes.HTML);
        Object d = d(optString7, str);
        com.tramini.plugin.a.d.a aVar2 = null;
        String str2 = d instanceof String ? (String) d : null;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String[] split = optString3.split(",");
        int length = split.length;
        int i = 0;
        while (i < length) {
            Object b = b(split[i], optString4);
            if (b != null) {
                aVar = aVar2;
                com.tramini.plugin.a.d.a a2 = a(b, optString, optString6, optString5, optString2, str2, optString8, optString9, optString10, jSONObject2, cVar.e);
                if (a2 != null) {
                    return a2;
                }
            } else {
                aVar = aVar2;
            }
            i++;
            jSONObject2 = jSONObject;
            aVar2 = aVar;
        }
        return aVar2;
    }

    private static com.tramini.plugin.a.d.a a(Object obj, String str, String str2, JSONObject jSONObject, JSONArray jSONArray) {
        Object obj2;
        Object obj3;
        com.tramini.plugin.a.d.a aVar;
        com.tramini.plugin.a.d.a aVar2 = null;
        try {
            String[] split = str2.split(":");
            if (split.length != 2) {
                return null;
            }
            int i = 0;
            try {
                List list = (List) b(obj, str);
                obj2 = null;
                for (int i2 = 0; i2 < list.size() && (obj2 = list.get(i2)) == null; i2++) {
                    try {
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                obj2 = null;
            }
            Object a2 = a(b(obj2, split[0]), split[1]);
            JSONObject jSONObject2 = new JSONObject();
            int i3 = 0;
            while (i3 < jSONArray.length()) {
                String optString = jSONArray.optString(i3);
                String optString2 = jSONObject.optString(optString);
                if (!TextUtils.isEmpty(optString2)) {
                    try {
                        String str3 = (String) b(obj, optString2);
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject2.put(optString, str3);
                        } else {
                            String str4 = (String) b(obj2, optString2);
                            if (!TextUtils.isEmpty(str4)) {
                                jSONObject2.put(optString, str4);
                            } else if (a2 instanceof String) {
                                String obj4 = a2.toString();
                                JSONArray jSONArray2 = new JSONArray(optString2);
                                int i4 = i;
                                int i5 = i4;
                                while (i4 < jSONArray2.length()) {
                                    Matcher matcher = Pattern.compile(jSONArray2.optString(i4)).matcher(obj4);
                                    while (true) {
                                        if (!matcher.find()) {
                                            aVar = aVar2;
                                            obj3 = a2;
                                            break;
                                        }
                                        aVar = aVar2;
                                        try {
                                            String group = matcher.group();
                                            int indexOf = group.indexOf(Separators.GREATER_THAN);
                                            int indexOf2 = group.indexOf(Separators.LESS_THAN);
                                            obj3 = a2;
                                            if (indexOf != -1 && indexOf2 != -1) {
                                                try {
                                                    String substring = group.substring(indexOf + 1, indexOf2);
                                                    if (!TextUtils.isEmpty(substring)) {
                                                        jSONObject2.put(optString, substring);
                                                        i5 = 1;
                                                        break;
                                                    }
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            aVar2 = aVar;
                                            a2 = obj3;
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    if (i5 == 0) {
                                        i4++;
                                        aVar2 = aVar;
                                        a2 = obj3;
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused5) {
                    }
                    aVar = aVar2;
                    obj3 = a2;
                    i3++;
                    aVar2 = aVar;
                    a2 = obj3;
                    i = 0;
                }
                aVar = aVar2;
                obj3 = a2;
                i3++;
                aVar2 = aVar;
                a2 = obj3;
                i = 0;
            }
            com.tramini.plugin.a.d.a aVar3 = aVar2;
            try {
                if (jSONObject2.length() <= 0) {
                    return aVar3;
                }
                com.tramini.plugin.a.d.a aVar4 = new com.tramini.plugin.a.d.a();
                aVar4.f13714a = jSONObject2;
                return aVar4;
            } catch (Throwable unused6) {
                return aVar3;
            }
        } catch (Throwable unused7) {
            return aVar2;
        }
    }

    private static Object d(String str, String str2) {
        Map map;
        try {
            Object invoke = Class.forName(str).getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Field[] declaredFields = invoke.getClass().getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    if ((field.get(invoke) instanceof Map) && (map = (Map) field.get(invoke)) != null && map.containsKey(str2)) {
                        return map.get(str2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: com.tramini.plugin.a.f.h$1, reason: invalid class name */
    final class AnonymousClass1 implements f.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13730a;
        final /* synthetic */ String b;

        AnonymousClass1(String str, String str2) {
            this.f13730a = str;
            this.b = str2;
        }

        @Override // com.tramini.plugin.a.f.f.c
        public final boolean a(Object obj) {
            return obj instanceof Map;
        }

        @Override // com.tramini.plugin.a.f.f.c
        public final f.a b(Object obj) {
            Map map = (Map) obj;
            if (map == null || map.size() == 0) {
                return f.a.a();
            }
            if (map.containsKey(this.f13730a)) {
                Object obj2 = map.get(this.f13730a);
                if (obj2 == null) {
                    return f.a.a();
                }
                if (obj2.getClass().getName().contains(this.b)) {
                    return f.a.a(obj2);
                }
                return f.a.b(obj2);
            }
            return f.a.a();
        }
    }

    private static Object a(Object obj, String str, String str2, String str3, String str4) {
        Object a2 = a(obj, str, new StringBuffer(), new AnonymousClass1(str2, str3));
        if (a2 == null) {
            return null;
        }
        return a(a2, str, new StringBuffer(), new AnonymousClass2(str4));
    }

    /* renamed from: com.tramini.plugin.a.f.h$2, reason: invalid class name */
    final class AnonymousClass2 implements f.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13731a;

        AnonymousClass2(String str) {
            this.f13731a = str;
        }

        @Override // com.tramini.plugin.a.f.f.c
        public final boolean a(Object obj) {
            return obj instanceof Map;
        }

        @Override // com.tramini.plugin.a.f.f.c
        public final f.a b(Object obj) {
            Map map = (Map) obj;
            if (map == null || map.size() == 0) {
                return f.a.a();
            }
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value == null) {
                    return f.a.a();
                }
                if (value.getClass().getSimpleName().contains(this.f13731a)) {
                    return f.a.a(value);
                }
                return f.a.b(value);
            }
            return f.a.a();
        }
    }

    private static Object a(Object obj, String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        Object a2 = a(obj, str, stringBuffer, new AnonymousClass3(str, str3));
        return a2 != null ? a2 : a(obj, str, new StringBuffer(), new AnonymousClass4(str2, str, stringBuffer, str3));
    }

    /* renamed from: com.tramini.plugin.a.f.h$3, reason: invalid class name */
    final class AnonymousClass3 implements f.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13732a;
        final /* synthetic */ String b;

        AnonymousClass3(String str, String str2) {
            this.f13732a = str;
            this.b = str2;
        }

        @Override // com.tramini.plugin.a.f.f.c
        public final boolean a(Object obj) {
            return obj.getClass().getName().startsWith(this.f13732a);
        }

        @Override // com.tramini.plugin.a.f.f.c
        public final f.a b(Object obj) {
            try {
                String str = this.b;
                if (str != null && str.contains(obj.getClass().getName())) {
                    return f.a.a(obj);
                }
                return f.a.b(obj);
            } catch (Throwable unused) {
                return f.a.a();
            }
        }
    }

    /* renamed from: com.tramini.plugin.a.f.h$4, reason: invalid class name */
    final class AnonymousClass4 implements f.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13733a;
        final /* synthetic */ String b;
        final /* synthetic */ StringBuffer c;
        final /* synthetic */ String d;

        AnonymousClass4(String str, String str2, StringBuffer stringBuffer, String str3) {
            this.f13733a = str;
            this.b = str2;
            this.c = stringBuffer;
            this.d = str3;
        }

        @Override // com.tramini.plugin.a.f.f.c
        public final boolean a(Object obj) {
            return obj instanceof Map;
        }

        @Override // com.tramini.plugin.a.f.f.c
        public final f.a b(Object obj) {
            Map map;
            try {
                map = (Map) obj;
            } catch (Throwable unused) {
            }
            if (map != null && map.size() > 0) {
                if (map.containsKey(this.f13733a)) {
                    Object obj2 = map.get(this.f13733a);
                    if (obj2 == null) {
                        return f.a.a();
                    }
                    Object a2 = f.a(obj2, this.b, this.c, new f.c() { // from class: com.tramini.plugin.a.f.h.4.1
                        @Override // com.tramini.plugin.a.f.f.c
                        public final boolean a(Object obj3) {
                            return obj3.getClass().getName().startsWith(AnonymousClass4.this.b);
                        }

                        @Override // com.tramini.plugin.a.f.f.c
                        public final f.a b(Object obj3) {
                            if (AnonymousClass4.this.d != null && AnonymousClass4.this.d.contains(obj3.getClass().getName())) {
                                return f.a.a(obj3);
                            }
                            return f.a.b(obj3);
                        }
                    });
                    if (a2 != null) {
                        return f.a.a(a2);
                    }
                    return f.a.a();
                }
                return f.a.a();
            }
            return f.a.a();
        }
    }

    private static com.tramini.plugin.a.d.a a(Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, JSONObject jSONObject, JSONArray jSONArray) {
        try {
            Object a2 = a(obj, str, new StringBuffer(), new AnonymousClass1(str5, str2));
            Object a3 = a2 == null ? null : a(a2, str, new StringBuffer(), new AnonymousClass2(str3));
            if (a3 == null) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            Object a4 = a(a3, str4, stringBuffer, new AnonymousClass3(str4, str6));
            if (a4 == null) {
                a4 = a(a3, str4, new StringBuffer(), new AnonymousClass4(str5, str4, stringBuffer, str6));
            }
            if (a4 == null) {
                return null;
            }
            return a(a4, str7, str8, jSONObject, jSONArray);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
