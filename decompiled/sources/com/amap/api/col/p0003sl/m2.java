package com.amap.api.col.p0003sl;

import android.gov.nist.core.Separators;

/* compiled from: DTFileInfo.java */
@ta(tableName = "update_item_file")
/* loaded from: classes11.dex */
class m2 {

    /* renamed from: a, reason: collision with root package name */
    @ua(fieldName = "file", fieldType = 6)
    private String f1763a;

    public m2() {
        this.f1763a = "";
    }

    public String a() {
        return this.f1763a;
    }

    public static String a(String str) {
        return "mAdcode='" + str + Separators.QUOTE;
    }

    public m2(String str, String str2) {
        this.f1763a = str2;
    }
}
