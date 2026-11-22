package com.wakeup.feature.health.info.view;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wakeup.commonui.R;
import com.wakeup.feature.health.databinding.LayoutHeartInfoBinding;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: HeartInfoView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/wakeup/feature/health/info/view/HeartInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartInfoView extends LinearLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeartInfoView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeartInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HeartInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeartInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutHeartInfoBinding inflate = LayoutHeartInfoBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        addView(inflate.getRoot(), new LinearLayout.LayoutParams(-1, -1));
        TextView textView = inflate.tvIdealHeartRateLow;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s%s", Arrays.copyOf(new Object[]{55, context.getString(R.string.qinyou_cifenzhong)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView.setText(format);
        TextView textView2 = inflate.tvIdealHeartRateUp;
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format("%s%s", Arrays.copyOf(new Object[]{70, context.getString(R.string.qinyou_cifenzhong)}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        textView2.setText(format2);
        TextView textView3 = inflate.tvNormalHrLow;
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String format3 = String.format("%s%s", Arrays.copyOf(new Object[]{60, context.getString(R.string.qinyou_cifenzhong)}, 2));
        Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
        textView3.setText(format3);
        TextView textView4 = inflate.tvNormalHrUp;
        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
        String format4 = String.format("%s%s", Arrays.copyOf(new Object[]{100, context.getString(R.string.qinyou_cifenzhong)}, 2));
        Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
        textView4.setText(format4);
        TextView textView5 = inflate.tvHrFastLow;
        StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
        String format5 = String.format("%s%s", Arrays.copyOf(new Object[]{100, context.getString(R.string.qinyou_cifenzhong)}, 2));
        Intrinsics.checkNotNullExpressionValue(format5, "format(...)");
        textView5.setText(format5);
        TextView textView6 = inflate.tvHrFastUp;
        StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
        String format6 = String.format("%s%s", Arrays.copyOf(new Object[]{160, context.getString(R.string.qinyou_cifenzhong)}, 2));
        Intrinsics.checkNotNullExpressionValue(format6, "format(...)");
        textView6.setText(format6);
        TextView textView7 = inflate.tvHrSlowLow;
        StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
        String format7 = String.format("%s%s", Arrays.copyOf(new Object[]{45, context.getString(R.string.qinyou_cifenzhong)}, 2));
        Intrinsics.checkNotNullExpressionValue(format7, "format(...)");
        textView7.setText(format7);
        TextView textView8 = inflate.tvHrSlowUp;
        StringCompanionObject stringCompanionObject8 = StringCompanionObject.INSTANCE;
        String format8 = String.format("%s%s", Arrays.copyOf(new Object[]{60, context.getString(R.string.qinyou_cifenzhong)}, 2));
        Intrinsics.checkNotNullExpressionValue(format8, "format(...)");
        textView8.setText(format8);
        TextView textView9 = inflate.tvHrHintOne;
        String string = context.getString(R.string.heart_rate_illustrate_hint_one);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        textView9.setText(Html.fromHtml("<big> <font color=\"#FF4848\">*</font> </big>" + StringsKt.replace$default(string, "\n", "<br>", false, 4, (Object) null)));
        TextView textView10 = inflate.tvHrHintTwo;
        String string2 = context.getString(R.string.heart_rate_illustrate_hint_two);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        textView10.setText(Html.fromHtml("<big> <font color=\"#FF4848\">*</font> </big>" + StringsKt.replace$default(string2, "\n", "<br>", false, 4, (Object) null)));
    }
}
