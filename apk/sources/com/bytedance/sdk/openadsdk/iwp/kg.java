package com.bytedance.sdk.openadsdk.iwp;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
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
            SharedPreferences sharedPreferencesKg = kg();
            if (sharedPreferencesKg != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesKg.edit();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                editorEdit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                editorEdit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                editorEdit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                editorEdit.putFloat(next, Double.valueOf(((Double) obj).doubleValue()).floatValue());
                            }
                        }
                    } catch (Throwable th) {
                        Log.e("SPUnit", th.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public void fxn(String str, long j) {
        try {
            SharedPreferences sharedPreferencesKg = kg();
            if (sharedPreferencesKg != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesKg.edit();
                editorEdit.putLong(str, j);
                editorEdit.apply();
            }
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
    }

    public int fxn(String str, int r4) {
        try {
            SharedPreferences sharedPreferencesKg = kg();
            if (sharedPreferencesKg != null && sharedPreferencesKg.contains(str)) {
                return sharedPreferencesKg.getInt(str, r4);
            }
            return r4;
        } catch (Throwable th) {
            Log.i("SPUnit", this.gff + th.getMessage());
            return r4;
        }
    }

    public long kg(String str, long j) {
        try {
            SharedPreferences sharedPreferencesKg = kg();
            if (sharedPreferencesKg != null && sharedPreferencesKg.contains(str)) {
                return sharedPreferencesKg.getLong(str, j);
            }
            return j;
        } catch (Throwable th) {
            Log.i("SPUnit", this.gff + th.getMessage());
            return j;
        }
    }

    public String fxn(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesKg = kg();
            if (sharedPreferencesKg != null && sharedPreferencesKg.contains(str)) {
                return sharedPreferencesKg.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            Log.i("SPUnit", this.gff + th.getMessage());
            return str2;
        }
    }

    public boolean fxn(String str, boolean z) {
        try {
            SharedPreferences sharedPreferencesKg = kg();
            if (sharedPreferencesKg != null && sharedPreferencesKg.contains(str)) {
                return sharedPreferencesKg.getBoolean(str, z);
            }
            return z;
        } catch (Throwable th) {
            Log.i("SPUnit", this.gff + th.getMessage());
            return z;
        }
    }

    public void fxn() {
        SharedPreferences sharedPreferencesKg = kg();
        if (sharedPreferencesKg != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesKg.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }
}
