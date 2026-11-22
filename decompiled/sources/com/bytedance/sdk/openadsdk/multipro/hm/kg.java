package com.bytedance.sdk.openadsdk.multipro.hm;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.fxn;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.openadsdk.core.jq;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
class kg {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> fxn;

    public static SharedPreferences fxn(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(fxn(str), 0);
        } catch (Throwable th) {
            dx.gff("SPMultiHelperImpl", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    private static String fxn(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object fxn(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = fxn;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(fxn(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static void fxn(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = fxn;
        if (softReference == null || softReference.get() == null) {
            fxn = new SoftReference<>(new ConcurrentHashMap());
        }
        String fxn2 = fxn(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = fxn.get();
        if (concurrentHashMap.get(fxn2) == null) {
            concurrentHashMap.put(fxn2, new HashMap());
        }
        concurrentHashMap.get(fxn2).put(str2, obj);
    }

    private static void kg(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = fxn;
        if (softReference == null || softReference.get() == null || (map = fxn.get().get(fxn(str))) == null) {
            return;
        }
        map.clear();
    }

    static synchronized <T> void fxn(Context context, String str, String str2, T t) {
        synchronized (kg.class) {
            String fxn2 = fxn.fxn(str, str2);
            if (jq.sg(fxn2)) {
                com.bytedance.sdk.component.fxn fxn3 = com.bytedance.sdk.component.fxn.fxn(context, fxn2);
                if (t.equals(fxn(fxn2, str2))) {
                    return;
                }
                fxn.gff kg = fxn3.kg();
                fxn(kg, str2, (Object) t);
                kg.apply();
                fxn(fxn2, str2, t);
                return;
            }
            SharedPreferences fxn4 = fxn(context, fxn2);
            if (fxn4 == null) {
                return;
            }
            if (t.equals(fxn(fxn2, str2))) {
                return;
            }
            SharedPreferences.Editor edit = fxn4.edit();
            fxn(edit, str2, t);
            edit.apply();
            fxn(fxn2, str2, t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void fxn(SharedPreferences.Editor editor, String str, T t) {
        if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            editor.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            editor.putString(str, (String) t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <T> void fxn(fxn.gff gffVar, String str, T t) {
        if (t instanceof Integer) {
            gffVar.putInt(str, ((Integer) t).intValue());
        }
        if (t instanceof Long) {
            gffVar.putLong(str, ((Long) t).longValue());
        }
        if (t instanceof Float) {
            gffVar.putFloat(str, ((Float) t).floatValue());
        }
        if (t instanceof Boolean) {
            gffVar.putBoolean(str, ((Boolean) t).booleanValue());
        }
        if (t instanceof String) {
            gffVar.putString(str, (String) t);
        }
    }

    static String fxn(Context context, String str, String str2, String str3) {
        Object fxn2 = fxn(str, str2);
        if (fxn2 != null) {
            return String.valueOf(fxn2);
        }
        Object kg = kg(context, str, str2, str3);
        fxn(str, str2, kg);
        return String.valueOf(kg);
    }

    private static Object kg(Context context, String str, String str2, String str3) {
        String fxn2 = fxn(str);
        if (!fxn(context, fxn2, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase("string")) {
            return fxn.fxn(context, fxn2, str2, (String) null);
        }
        if (str3.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(fxn.fxn(context, fxn2, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(fxn.fxn(context, fxn2, str2, 0));
        }
        if (str3.equalsIgnoreCase("long")) {
            return Long.valueOf(fxn.fxn(context, fxn2, str2, 0L));
        }
        if (str3.equalsIgnoreCase("float")) {
            return Float.valueOf(fxn.fxn(context, fxn2, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return fxn.fxn(context, fxn2, str2, (String) null);
        }
        return null;
    }

    static boolean fxn(Context context, String str, String str2) {
        String fxn2 = fxn.fxn(str, str2);
        if (jq.sg(fxn2)) {
            return com.bytedance.sdk.component.fxn.fxn(context, fxn2).fxn(str2);
        }
        SharedPreferences fxn3 = fxn(context, fxn2);
        return fxn3 != null && fxn3.contains(str2);
    }

    public static void kg(Context context, String str, String str2) {
        try {
            String fxn2 = fxn.fxn(str, str2);
            if (jq.sg(fxn2)) {
                com.bytedance.sdk.component.fxn.fxn(context, fxn2).kg().remove(str2).apply();
                return;
            }
            SharedPreferences fxn3 = fxn(context, fxn2);
            if (fxn3 == null) {
                return;
            }
            SharedPreferences.Editor edit = fxn3.edit();
            edit.remove(str2);
            edit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = fxn;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = fxn.get().get(fxn(fxn2));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    static void kg(Context context, String str) {
        if (jq.sg(str)) {
            com.bytedance.sdk.component.fxn.fxn(context, str).kg().clear().apply();
            kg(str);
            return;
        }
        SharedPreferences fxn2 = fxn(context, str);
        if (fxn2 == null) {
            return;
        }
        SharedPreferences.Editor edit = fxn2.edit();
        edit.clear();
        edit.apply();
        kg(str);
    }

    static Map<String, ?> gff(Context context, String str) {
        SharedPreferences fxn2 = fxn(context, str);
        if (fxn2 == null) {
            return null;
        }
        return fxn2.getAll();
    }
}
