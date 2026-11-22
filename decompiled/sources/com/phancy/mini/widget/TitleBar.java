package com.phancy.mini.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alipay.sdk.m.c0.d;
import com.phancy.mini.MiniSDK;
import com.phancy.mini.R;
import com.phancy.mini.core.app.MiniAppActivity;
import com.phancy.mini.utils.MiniSwitch;
import com.phancy.mini.utils.OSExtKt;
import com.phancy.mini.utils.StatusBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TitleBar.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020\"J\u0006\u0010%\u001a\u00020 J\b\u0010&\u001a\u00020 H\u0002J\u0010\u0010'\u001a\u00020 2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\u000e\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\"J\u000e\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\tJ\u000e\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\tJ\u0006\u0010.\u001a\u00020 R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/phancy/mini/widget/TitleBar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "content", "Landroid/view/View;", "mTitleClickCount", "", "mTitleClickTime", "navButton", "Lcom/phancy/mini/widget/IconButton;", "navProgress", "Landroid/widget/ProgressBar;", "navTextLayout", "Landroid/widget/LinearLayout;", "navTitle", "Landroid/widget/TextView;", "value", "", "title", "getTitle", "()Ljava/lang/CharSequence;", d.p, "(Ljava/lang/CharSequence;)V", "disableNavigationBack", "", "disable", "", "fullStyleTextLayout", "fullStyle", "hideLoading", "init", d.o, "onCustomNavigationStyleChanged", "customNavigationStyle", "setButtonIcon", "resourceId", "setTitleTextColor", "color", "showLoading", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TitleBar extends FrameLayout {
    private static final String TAG = "TitleBar";
    private static final int TEXT_MARGIN_FULL_STYLE = 32;
    private static final int TEXT_MARGIN_MINI_STYLE = 96;
    private View content;
    private long mTitleClickCount;
    private long mTitleClickTime;
    private IconButton navButton;
    private ProgressBar navProgress;
    private LinearLayout navTextLayout;
    private TextView navTitle;

    public final CharSequence getTitle() {
        TextView textView = this.navTitle;
        if (textView != null) {
            return textView.getText();
        }
        return null;
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.navTitle;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleBar(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        init();
    }

    private final void init() {
        this.content = FrameLayout.inflate(getContext(), R.layout.mini_nav_bar, this);
        this.navButton = (IconButton) findViewById(R.id.nav_button);
        this.navTitle = (TextView) findViewById(R.id.nav_title);
        this.navProgress = (ProgressBar) findViewById(R.id.nav_progress);
        this.navTextLayout = (LinearLayout) findViewById(R.id.nav_text_layout);
        IconButton iconButton = this.navButton;
        if (iconButton != null) {
            iconButton.setOnClickListener(new View.OnClickListener() { // from class: com.phancy.mini.widget.TitleBar$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TitleBar.init$lambda$0(TitleBar.this, view);
                }
            });
        }
        TextView textView = this.navTitle;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.phancy.mini.widget.TitleBar$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TitleBar.init$lambda$1(TitleBar.this, view);
                }
            });
        }
        hideLoading();
        if (getBackground() == null) {
            setBackgroundColor(MiniSDK.MINI_APP_BG_COLOR);
        }
        if (getContext() instanceof MiniAppActivity) {
            onCustomNavigationStyleChanged(false);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Activity activity = OSExtKt.toActivity(context);
        if (activity != null) {
            setTitle(activity.getTitle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(TitleBar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBack(this$0.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(TitleBar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this$0.mTitleClickTime < 500) {
            this$0.mTitleClickCount++;
        }
        if (this$0.mTitleClickCount > 5) {
            this$0.mTitleClickCount = 0L;
            this$0.mTitleClickTime = 0L;
            MiniSDK.d(TAG, "SLOGAN: " + MiniSwitch.getValue("SLOGAN"));
            return;
        }
        this$0.mTitleClickTime = currentTimeMillis;
    }

    public final void onCustomNavigationStyleChanged(boolean customNavigationStyle) {
        int statusBarHeight;
        if (customNavigationStyle) {
            statusBarHeight = 0;
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            statusBarHeight = StatusBar.getStatusBarHeight(context);
        }
        setPadding(0, statusBarHeight, 0, 0);
    }

    public final void onBack(Context context) {
        if (context instanceof Activity) {
            ((Activity) context).onBackPressed();
        } else if (context instanceof ContextWrapper) {
            onBack(((ContextWrapper) context).getBaseContext());
        }
    }

    public final void setButtonIcon(int resourceId) {
        IconButton iconButton = this.navButton;
        if (iconButton != null) {
            iconButton.setImageDrawable(getContext().getDrawable(resourceId));
        }
    }

    public final void setTitleTextColor(int color) {
        TextView textView = this.navTitle;
        if (textView != null) {
            textView.setTextColor(color);
        }
        IconButton iconButton = this.navButton;
        if (iconButton != null) {
            iconButton.setIconColorFilter(color, PorterDuff.Mode.SRC_IN);
        }
    }

    public final void disableNavigationBack(boolean disable) {
        IconButton iconButton = this.navButton;
        if (iconButton == null) {
            return;
        }
        iconButton.setVisibility(disable ? 8 : 0);
    }

    public final void showLoading() {
        ProgressBar progressBar = this.navProgress;
        if (progressBar == null) {
            return;
        }
        progressBar.setVisibility(0);
    }

    public final void hideLoading() {
        ProgressBar progressBar = this.navProgress;
        if (progressBar == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    public static /* synthetic */ void fullStyleTextLayout$default(TitleBar titleBar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        titleBar.fullStyleTextLayout(z);
    }

    public final void fullStyleTextLayout(boolean fullStyle) {
        int dip2px;
        int dip2px2;
        LinearLayout linearLayout = this.navTextLayout;
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (fullStyle) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                dip2px = OSExtKt.dip2px(32, context);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                dip2px = OSExtKt.dip2px(96, context2);
            }
            marginLayoutParams.leftMargin = dip2px;
            if (fullStyle) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "context");
                dip2px2 = OSExtKt.dip2px(32, context3);
            } else {
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "context");
                dip2px2 = OSExtKt.dip2px(96, context4);
            }
            marginLayoutParams.rightMargin = dip2px2;
            LinearLayout linearLayout2 = this.navTextLayout;
            if (linearLayout2 == null) {
                return;
            }
            linearLayout2.setLayoutParams(layoutParams);
        }
    }
}
