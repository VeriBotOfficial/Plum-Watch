package com.wakeup.commonui.popup;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.widget.PopupWindow;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.blankj.utilcode.util.ShadowUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UIHelper;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BasePopup.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0015\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0002¢\u0006\u0002\u0010\u0018R\u001c\u0010\b\u001a\u00028\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/wakeup/commonui/popup/BasePopup;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroid/widget/PopupWindow;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mBinding", "getMBinding", "()Landroidx/viewbinding/ViewBinding;", "setMBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "init", "", "initViews", "initViewBinding", "inflater", "Landroid/view/LayoutInflater;", "(Landroid/view/LayoutInflater;)Landroidx/viewbinding/ViewBinding;", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BasePopup<VB extends ViewBinding> extends PopupWindow {
    private VB mBinding;
    private Context mContext;

    private final void init() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePopup(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        VB initViewBinding = initViewBinding(from);
        this.mBinding = initViewBinding;
        setContentView(initViewBinding.getRoot());
        init();
        initViews();
    }

    public final VB getMBinding() {
        return this.mBinding;
    }

    public final void setMBinding(VB vb) {
        Intrinsics.checkNotNullParameter(vb, "<set-?>");
        this.mBinding = vb;
    }

    public final Context getMContext() {
        return this.mContext;
    }

    public final void setMContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    private final void initViews() {
        setWidth(-2);
        setHeight(-2);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        ShadowUtils.apply(this.mBinding.getRoot(), new ShadowUtils.Config().setShadowColor(ContextCompat.getColor(this.mContext, R.color.color_2b000000)).setShadowRadius(UIHelper.dp2px(12.0f)).setShadowSize(UIHelper.dp2px(4.0f)));
    }

    private final VB initViewBinding(LayoutInflater inflater) {
        Type genericSuperclass;
        if (getClass().getGenericSuperclass() instanceof ParameterizedType) {
            genericSuperclass = getClass().getGenericSuperclass();
        } else {
            genericSuperclass = getClass().getSuperclass().getGenericSuperclass();
        }
        Intrinsics.checkNotNull(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type java.lang.Class<VB of com.wakeup.commonui.popup.BasePopup>");
        Object invoke = ((Class) type).getDeclaredMethod("inflate", LayoutInflater.class).invoke(null, inflater);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type VB of com.wakeup.commonui.popup.BasePopup");
        return (VB) invoke;
    }
}
