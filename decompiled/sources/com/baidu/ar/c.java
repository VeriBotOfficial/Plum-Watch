package com.baidu.ar;

import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public y4 f6830a;

    public c() {
        new HashMap();
        new HashMap();
        new hc();
        new y4(this, Looper.getMainLooper(), 10);
    }

    public void a(Looper looper) {
        y4 y4Var = this.f6830a;
        if (y4Var != null) {
            y4Var.a();
        }
        this.f6830a = new y4(this, looper, 10);
    }
}
