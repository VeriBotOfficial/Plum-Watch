package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Process;
import android.view.TextureView;
import com.hjq.permissions.Permission;

/* compiled from: CaptureHelper.java */
/* renamed from: com.huawei.hms.scankit.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class TextureViewSurfaceTextureListenerC2974c implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2976e f10530a;

    TextureViewSurfaceTextureListenerC2974c(C2976e c2976e) {
        this.f10530a = c2976e;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        boolean z;
        Context context;
        Context context2;
        Context context3;
        TextureView textureView;
        this.f10530a.E = false;
        if (surfaceTexture == null) {
            com.huawei.hms.scankit.util.a.b(C2976e.f10538a, "*** WARNING *** surfaceCreated() gave us a null surface!");
        }
        z = this.f10530a.f10539q;
        if (z) {
            return;
        }
        this.f10530a.f10539q = true;
        context = this.f10530a.g;
        if (context.checkPermission(Permission.CAMERA, Process.myPid(), Process.myUid()) == 0) {
            C2976e c2976e = this.f10530a;
            textureView = c2976e.l;
            c2976e.a(textureView);
        } else {
            context2 = this.f10530a.g;
            if (context2 instanceof Activity) {
                this.f10530a.E = true;
                context3 = this.f10530a.g;
                ((Activity) context3).requestPermissions(new String[]{Permission.CAMERA}, 1);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f10530a.f10539q = false;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
