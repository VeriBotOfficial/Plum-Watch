package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public abstract class fp {

    /* renamed from: a, reason: collision with other field name */
    public static final DateFormat f544a;
    private static long b;
    private static String c;

    /* renamed from: a, reason: collision with other field name */
    public long f546a;

    /* renamed from: a, reason: collision with other field name */
    private ft f547a;

    /* renamed from: a, reason: collision with other field name */
    private List<fm> f548a;

    /* renamed from: a, reason: collision with other field name */
    private final Map<String, Object> f549a;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    /* renamed from: a, reason: collision with root package name */
    protected static final String f14596a = Locale.getDefault().getLanguage().toLowerCase();

    /* renamed from: b, reason: collision with other field name */
    private static String f545b = null;

    /* renamed from: a */
    public abstract String mo12164a();

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f544a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        c = fy.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        b = 0L;
    }

    public static synchronized String i() {
        String sb;
        synchronized (fp.class) {
            StringBuilder append = new StringBuilder().append(c);
            long j = b;
            b = 1 + j;
            sb = append.append(Long.toString(j)).toString();
        }
        return sb;
    }

    public fp() {
        this.d = f545b;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.f548a = new CopyOnWriteArrayList();
        this.f549a = new HashMap();
        this.f547a = null;
    }

    public fp(Bundle bundle) {
        this.d = f545b;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.f548a = new CopyOnWriteArrayList();
        this.f549a = new HashMap();
        this.f547a = null;
        this.f = bundle.getString("ext_to");
        this.g = bundle.getString("ext_from");
        this.h = bundle.getString("ext_chid");
        this.e = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f548a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                fm a2 = fm.a((Bundle) parcelable);
                if (a2 != null) {
                    this.f548a.add(a2);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f547a = new ft(bundle2);
        }
    }

    public String j() {
        if ("ID_NOT_AVAILABLE".equals(this.e)) {
            return null;
        }
        if (this.e == null) {
            this.e = i();
        }
        return this.e;
    }

    public void k(String str) {
        this.e = str;
    }

    public String k() {
        return this.h;
    }

    public void l(String str) {
        this.h = str;
    }

    public String l() {
        return this.f;
    }

    public void m(String str) {
        this.f = str;
    }

    public String m() {
        return this.g;
    }

    public void n(String str) {
        this.g = str;
    }

    public String n() {
        return this.i;
    }

    public void o(String str) {
        this.i = str;
    }

    /* renamed from: a, reason: collision with other method in class */
    public ft m12165a() {
        return this.f547a;
    }

    public void a(ft ftVar) {
        this.f547a = ftVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized Collection<fm> m12167a() {
        if (this.f548a == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(this.f548a));
    }

    public fm a(String str) {
        return a(str, null);
    }

    public fm a(String str, String str2) {
        for (fm fmVar : this.f548a) {
            if (str2 == null || str2.equals(fmVar.b())) {
                if (str.equals(fmVar.m12161a())) {
                    return fmVar;
                }
            }
        }
        return null;
    }

    public void a(fm fmVar) {
        this.f548a.add(fmVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized Object m12166a(String str) {
        Map<String, Object> map = this.f549a;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public synchronized Collection<String> b() {
        if (this.f549a == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.f549a.keySet()));
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.d)) {
            bundle.putString("ext_ns", this.d);
        }
        if (!TextUtils.isEmpty(this.g)) {
            bundle.putString("ext_from", this.g);
        }
        if (!TextUtils.isEmpty(this.f)) {
            bundle.putString("ext_to", this.f);
        }
        if (!TextUtils.isEmpty(this.e)) {
            bundle.putString("ext_pkt_id", this.e);
        }
        if (!TextUtils.isEmpty(this.h)) {
            bundle.putString("ext_chid", this.h);
        }
        ft ftVar = this.f547a;
        if (ftVar != null) {
            bundle.putBundle("ext_ERROR", ftVar.a());
        }
        List<fm> list = this.f548a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            Iterator<fm> it = this.f548a.iterator();
            int i = 0;
            while (it.hasNext()) {
                Bundle a2 = it.next().a();
                if (a2 != null) {
                    bundleArr[i] = a2;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:40|(2:41|42)|(6:44|45|46|47|49|50)|51|52|54) */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected synchronized java.lang.String o() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fp.o():java.lang.String");
    }

    public String p() {
        return this.d;
    }

    public static String q() {
        return f14596a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fp fpVar = (fp) obj;
            ft ftVar = this.f547a;
            if (ftVar == null ? fpVar.f547a != null : !ftVar.equals(fpVar.f547a)) {
                return false;
            }
            String str = this.g;
            if (str == null ? fpVar.g != null : !str.equals(fpVar.g)) {
                return false;
            }
            if (!this.f548a.equals(fpVar.f548a)) {
                return false;
            }
            String str2 = this.e;
            if (str2 == null ? fpVar.e != null : !str2.equals(fpVar.e)) {
                return false;
            }
            String str3 = this.h;
            if (str3 == null ? fpVar.h != null : !str3.equals(fpVar.h)) {
                return false;
            }
            Map<String, Object> map = this.f549a;
            if (map == null ? fpVar.f549a != null : !map.equals(fpVar.f549a)) {
                return false;
            }
            String str4 = this.f;
            if (str4 == null ? fpVar.f != null : !str4.equals(fpVar.f)) {
                return false;
            }
            String str5 = this.d;
            String str6 = fpVar.d;
            if (str5 == null ? str6 == null : str5.equals(str6)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.d;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.h;
        int hashCode5 = (((((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f548a.hashCode()) * 31) + this.f549a.hashCode()) * 31;
        ft ftVar = this.f547a;
        return hashCode5 + (ftVar != null ? ftVar.hashCode() : 0);
    }
}
