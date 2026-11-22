package com.umeng.crash;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: UCrash */
/* loaded from: classes2.dex */
final class j {
    public static boolean a(Context context, File file) {
        boolean z;
        boolean z2 = false;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("um_crash_cfg", 0);
            String string = sharedPreferences.getString("k_upload", null);
            UCrash.a().a("UCrash.Upload", "get upload cfg: ".concat(String.valueOf(string)));
            boolean z3 = true;
            if (TextUtils.isEmpty(string)) {
                return true;
            }
            String str = "crash";
            if (!k.d(file.getPath()) && !k.c(file.getPath()) && !k.b(file.getPath())) {
                if (!k.e(file.getPath())) {
                    return false;
                }
                str = "custom";
            }
            try {
                JSONObject jSONObject = new JSONObject(string);
                JSONObject optJSONObject = jSONObject.optJSONObject(str);
                if (optJSONObject == null) {
                    return true;
                }
                if ("custom".equals(str)) {
                    long optLong = optJSONObject.optLong("ts", 0L);
                    int optInt = optJSONObject.optInt("cnt", 0);
                    if (!a(System.currentTimeMillis(), optLong)) {
                        optInt = 0;
                    }
                    return optInt < c.a().p;
                }
                JSONArray optJSONArray = optJSONObject.optJSONArray("time");
                if (optJSONArray != null && optJSONArray.length() >= 25) {
                    JSONArray jSONArray = new JSONArray();
                    int length = optJSONArray.length() - 1;
                    while (length >= 0) {
                        long optLong2 = optJSONArray.optLong(length, 0L);
                        z = z2;
                        try {
                            boolean z4 = z3;
                            JSONArray jSONArray2 = optJSONArray;
                            if (optLong2 >= System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L)) {
                                jSONArray.put(optLong2);
                            }
                            length--;
                            z3 = z4;
                            optJSONArray = jSONArray2;
                            z2 = z;
                        } catch (Exception unused) {
                            return z;
                        }
                    }
                    z = z2;
                    boolean z5 = z3;
                    optJSONObject.put("time", jSONArray);
                    sharedPreferences.edit().putString("k_upload", jSONObject.toString()).apply();
                    return jSONArray.length() < 25 ? z5 : z;
                }
                return true;
            } catch (Exception unused2) {
                return true;
            }
        } catch (Exception unused3) {
            return false;
        }
    }

    public static void b(Context context, File file) {
        JSONObject jSONObject;
        try {
            String str = "crash";
            if (!k.d(file.getPath()) && !k.c(file.getPath()) && !k.b(file.getPath())) {
                if (!k.e(file.getPath())) {
                    return;
                } else {
                    str = "custom";
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("um_crash_cfg", 0);
            String string = sharedPreferences.getString("k_upload", null);
            if (TextUtils.isEmpty(string)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(string);
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            if ("custom".equals(str)) {
                long optLong = optJSONObject.optLong("ts", 0L);
                int optInt = optJSONObject.optInt("cnt", 0);
                long currentTimeMillis = System.currentTimeMillis();
                int i = a(currentTimeMillis, optLong) ? 1 + optInt : 1;
                optJSONObject.put("ts", currentTimeMillis);
                optJSONObject.put("cnt", i);
            } else {
                JSONArray optJSONArray = optJSONObject.optJSONArray("time");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                optJSONArray.put(System.currentTimeMillis());
                optJSONObject.put("time", optJSONArray);
            }
            jSONObject.put(str, optJSONObject);
            sharedPreferences.edit().putString("k_upload", jSONObject.toString()).commit();
            UCrash.a().a("UCrash.Upload", "save cfg: ".concat(String.valueOf(jSONObject)));
        } catch (Exception e) {
            UCrash.a().a("UCrash.Upload", "save cfg failed", e);
        }
    }

    static boolean a(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar2.setTimeInMillis(j2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public static String a(Context context, String str) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("um_crash_cfg", 0);
            String str2 = "k_ver";
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(":");
                if (split.length > 1) {
                    str2 = "k_ver_" + split[1];
                }
            }
            return sharedPreferences.getString(str2, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean a(Context context) {
        try {
            String string = context.getSharedPreferences("um_crash_cfg", 0).getString("k_generate", null);
            if (TextUtils.isEmpty(string)) {
                return true;
            }
            JSONObject jSONObject = new JSONObject(string);
            long optLong = jSONObject.optLong("ts", 0L);
            int optInt = jSONObject.optInt("cnt", 0);
            if (!a(System.currentTimeMillis(), optLong)) {
                optInt = 0;
            }
            return optInt < c.a().o;
        } catch (Exception unused) {
            return true;
        }
    }
}
