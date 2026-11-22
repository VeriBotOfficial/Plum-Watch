package com.wakeup.commonui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.framework.common.NetworkUtil;
import com.wakeup.common.utils.StringUtils;
import com.wakeup.common.utils.ToastUtils;
import com.wakeup.commonui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StateLayout.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0010H\u0014J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000bJ\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0010J\u0014\u0010\u0016\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/wakeup/commonui/view/StateLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "contentView", "Landroid/view/View;", "loadingView", "errorView", "retryBlock", "Lkotlin/Function0;", "", "onFinishInflate", "bindContent", "view", "showLoading", "showContent", "showNetError", "onRetry", "ensureLoadingView", "ensureErrorView", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StateLayout extends FrameLayout {
    private View contentView;
    private View errorView;
    private View loadingView;
    private Function0<Unit> retryBlock;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StateLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StateLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ StateLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setClickable(true);
        setFocusable(true);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.contentView != null || getChildCount() <= 0) {
            return;
        }
        this.contentView = getChildAt(getChildCount() - 1);
    }

    public final void bindContent(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.contentView = view;
    }

    public final void showLoading() {
        ensureLoadingView();
        View view = this.loadingView;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.errorView;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.contentView;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    public final void showContent() {
        View view = this.loadingView;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.errorView;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.contentView;
        if (view3 != null) {
            view3.setVisibility(0);
        }
    }

    public final void showNetError(Function0<Unit> onRetry) {
        Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        ensureErrorView();
        this.retryBlock = onRetry;
        View view = this.loadingView;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.errorView;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.contentView;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    private final void ensureLoadingView() {
        if (this.loadingView == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_common_state_loading, (ViewGroup) this, false);
            this.loadingView = inflate;
            addView(inflate);
        }
    }

    private final void ensureErrorView() {
        TextView textView;
        View view = this.errorView;
        if (view != null) {
            if (view == null || (textView = (TextView) view.findViewById(R.id.tv_try_refresh)) == null) {
                return;
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.view.StateLayout$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StateLayout.ensureErrorView$lambda$2(StateLayout.this, view2);
                }
            });
            return;
        }
        final View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_none_net_work, (ViewGroup) this, false);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_try_refresh);
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.view.StateLayout$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StateLayout.ensureErrorView$lambda$1$lambda$0(inflate, this, view2);
                }
            });
        }
        this.errorView = inflate;
        addView(inflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureErrorView$lambda$1$lambda$0(View view, StateLayout stateLayout, View view2) {
        if (!NetworkUtil.isNetworkAvailable(view.getContext())) {
            ToastUtils.showToast(StringUtils.getString(R.string.net_error_tip));
            return;
        }
        Function0<Unit> function0 = stateLayout.retryBlock;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureErrorView$lambda$2(StateLayout stateLayout, View view) {
        if (!NetworkUtil.isNetworkAvailable(stateLayout.getContext())) {
            ToastUtils.showToast(StringUtils.getString(R.string.net_error_tip));
            return;
        }
        Function0<Unit> function0 = stateLayout.retryBlock;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
