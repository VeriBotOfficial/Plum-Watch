package com.baidu.ar;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public final class jb {

    /* renamed from: a, reason: collision with root package name */
    public Map<String, String> f7040a;
    public int b;

    public static jb a() {
        jb jbVar = new jb();
        jbVar.f7040a = new HashMap();
        jbVar.b = o.a();
        return jbVar;
    }

    public static jb a(Context context) {
        jb jbVar = new jb();
        SharedPreferences sharedPreferences = context.getSharedPreferences("ar_res_info", 0);
        String string = sharedPreferences.getString("res_version", "");
        jbVar.f7040a = new HashMap();
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split("\n")) {
                String trim = str.trim();
                int indexOf = trim.indexOf(" ");
                if (indexOf > 0) {
                    jbVar.f7040a.put(trim.substring(0, indexOf).trim(), trim.substring(indexOf + 1).trim());
                }
            }
        }
        jbVar.b = sharedPreferences.getInt("ar_sdk_version", 0);
        return jbVar;
    }

    public static void a(Context context, jb jbVar) {
        SharedPreferences.Editor edit = context.getSharedPreferences("ar_res_info", 0).edit();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : jbVar.f7040a.entrySet()) {
            sb.append(entry.getKey() + " " + entry.getValue() + "\n");
        }
        edit.putString("res_version", sb.toString());
        edit.putInt("ar_sdk_version", jbVar.b);
        edit.apply();
    }

    public String a(String str) {
        return this.f7040a.get(str);
    }

    public void a(String str, String str2) {
        this.f7040a.put(str, str2);
    }

    public int b() {
        return this.b;
    }
}
