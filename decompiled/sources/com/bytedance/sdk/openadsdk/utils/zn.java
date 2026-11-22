package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
public class zn implements com.bytedance.sdk.component.rb.xdg {
    private final WeakReference<ImageView> fxn;

    public zn(ImageView imageView) {
        this.fxn = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.rb.xdg
    public void fxn(com.bytedance.sdk.component.rb.dgx dgxVar) {
        ImageView imageView = this.fxn.get();
        if (imageView == null) {
            return;
        }
        try {
            Object kg = dgxVar.kg();
            if (kg instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) kg);
                return;
            }
            if (kg instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && (kg instanceof AnimatedImageDrawable)) {
                    ((AnimatedImageDrawable) kg).start();
                }
                imageView.setImageDrawable((Drawable) kg);
                return;
            }
            imageView.setVisibility(8);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.rb.xdg
    public void fxn(int i, String str, Throwable th) {
        ImageView imageView = this.fxn.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
