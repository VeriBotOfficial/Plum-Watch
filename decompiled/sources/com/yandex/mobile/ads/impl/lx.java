package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.yandex.div.core.images.LoadReference;
import com.yandex.mobile.ads.impl.oj0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lx {

    /* renamed from: a, reason: collision with root package name */
    private final oj0 f16181a;
    private final List<LoadReference> b;

    public static final class a implements oj0.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f16182a;

        a(ImageView imageView) {
            this.f16182a = imageView;
        }

        @Override // com.yandex.mobile.ads.impl.xq1.a
        public final void a(si2 si2Var) {
        }

        @Override // com.yandex.mobile.ads.impl.oj0.d
        public final void a(oj0.c response, boolean z) {
            Intrinsics.checkNotNullParameter(response, "response");
            Bitmap b = response.b();
            if (b != null) {
                this.f16182a.setImageBitmap(b);
            }
        }
    }

    public lx(jz1 imageLoader, List loadReferencesStorage) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(loadReferencesStorage, "loadReferencesStorage");
        this.f16181a = imageLoader;
        this.b = loadReferencesStorage;
    }

    public final void a() {
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            ((LoadReference) it.next()).cancel();
        }
        this.b.clear();
    }

    public final LoadReference a(String imageUrl, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        final oj0.c a2 = this.f16181a.a(imageUrl, new a(imageView), 0, 0);
        Intrinsics.checkNotNullExpressionValue(a2, "get(...)");
        LoadReference loadReference = new LoadReference() { // from class: com.yandex.mobile.ads.impl.lx$$ExternalSyntheticLambda0
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                lx.a(oj0.c.this);
            }
        };
        this.b.add(loadReference);
        return loadReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(oj0.c imageContainer) {
        Intrinsics.checkNotNullParameter(imageContainer, "$imageContainer");
        imageContainer.a();
    }
}
