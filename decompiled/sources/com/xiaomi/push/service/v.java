package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hc;
import com.xiaomi.push.hf;
import java.util.Map;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static a f14812a;

    /* renamed from: a, reason: collision with other field name */
    private static b f1102a;

    public interface a {
        Map<String, String> a(Context context, hc hcVar);

        /* renamed from: a, reason: collision with other method in class */
        void m12484a(Context context, hc hcVar);

        void a(Context context, hc hcVar, hf hfVar);

        void a(String str, byte[] bArr, long j);

        boolean a(Context context, hc hcVar, boolean z);
    }

    public interface b {
        void a(hc hcVar);

        void a(String str);

        /* renamed from: a, reason: collision with other method in class */
        boolean m12485a(hc hcVar);
    }

    public static void a(Context context, hc hcVar, hf hfVar) {
        a aVar = f14812a;
        if (aVar == null) {
            com.xiaomi.channel.commonutils.logger.b.d("The Listener of EventProcessor must be set. Please check extension plugin initialization.");
        } else {
            aVar.a(context, hcVar, hfVar);
        }
    }

    public static boolean a(Context context, hc hcVar, boolean z) {
        a aVar = f14812a;
        if (aVar == null || hcVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("pepa judement listener or container is null");
            return false;
        }
        return aVar.a(context, hcVar, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m12482a(Context context, hc hcVar) {
        a aVar = f14812a;
        if (aVar == null || hcVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("handle msg wrong");
        } else {
            aVar.m12484a(context, hcVar);
        }
    }

    public static void a(String str, byte[] bArr, long j) {
        a aVar = f14812a;
        if (aVar == null || bArr == null) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("handle send msg wrong");
        } else {
            aVar.a(str, bArr, j);
        }
    }

    public static Map<String, String> a(Context context, hc hcVar) {
        a aVar = f14812a;
        if (aVar == null || hcVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("pepa listener or container is null");
            return null;
        }
        return aVar.a(context, hcVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12483a(hc hcVar) {
        b bVar = f1102a;
        if (bVar == null || hcVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("pepa handleReceiveMessage is null");
            return false;
        }
        return bVar.m12485a(hcVar);
    }

    public static void a(hc hcVar) {
        b bVar = f1102a;
        if (bVar == null || hcVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("pepa clearMessage is null");
        } else {
            bVar.a(hcVar);
        }
    }

    public static void a(String str) {
        b bVar = f1102a;
        if (bVar == null || str == null) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("pepa clearMessage is null");
        } else {
            bVar.a(str);
        }
    }
}
