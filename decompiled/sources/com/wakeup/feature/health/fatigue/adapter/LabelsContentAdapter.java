package com.wakeup.feature.health.fatigue.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.baidu.platform.comapi.map.MapController;
import com.wakeup.commonui.viewHolder.BaseAdapter;
import com.wakeup.commonui.viewHolder.BaseViewHolder;
import com.wakeup.feature.health.databinding.ItemBreathLabelContentBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LabelsContentAdapter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0014¨\u0006\r"}, d2 = {"Lcom/wakeup/feature/health/fatigue/adapter/LabelsContentAdapter;", "Lcom/wakeup/commonui/viewHolder/BaseAdapter;", "", "Lcom/wakeup/feature/health/databinding/ItemBreathLabelContentBinding;", "labels", "", "<init>", "(Ljava/util/List;)V", "convert", "", "holder", "Lcom/wakeup/commonui/viewHolder/BaseViewHolder;", MapController.ITEM_LAYER_TAG, "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LabelsContentAdapter extends BaseAdapter<String, ItemBreathLabelContentBinding> {
    public static final int $stable = 0;

    /* compiled from: LabelsContentAdapter.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.wakeup.feature.health.fatigue.adapter.LabelsContentAdapter$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, ItemBreathLabelContentBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(3, ItemBreathLabelContentBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/wakeup/feature/health/databinding/ItemBreathLabelContentBinding;", 0);
        }

        public final ItemBreathLabelContentBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ItemBreathLabelContentBinding.inflate(p0, viewGroup, z);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ ItemBreathLabelContentBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelsContentAdapter(List<String> labels) {
        super(AnonymousClass1.INSTANCE, labels);
        Intrinsics.checkNotNullParameter(labels, "labels");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder<ItemBreathLabelContentBinding> holder, String item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.getBinding().tvName.setText(item);
    }
}
