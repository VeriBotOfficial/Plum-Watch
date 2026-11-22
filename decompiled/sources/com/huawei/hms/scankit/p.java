package com.huawei.hms.scankit;

import android.view.View;

/* compiled from: IRemoteCustomedViewDelegateImpl.java */
/* loaded from: classes14.dex */
class p implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f10548a;

    p(q qVar) {
        this.f10548a = qVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f10548a.o.dismiss();
    }
}
