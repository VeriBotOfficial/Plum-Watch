package com.huawei.hms.scankit.p;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import com.huawei.hms.scankit.p.C2995e;
import com.wakeup.howear.R;

/* compiled from: PreviewCallbackProxy.java */
/* renamed from: com.huawei.hms.scankit.p.p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3039p implements Camera.PreviewCallback {

    /* renamed from: a, reason: collision with root package name */
    private C2995e.d f10676a;
    private C3035o b;

    public C3039p(C3035o c3035o, C2995e.d dVar) {
        this.f10676a = dVar;
        this.b = c3035o;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        Handler handler = this.b.b;
        if (handler == null) {
            this.f10676a.a(bArr);
            return;
        }
        Message.obtain(handler, R.integer.abc_config_activityShortDur, "MLKitCamera").sendToTarget();
        this.f10676a.a(bArr);
        Message.obtain(handler, R.integer.animation_default_duration).sendToTarget();
    }
}
