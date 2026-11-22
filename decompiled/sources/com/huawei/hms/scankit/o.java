package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: IRemoteCustomedViewDelegateImpl.java */
/* loaded from: classes14.dex */
class o extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q f10547a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(q qVar, Context context) {
        super(context);
        this.f10547a = qVar;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i) {
        int rotation = ((Activity) this.f10547a.e).getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            this.f10547a.a(90);
            return;
        }
        if (rotation == 1) {
            this.f10547a.a(0);
        } else if (rotation == 2) {
            this.f10547a.a(270);
        } else {
            if (rotation != 3) {
                return;
            }
            this.f10547a.a(180);
        }
    }
}
