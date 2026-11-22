package com.wakeup.commonui.ad;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScenarioBannerView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u0000 '2\u00020\u0001:\u0001'B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007JB\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0007J+\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0007J\u0006\u0010\u001f\u001a\u00020\u0007J\u0006\u0010 \u001a\u00020\u0007J\u0006\u0010!\u001a\u00020\u0007J\u0006\u0010\"\u001a\u00020\u000fJ\u0016\u0010#\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010$\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010\rJ\u0006\u0010&\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/wakeup/commonui/ad/ScenarioBannerView;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pendingWidthPx", "pendingHeightPx", "sdkReleaser", "Ljava/lang/Runnable;", "parseAttrs", "", "applyLayout", "widthPx", "heightPx", "marginPx", "marginLeftPx", "marginTopPx", "marginRightPx", "marginBottomPx", "applyAppearance", "cornerRadiusPx", "backgroundColor", "elevationPx", "", "(ILjava/lang/Integer;F)V", "targetWidthPx", "targetHeightPx", "resolvedWidth", "resolvedHeight", "collapsePlaceholder", "expandToTarget", "setSdkReleaser", "releaser", "release", "Companion", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScenarioBannerView extends CardView {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int PLACEHOLDER_HEIGHT_PX = 1;
    private int pendingHeightPx;
    private int pendingWidthPx;
    private Runnable sdkReleaser;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScenarioBannerView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScenarioBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @JvmStatic
    public static final void bindSdkReleaser(FrameLayout frameLayout, Runnable runnable) {
        INSTANCE.bindSdkReleaser(frameLayout, runnable);
    }

    @JvmStatic
    public static final void collapse(FrameLayout frameLayout) {
        INSTANCE.collapse(frameLayout);
    }

    @JvmStatic
    public static final int defaultCornerRadiusPx() {
        return INSTANCE.defaultCornerRadiusPx();
    }

    @JvmStatic
    public static final void expand(FrameLayout frameLayout, int i, int i2) {
        INSTANCE.expand(frameLayout, i, i2);
    }

    @JvmStatic
    public static final void release(FrameLayout frameLayout) {
        INSTANCE.release(frameLayout);
    }

    public /* synthetic */ ScenarioBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScenarioBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setUseCompatPadding(false);
        setPreventCornerOverlap(false);
        if (getVisibility() == 0 && !isInEditMode()) {
            setVisibility(8);
        }
        if (attributeSet != null) {
            parseAttrs(attributeSet);
        }
    }

    private final void parseAttrs(AttributeSet attrs) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.ScenarioBannerView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.pendingWidthPx = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScenarioBannerView_bannerWidth, 0);
            this.pendingHeightPx = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScenarioBannerView_bannerHeight, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScenarioBannerView_bannerMargin, 0);
            final int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScenarioBannerView_bannerMarginLeft, dimensionPixelSize);
            final int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScenarioBannerView_bannerMarginTop, dimensionPixelSize);
            final int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScenarioBannerView_bannerMarginRight, dimensionPixelSize);
            final int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ScenarioBannerView_bannerMarginBottom, dimensionPixelSize);
            if (obtainStyledAttributes.hasValue(R.styleable.ScenarioBannerView_bannerCornerRadius)) {
                setRadius(obtainStyledAttributes.getDimension(R.styleable.ScenarioBannerView_bannerCornerRadius, getRadius()));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.ScenarioBannerView_bannerBackgroundColor)) {
                setCardBackgroundColor(obtainStyledAttributes.getColor(R.styleable.ScenarioBannerView_bannerBackgroundColor, 0));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.ScenarioBannerView_bannerElevation)) {
                setCardElevation(obtainStyledAttributes.getDimension(R.styleable.ScenarioBannerView_bannerElevation, 0.0f));
            }
            try {
                if (this.pendingWidthPx <= 0 && this.pendingHeightPx <= 0 && dimensionPixelSize <= 0 && dimensionPixelSize2 <= 0 && dimensionPixelSize3 <= 0 && dimensionPixelSize4 <= 0 && dimensionPixelSize5 <= 0) {
                    obtainStyledAttributes.recycle();
                }
                post(new Runnable() { // from class: com.wakeup.commonui.ad.ScenarioBannerView$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScenarioBannerView.parseAttrs$lambda$1(ScenarioBannerView.this, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5);
                    }
                });
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                th = th;
                obtainStyledAttributes.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void parseAttrs$lambda$1(ScenarioBannerView scenarioBannerView, int i, int i2, int i3, int i4) {
        scenarioBannerView.applyLayout(scenarioBannerView.pendingWidthPx, scenarioBannerView.pendingHeightPx, i, i2, i3, i4);
    }

    public final void applyLayout(int widthPx, int heightPx, int marginPx) {
        applyLayout(widthPx, heightPx, marginPx, marginPx, marginPx, marginPx);
    }

    public static /* synthetic */ void applyLayout$default(ScenarioBannerView scenarioBannerView, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = 0;
        }
        if ((i7 & 2) != 0) {
            i2 = 0;
        }
        if ((i7 & 4) != 0) {
            i3 = 0;
        }
        if ((i7 & 8) != 0) {
            i4 = 0;
        }
        if ((i7 & 16) != 0) {
            i5 = 0;
        }
        if ((i7 & 32) != 0) {
            i6 = 0;
        }
        scenarioBannerView.applyLayout(i, i2, i3, i4, i5, i6);
    }

    public final void applyLayout(int widthPx, int heightPx, int marginLeftPx, int marginTopPx, int marginRightPx, int marginBottomPx) {
        FrameLayout.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        if (widthPx > 0) {
            layoutParams.width = widthPx;
        }
        if (heightPx > 0) {
            layoutParams.height = heightPx;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLeftPx != 0 || marginTopPx != 0 || marginRightPx != 0 || marginBottomPx != 0)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(marginLeftPx, marginTopPx, marginRightPx, marginBottomPx);
        }
        setLayoutParams(layoutParams);
        this.pendingWidthPx = widthPx;
        this.pendingHeightPx = heightPx;
    }

    public static /* synthetic */ void applyAppearance$default(ScenarioBannerView scenarioBannerView, int i, Integer num, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            f = -1.0f;
        }
        scenarioBannerView.applyAppearance(i, num, f);
    }

    public final void applyAppearance(int cornerRadiusPx, Integer backgroundColor, float elevationPx) {
        if (cornerRadiusPx >= 0) {
            setRadius(cornerRadiusPx);
        }
        if (backgroundColor != null) {
            setCardBackgroundColor(backgroundColor.intValue());
        }
        if (elevationPx >= 0.0f) {
            setCardElevation(elevationPx);
        }
    }

    /* renamed from: targetWidthPx, reason: from getter */
    public final int getPendingWidthPx() {
        return this.pendingWidthPx;
    }

    /* renamed from: targetHeightPx, reason: from getter */
    public final int getPendingHeightPx() {
        return this.pendingHeightPx;
    }

    public final int resolvedWidth() {
        int i = this.pendingWidthPx;
        if (i > 0) {
            return i;
        }
        if (getWidth() > 0) {
            return getWidth();
        }
        if (getMeasuredWidth() > 0) {
            return getMeasuredWidth();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.width <= 0) {
            return 0;
        }
        return layoutParams.width;
    }

    public final int resolvedHeight() {
        int i = this.pendingHeightPx;
        if (i > 0) {
            return i;
        }
        if (getHeight() > 0) {
            return getHeight();
        }
        if (getMeasuredHeight() > 0) {
            return getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.height <= 0) {
            return 0;
        }
        return layoutParams.height;
    }

    public final void collapsePlaceholder() {
        INSTANCE.collapse(this);
    }

    public final void expandToTarget(int widthPx, int heightPx) {
        INSTANCE.expand(this, widthPx, heightPx);
    }

    public final void setSdkReleaser(Runnable releaser) {
        this.sdkReleaser = releaser;
    }

    public final void release() {
        Runnable runnable = this.sdkReleaser;
        this.sdkReleaser = null;
        if (runnable != null) {
            runnable.run();
        }
        removeAllViews();
        collapsePlaceholder();
    }

    /* compiled from: ScenarioBannerView.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\"\u0010\u000f\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/wakeup/commonui/ad/ScenarioBannerView$Companion;", "", "<init>", "()V", "PLACEHOLDER_HEIGHT_PX", "", "defaultCornerRadiusPx", "bindSdkReleaser", "", "container", "Landroid/widget/FrameLayout;", "releaser", "Ljava/lang/Runnable;", "release", "collapse", "expand", "widthPx", "heightPx", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final int defaultCornerRadiusPx() {
            return UIHelper.dp2px(12.0f);
        }

        @JvmStatic
        public final void bindSdkReleaser(FrameLayout container, Runnable releaser) {
            ScenarioBannerView scenarioBannerView = container instanceof ScenarioBannerView ? (ScenarioBannerView) container : null;
            if (scenarioBannerView != null) {
                scenarioBannerView.setSdkReleaser(releaser);
            }
        }

        @JvmStatic
        public final void release(FrameLayout container) {
            if (container instanceof ScenarioBannerView) {
                ((ScenarioBannerView) container).release();
                return;
            }
            if (container != null) {
                container.removeAllViews();
            }
            collapse(container);
        }

        @JvmStatic
        public final void collapse(FrameLayout container) {
            ViewGroup.LayoutParams layoutParams;
            if (container == null || (layoutParams = container.getLayoutParams()) == null) {
                return;
            }
            layoutParams.height = 1;
            container.setLayoutParams(layoutParams);
            container.setVisibility(8);
        }

        @JvmStatic
        public final void expand(FrameLayout container, int widthPx, int heightPx) {
            if (container == null || heightPx <= 0) {
                return;
            }
            FrameLayout.LayoutParams layoutParams = container.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, heightPx);
            }
            if (widthPx > 0 && layoutParams.width != -1 && layoutParams.width != -2 && layoutParams.width != 0) {
                layoutParams.width = widthPx;
            }
            layoutParams.height = heightPx;
            container.setLayoutParams(layoutParams);
            container.setVisibility(0);
        }
    }
}
