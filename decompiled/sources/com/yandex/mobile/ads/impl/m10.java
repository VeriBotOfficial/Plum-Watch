package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.DialogInterface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m10 implements zr {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f16194a;

    public final void a(Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f16194a = dialog;
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yandex.mobile.ads.impl.m10$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                m10.a(m10.this, dialogInterface);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zr
    public final void f() {
        Dialog dialog = this.f16194a;
        if (dialog != null) {
            n10.a(dialog);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(m10 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.f16194a;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
        }
        this$0.f16194a = null;
    }
}
