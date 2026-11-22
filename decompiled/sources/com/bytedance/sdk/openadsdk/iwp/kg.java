package com.bytedance.sdk.openadsdk.iwp;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class kg {
    private SharedPreferences fxn;
    private final String gff;
    private final Context kg;

    public kg(Context context, String str) {
        this.kg = context;
        this.gff = str;
    }

    private SharedPreferences kg() {
        Context context;
        SharedPreferences sharedPreferences = this.fxn;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.gff) || (context = this.kg) == null) {
            return null;
        }
        try {
            this.fxn = context.getSharedPreferences(this.gff, 0);
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
        return this.fxn;
    }

    public void fxn(JSONObject jSONObject) {
        try {
            SharedPreferences kg = kg();
            if (kg != null) {
                SharedPreferences.Editor edit = kg.edit();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                edit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                edit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                edit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                edit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                edit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                edit.putFloat(next, Double.valueOf(((Double) obj).doubleValue()).floatValue());
                            }
                        }
                    } catch (Throwable th) {
                        Log.e("SPUnit", th.getMessage());
                    }
                }
                edit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public void fxn(String str, long j) {
        try {
            SharedPreferences kg = kg();
            if (kg != null) {
                SharedPreferences.Editor edit = kg.edit();
                edit.putLong(str, j);
                edit.apply();
            }
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
    }

    public int fxn(String str, int i) {
        try {
            SharedPreferences kg = kg();
            if (kg != null && kg.contains(str)) {
                return kg.getInt(str, i);
            }
            return i;
        } catch (Throwable th) {
            Log.i("SPUnit", this.gff + th.getMessage());
            return i;
        }
    }

    public long kg(String str, long j) {
        try {
            SharedPreferences kg = kg();
            if (kg != null && kg.contains(str)) {
                return kg.getLong(str, j);
            }
            return j;
        } catch (Throwable th) {
            Log.i("SPUnit", this.gff + th.getMessage());
            return j;
        }
    }

    public String fxn(String str, String str2) {
        try {
            SharedPreferences kg = kg();
            if (kg != null && kg.contains(str)) {
                return kg.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            Log.i("SPUnit", this.gff + th.getMessage());
            return str2;
        }
    }

    public boolean fxn(String str, boolean z) {
        try {
            SharedPreferences kg = kg();
            if (kg != null && kg.contains(str)) {
                return kg.getBoolean(str, z);
            }
            return z;
        } catch (Throwable th) {
            Log.i("SPUnit", this.gff + th.getMessage());
            return z;
        }
    }

    public void fxn() {
        SharedPreferences kg = kg();
        if (kg != null) {
            SharedPreferences.Editor edit = kg.edit();
            edit.clear();
            edit.commit();
        }
    }
}
