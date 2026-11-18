package com.baidu.ar;

import android.content.Context;
import android.os.Vibrator;

/* JADX INFO: loaded from: classes16.dex */
public class wd {
    public static wd b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Vibrator f7308a;

    public wd(Context context) {
        this.f7308a = (Vibrator) context.getSystemService("vibrator");
    }

    public static synchronized wd a(Context context) {
        if (b == null) {
            b = new wd(context);
        }
        return b;
    }

    public void a(long j) {
        this.f7308a.vibrate(j);
    }

    public void a(long[] jArr) {
        this.f7308a.vibrate(jArr, -1);
    }
}
