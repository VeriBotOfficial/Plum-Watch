package com.baidu.platform.comapi.wnplatform.p;

import android.view.View;

/* JADX INFO: compiled from: WNSwitchMutexClickListener.java */
/* JADX INFO: loaded from: classes15.dex */
public abstract class m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f8958a;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f8958a > 300) {
            f8958a = jCurrentTimeMillis;
            a(view);
        }
    }
}
