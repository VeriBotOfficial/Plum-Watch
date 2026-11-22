package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class q71 {
    static final /* synthetic */ KProperty<Object>[] f = {ta.a(q71.class, "nativeAdView", "getNativeAdView()Landroid/view/View;", 0), ta.a(q71.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0), ta.a(q71.class, "muteButtonView", "getMuteButtonView()Landroid/widget/CheckBox;", 0), ta.a(q71.class, "videoProgressView", "getVideoProgressView()Landroid/widget/ProgressBar;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final go1 f16636a;
    private final go1 b;
    private final go1 c;
    private final go1 d;
    private final LinkedHashMap e;

    public final View a(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        WeakReference weakReference = (WeakReference) this.e.get(assetName);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private q71(a aVar) {
        this.f16636a = ho1.a(aVar.d());
        this.b = ho1.a(aVar.b());
        this.c = ho1.a(aVar.c());
        this.d = ho1.a(aVar.e());
        this.e = bu0.a(aVar.a());
    }

    public final View d() {
        return (View) this.f16636a.getValue(this, f[0]);
    }

    @Deprecated(message = "")
    public final ImageView b() {
        return (ImageView) this.b.getValue(this, f[1]);
    }

    public final CheckBox c() {
        return (CheckBox) this.c.getValue(this, f[2]);
    }

    public final ProgressBar e() {
        return (ProgressBar) this.d.getValue(this, f[3]);
    }

    public /* synthetic */ q71(a aVar, int i) {
        this(aVar);
    }

    public final LinkedHashMap a() {
        return this.e;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final View f16637a;
        private CheckBox b;
        private ProgressBar c;
        private final Map<String, View> d;
        private ImageView e;

        public a(View nativeAdView, Map<String, ? extends View> initialAssetViews) {
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
            Intrinsics.checkNotNullParameter(initialAssetViews, "initialAssetViews");
            this.f16637a = nativeAdView;
            this.d = MapsKt.toMutableMap(initialAssetViews);
        }

        public final View d() {
            return this.f16637a;
        }

        public final CheckBox c() {
            return this.b;
        }

        public final ProgressBar e() {
            return this.c;
        }

        public final Map<String, View> a() {
            return this.d;
        }

        public final ImageView b() {
            return this.e;
        }

        @Deprecated(message = "")
        public final a a(ImageView imageView) {
            this.e = imageView;
            return this;
        }

        public final a a(CheckBox checkBox) {
            this.b = checkBox;
            return this;
        }

        public final a a(ProgressBar progressBar) {
            this.c = progressBar;
            return this;
        }
    }
}
