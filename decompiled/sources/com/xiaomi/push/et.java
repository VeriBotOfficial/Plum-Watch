package com.xiaomi.push;

import android.util.Log;
import com.xiaomi.push.ew;

/* loaded from: classes4.dex */
class et {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f14571a = Log.isLoggable("BCompressed", 3);

    static byte[] a(es esVar, byte[] bArr) {
        try {
            byte[] a2 = ew.a.a(bArr);
            if (f14571a) {
                com.xiaomi.channel.commonutils.logger.b.m11782a("BCompressed", "decompress " + bArr.length + " to " + a2.length + " for " + esVar);
                if (esVar.f479a == 1) {
                    com.xiaomi.channel.commonutils.logger.b.m11782a("BCompressed", "decompress not support upStream");
                }
            }
            return a2;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m11782a("BCompressed", "decompress error " + e);
            return bArr;
        }
    }
}
