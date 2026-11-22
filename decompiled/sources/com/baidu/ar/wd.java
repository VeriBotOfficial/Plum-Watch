package com.baidu.ar;

import android.content.Context;
import android.os.Vibrator;

/* loaded from: classes12.dex */
public class wd {
    public static wd b;

    /* renamed from: a, reason: collision with root package name */
    public Vibrator f7308a;

    public wd(Context context) {
        this.f7308a = (Vibrator) context.getSystemService("vibrator");
    }

    public static synchronized wd a(Context context) {
        wd wdVar;
        synchronized (wd.class) {
            if (b == null) {
                b = new wd(context);
            }
            wdVar = b;
        }
        return wdVar;
    }

    public void a(long j) {
        this.f7308a.vibrate(j);
    }

    public void a(long[] jArr) {
        this.f7308a.vibrate(jArr, -1);
    }
}
