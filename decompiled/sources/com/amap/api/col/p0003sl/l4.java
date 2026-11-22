package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.maps.model.LatLng;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Iterator;

/* compiled from: InfoCollectUtils.java */
/* loaded from: classes11.dex */
public class l4 {
    private static boolean c = false;
    private static volatile l4 d;

    /* renamed from: a, reason: collision with root package name */
    private Hashtable<String, String> f1744a = new Hashtable<>();
    private WeakReference<Context> b = null;

    private l4() {
    }

    public static void a() {
        if (d != null) {
            if (d.f1744a != null && d.f1744a.size() > 0) {
                synchronized (d.f1744a) {
                    d.d();
                    if (d.b != null) {
                        d.b.clear();
                    }
                }
            }
            d = null;
        }
        c = false;
    }

    public static l4 b() {
        if (d == null) {
            synchronized (l4.class) {
                if (d == null) {
                    d = new l4();
                }
            }
        }
        return d;
    }

    public static boolean c() {
        return c;
    }

    private void d() {
        WeakReference<Context> weakReference;
        if (!c) {
            this.f1744a.clear();
            return;
        }
        if (this.f1744a != null) {
            StringBuffer stringBuffer = new StringBuffer();
            int size = this.f1744a.size();
            if (size > 0) {
                stringBuffer.append("[");
                Iterator<String> it = this.f1744a.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    i++;
                    stringBuffer.append(it.next());
                    if (i < size) {
                        stringBuffer.append(",");
                    }
                }
                stringBuffer.append("]");
                String stringBuffer2 = stringBuffer.toString();
                if (!TextUtils.isEmpty(stringBuffer2) && (weakReference = this.b) != null && weakReference.get() != null) {
                    vb.a(stringBuffer2, this.b.get());
                }
            }
            this.f1744a.clear();
        }
    }

    public static void a(boolean z) {
        c = z;
    }

    public void a(Context context) {
        if (context != null) {
            this.b = new WeakReference<>(context);
        }
    }

    public void a(LatLng latLng, String str, String str2) {
        Hashtable<String, String> hashtable;
        if (!c) {
            this.f1744a.clear();
            return;
        }
        if (latLng == null || TextUtils.isEmpty(str)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("{\"lon\":");
        stringBuffer.append(latLng.longitude).append(",\"lat\":");
        stringBuffer.append(latLng.latitude).append(",\"title\":\"");
        stringBuffer.append(str).append("\",\"snippet\":\"");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        stringBuffer.append(str2).append("\"}");
        String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2 == null || (hashtable = this.f1744a) == null) {
            return;
        }
        synchronized (hashtable) {
            String c2 = i9.c(stringBuffer2);
            Hashtable<String, String> hashtable2 = this.f1744a;
            if (hashtable2 != null && !hashtable2.contains(c2)) {
                this.f1744a.put(c2, stringBuffer2);
            }
            Hashtable<String, String> hashtable3 = this.f1744a;
            if (hashtable3 != null && hashtable3.size() > 20) {
                d();
            }
        }
    }
}
