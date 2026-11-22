package com.huawei.hms.hmsscankit;

import android.app.Activity;
import android.view.View;
import com.huawei.hms.hmsscankit.RemoteView;

/* compiled from: RemoteView.java */
/* loaded from: classes14.dex */
class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RemoteView.a f10447a;

    i(RemoteView.a aVar) {
        this.f10447a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Activity activity;
        RemoteView.a aVar = this.f10447a;
        RemoteView remoteView = RemoteView.this;
        activity = aVar.g;
        remoteView.startPhotoCode(activity);
    }
}
