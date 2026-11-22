package com.wakeup.howear.sharevm;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.wakeup.common.burypoint.BuryPointPageId;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimpleViewModelFactory.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\b\u001a\u0002H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0016¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/wakeup/howear/sharevm/SimpleViewModelFactory;", "T", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "creator", "Lkotlin/Function0;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", BuryPointPageId.PAGE_ID_PLAN_CREATE, "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SimpleViewModelFactory<T extends ViewModel> implements ViewModelProvider.Factory {
    private final Function0<T> creator;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleViewModelFactory(Function0<? extends T> creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        this.creator = creator;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        T invoke = this.creator.invoke();
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type T of com.wakeup.howear.sharevm.SimpleViewModelFactory.create");
        return invoke;
    }
}
