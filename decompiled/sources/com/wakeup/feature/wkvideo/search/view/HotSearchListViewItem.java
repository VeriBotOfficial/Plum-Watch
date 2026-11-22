package com.wakeup.feature.wkvideo.search.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.wakeup.common.network.entity.search.HotSearchInfoBean;
import com.wakeup.feature.wkvideo.databinding.AdapterHotSearchItemBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HotSearchListViewItem.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/wakeup/feature/wkvideo/search/view/HotSearchListViewItem;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mBinding", "Lcom/wakeup/feature/wkvideo/databinding/AdapterHotSearchItemBinding;", "getMBinding", "()Lcom/wakeup/feature/wkvideo/databinding/AdapterHotSearchItemBinding;", "setMBinding", "(Lcom/wakeup/feature/wkvideo/databinding/AdapterHotSearchItemBinding;)V", "mData", "Lcom/wakeup/common/network/entity/search/HotSearchInfoBean;", "getMData", "()Lcom/wakeup/common/network/entity/search/HotSearchInfoBean;", "setMData", "(Lcom/wakeup/common/network/entity/search/HotSearchInfoBean;)V", "setData", "", "data", "Companion", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotSearchListViewItem extends FrameLayout {
    public static final String LABEL_LABEL_BOOM = "boom";
    public static final String LABEL_LABEL_HOT = "hot";
    public static final String LABEL_LABEL_NEW = "new";
    public static final String LABEL_RANK_FIRST = "1";
    public static final String LABEL_RANK_SECOND = "2";
    public static final String LABEL_RANK_THRID = "3";
    private AdapterHotSearchItemBinding mBinding;
    private HotSearchInfoBean mData;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HotSearchListViewItem(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HotSearchListViewItem(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotSearchListViewItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.mBinding = AdapterHotSearchItemBinding.inflate((LayoutInflater) systemService, this, true);
    }

    public final AdapterHotSearchItemBinding getMBinding() {
        return this.mBinding;
    }

    public final void setMBinding(AdapterHotSearchItemBinding adapterHotSearchItemBinding) {
        this.mBinding = adapterHotSearchItemBinding;
    }

    public final HotSearchInfoBean getMData() {
        return this.mData;
    }

    public final void setMData(HotSearchInfoBean hotSearchInfoBean) {
        this.mData = hotSearchInfoBean;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setData(com.wakeup.common.network.entity.search.HotSearchInfoBean r4) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.wkvideo.search.view.HotSearchListViewItem.setData(com.wakeup.common.network.entity.search.HotSearchInfoBean):void");
    }
}
