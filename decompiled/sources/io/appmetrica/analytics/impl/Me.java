package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public abstract class Me {
    public static final String c = "Me";

    /* renamed from: a, reason: collision with root package name */
    public final Oa f17974a;
    public final String b;

    public Me(Oa oa, String str) {
        this.f17974a = oa;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Me> T a(String str, float f) {
        synchronized (this) {
            this.f17974a.a(str, f);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Me> T b(String str, String str2) {
        synchronized (this) {
            this.f17974a.a(str, str2);
        }
        return this;
    }

    public final Ne c(String str) {
        return new Ne(str, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Me> T d(String str) {
        synchronized (this) {
            this.f17974a.remove(str);
        }
        return this;
    }

    public Set<String> c() {
        return this.f17974a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Me> T a(String str, String[] strArr) {
        String str2;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str3 : strArr) {
                jSONArray.put(str3);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.f17974a.a(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Me> T b(String str, long j) {
        synchronized (this) {
            this.f17974a.a(str, j);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Me> T b(String str, int i) {
        synchronized (this) {
            this.f17974a.a(i, str);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Me> T b(String str, boolean z) {
        synchronized (this) {
            this.f17974a.a(str, z);
        }
        return this;
    }

    public final <T extends Me> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j) {
        return this.f17974a.getLong(str, j);
    }

    public final int a(String str, int i) {
        return this.f17974a.getInt(str, i);
    }

    public final String a(String str, String str2) {
        return this.f17974a.getString(str, str2);
    }

    public final void b() {
        synchronized (this) {
            this.f17974a.b();
        }
    }

    public final boolean a(String str, boolean z) {
        return this.f17974a.getBoolean(str, z);
    }

    public final boolean b(String str) {
        return this.f17974a.a(str);
    }
}
