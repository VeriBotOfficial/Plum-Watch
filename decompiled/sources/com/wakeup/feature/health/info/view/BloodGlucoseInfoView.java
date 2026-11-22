package com.wakeup.feature.health.info.view;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wakeup.commonui.R;
import com.wakeup.feature.health.databinding.LayoutBloodGlucoseInfoBinding;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: BloodGlucoseInfoView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/wakeup/feature/health/info/view/BloodGlucoseInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BloodGlucoseInfoView extends LinearLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BloodGlucoseInfoView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BloodGlucoseInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BloodGlucoseInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodGlucoseInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutBloodGlucoseInfoBinding inflate = LayoutBloodGlucoseInfoBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        addView(inflate.getRoot(), new LinearLayout.LayoutParams(-1, -1));
        TextView textView = inflate.llBsReference.llFastingBloodSugar.tvBsInstructionsType;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s%s ", Arrays.copyOf(new Object[]{context.getString(R.string.blood_sugar_fasting), "/"}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format("%s%s ", Arrays.copyOf(new Object[]{context.getString(R.string.tip_21_0427_25), "/"}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        textView.setText(format + format2 + context.getString(R.string.tip_21_0427_27));
        TextView textView2 = inflate.llBsReference.llFastingBloodSugar.tv1;
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String format3 = String.format("%s%s ", Arrays.copyOf(new Object[]{context.getString(R.string.tip_21_0427_19), "< 4.4"}, 2));
        Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
        textView2.setText(format3);
        TextView textView3 = inflate.llBsReference.llFastingBloodSugar.tv3;
        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
        String format4 = String.format("%s%s%s", Arrays.copyOf(new Object[]{"4.4≤", context.getString(R.string.tip_22_0112_11), "≤7"}, 3));
        Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
        textView3.setText(format4);
        TextView textView4 = inflate.llBsReference.llFastingBloodSugar.tv5;
        StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
        String format5 = String.format("%s%s ", Arrays.copyOf(new Object[]{context.getString(R.string.tip_21_0427_19), ">7"}, 2));
        Intrinsics.checkNotNullExpressionValue(format5, "format(...)");
        textView4.setText(format5);
        inflate.llBsReference.llFastingBloodSugar.tv2.setText(context.getString(R.string.tiwen_piandi));
        inflate.llBsReference.llFastingBloodSugar.tv4.setText(context.getString(R.string.tiwen_zhengchang));
        inflate.llBsReference.llFastingBloodSugar.tv6.setText(context.getString(R.string.mianyili_piangao));
        TextView textView5 = inflate.llBsReference.llOtherBloodSugar.tvBsInstructionsType;
        StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
        String format6 = String.format("%s%s ", Arrays.copyOf(new Object[]{context.getString(R.string.tip_21_0427_24), "/"}, 2));
        Intrinsics.checkNotNullExpressionValue(format6, "format(...)");
        StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
        String format7 = String.format("%s%s ", Arrays.copyOf(new Object[]{context.getString(R.string.tip_21_0427_26), "/"}, 2));
        Intrinsics.checkNotNullExpressionValue(format7, "format(...)");
        StringCompanionObject stringCompanionObject8 = StringCompanionObject.INSTANCE;
        String format8 = String.format("%s%s ", Arrays.copyOf(new Object[]{context.getString(R.string.tip_21_0427_28), "/"}, 2));
        Intrinsics.checkNotNullExpressionValue(format8, "format(...)");
        StringCompanionObject stringCompanionObject9 = StringCompanionObject.INSTANCE;
        String format9 = String.format("%s%s ", Arrays.copyOf(new Object[]{context.getString(R.string.blood_sugar_bedtime), "/"}, 2));
        Intrinsics.checkNotNullExpressionValue(format9, "format(...)");
        StringCompanionObject stringCompanionObject10 = StringCompanionObject.INSTANCE;
        String format10 = String.format("%s%s ", Arrays.copyOf(new Object[]{context.getString(R.string.blood_sugar_at_night), "/"}, 2));
        Intrinsics.checkNotNullExpressionValue(format10, "format(...)");
        textView5.setText(format6 + format7 + format8 + format9 + format10 + context.getString(R.string.blood_sugar_random));
        TextView textView6 = inflate.llBsReference.llOtherBloodSugar.tv1;
        StringCompanionObject stringCompanionObject11 = StringCompanionObject.INSTANCE;
        String format11 = String.format("%s%s ", Arrays.copyOf(new Object[]{context.getString(R.string.tip_21_0427_19), "<4.4"}, 2));
        Intrinsics.checkNotNullExpressionValue(format11, "format(...)");
        textView6.setText(format11);
        TextView textView7 = inflate.llBsReference.llOtherBloodSugar.tv3;
        StringCompanionObject stringCompanionObject12 = StringCompanionObject.INSTANCE;
        String format12 = String.format("%s%s%s", Arrays.copyOf(new Object[]{"4.4≤", context.getString(R.string.tip_21_0427_19), "≤10"}, 3));
        Intrinsics.checkNotNullExpressionValue(format12, "format(...)");
        textView7.setText(format12);
        TextView textView8 = inflate.llBsReference.llOtherBloodSugar.tv5;
        StringCompanionObject stringCompanionObject13 = StringCompanionObject.INSTANCE;
        String format13 = String.format("%s%s ", Arrays.copyOf(new Object[]{context.getString(R.string.tip_21_0427_19), ">10"}, 2));
        Intrinsics.checkNotNullExpressionValue(format13, "format(...)");
        textView8.setText(format13);
        inflate.llBsReference.llOtherBloodSugar.tv2.setText(context.getString(R.string.tiwen_piandi));
        inflate.llBsReference.llOtherBloodSugar.tv4.setText(context.getString(R.string.tiwen_zhengchang));
        inflate.llBsReference.llOtherBloodSugar.tv6.setText(context.getString(R.string.mianyili_piangao));
        TextView textView9 = inflate.llBsReference.tvHint;
        String string = context.getString(R.string.blood_sugar_illustrate_hint);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        textView9.setText(Html.fromHtml("<big> <font color=\"#FF4848\">*</font> </big>" + StringsKt.replace$default(string, "\n", "<br>", false, 4, (Object) null)));
    }
}
