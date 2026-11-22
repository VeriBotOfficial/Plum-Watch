package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* compiled from: PreloadListenerEx.java */
/* loaded from: classes17.dex */
public class a implements PreloadListener {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f11952a;
    private int b = 0;
    private boolean c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f11952a = new WeakReference<>(preloadListener);
        }
    }

    public boolean a() {
        return this.c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f11952a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f11952a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f11952a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f11952a.get().onPreloadSucceed();
    }

    public void a(boolean z) {
        this.c = z;
    }
}
