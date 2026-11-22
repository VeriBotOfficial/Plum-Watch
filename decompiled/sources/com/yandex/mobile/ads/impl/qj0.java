package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qj0 {

    /* renamed from: a, reason: collision with root package name */
    private final bl1 f16674a;
    private final cl1 b;
    private final yl c;

    public final Bitmap a(xj0 imageValue) {
        Object m14057constructorimpl;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        String c = imageValue.c();
        if (c == null) {
            return null;
        }
        this.f16674a.getClass();
        Bitmap a2 = bl1.a(c);
        if (a2 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m14057constructorimpl = Result.m14057constructorimpl(this.b.a(a2, imageValue));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m14063isFailureimpl(m14057constructorimpl)) {
                m14057constructorimpl = null;
            }
            bitmap = (Bitmap) m14057constructorimpl;
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        this.c.getClass();
        return yl.a(bitmap, 1.0d);
    }

    public /* synthetic */ qj0() {
        this(new bl1(), new cl1(), new yl());
    }

    public qj0(bl1 previewBitmapCreator, cl1 previewBitmapScaler, yl blurredBitmapProvider) {
        Intrinsics.checkNotNullParameter(previewBitmapCreator, "previewBitmapCreator");
        Intrinsics.checkNotNullParameter(previewBitmapScaler, "previewBitmapScaler");
        Intrinsics.checkNotNullParameter(blurredBitmapProvider, "blurredBitmapProvider");
        this.f16674a = previewBitmapCreator;
        this.b = previewBitmapScaler;
        this.c = blurredBitmapProvider;
    }
}
