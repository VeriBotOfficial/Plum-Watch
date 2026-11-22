package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.jj0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class en1 {

    /* renamed from: a, reason: collision with root package name */
    private final jj0 f15406a;
    private final fn1 b;

    public final void a(String clickUrl, String str, jj0.b listener) {
        Intrinsics.checkNotNullParameter(clickUrl, "clickUrl");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.b.getClass();
        Intrinsics.checkNotNullParameter(clickUrl, "clickUrl");
        Uri.Builder buildUpon = Uri.parse("https://www.yandex.ru/ads/qr/gen").buildUpon();
        buildUpon.appendQueryParameter("click_link", clickUrl);
        buildUpon.appendQueryParameter("size", String.valueOf(300));
        Intrinsics.checkNotNull(buildUpon);
        Intrinsics.checkNotNullParameter(buildUpon, "<this>");
        Intrinsics.checkNotNullParameter("brand_logo_link", "key");
        if (str != null && str.length() != 0) {
            Intrinsics.checkNotNull(buildUpon.appendQueryParameter("brand_logo_link", str));
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.f15406a.a(new xj0(300, 300, uri, null, 120), listener);
    }

    public /* synthetic */ en1(Context context, sj0 sj0Var) {
        this(context, sj0Var, new jj0(context, new sn0(true), sj0Var), new fn1());
    }

    public en1(Context context, sj0 imageProvider, jj0 imageForPresentProvider, fn1 qrcodeUrlConfigurator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(imageForPresentProvider, "imageForPresentProvider");
        Intrinsics.checkNotNullParameter(qrcodeUrlConfigurator, "qrcodeUrlConfigurator");
        this.f15406a = imageForPresentProvider;
        this.b = qrcodeUrlConfigurator;
    }
}
