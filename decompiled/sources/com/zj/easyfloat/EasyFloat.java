package com.zj.easyfloat;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.autonavi.aps.amapapi.config.Const;
import com.zj.easyfloat.floatingview.EnFloatingView;
import com.zj.easyfloat.floatingview.FloatingMagnetView;
import com.zj.easyfloat.floatingview.FloatingView;
import com.zj.easyfloat.floatingview.MagnetViewListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EasyFloat.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00002\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\u0015\u001a\u00020\fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fJ8\u0010\u001c\u001a\u00020\u00002\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eJ\u001a\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010%\u001a\u00020 H\u0016J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010)\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/zj/easyfloat/EasyFloat;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "autoMoveToEdge", "", "blackList", "", "Ljava/lang/Class;", "dragEnable", "mLayout", "", "mLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "onClickListener", "Lkotlin/Function1;", "Lcom/zj/easyfloat/floatingview/FloatingMagnetView;", "", "onRemoveListener", "dismiss", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "getFloatingLayoutParams", "initShow", "isActivityInValid", "isAutoMoveToEdge", "isDragEnable", "layout", "layoutParams", "listener", "Landroid/view/View;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "setAutoMoveToEdge", "show", "easyfloat_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class EasyFloat implements Application.ActivityLifecycleCallbacks {
    public static final EasyFloat INSTANCE;
    private static boolean autoMoveToEdge;
    private static final List<Class<?>> blackList;
    private static boolean dragEnable;
    private static int mLayout;
    private static FrameLayout.LayoutParams mLayoutParams;
    private static Function1<? super FloatingMagnetView, Unit> onClickListener;
    private static Function1<? super FloatingMagnetView, Unit> onRemoveListener;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    static {
        EasyFloat easyFloat = new EasyFloat();
        INSTANCE = easyFloat;
        mLayoutParams = easyFloat.getFloatingLayoutParams();
        blackList = new ArrayList();
        dragEnable = true;
        autoMoveToEdge = true;
    }

    private EasyFloat() {
    }

    public final EasyFloat layout(int layout) {
        mLayout = layout;
        return this;
    }

    public final EasyFloat layoutParams(FrameLayout.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        mLayoutParams = layoutParams;
        return this;
    }

    public final EasyFloat blackList(List<Class<?>> blackList2) {
        Intrinsics.checkNotNullParameter(blackList2, "blackList");
        blackList.addAll(blackList2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EasyFloat listener$default(EasyFloat easyFloat, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function12 = null;
        }
        return easyFloat.listener(function1, function12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EasyFloat listener(Function1<? super View, Unit> onRemoveListener2, Function1<? super View, Unit> onClickListener2) {
        onRemoveListener = onRemoveListener2;
        onClickListener = onClickListener2;
        return this;
    }

    public final EasyFloat dragEnable(boolean dragEnable2) {
        dragEnable = dragEnable2;
        FloatingView floatingView = FloatingView.get();
        Intrinsics.checkNotNullExpressionValue(floatingView, "FloatingView.get()");
        FloatingMagnetView view = floatingView.getView();
        if (view != null) {
            view.updateDragState(dragEnable2);
        }
        return this;
    }

    public final boolean isDragEnable() {
        return dragEnable;
    }

    public final EasyFloat setAutoMoveToEdge(boolean autoMoveToEdge2) {
        autoMoveToEdge = autoMoveToEdge2;
        FloatingView floatingView = FloatingView.get();
        Intrinsics.checkNotNullExpressionValue(floatingView, "FloatingView.get()");
        FloatingMagnetView view = floatingView.getView();
        if (view != null) {
            view.setAutoMoveToEdge(autoMoveToEdge2);
        }
        return this;
    }

    public final boolean isAutoMoveToEdge() {
        return autoMoveToEdge;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (isActivityInValid(activity)) {
            return;
        }
        initShow(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        isActivityInValid(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (isActivityInValid(activity)) {
            return;
        }
        FloatingView.get().detach(activity);
    }

    private final boolean isActivityInValid(Activity activity) {
        return blackList.contains(activity.getClass());
    }

    private final FrameLayout.LayoutParams getFloatingLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        layoutParams.setMargins(0, layoutParams.topMargin, layoutParams.rightMargin, 500);
        return layoutParams;
    }

    private final void initShow(Activity activity) {
        FloatingView floatingView = FloatingView.get();
        Intrinsics.checkNotNullExpressionValue(floatingView, "FloatingView.get()");
        if (floatingView.getView() == null) {
            FloatingView.get().customView(new EnFloatingView(activity, mLayout));
        }
        FloatingView floatingView2 = FloatingView.get();
        floatingView2.layoutParams(mLayoutParams);
        floatingView2.attach(activity);
        floatingView2.dragEnable(dragEnable);
        floatingView2.listener(new MagnetViewListener() { // from class: com.zj.easyfloat.EasyFloat$initShow$1$1$1
            @Override // com.zj.easyfloat.floatingview.MagnetViewListener
            public void onRemove(FloatingMagnetView magnetView) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(magnetView, "magnetView");
                EasyFloat easyFloat = EasyFloat.INSTANCE;
                function1 = EasyFloat.onRemoveListener;
                if (function1 != null) {
                }
            }

            @Override // com.zj.easyfloat.floatingview.MagnetViewListener
            public void onClick(FloatingMagnetView magnetView) {
                Function1 function1;
                Intrinsics.checkNotNullParameter(magnetView, "magnetView");
                EasyFloat easyFloat = EasyFloat.INSTANCE;
                function1 = EasyFloat.onClickListener;
                if (function1 != null) {
                }
            }
        });
    }

    public final void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        initShow(activity);
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    public final void dismiss(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FloatingView.get().remove();
        FloatingView.get().detach(activity);
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }
}
