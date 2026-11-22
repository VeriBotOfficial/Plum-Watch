package com.xiaomi.push;

import android.content.Context;
import java.io.File;

/* loaded from: classes4.dex */
public class da {

    /* renamed from: a, reason: collision with root package name */
    private static cz f14511a;

    public static File a(Context context) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.b.d("ERROR: Context cannot be null.");
            return null;
        }
        cz czVar = f14511a;
        if (czVar != null) {
            return czVar.a(context);
        }
        com.xiaomi.channel.commonutils.logger.b.d("ERROR: XMSF not configure the instance of LogAgent.");
        return null;
    }
}
