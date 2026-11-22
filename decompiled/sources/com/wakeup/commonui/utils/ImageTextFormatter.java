package com.wakeup.commonui.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import com.anythink.expressad.foundation.h.k;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: ImageTextFormatter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0002\u0010\u000eJM\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0018"}, d2 = {"Lcom/wakeup/commonui/utils/ImageTextFormatter;", "", "<init>", "()V", "formatWithIcon", "", "context", "Landroid/content/Context;", "textResId", "", "iconResId", "iconSize", ViewProps.MARGIN_START, ViewProps.MARGIN_END, "(Landroid/content/Context;IILjava/lang/Integer;II)Ljava/lang/CharSequence;", "formatWithFormatPlaceholder", "text", "", "isRtl", "", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Integer;IIZ)Ljava/lang/CharSequence;", "getDefaultIconSize", "isRtlLocale", "CenteredImageSpan", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageTextFormatter {
    public static final ImageTextFormatter INSTANCE = new ImageTextFormatter();

    private ImageTextFormatter() {
    }

    public static /* synthetic */ CharSequence formatWithIcon$default(ImageTextFormatter imageTextFormatter, Context context, int i, int i2, Integer num, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            num = null;
        }
        return imageTextFormatter.formatWithIcon(context, i, i2, num, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4);
    }

    public final CharSequence formatWithIcon(Context context, int textResId, int iconResId, Integer iconSize, int marginStart, int marginEnd) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(textResId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = string;
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "%1$s", false, 2, (Object) null) ? formatWithFormatPlaceholder(context, string, iconResId, iconSize, marginStart, marginEnd, isRtlLocale(context)) : str;
    }

    static /* synthetic */ CharSequence formatWithFormatPlaceholder$default(ImageTextFormatter imageTextFormatter, Context context, String str, int i, Integer num, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            i2 = 0;
        }
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        return imageTextFormatter.formatWithFormatPlaceholder(context, str, i, num, i2, i3, z);
    }

    private final CharSequence formatWithFormatPlaceholder(Context context, String text, int iconResId, Integer iconSize, int marginStart, int marginEnd, boolean isRtl) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(text, Arrays.copyOf(new Object[]{"\u200b"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String str = format;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, "\u200b", 0, false, 6, (Object) null);
        if (indexOf$default < 0) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        Drawable drawable = ContextCompat.getDrawable(context, iconResId);
        if (drawable == null) {
            return spannableString;
        }
        int intValue = iconSize != null ? iconSize.intValue() : getDefaultIconSize(context);
        if (isRtl) {
            drawable.setAutoMirrored(true);
        }
        drawable.setBounds(0, 0, intValue, intValue);
        spannableString.setSpan(new CenteredImageSpan(drawable, marginStart, marginEnd), indexOf$default, indexOf$default + 1, 33);
        return spannableString;
    }

    /* compiled from: ImageTextFormatter.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016JP\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/wakeup/commonui/utils/ImageTextFormatter$CenteredImageSpan;", "Landroid/text/style/ImageSpan;", k.c, "Landroid/graphics/drawable/Drawable;", ViewProps.MARGIN_START, "", ViewProps.MARGIN_END, "<init>", "(Landroid/graphics/drawable/Drawable;II)V", "getSize", "paint", "Landroid/graphics/Paint;", "text", "", "start", "end", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "", "top", "y", "bottom", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class CenteredImageSpan extends ImageSpan {
        private final int marginEnd;
        private final int marginStart;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CenteredImageSpan(Drawable drawable, int i, int i2) {
            super(drawable, 2);
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            this.marginStart = i;
            this.marginEnd = i2;
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
            Intrinsics.checkNotNullParameter(paint, "paint");
            Intrinsics.checkNotNullParameter(text, "text");
            return super.getSize(paint, text, start, end, fm) + this.marginStart + this.marginEnd;
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top2, int y, int bottom, Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(paint, "paint");
            Drawable drawable = getDrawable();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i = ((((fontMetricsInt.descent + y) + y) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
            canvas.save();
            canvas.translate(x + this.marginStart, i);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    private final int getDefaultIconSize(Context context) {
        return (int) TypedValue.applyDimension(2, 18.0f, context.getResources().getDisplayMetrics());
    }

    private final boolean isRtlLocale(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
