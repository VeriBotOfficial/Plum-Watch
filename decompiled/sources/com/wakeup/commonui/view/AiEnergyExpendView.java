package com.wakeup.commonui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.heytap.mcssdk.constant.b;
import com.wakeup.common.network.entity.aipay.AiEnergyRule;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.ViewAiEnergyExpendBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiEnergyExpendView.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/wakeup/commonui/view/AiEnergyExpendView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBinding", "Lcom/wakeup/commonui/databinding/ViewAiEnergyExpendBinding;", "setData", "", b.p, "Lcom/wakeup/common/network/entity/aipay/AiEnergyRule;", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AiEnergyExpendView extends FrameLayout {
    private final ViewAiEnergyExpendBinding mBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AiEnergyExpendView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AiEnergyExpendView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AiEnergyExpendView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiEnergyExpendView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewAiEnergyExpendBinding inflate = ViewAiEnergyExpendBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.mBinding = inflate;
        addView(inflate.getRoot());
    }

    public final void setData(AiEnergyRule rule) {
        String string;
        if (rule == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.mBinding.tvValue.setText(String.valueOf(rule.getChargeUnitPrice()));
        String valueOf = rule.getChargeUnit() > 1 ? String.valueOf(rule.getChargeUnit()) : "";
        int chargeType = rule.getChargeType();
        if (chargeType == 0) {
            string = getContext().getString(R.string.youxiaohuodong_ci);
        } else if (chargeType == 1) {
            string = getContext().getString(R.string.energy_number_unit);
        } else {
            string = getContext().getString(R.string.home_fenzhong);
        }
        Intrinsics.checkNotNull(string);
        this.mBinding.tvUnit.setText("/" + valueOf + string);
    }
}
