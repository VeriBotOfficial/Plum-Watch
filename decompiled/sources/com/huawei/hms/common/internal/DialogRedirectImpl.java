package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes14.dex */
public class DialogRedirectImpl extends DialogRedirect {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f10302a;
    private final int b;
    private final Intent c;

    DialogRedirectImpl(Intent intent, Activity activity, int i) {
        this.c = intent;
        this.f10302a = activity;
        this.b = i;
    }

    @Override // com.huawei.hms.common.internal.DialogRedirect
    public final void redirect() {
        Intent intent = this.c;
        if (intent != null) {
            this.f10302a.startActivityForResult(intent, this.b);
        }
    }
}
