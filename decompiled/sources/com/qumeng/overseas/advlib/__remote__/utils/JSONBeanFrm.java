package com.qumeng.overseas.advlib.__remote__.utils;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.z;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public abstract class JSONBeanFrm implements Serializable {
    private static final long serialVersionUID = -2822531047250978416L;
    private final String TAG = z.a(getClass().getName());

    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        String fieldname() default "";

        boolean marshallable() default true;
    }

    private static JSONArray BoxingArray(Object obj) {
        int length = Array.getLength(obj);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                if (obj2 instanceof JSONBeanFrm) {
                    obj2 = ((JSONBeanFrm) obj2).marshal();
                } else if (obj2 instanceof Map) {
                    obj2 = new JSONObject((Map) obj2);
                } else if (obj2 instanceof List) {
                    obj2 = BoxingArray(((List) obj2).toArray());
                } else if (obj2.getClass().isArray()) {
                    obj2 = BoxingArray(obj2);
                }
                jSONArray.put(obj2);
            }
        }
        return jSONArray;
    }

    private static void assign(JSONBeanFrm jSONBeanFrm, Field field, Object obj) {
        try {
            Class<?> type = field.getType();
            if (type.isInstance(obj) || ((type == Boolean.TYPE && (obj instanceof Boolean)) || ((type == Integer.TYPE && (obj instanceof Integer)) || ((type == Double.TYPE && (obj instanceof Double)) || (type == Long.TYPE && (obj instanceof Long)))))) {
                field.set(jSONBeanFrm, obj);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static <J extends JSONBeanFrm> void beanCopy(J j, J j2) {
        if (j == null || j2 == null || j.getClass() != j2.getClass()) {
            n.b("JSONBeanFrm", "copy need two object with same class!", new Object[0]);
        } else {
            fieldCopy(j.getClass().getFields(), j, j2);
        }
    }

    public static <J extends JSONBeanFrm> boolean compare(J j, J j2) {
        if (j == j2) {
            return true;
        }
        if (j == null || j2 == null || j.getClass() != j2.getClass()) {
            return false;
        }
        try {
            for (Field field : j.getClass().getFields()) {
                Object obj = field.get(j);
                Object obj2 = field.get(j2);
                if ((obj != null && !obj.equals(obj2)) || obj2 != null) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(JSONBeanFrm.class, "exp_JSONBeanFrm_compare", th);
            return false;
        }
    }

    private static List<Object> createListFreeStyle(JSONArray jSONArray) throws JSONException {
        Object[] objArr = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            objArr[i] = unpackObjectFreeStyle(jSONArray.get(i));
        }
        return Arrays.asList(objArr);
    }

    private static Map<String, Object> createMapFreeStyle(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            unpackObjectFreeStyle(jSONObject.get(keys.next()));
        }
        return hashMap;
    }

    public static <J extends JSONBeanFrm> void fieldCopy(Field[] fieldArr, J j, J j2) {
        for (Field field : fieldArr) {
            try {
                boolean isAccessible = field.isAccessible();
                if (!isAccessible) {
                    field.setAccessible(true);
                }
                field.set(j, field.get(j2));
                if (!isAccessible) {
                    field.setAccessible(false);
                }
            } catch (IllegalAccessException unused) {
            }
        }
    }

    private Map<String, Field> getFiledMap() {
        return k.b(getClass());
    }

    private List<Field> getNoMarshalList() {
        return k.c(getClass());
    }

    public static boolean isEmpty(JSONBeanFrm jSONBeanFrm) {
        return jSONBeanFrm == null || jSONBeanFrm.isEmpty();
    }

    public static <J extends JSONBeanFrm> void objectCopy(J j, J j2) {
        if (j == null || j2 == null || j.getClass() != j2.getClass()) {
            n.b("JSONBeanFrm", "copy need two object with same class!", new Object[0]);
        } else {
            fieldCopy(j.getClass().getDeclaredFields(), j, j2);
        }
    }

    public static Map<String, Object> simpleJSONConvert(String str, Map<String, Class> map) throws JSONException {
        return simpleJSONConvert(new JSONObject(str), map, false);
    }

    private static Object unpackObjectFreeStyle(Object obj) throws JSONException {
        return obj instanceof JSONObject ? createMapFreeStyle((JSONObject) obj) : obj instanceof JSONArray ? createListFreeStyle((JSONArray) obj) : obj;
    }

    protected final void WriteLog(int i, String str) {
        n.a(i, this.TAG, str, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends JSONBeanFrm> T cloneBean() {
        return this;
    }

    public boolean equals(Object obj) {
        return (obj instanceof JSONBeanFrm) && compare(this, (JSONBeanFrm) obj);
    }

    public Map<Field, String> getReverseFieldMap() {
        return k.d(getClass());
    }

    public Object getValue(String str) {
        try {
            return getClass().getField(str).get(this);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int hashCode() {
        try {
            return marshal().toString().hashCode();
        } catch (Throwable th) {
            th.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_JSONBeanFrm_hashCode", th);
            return super.hashCode();
        }
    }

    public JSONObject marshal() {
        JSONObject jSONObject = new JSONObject();
        for (Field field : getClass().getFields()) {
            try {
                List<Field> noMarshalList = getNoMarshalList();
                if (noMarshalList == null || !noMarshalList.contains(field)) {
                    Map<Field, String> reverseFieldMap = getReverseFieldMap();
                    String str = reverseFieldMap != null ? reverseFieldMap.get(field) : "";
                    if (TextUtils.isEmpty(str)) {
                        str = field.getName();
                    }
                    Object obj = field.get(this);
                    if (!TextUtils.isEmpty(str) && obj != null) {
                        if (obj instanceof JSONBeanFrm) {
                            obj = ((JSONBeanFrm) obj).marshal();
                        } else if (obj instanceof Map) {
                            obj = new JSONObject((Map) obj);
                        } else if (obj.getClass().isArray()) {
                            obj = BoxingArray(obj);
                        } else if (obj instanceof List) {
                            obj = BoxingArray(((List) obj).toArray());
                        }
                        jSONObject.put(str, obj);
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    public boolean setValue(String str, Object obj) {
        try {
            getClass().getField(str).set(this, obj);
            return true;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String toString() {
        return Separators.LESS_THAN + this.TAG + "> applyfield=" + (getClass().getFields().length - k.c(getClass()).size()) + ", content=" + (isEmpty() ? "EMPTY" : marshal().toString());
    }

    public static Map<String, Object> simpleJSONConvert(JSONObject jSONObject, Map<String, Class> map, boolean z) throws JSONException {
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
                        opt = createMapFreeStyle((JSONObject) opt);
                    }
                    hashMap.put(key, opt);
                } else if ((opt instanceof JSONArray) && List.class.isAssignableFrom(value)) {
                    if (z) {
                        opt = createListFreeStyle((JSONArray) opt);
                    }
                    hashMap.put(key, opt);
                }
            }
        }
        return hashMap;
    }

    public boolean isEmpty() {
        try {
            for (Field field : getClass().getFields()) {
                Object obj = field.get(this);
                Class<?> type = field.getType();
                if (obj instanceof JSONBeanFrm) {
                    if (!((JSONBeanFrm) obj).isEmpty()) {
                        return false;
                    }
                } else if (obj instanceof Collection) {
                    if (!com.qumeng.overseas.advlib.__remote__.core.proto.utils.d.a((Collection<? extends Object>) obj)) {
                        return false;
                    }
                } else if (obj instanceof Map) {
                    if (!com.qumeng.overseas.advlib.__remote__.core.proto.utils.d.a((Map<? extends Object, ? extends Object>) obj)) {
                        return false;
                    }
                } else if (obj instanceof String) {
                    if (!TextUtils.isEmpty((String) obj)) {
                        return false;
                    }
                } else if (type.isArray()) {
                    if (!com.qumeng.overseas.advlib.__remote__.core.proto.utils.d.b(obj)) {
                        return false;
                    }
                } else {
                    if (((obj instanceof Integer) && Integer.valueOf(((Integer) obj).intValue()).intValue() != 0) || (((obj instanceof Long) && Long.valueOf(((Long) obj).longValue()).longValue() != 0) || (((obj instanceof Double) && Double.valueOf(((Double) obj).doubleValue()).doubleValue() != 0.0d) || ((obj instanceof Boolean) && Boolean.valueOf(((Boolean) obj).booleanValue()).booleanValue())))) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Boolean)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public void beanCopy(JSONBeanFrm jSONBeanFrm) {
        beanCopy(jSONBeanFrm, this);
    }

    public void objectCopy(JSONBeanFrm jSONBeanFrm) {
        objectCopy(jSONBeanFrm, this);
    }
}
