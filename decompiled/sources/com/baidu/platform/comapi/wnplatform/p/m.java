package com.baidu.platform.comapi.wnplatform.p;

import android.view.View;

/* compiled from: WNSwitchMutexClickListener.java */
/* loaded from: classes13.dex */
public abstract class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private static long f8958a;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f8958a > 300) {
            f8958a = currentTimeMillis;
            a(view);
        }
    }
}
