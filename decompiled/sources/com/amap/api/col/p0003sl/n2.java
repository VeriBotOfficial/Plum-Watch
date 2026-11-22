package com.amap.api.col.p0003sl;

import android.gov.nist.core.Separators;

/* compiled from: DTInfo.java */
@ta(tableName = "update_item")
/* loaded from: classes11.dex */
public class n2 {

    @ua(fieldName = "localPath", fieldType = 6)
    protected String h;

    @ua(fieldName = "mCompleteCode", fieldType = 2)
    protected int j;

    @ua(fieldName = "mState", fieldType = 2)
    public int l;

    /* renamed from: a, reason: collision with root package name */
    @ua(fieldName = "title", fieldType = 6)
    protected String f1785a = null;

    @ua(fieldName = "url", fieldType = 6)
    protected String b = null;

    @ua(fieldName = "mAdcode", fieldType = 6)
    protected String c = null;

    @ua(fieldName = "fileName", fieldType = 6)
    protected String d = null;

    @ua(fieldName = "version", fieldType = 6)
    protected String e = "";

    @ua(fieldName = "lLocalLength", fieldType = 5)
    protected long f = 0;

    @ua(fieldName = "lRemoteLength", fieldType = 5)
    protected long g = 0;

    @ua(fieldName = "isProvince", fieldType = 2)
    protected int i = 0;

    @ua(fieldName = "mCityCode", fieldType = 6)
    protected String k = "";

    @ua(fieldName = "mPinyin", fieldType = 6)
    public String m = "";

    public String a() {
        return this.c;
    }

    public void b(String str) {
        this.c = str;
    }

    public String c() {
        return this.f1785a;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.e;
    }

    public static String a(String str) {
        return "mAdcode='" + str + Separators.QUOTE;
    }

    public int b() {
        return this.j;
    }

    public void c(String str) {
        this.k = str;
    }
}
