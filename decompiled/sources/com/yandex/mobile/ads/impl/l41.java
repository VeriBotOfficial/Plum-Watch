package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.api.ATCustomRuleKeys;
import com.caverock.androidsvg.SVGParser;
import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l41 implements j41 {
    @Override // com.yandex.mobile.ads.impl.j41
    public final View a(View container, String assetName) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        View findViewWithTag = container.findViewWithTag(assetName);
        if (findViewWithTag instanceof View) {
            return findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final CheckBox b(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("mute_button");
        if (findViewWithTag instanceof CheckBox) {
            return (CheckBox) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final CustomizableMediaView c(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag(SVGParser.XML_STYLESHEET_ATTR_MEDIA);
        if (findViewWithTag instanceof CustomizableMediaView) {
            return (CustomizableMediaView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView d(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("price");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView e(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("call_to_action");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView f(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("warning");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final ImageView g(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("favicon");
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView h(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag(ATCustomRuleKeys.AGE);
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final View i(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("rating");
        if (findViewWithTag instanceof View) {
            return findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView j(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("title");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final ProgressBar k(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag(g.a.k);
        if (findViewWithTag instanceof ProgressBar) {
            return (ProgressBar) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final ImageView l(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("feedback");
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView m(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("sponsored");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView n(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("domain");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final ImageView o(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("icon");
        if (findViewWithTag instanceof ImageView) {
            return (ImageView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView p(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("review_count");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.j41
    public final TextView a(View container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewWithTag = container.findViewWithTag("body");
        if (findViewWithTag instanceof TextView) {
            return (TextView) findViewWithTag;
        }
        return null;
    }
}
