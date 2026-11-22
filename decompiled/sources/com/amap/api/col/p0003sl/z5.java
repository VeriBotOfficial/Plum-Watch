package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: AutoTCommonParam.java */
/* loaded from: classes11.dex */
public class z5 {

    /* renamed from: a, reason: collision with root package name */
    private Context f1996a;

    public z5(Context context) {
        this.f1996a = context.getApplicationContext();
    }

    public String a() {
        StringBuilder sb = new StringBuilder("personal_switch=off&autodiv=ANDA0605000");
        if (!TextUtils.isEmpty("")) {
            sb.append("&tid=");
        }
        String f = d9.f(this.f1996a);
        if (!TextUtils.isEmpty(f)) {
            sb.append("&adiu=").append(f);
        }
        if (!TextUtils.isEmpty("9.7.4")) {
            sb.append("&app_version=9.7.4");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("&cifa=");
        }
        String b = d9.b();
        if (!TextUtils.isEmpty(b)) {
            sb.append("&deviceid=").append(b);
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("&did=");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("&didv=");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("&dic=");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("&dip=");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("&diu=");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("&diu2=");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("&diu3=");
        }
        if (!TextUtils.isEmpty("ANDH070308")) {
            sb.append("&div=ANDH070308");
        }
        if (!TextUtils.isEmpty("android")) {
            sb.append("&os=android");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("&stepid=");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("&session=");
        }
        return sb.toString();
    }
}
