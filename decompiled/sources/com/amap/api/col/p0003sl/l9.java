package com.amap.api.col.p0003sl;

import android.text.TextUtils;
import com.autonavi.aps.amapapi.storage.SdCardDbCreator;
import com.facebook.hermes.intl.Constants;

/* compiled from: SDKInfo.java */
@ta(tableName = "a")
/* loaded from: classes11.dex */
public class l9 {

    /* renamed from: a, reason: collision with root package name */
    @ua(fieldName = SdCardDbCreator.FIELD_LASTLOC_ID, fieldType = 6)
    private String f1748a;

    @ua(fieldName = SdCardDbCreator.FIELD_LASTLOC_INFO, fieldType = 6)
    private String b;

    @ua(fieldName = "a6", fieldType = 2)
    private int c;

    @ua(fieldName = SdCardDbCreator.FIELD_LASTLOC_NB, fieldType = 6)
    private String d;

    @ua(fieldName = "a5", fieldType = 6)
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String[] k;

    /* compiled from: SDKInfo.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f1749a;
        private String b;
        private String c;
        private String d;
        private boolean e = true;
        private String[] f = null;

        public a(String str, String str2, String str3) {
            this.f1749a = str2;
            this.b = str2;
            this.d = str3;
            this.c = str;
        }

        static /* synthetic */ String f(a aVar) {
            aVar.getClass();
            return Constants.COLLATION_STANDARD;
        }

        public a a(boolean z) {
            this.e = z;
            return this;
        }

        public a a(String[] strArr) {
            if (strArr != null) {
                this.f = (String[]) strArr.clone();
            }
            return this;
        }

        public a a(String str) {
            this.b = str;
            return this;
        }

        public l9 a() throws y8 {
            if (this.f != null) {
                return new l9(this, (byte) 0);
            }
            throw new y8("sdk packages is null");
        }
    }

    /* synthetic */ l9(a aVar, byte b) {
        this(aVar);
    }

    public void a(boolean z) {
        this.c = z ? 1 : 0;
    }

    public String b() {
        if (TextUtils.isEmpty(this.g) && !TextUtils.isEmpty(this.b)) {
            this.g = m9.b(this.b);
        }
        return this.g;
    }

    public String[] c() {
        String[] strArr;
        String[] strArr2 = this.k;
        if ((strArr2 == null || strArr2.length == 0) && !TextUtils.isEmpty(this.d)) {
            try {
                strArr = m9.b(this.d).split(";");
            } catch (Throwable th) {
                th.printStackTrace();
                strArr = null;
            }
            this.k = strArr;
        }
        return (String[]) this.k.clone();
    }

    public String d() {
        if (TextUtils.isEmpty(this.i) && !TextUtils.isEmpty(this.f1748a)) {
            this.i = m9.b(this.f1748a);
        }
        return this.i;
    }

    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (l9.class != obj.getClass()) {
            return false;
        }
        try {
            if (this.i.equals(((l9) obj).i) && this.f.equals(((l9) obj).f)) {
                if (this.g.equals(((l9) obj).g)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public boolean f() {
        return this.c == 1;
    }

    private l9() {
        this.c = 1;
        this.k = null;
    }

    public String a() {
        if (TextUtils.isEmpty(this.j) && !TextUtils.isEmpty(this.e)) {
            this.j = m9.b(this.e);
        }
        if (TextUtils.isEmpty(this.j)) {
            this.j = Constants.COLLATION_STANDARD;
        }
        return this.j;
    }

    private static String a(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str).append(";");
            }
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private l9(a aVar) {
        this.c = 1;
        this.k = null;
        this.f = aVar.f1749a;
        this.g = aVar.b;
        this.i = aVar.c;
        this.h = aVar.d;
        this.c = aVar.e ? 1 : 0;
        a.f(aVar);
        this.j = Constants.COLLATION_STANDARD;
        this.k = aVar.f;
        this.b = m9.f(this.g);
        this.f1748a = m9.f(this.i);
        m9.f(this.h);
        this.d = m9.f(a(this.k));
        this.e = m9.f(this.j);
    }
}
