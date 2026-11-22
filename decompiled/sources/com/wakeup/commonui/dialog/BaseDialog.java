package com.wakeup.commonui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Window;
import androidx.viewbinding.ViewBinding;
import com.anythink.expressad.foundation.h.k;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseDialog.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0015\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0007R\u001c\u0010\n\u001a\u00028\u0000X\u0086.¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/wakeup/commonui/dialog/BaseDialog;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "style", "", "<init>", "(Landroid/content/Context;I)V", "mBinding", "getMBinding", "()Landroidx/viewbinding/ViewBinding;", "setMBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "onAttachedToWindow", "", "init", "initData", "initViews", "initViewBinding", "inflater", "Landroid/view/LayoutInflater;", "(Landroid/view/LayoutInflater;)Landroidx/viewbinding/ViewBinding;", "setGravity", "gravity", "setAnim", k.f, "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BaseDialog<VB extends ViewBinding> extends Dialog {
    public VB mBinding;
    public Context mContext;

    public void initData() {
    }

    public void initViews() {
    }

    public final VB getMBinding() {
        VB vb = this.mBinding;
        if (vb != null) {
            return vb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final void setMBinding(VB vb) {
        Intrinsics.checkNotNullParameter(vb, "<set-?>");
        this.mBinding = vb;
    }

    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final void setMContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDialog(Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        setMBinding(initViewBinding(layoutInflater));
        setMContext(context);
        setContentView(getMBinding().getRoot());
        init();
        initData();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        initViews();
    }

    private final void init() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        window.setLayout(displayMetrics.widthPixels, window.getAttributes().height);
        window.setBackgroundDrawable(new ColorDrawable(0));
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
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type java.lang.Class<VB of com.wakeup.commonui.dialog.BaseDialog>");
        Object invoke = ((Class) type).getDeclaredMethod("inflate", LayoutInflater.class).invoke(null, inflater);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type VB of com.wakeup.commonui.dialog.BaseDialog");
        return (VB) invoke;
    }

    public final void setGravity(int gravity) {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setGravity(gravity);
    }

    public final void setAnim(int anim) {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setWindowAnimations(anim);
    }
}
