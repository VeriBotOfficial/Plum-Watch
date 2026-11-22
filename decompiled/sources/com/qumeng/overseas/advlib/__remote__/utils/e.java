package com.qumeng.overseas.advlib.__remote__.utils;

import android.text.TextUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class e {
    private static void a(Throwable th) {
    }

    private static Object b(Class<?> cls, JSONArray jSONArray) throws JSONException, IllegalAccessException {
        Object newInstance = Array.newInstance(cls, jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj != null) {
                Array.set(newInstance, i, a(obj, cls));
            }
        }
        return newInstance;
    }

    public static Map<Field, String> c(Class cls) {
        return k.d(cls);
    }

    public static JSONObject d(Object obj) {
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        JSONObject jSONObject = new JSONObject();
        Class<?> cls = obj.getClass();
        for (Field field : cls.getFields()) {
            try {
                List<Field> b = b((Class) cls);
                if (b == null || !b.contains(field)) {
                    Map<Field, String> c = c((Class) cls);
                    String str = c != null ? c.get(field) : "";
                    if (TextUtils.isEmpty(str)) {
                        str = field.getName();
                    }
                    Object obj2 = field.get(obj);
                    if (!TextUtils.isEmpty(str) && obj2 != null) {
                        if (!c(obj2) && !b(obj2)) {
                            obj2 = d(obj2);
                        } else if (obj2 instanceof Map) {
                            obj2 = a((Map) obj2);
                        } else if (obj2.getClass().isArray()) {
                            obj2 = a(obj2);
                        } else if (obj2 instanceof List) {
                            obj2 = a(((List) obj2).toArray());
                        }
                        jSONObject.put(str, obj2);
                    }
                }
            } catch (IllegalAccessException e) {
                a((Throwable) e);
            } catch (JSONException e2) {
                a((Throwable) e2);
            }
        }
        return jSONObject;
    }

    private static Object e(Object obj) throws JSONException {
        return obj instanceof JSONObject ? a((JSONObject) obj) : obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    private static void a(Object obj, Field field, Object obj2) {
        try {
            Class<?> type = field.getType();
            if (type.isInstance(obj2) || ((type == Boolean.TYPE && (obj2 instanceof Boolean)) || ((type == Integer.TYPE && (obj2 instanceof Integer)) || ((type == Double.TYPE && ((obj2 instanceof Double) || (obj2 instanceof Integer) || (obj2 instanceof Float))) || ((type == Long.TYPE && (obj2 instanceof Long)) || (type == Float.TYPE && (obj2 instanceof Float))))))) {
                field.set(obj, obj2);
            }
        } catch (IllegalAccessException e) {
            a((Throwable) e);
        }
    }

    public static boolean c(Object obj) {
        if (obj == null) {
            return true;
        }
        try {
            if (obj instanceof String) {
                return true;
            }
            return ((Class) obj.getClass().getField("TYPE").get(null)).isPrimitive();
        } catch (NoSuchFieldException unused) {
            a(new Throwable("NoSuchFieldException : Field TYPE not found in clz " + obj.getClass().getName()));
            return false;
        } catch (Throwable unused2) {
            a(new Throwable("NoSuchFieldException : Field TYPE not found in clz " + obj.getClass().getName()));
            return false;
        }
    }

    private static List<Field> b(Class cls) {
        return k.c(cls);
    }

    public static boolean b(Object obj) {
        return (obj instanceof Map) || (obj instanceof List) || obj.getClass().isArray();
    }

    private static JSONArray a(Object obj) {
        int length = Array.getLength(obj);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                if (obj2 instanceof Map) {
                    obj2 = new JSONObject((Map) obj2);
                } else if (obj2 instanceof List) {
                    obj2 = a(((List) obj2).toArray());
                } else if (obj2.getClass().isArray()) {
                    obj2 = a(obj2);
                } else if (!c(obj2)) {
                    obj2 = d(obj2);
                }
                jSONArray.put(obj2);
            }
        }
        return jSONArray;
    }

    private static JSONObject a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj != null) {
                try {
                    if (obj instanceof Map) {
                        obj = a((Map) obj);
                    } else if (obj instanceof List) {
                        obj = a(((List) obj).toArray());
                    } else if (obj.getClass().isArray()) {
                        obj = a(obj);
                    } else if (!c(obj)) {
                        obj = d(obj);
                    }
                    jSONObject.put(str, obj);
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    private static void a(Object obj, Field field, JSONObject jSONObject) throws JSONException {
        try {
            if (Map.class.isAssignableFrom(field.getType())) {
                field.set(obj, a(jSONObject, (ParameterizedType) field.getGenericType()));
            } else {
                field.set(obj, a(jSONObject, (Class) field.getType()));
            }
        } catch (IllegalAccessException e) {
            a((Throwable) e);
        }
    }

    private static Object a(Object obj, Class<?> cls) throws IllegalAccessException, JSONException {
        if (obj instanceof JSONObject) {
            try {
                if (Map.class.isAssignableFrom(cls)) {
                    return a((JSONObject) obj, (ParameterizedType) null);
                }
                return a((JSONObject) obj, (Class) cls);
            } catch (Throwable th) {
                a(th);
                return obj;
            }
        }
        if (!(obj instanceof JSONArray)) {
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (List.class.isAssignableFrom(cls)) {
            return a(cls, jSONArray);
        }
        return cls.isArray() ? b(cls, jSONArray) : obj;
    }

    private static List a(Class<?> cls, JSONArray jSONArray) throws JSONException, IllegalAccessException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj != null) {
                arrayList.add(a(obj, cls));
            }
        }
        return arrayList;
    }

    private static List a(Type type, JSONArray jSONArray) throws JSONException, IllegalAccessException {
        if (type instanceof Class) {
            return a((Class<?>) type, jSONArray);
        }
        if (type instanceof ParameterizedType) {
            return a(((ParameterizedType) type).getRawType(), jSONArray);
        }
        return null;
    }

    private static List<Object> a(JSONArray jSONArray) throws JSONException {
        Object[] objArr = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            objArr[i] = e(jSONArray.get(i));
        }
        return Arrays.asList(objArr);
    }

    private static Map<String, Object> a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            e(jSONObject.get(keys.next()));
        }
        return hashMap;
    }

    private static Map a(JSONObject jSONObject, ParameterizedType parameterizedType) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!TextUtils.isEmpty(next) && obj != null) {
                if (parameterizedType != null) {
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    if (actualTypeArguments.length > 1) {
                        Type type = actualTypeArguments[1];
                        if (type instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) type;
                            if (parameterizedType2.getRawType() instanceof Class) {
                                if (Map.class.isAssignableFrom((Class) parameterizedType2.getRawType()) && (obj instanceof JSONObject)) {
                                    obj = a((JSONObject) obj, parameterizedType2);
                                } else if (List.class.isAssignableFrom((Class) parameterizedType2.getRawType()) && (obj instanceof JSONArray)) {
                                    try {
                                        obj = a((Class<?>) ((ParameterizedType) type).getRawType(), (JSONArray) obj);
                                    } catch (IllegalAccessException e) {
                                        a((Throwable) e);
                                    }
                                }
                            }
                        }
                        if ((type instanceof Class) && (obj instanceof JSONObject)) {
                            try {
                                obj = a((JSONObject) obj, (Class<Object>) type);
                            } catch (Throwable th) {
                                a(th);
                            }
                        }
                    }
                }
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    private static void a(Object obj, Field field, JSONArray jSONArray) throws JSONException {
        List a2;
        try {
            Class<?> componentType = field.getType().getComponentType();
            if (componentType != null) {
                field.set(obj, b(componentType, jSONArray));
                return;
            }
            if (List.class.isAssignableFrom(field.getType())) {
                Type[] actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
                if (actualTypeArguments.length <= 0 || (a2 = a(actualTypeArguments[0], jSONArray)) == null) {
                    return;
                }
                field.set(obj, a2);
            }
        } catch (IllegalAccessException e) {
            a((Throwable) e);
        }
    }

    private static void a() {
        System.exit(1);
    }

    public static <T> T a(JSONObject jSONObject, Class<T> cls) throws JSONException {
        T t;
        List<Field> b;
        Iterator<String> keys = jSONObject.keys();
        try {
            t = cls.newInstance();
        } catch (Throwable unused) {
            a(new Throwable("newInstance Err by default Constructor not found in " + cls.getName()));
            t = null;
        }
        if (t == null) {
            try {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                t = declaredConstructor.newInstance(new Object[0]);
            } catch (Throwable unused2) {
                a(new Throwable("repeat call default Constructor not found in " + cls.getName()));
            }
        }
        if (t == null) {
            a(new Throwable("NoSuchConstructorException : " + cls.getName()));
        }
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (!TextUtils.isEmpty(next) && obj != null) {
                try {
                    Map<String, Field> a2 = a((Class) cls);
                    Field field = a2 != null ? a2.get(next) : null;
                    if (field == null) {
                        try {
                            field = cls.getField(next);
                        } catch (NoSuchFieldException unused3) {
                        }
                    }
                    if (field != null && ((b = b((Class) cls)) == null || !b.contains(field))) {
                        if (obj instanceof JSONArray) {
                            a((Object) t, field, (JSONArray) obj);
                        } else if (obj instanceof JSONObject) {
                            a((Object) t, field, (JSONObject) obj);
                        } else {
                            a(t, field, obj);
                        }
                    }
                } catch (Throwable th) {
                    a(th);
                }
            }
        }
        return t;
    }

    private static Map<String, Field> a(Class cls) {
        return k.b(cls);
    }

    public static Map<String, Object> a(String str, Map<String, Class> map) throws JSONException {
        return a(new JSONObject(str), map, false);
    }

    public static Map<String, Object> a(JSONObject jSONObject, Map<String, Class> map, boolean z) throws JSONException {
        map.getClass();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Class> entry : map.entrySet()) {
            String key = entry.getKey();
            Class value = entry.getValue();
            Object opt = jSONObject.opt(key);
            if (value != null) {
                if (opt != null && value.isAssignableFrom(opt.getClass())) {
                    hashMap.put(key, opt);
                } else if ((opt instanceof JSONObject) && Map.class.isAssignableFrom(value)) {
                    if (z) {
                        opt = a((JSONObject) opt);
                    }
                    hashMap.put(key, opt);
                } else if ((opt instanceof JSONArray) && List.class.isAssignableFrom(value)) {
                    if (z) {
                        opt = a((JSONArray) opt);
                    }
                    hashMap.put(key, opt);
                }
            }
        }
        return hashMap;
    }
}
