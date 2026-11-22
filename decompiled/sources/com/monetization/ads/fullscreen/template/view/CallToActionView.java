package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.x42;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/monetization/ads/fullscreen/template/view/CallToActionView;", "Landroid/widget/Button;", "", "text", "Landroid/widget/TextView$BufferType;", "type", "", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class CallToActionView extends Button {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f12681a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallToActionView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private static Drawable a(Context context, int i) {
        return ContextCompat.getDrawable(context, i);
    }

    @Override // android.widget.TextView
    public final CharSequence getText() {
        return this.f12681a;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        if (text instanceof String) {
            this.f12681a = text;
        }
        super.setText(this.f12681a, TextView.BufferType.SPANNABLE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallToActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        setSpannableFactory(Spannable.Factory.getInstance());
        setText(this.f12681a);
    }

    public /* synthetic */ CallToActionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallToActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        Intrinsics.checkNotNullParameter(context, "context");
        int i3 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalIconButton, i, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalIconButton_monetization_internal_icon, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_size, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_offset, 0);
            obtainStyledAttributes.recycle();
            r0 = resourceId != 0 ? a(context, resourceId) : null;
            i2 = dimensionPixelSize2;
            i3 = dimensionPixelSize;
        } else {
            i2 = 0;
        }
        setSpannableFactory(new x42(r0, i3, i2));
    }
}
