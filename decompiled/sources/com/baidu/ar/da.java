package com.baidu.ar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.photo.PhotoCallback;
import java.io.File;

/* loaded from: classes12.dex */
public class da implements com.baidu.ar.arplay.core.renderer.TakePictureCallback {

    /* renamed from: a, reason: collision with root package name */
    public String f6876a;
    public PhotoCallback b;

    public void a(IARRenderer iARRenderer, String str, PhotoCallback photoCallback) {
        if (iARRenderer == null || TextUtils.isEmpty(str) || photoCallback == null) {
            return;
        }
        this.f6876a = str;
        this.b = photoCallback;
        iARRenderer.getSnapShot(this);
    }

    @Override // com.baidu.ar.arplay.core.renderer.TakePictureCallback
    public void onPictureTake(boolean z, Bitmap bitmap, long j) {
        if (this.b == null || TextUtils.isEmpty(this.f6876a)) {
            return;
        }
        j4.d(new File(this.f6876a));
        j4.a(this.f6876a, bitmap, 100);
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.b.onPictureTake(z, this.f6876a);
    }
}
