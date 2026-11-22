package com.xiaomi.push.service;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.xiaomi.push.g;
import com.xiaomi.push.service.ag;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<ag.a<String, String, String>> f14732a = new SparseArray<ag.a<String, String, String>>(6) { // from class: com.xiaomi.push.service.a.1
        {
            put(1, ag.g);
            put(2, ag.f);
            put(4, ag.e);
            put(8, ag.b);
            put(16, ag.c);
            put(32, ag.h);
        }
    };

    private static int a(String str, int i) {
        return ag.a(com.xiaomi.push.s.m12370a(), str, null, f14732a.get(i));
    }

    private static Bundle a(String str) {
        return ag.a(com.xiaomi.push.s.m12370a(), str, (String) null);
    }

    public static int a(Context context, String str) {
        int i = 0;
        if (context != null && !TextUtils.isEmpty(str)) {
            g.b a2 = com.xiaomi.push.g.a(context, str, true);
            if (a2 == g.b.ALLOWED) {
                i = 1;
            } else if (a2 == g.b.NOT_ALLOWED) {
                i = 2;
            }
            if (ag.a()) {
                Bundle a3 = a(str);
                if (a3.containsKey(ag.g.c)) {
                    i |= a3.getBoolean(ag.g.c) ? 4 : 8;
                }
                if (a3.containsKey(ag.e.c)) {
                    i |= a3.getBoolean(ag.e.c) ? 16 : 32;
                }
                if (a3.containsKey(ag.f.c)) {
                    i |= a3.getBoolean(ag.f.c) ? 64 : 128;
                }
                if (a3.containsKey(ag.b.c)) {
                    i |= a3.getBoolean(ag.b.c) ? 256 : 512;
                }
                if (a3.containsKey(ag.c.c)) {
                    i |= a3.getBoolean(ag.c.c) ? 1024 : 2048;
                }
                if (a3.containsKey(ag.h.c)) {
                    return i | (a3.getBoolean(ag.h.c) ? 4096 : 8192);
                }
                return i;
            }
            int a4 = a(str, 1);
            if (a4 == 1) {
                i |= 4;
            } else if (a4 == 0) {
                i |= 8;
            }
            int a5 = a(str, 4);
            if (a5 == 1) {
                i |= 16;
            } else if (a5 == 0) {
                i |= 32;
            }
            int a6 = a(str, 2);
            if (a6 == 1) {
                i |= 64;
            } else if (a6 == 0) {
                i |= 128;
            }
            int a7 = a(str, 8);
            if (a7 == 1) {
                i |= 256;
            } else if (a7 == 0) {
                i |= 512;
            }
            int a8 = a(str, 16);
            if (a8 == 1) {
                i |= 1024;
            } else if (a8 == 0) {
                i |= 2048;
            }
            int a9 = a(str, 32);
            return a9 == 1 ? i | 4096 : a9 == 0 ? i | 8192 : i;
        }
        com.xiaomi.channel.commonutils.logger.b.m11781a("context | packageName must not be null");
        return 0;
    }
}
