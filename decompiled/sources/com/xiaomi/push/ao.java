package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes4.dex */
public class ao implements aj {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ao f14433a;

    /* renamed from: a, reason: collision with other field name */
    private int f201a = an.f14432a;

    /* renamed from: a, reason: collision with other field name */
    private Context f202a;

    /* renamed from: a, reason: collision with other field name */
    private aj f203a;

    public void a() {
    }

    public String b() {
        return null;
    }

    public String c() {
        return null;
    }

    public String d() {
        return null;
    }

    private ao(Context context) {
        this.f202a = context.getApplicationContext();
        this.f203a = an.a(context);
        com.xiaomi.channel.commonutils.logger.b.m11781a("create id manager is: " + this.f201a);
    }

    public static ao a(Context context) {
        if (f14433a == null) {
            synchronized (ao.class) {
                if (f14433a == null) {
                    f14433a = new ao(context.getApplicationContext());
                }
            }
        }
        return f14433a;
    }

    @Override // com.xiaomi.push.aj
    /* renamed from: a */
    public boolean mo11870a() {
        return this.f203a.mo11870a();
    }

    @Override // com.xiaomi.push.aj
    /* renamed from: a */
    public String mo11869a() {
        if (j.m12358a(this.f202a)) {
            return a(this.f203a.mo11869a());
        }
        return "";
    }

    public void a(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String b = b();
        if (!TextUtils.isEmpty(b)) {
            map.put("udid", b);
        }
        String mo11869a = mo11869a();
        if (!TextUtils.isEmpty(mo11869a)) {
            map.put("oaid", mo11869a);
        }
        String c = c();
        if (!TextUtils.isEmpty(c)) {
            map.put("vaid", c);
        }
        String d = d();
        if (!TextUtils.isEmpty(d)) {
            map.put("aaid", d);
        }
        map.put("oaid_type", String.valueOf(this.f201a));
    }

    private String a(String str) {
        return str == null ? "" : str;
    }
}
