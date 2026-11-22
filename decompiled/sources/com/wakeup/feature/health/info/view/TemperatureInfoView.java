package com.wakeup.feature.health.info.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wakeup.common.storage.UserDao;
import com.wakeup.commonui.R;
import com.wakeup.commonui.utils.UnitConvertUtils;
import com.wakeup.feature.health.databinding.LayoutTemperatureInfoBinding;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: TemperatureInfoView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/wakeup/feature/health/info/view/TemperatureInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TemperatureInfoView extends LinearLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TemperatureInfoView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TemperatureInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TemperatureInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemperatureInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutTemperatureInfoBinding inflate = LayoutTemperatureInfoBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        addView(inflate.getRoot(), new LinearLayout.LayoutParams(-1, -1));
        String str2 = UserDao.getTemperatureUnit() == 0 ? "℃" : "℉";
        TextView textView = inflate.tvTemIllustrateTitle;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = context.getString(R.string.temperature_desc_1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView.setText(format);
        int temperatureUnit = UserDao.getTemperatureUnit();
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(temperatureUnit != 0 ? UnitConvertUtils.cToF(36.0f) : 36.0f)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        String str3 = format2 + str2;
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String format3 = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(temperatureUnit != 0 ? UnitConvertUtils.cToF(37.0f) : 37.0f)}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
        String str4 = format3 + str2;
        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
        String format4 = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(temperatureUnit == 0 ? 35.0f : UnitConvertUtils.cToF(35.0f))}, 1));
        Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
        String str5 = format4 + str2;
        StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
        String format5 = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(temperatureUnit != 0 ? UnitConvertUtils.cToF(37.3f) : 37.3f)}, 1));
        Intrinsics.checkNotNullExpressionValue(format5, "format(...)");
        String str6 = format5 + str2;
        TextView textView2 = inflate.tvTemHint;
        try {
            str = context.getString(R.string.temperature_illustrate, str3, str4, str5, str6);
        } catch (Exception unused) {
        }
        textView2.setText(str);
        TextView textView3 = inflate.temReferenceLayout.tv1;
        String string2 = context.getString(R.string.tiwen);
        StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
        String format6 = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(temperatureUnit == 0 ? 35.0f : UnitConvertUtils.cToF(35.0f))}, 1));
        Intrinsics.checkNotNullExpressionValue(format6, "format(...)");
        textView3.setText(string2 + " < " + format6 + str2);
        TextView textView4 = inflate.temReferenceLayout.tv3;
        StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
        String format7 = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(temperatureUnit != 0 ? UnitConvertUtils.cToF(35.0f) : 35.0f)}, 1));
        Intrinsics.checkNotNullExpressionValue(format7, "format(...)");
        StringCompanionObject stringCompanionObject8 = StringCompanionObject.INSTANCE;
        String format8 = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(temperatureUnit == 0 ? 37.2f : UnitConvertUtils.cToF(37.2f))}, 1));
        Intrinsics.checkNotNullExpressionValue(format8, "format(...)");
        textView4.setText(format7 + str2 + " - " + format8 + str2);
        TextView textView5 = inflate.temReferenceLayout.tv5;
        String string3 = context.getString(R.string.tiwen);
        StringCompanionObject stringCompanionObject9 = StringCompanionObject.INSTANCE;
        String format9 = String.format(Locale.ENGLISH, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(temperatureUnit != 0 ? UnitConvertUtils.cToF(37.2f) : 37.2f)}, 1));
        Intrinsics.checkNotNullExpressionValue(format9, "format(...)");
        textView5.setText(string3 + " ≥ " + format9 + str2);
    }
}
