package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yd1 implements j41 {

    /* renamed from: a, reason: collision with root package name */
    private final int f17413a;

    @Override // com.yandex.mobile.ads.impl.j41
    public final View a(View container, String assetName) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        View findViewWithTag = container.findViewWithTag(assetName + "_" + this.f17413a);
        if (findViewWithTag instanceof View) {
            return findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final CheckBox b(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("mute_button_" + this.f17413a);
        if (findViewWithTag instanceof CheckBox) {
            return (CheckBox) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final CustomizableMediaView c(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("media_" + this.f17413a);
        if (findViewWithTag instanceof CustomizableMediaView) {
            return (CustomizableMediaView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView d(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("price_" + this.f17413a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView e(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("call_to_action_" + this.f17413a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView f(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("warning_" + this.f17413a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final ImageView g(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("favicon_" + this.f17413a);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView h(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("age_" + this.f17413a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final View i(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("rating_" + this.f17413a);
        if (findViewWithTag instanceof View) {
            return findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView j(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("title_" + this.f17413a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final ProgressBar k(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return (ProgressBar) container.findViewWithTag("video_progress_" + this.f17413a);
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final ImageView l(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("feedback_" + this.f17413a);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView m(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("sponsored_" + this.f17413a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView n(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("domain_" + this.f17413a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final ImageView o(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("icon_" + this.f17413a);
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView p(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("review_count_" + this.f17413a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    public yd1(int i) {
        this.f17413a = i;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView a(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("body_" + this.f17413a);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }
}
