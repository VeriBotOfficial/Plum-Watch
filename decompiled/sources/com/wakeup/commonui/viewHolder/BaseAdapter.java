package com.wakeup.commonui.viewHolder;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.chad.library.adapter.base.BaseQuickAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseAdapter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B;\b\u0016\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eB)\b\u0016\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\r\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0013H\u0014R&\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/wakeup/commonui/viewHolder/BaseAdapter;", "T", "VB", "Landroidx/viewbinding/ViewBinding;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/wakeup/commonui/viewHolder/BaseViewHolder;", "inflate", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "data", "", "<init>", "(Lkotlin/jvm/functions/Function3;Ljava/util/List;)V", "(Lkotlin/jvm/functions/Function3;)V", "onItemMove", "", "from", "", "to", "onCreateDefViewHolder", "parent", "viewType", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseAdapter<T, VB extends ViewBinding> extends BaseQuickAdapter<T, BaseViewHolder<VB>> {
    private final Function3<LayoutInflater, ViewGroup, Boolean, VB> inflate;

    public void onItemMove(int from, int to) {
    }

    public /* synthetic */ BaseAdapter(Function3 function3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function3, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseAdapter(Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> inflate, List<T> list) {
        super(0, list);
        Intrinsics.checkNotNullParameter(inflate, "inflate");
        this.inflate = inflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseAdapter(Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> inflate) {
        super(0, null);
        Intrinsics.checkNotNullParameter(inflate, "inflate");
        this.inflate = inflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public BaseViewHolder<VB> onCreateDefViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Function3<LayoutInflater, ViewGroup, Boolean, VB> function3 = this.inflate;
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        return new BaseViewHolder<>(function3.invoke(from, parent, false));
    }
}
