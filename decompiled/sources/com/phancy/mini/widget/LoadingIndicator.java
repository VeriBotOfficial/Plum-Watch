package com.phancy.mini.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alipay.sdk.m.c0.d;
import com.phancy.mini.R;
import com.phancy.mini.utils.OSExtKt;
import com.wakeup.common.dfx.PayFeedbackLogHelper;
import com.yandex.div.core.timer.TimerController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadingIndicator.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0012\u0010\u001f\u001a\u00020\u00122\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010#\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\rJ\u0010\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'J\u0010\u0010%\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010(\u001a\u00020\u0012J\u0006\u0010)\u001a\u00020\u0012R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/phancy/mini/widget/LoadingIndicator;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "content", "Landroid/view/View;", "icon", "Landroid/widget/ImageView;", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "iconUrl", "", "onLoadIconSuccess", "Lkotlin/Function0;", "", "getOnLoadIconSuccess", "()Lkotlin/jvm/functions/Function0;", "setOnLoadIconSuccess", "(Lkotlin/jvm/functions/Function0;)V", PayFeedbackLogHelper.BIZ_RING, "Landroid/widget/ProgressBar;", "showing", "", "title", "Landroid/widget/TextView;", "getIconBitmap", "Landroid/graphics/Bitmap;", "hide", "completeAction", "Ljava/lang/Runnable;", "init", "setIcon", "url", d.p, "resId", "", "show", TimerController.STOP_COMMAND, "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LoadingIndicator extends FrameLayout {
    private View content;
    private ImageView icon;
    private Drawable iconDrawable;
    private String iconUrl;
    private Function0<Unit> onLoadIconSuccess;
    private ProgressBar ring;
    private boolean showing;
    private TextView title;

    public final Function0<Unit> getOnLoadIconSuccess() {
        return this.onLoadIconSuccess;
    }

    public final void setOnLoadIconSuccess(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onLoadIconSuccess = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingIndicator(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onLoadIconSuccess = LoadingIndicator$onLoadIconSuccess$1.INSTANCE;
        this.showing = true;
        init(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onLoadIconSuccess = LoadingIndicator$onLoadIconSuccess$1.INSTANCE;
        this.showing = true;
        init(context);
    }

    private final void init(Context context) {
        this.content = FrameLayout.inflate(context, R.layout.mini_loading_indicator, this);
        this.ring = (ProgressBar) findViewById(R.id.indicator_ring);
        this.icon = (ImageView) findViewById(R.id.indicator_icon);
        this.title = (TextView) findViewById(R.id.indicator_title);
    }

    public final Bitmap getIconBitmap() {
        ImageView imageView = this.icon;
        Drawable drawable = imageView != null ? imageView.getDrawable() : null;
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        return null;
    }

    public final void setIcon(Drawable icon) {
        this.iconUrl = null;
        this.iconDrawable = icon;
        ImageView imageView = this.icon;
        if (imageView != null) {
            imageView.setImageDrawable(icon);
        }
        ImageView imageView2 = this.icon;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
    }

    public final void setIcon(String url) {
        String str = url;
        if (str == null || str.length() == 0 || Intrinsics.areEqual(this.iconUrl, url)) {
            return;
        }
        this.iconUrl = url;
        ImageView imageView = this.icon;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.icon;
        if (imageView2 != null) {
            OSExtKt.load$default(imageView2, url, this.iconDrawable == null ? R.drawable.ic_mini : 0, true, new Function1<Drawable, Unit>() { // from class: com.phancy.mini.widget.LoadingIndicator$setIcon$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
                    invoke2(drawable);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Drawable drawable) {
                    LoadingIndicator.this.iconDrawable = null;
                    LoadingIndicator.this.getOnLoadIconSuccess().invoke();
                }
            }, null, 16, null);
        }
    }

    public final void setTitle(String title) {
        TextView textView = this.title;
        if (textView != null) {
            textView.setText(title);
        }
        TextView textView2 = this.title;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(0);
    }

    public final void setTitle(int resId) {
        TextView textView = this.title;
        if (textView != null) {
            textView.setText(resId);
        }
        TextView textView2 = this.title;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(0);
    }

    public final void stop() {
        ProgressBar progressBar = this.ring;
        if (progressBar == null) {
            return;
        }
        progressBar.setVisibility(4);
    }

    public final void show() {
        if (this.showing) {
            return;
        }
        setVisibility(0);
        ProgressBar progressBar = this.ring;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.showing = true;
    }

    public static /* synthetic */ void hide$default(LoadingIndicator loadingIndicator, Runnable runnable, int i, Object obj) {
        if ((i & 1) != 0) {
            runnable = null;
        }
        loadingIndicator.hide(runnable);
    }

    public final void hide(final Runnable completeAction) {
        if (!this.showing) {
            if (completeAction != null) {
                completeAction.run();
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.content, "alpha", 1.0f, 0.9f, 0.7f, 0.4f, 0.0f).setDuration(300L));
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.phancy.mini.widget.LoadingIndicator$hide$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    LoadingIndicator.this.showing = false;
                    LoadingIndicator.this.setVisibility(8);
                    Runnable runnable = completeAction;
                    if (runnable != null) {
                        runnable.run();
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    LoadingIndicator.this.showing = false;
                    LoadingIndicator.this.setVisibility(8);
                    Runnable runnable = completeAction;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            });
            animatorSet.start();
        }
    }
}
