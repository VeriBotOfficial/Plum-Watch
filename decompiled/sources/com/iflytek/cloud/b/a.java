package com.iflytek.cloud.b;

import android.text.TextUtils;
import com.iflytek.cloud.msc.util.log.DebugLog;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    HashMap<String, String> f11152a = new HashMap<>();

    public a() {
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.replaceAll("[,\n ]", "|");
    }

    public void a() {
        this.f11152a.clear();
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        a aVar = new a();
        aVar.f11152a = (HashMap) this.f11152a.clone();
        return aVar;
    }

    public void c(String str) {
        this.f11152a.clear();
        d(str);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(",")) {
            int indexOf = str2.indexOf("=");
            if (indexOf > 0 && indexOf < str2.length()) {
                this.f11152a.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
            }
        }
    }

    public String e(String str) {
        return this.f11152a.remove(str);
    }

    public Boolean f(String str) {
        return Boolean.valueOf(this.f11152a.remove(str) != null);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : this.f11152a.entrySet()) {
            stringBuffer.append(entry.getKey());
            stringBuffer.append("=");
            stringBuffer.append(entry.getValue());
            stringBuffer.append(",");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        String stringBuffer2 = stringBuffer.toString();
        DebugLog.LogS(stringBuffer2);
        return stringBuffer2;
    }

    public void a(a aVar, String str) {
        if (aVar == null) {
            return;
        }
        b(str, aVar.a(str));
    }

    public a(String str, String[][] strArr) {
        c(str);
        a(strArr);
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f11152a.putAll(aVar.c());
        }
    }

    public void b(String str, String str2) {
        a(str, str2, true);
    }

    public HashMap<String, String> c() {
        return this.f11152a;
    }

    public void a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (z || !this.f11152a.containsKey(str)) {
            this.f11152a.put(str, str2);
        }
    }

    public boolean b(String str) {
        return this.f11152a.containsKey(str);
    }

    public static boolean b(String str, boolean z) {
        if (str != null) {
            if (str.equals(MediaConstraintKeys.TRUE) || str.equals("1")) {
                return true;
            }
            if (str.equals("false") || str.equals("0")) {
                return false;
            }
        }
        return z;
    }

    public static int b(String str, int i) {
        if (str != null) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public static long b(String str, long j) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public void d() {
        for (Map.Entry<String, String> entry : this.f11152a.entrySet()) {
            entry.setValue(g(entry.getValue()));
        }
    }

    public String a(String str) {
        return this.f11152a.get(str);
    }

    public String a(String str, String str2) {
        String str3 = this.f11152a.get(str);
        return str3 == null ? str2 : str3;
    }

    public int a(String str, int i) {
        return b(this.f11152a.get(str), i);
    }

    public long a(String str, long j) {
        return b(this.f11152a.get(str), j);
    }

    public boolean a(String str, boolean z) {
        return b(this.f11152a.get(str), z);
    }

    public void a(String[][] strArr) {
        if (strArr == null) {
            return;
        }
        for (String[] strArr2 : strArr) {
            if (this.f11152a.containsKey(strArr2[0])) {
                String str = this.f11152a.get(strArr2[0]);
                this.f11152a.remove(strArr2[0]);
                for (int i = 1; i < strArr2.length; i++) {
                    this.f11152a.put(strArr2[i], str);
                }
            }
        }
    }
}
