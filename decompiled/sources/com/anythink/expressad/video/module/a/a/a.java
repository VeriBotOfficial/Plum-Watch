package com.anythink.expressad.video.module.a.a;

import android.app.Activity;

/* loaded from: classes12.dex */
public final class a extends f {
    private com.anythink.expressad.foundation.d.d X;

    /* renamed from: a, reason: collision with root package name */
    private Activity f5379a;

    private a(Activity activity, com.anythink.expressad.foundation.d.d dVar) {
        this.f5379a = activity;
        this.X = dVar;
    }

    @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i, Object obj) {
        Activity activity;
        super.a(i, obj);
        if (i != 106 || (activity = this.f5379a) == null || this.X == null) {
            return;
        }
        activity.finish();
    }
}
