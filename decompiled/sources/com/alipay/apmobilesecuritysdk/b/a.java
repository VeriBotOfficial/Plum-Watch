package com.alipay.apmobilesecuritysdk.b;

import com.alipay.sdk.m.i0.d;

/* loaded from: classes11.dex */
public class a {
    private static a b = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f1294a = 0;

    public static a a() {
        return b;
    }

    private String a(String str, String str2) {
        return str + str2;
    }

    public void a(int i) {
        this.f1294a = i;
    }

    public int b() {
        return this.f1294a;
    }

    public String c() {
        String str;
        String a2 = d.a();
        if (com.alipay.sdk.m.d0.a.b(a2)) {
            return a2;
        }
        int i = this.f1294a;
        if (i == 1) {
            str = "://mobilegw.stable.alipay.net/mgw.htm";
        } else {
            if (i == 2) {
                return "https://mobilegwpre.alipay.com/mgw.htm";
            }
            if (i == 3) {
                str = "://mobilegw-1-64.test.alipay.net/mgw.htm";
            } else {
                if (i != 4) {
                    return "https://mobilegw.alipay.com/mgw.htm";
                }
                str = "://mobilegw.aaa.alipay.net/mgw.htm";
            }
        }
        return a("http", str);
    }
}
