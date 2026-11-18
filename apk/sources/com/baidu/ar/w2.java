package com.baidu.ar;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class w2 {
    public static int d = 1;
    public static int e = 2;
    public static int f = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, String> f7300a = new HashMap();
    public Map<String, String> b = new HashMap();
    public SharedPreferences c;

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public String a(int r3, String str) {
        String string;
        Map<String, String> map;
        if (r3 != d) {
            if (r3 == e) {
                map = this.b;
            } else if (r3 != f) {
                string = null;
            } else {
                SharedPreferences sharedPreferences = this.c;
                if (sharedPreferences != null) {
                    string = sharedPreferences.getString(str, "");
                } else {
                    Log.e("TAG", "prefs data store is null");
                    string = null;
                }
            }
            if (string == null) {
                return "";
            }
            return string;
        }
        map = this.f7300a;
        string = map.get(str);
        if (string == null) {
            return "";
        }
        return string;
    }

    public void a() {
        this.f7300a.clear();
    }

    public void a(int r2, String str, String str2) {
        Map<String, String> map;
        if (r2 == d) {
            map = this.f7300a;
        } else {
            if (r2 != e) {
                if (r2 == f) {
                    SharedPreferences sharedPreferences = this.c;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString(str, str2).commit();
                        return;
                    } else {
                        Log.e("TAG", "prefs data store is null");
                        return;
                    }
                }
                return;
            }
            map = this.b;
        }
        map.put(str, str2);
    }

    public void a(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences;
    }
}
