package com.baidu.location.indoor.mapversion.b;

import android.content.Context;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f7795a;
    private String f;
    private a b = null;
    private String c = null;
    private boolean d = false;
    private boolean e = false;
    private String g = "";
    private double h = 7.0d;
    private Map<String, C0445b> i = Collections.synchronizedMap(new HashMap());

    public interface a {
    }

    /* JADX INFO: renamed from: com.baidu.location.indoor.mapversion.b.b$b, reason: collision with other inner class name */
    public static class C0445b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7796a;
        public String b;
        public double c;
        public double d;
        public double e;
        public double f;
        public String g;
    }

    private b(Context context) {
        this.f = "slr";
        this.f = new File(context.getCacheDir(), this.f).getAbsolutePath();
    }

    public static synchronized b a() {
        return f7795a;
    }

    public static b a(Context context) {
        if (f7795a == null) {
            f7795a = new b(context);
        }
        return f7795a;
    }

    public boolean b() {
        return this.e;
    }

    public boolean c() {
        return this.g.equals("on");
    }

    public Map<String, C0445b> d() {
        return this.i;
    }
}
