package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdImage;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fj0 {

    /* renamed from: a, reason: collision with root package name */
    private final vj0 f15501a;
    private final uj0 b;

    public final xj0 a(Map<String, Bitmap> imageValues, MediatedNativeAdImage mediatedNativeAdImage) {
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        if (mediatedNativeAdImage != null) {
            String url = mediatedNativeAdImage.getUrl();
            int width = mediatedNativeAdImage.getWidth();
            int height = mediatedNativeAdImage.getHeight();
            this.f15501a.getClass();
            if (width > 0 && height > 0) {
                return new xj0(width, height, url, this.b.a(width, height), 112);
            }
            Bitmap bitmap = imageValues.get(url);
            if (bitmap != null) {
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                return new xj0(width2, height2, url, this.b.a(width2, height2), 112);
            }
        }
        return null;
    }

    public /* synthetic */ fj0(Context context, vj0 vj0Var) {
        this(context, vj0Var, new uj0(context));
    }

    public fj0(Context context, vj0 imageSizeValidator, uj0 imageSizeTypeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageSizeValidator, "imageSizeValidator");
        Intrinsics.checkNotNullParameter(imageSizeTypeProvider, "imageSizeTypeProvider");
        this.f15501a = imageSizeValidator;
        this.b = imageSizeTypeProvider;
    }
}
