package com.anythink.core.common.g;

import com.anythink.core.api.ATSDK;
import com.anythink.core.common.d.j;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f3816a = "api.anythinktech.com";
    public static final String b = "https://se.zxcvbnmpo.com/v2/open/ns";
    public static final String c = "https://api.anythinktech.com/v2/open/app";
    public static final String d = "https://api.anythinktech.com/v2/open/placement";
    public static final String e = "https://ssapi.anythinktech.com/sdk/realtime_waterfall";
    public static final String f = "https://api.anythinktech.com/v2/open/pl_wf";
    public static final String g = "https://da.anythinktech.com/v1/open/da";
    public static final String h = "https://tk.anythinktech.com/v1/open/tk";
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n = "";
    public static final String o;
    public static final String p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f3817q;
    public static final String r;
    public static final String s = "https://img.anythinktech.com/gdpr/PrivacyPolicySetting.html";

    static {
        String d2;
        StringBuilder sb = new StringBuilder("https://");
        if (ATSDK.isCnSDK()) {
            d2 = "api.anythinktech.com";
        } else {
            c.a();
            d2 = c.d();
        }
        i = sb.append(d2).append("/v2/open/eu").toString();
        j = "https://adx.anythinktech.com/bid";
        k = "https://adx.anythinktech.com/request";
        l = "https://adxtk.anythinktech.com/v1";
        m = "https://adx.anythinktech.com/openapi/req";
        o = "https://tk.anythinktech.com/ss/rrd";
        p = "https://api.anythinktech.com/v2/open/area";
        f3817q = "https://api.anythinktech.com/v2/open/m_adapter";
        r = "https://api.anythinktech.com/v2/open/dna";
    }

    public static String a() {
        return "api.anythinktech.com";
    }

    private static String b() {
        return j.g.a.b;
    }

    private static String c() {
        return j.g.a.c;
    }

    private static String d() {
        return j.g.a.d;
    }

    private static String e() {
        if (ATSDK.isCnSDK()) {
            return "api.anythinktech.com";
        }
        c.a();
        return c.d();
    }

    private static String f() {
        return j.g.a.e;
    }
}
