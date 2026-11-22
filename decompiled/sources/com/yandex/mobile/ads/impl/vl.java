package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vl implements tl<BitmapDrawable> {
    @Override // com.yandex.mobile.ads.impl.tl
    public final boolean a(BitmapDrawable bitmapDrawable, Bitmap bitmap) {
        BitmapDrawable drawable = bitmapDrawable;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return Intrinsics.areEqual(bitmap, drawable.getBitmap());
    }
}
