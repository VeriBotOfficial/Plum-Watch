package com.xiaomi.push;

import android.os.Looper;
import android.text.TextUtils;
import java.util.Collection;

/* loaded from: classes4.dex */
public class t {
    public static int a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public static long a(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f14823a;

        /* renamed from: a, reason: collision with other field name */
        private final StringBuilder f1118a;
        private final String b;

        public a() {
            this(":", ",");
        }

        public a(String str, String str2) {
            this.f1118a = new StringBuilder();
            this.f14823a = str;
            this.b = str2;
        }

        public a a(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                if (this.f1118a.length() > 0) {
                    this.f1118a.append(this.b);
                }
                this.f1118a.append(str).append(this.f14823a).append(obj);
            }
            return this;
        }

        public String toString() {
            return this.f1118a.toString();
        }
    }

    public static int b(String str, int i) {
        return !TextUtils.isEmpty(str) ? ((str.hashCode() / 10) * 10) + i : i;
    }

    public static boolean a() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
