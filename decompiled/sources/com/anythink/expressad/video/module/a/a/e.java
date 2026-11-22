package com.anythink.expressad.video.module.a.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public class e implements com.anythink.expressad.foundation.g.d.c {
    protected static final String b = "ImageLoaderListener";

    /* renamed from: a, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f5382a;
    protected WeakReference<ImageView> c;
    private String d;

    @Override // com.anythink.expressad.foundation.g.d.c
    public void a(String str, String str2) {
    }

    public e(ImageView imageView) {
        this.c = new WeakReference<>(imageView);
    }

    public e(ImageView imageView, com.anythink.expressad.foundation.d.d dVar, String str) {
        this.c = new WeakReference<>(imageView);
        this.f5382a = dVar;
        this.d = str;
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public void a(Bitmap bitmap, String str) {
        if (bitmap == null) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.c;
            if (weakReference == null || weakReference.get() == null || bitmap.isRecycled()) {
                return;
            }
            this.c.get().setImageBitmap(bitmap);
            this.c.get().setVisibility(0);
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f4564a) {
                th.printStackTrace();
            }
        }
    }
}
