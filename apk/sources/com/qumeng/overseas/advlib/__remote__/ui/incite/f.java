package com.qumeng.overseas.advlib.__remote__.ui.incite;

import android.text.TextUtils;
import android.util.JsonWriter;
import androidx.camera.core.processing.SurfaceProcessorNode;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes2.dex */
public class f {
    public static <T> String a(List<T> list) throws Exception {
        StringWriter stringWriter = new StringWriter();
        a(new JsonWriter(stringWriter), (List) list);
        return stringWriter.toString();
    }

    public static <T> List<T> b(String str, Class<T> cls) throws Exception {
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object objNextValue = new JSONTokener(str).nextValue();
        if (objNextValue instanceof JSONArray) {
            arrayList = new ArrayList();
            int r0 = 0;
            while (true) {
                JSONArray jSONArray = (JSONArray) objNextValue;
                if (r0 >= jSONArray.length()) {
                    break;
                }
                Object obj = jSONArray.get(r0);
                if (obj instanceof JSONObject) {
                    arrayList.add(a((JSONObject) obj, cls));
                } else {
                    arrayList.add(obj);
                }
                r0++;
            }
        }
        return arrayList;
    }

    public static Object a(String str, Type type) throws Exception {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (((Class) parameterizedType.getRawType()) == List.class) {
                return b(str, (Class) parameterizedType.getActualTypeArguments()[0]);
            }
            return null;
        }
        return a(str, (Class) type);
    }

    public static <T> T a(String str, Class<T> cls) throws Exception {
        return (T) a(new JSONObject(str), cls);
    }

    public static <T> T a(JSONObject jSONObject, Class<T> cls) throws Exception {
        Field declaredField;
        Iterator<String> itKeys = jSONObject.keys();
        T tNewInstance = cls.newInstance();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                declaredField = cls.getDeclaredField(next);
            } catch (Exception unused) {
                declaredField = null;
            }
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONArray) {
                    Type genericType = declaredField.getGenericType();
                    if (ParameterizedType.class.isAssignableFrom(genericType.getClass())) {
                        for (Type type : ((ParameterizedType) genericType).getActualTypeArguments()) {
                            declaredField.set(tNewInstance, b(obj.toString(), (Class) type));
                        }
                    }
                } else if (obj instanceof JSONObject) {
                    declaredField.set(tNewInstance, a((JSONObject) obj, declaredField.getType()));
                } else {
                    try {
                        declaredField.set(tNewInstance, obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return tNewInstance;
    }

    private static <T> void a(JsonWriter jsonWriter, List<T> list) throws Exception {
        jsonWriter.beginArray();
        for (int r0 = 0; r0 < list.size(); r0++) {
            T t = list.get(r0);
            if (t instanceof String) {
                jsonWriter.value((String) t);
            } else if (t instanceof Number) {
                jsonWriter.value((Number) t);
            } else if (t == null) {
                jsonWriter.nullValue();
            } else if (t instanceof List) {
                a(jsonWriter, (List) t);
            } else {
                a(jsonWriter, t);
            }
        }
        jsonWriter.endArray();
    }

    private static <T> void a(JsonWriter jsonWriter, T t) throws Exception {
        jsonWriter.beginObject();
        for (Field field : t.getClass().getDeclaredFields()) {
            if (!Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                field.setAccessible(true);
                Object obj = field.get(t);
                if (obj instanceof String) {
                    jsonWriter.name(name).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(name).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(name).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof List) {
                    jsonWriter.name(name);
                    a(jsonWriter, (List) obj);
                } else if (obj != null) {
                    jsonWriter.name(name);
                    a(jsonWriter, obj);
                }
            }
        }
        jsonWriter.endObject();
    }

    public static <T> String a(T t) throws Exception {
        StringWriter stringWriter = new StringWriter();
        a(new JsonWriter(stringWriter), t);
        return stringWriter.toString();
    }

    public static Map<String, Serializable> a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            HashMap map = new HashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, (Serializable) jSONObject.get(next));
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> HashMap<String, T> a(JSONObject jSONObject) {
        try {
            SurfaceProcessorNode.Out out = (HashMap<String, T>) new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String string = itKeys.next().toString();
                out.put(string, jSONObject.get(string));
            }
            return out;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> List<T> a(JSONArray jSONArray, Class cls) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int r0 = 0; r0 < jSONArray.length(); r0++) {
                        arrayList.add(jSONArray.get(r0));
                    }
                    return arrayList;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return Collections.EMPTY_LIST;
            }
        }
        return Collections.EMPTY_LIST;
    }
}
