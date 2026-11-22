package com.xiaomi.push.service;

import com.xiaomi.push.hf;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static a f14786a;

    /* renamed from: a, reason: collision with other field name */
    private static b f1060a;

    public interface a {
        boolean a(hf hfVar);
    }

    public interface b {
    }

    public static void a(b bVar) {
        f1060a = bVar;
    }

    public static boolean a(hf hfVar) {
        if (f14786a == null || hfVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("rc params is null, not cpra");
            return false;
        }
        if (!com.xiaomi.push.j.m12358a(com.xiaomi.push.s.m12370a())) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("rc app not permission to cpra");
            return false;
        }
        return f14786a.a(hfVar);
    }
}
