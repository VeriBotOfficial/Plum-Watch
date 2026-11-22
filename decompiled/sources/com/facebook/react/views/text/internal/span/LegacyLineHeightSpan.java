package com.facebook.react.views.text.internal.span;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyLineHeightSpan.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/views/text/internal/span/LegacyLineHeightSpan;", "Landroid/text/style/LineHeightSpan;", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", "height", "", "<init>", "(F)V", ViewProps.LINE_HEIGHT, "", "getLineHeight", "()I", "chooseHeight", "", "text", "", "start", "end", "spanstartv", "v", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LegacyLineHeightSpan implements LineHeightSpan, ReactSpan {
    private final int lineHeight;

    public LegacyLineHeightSpan(float f) {
        this.lineHeight = (int) Math.ceil(f);
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int v, Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        int i = fm.descent;
        int i2 = this.lineHeight;
        if (i > i2) {
            fm.descent = (int) Math.min(i2, fm.descent);
            fm.bottom = fm.descent;
            fm.ascent = 0;
            fm.top = fm.ascent;
            return;
        }
        if ((-fm.ascent) + fm.descent > this.lineHeight) {
            fm.bottom = fm.descent;
            fm.ascent = (-this.lineHeight) + fm.descent;
            fm.top = fm.ascent;
            return;
        }
        if ((-fm.ascent) + fm.bottom > this.lineHeight) {
            fm.top = fm.ascent;
            fm.bottom = fm.ascent + this.lineHeight;
            return;
        }
        if ((-fm.top) + fm.bottom > this.lineHeight) {
            fm.top = fm.bottom - this.lineHeight;
            return;
        }
        double d = (r2 - ((-fm.top) + fm.bottom)) / 2.0f;
        int ceil = (int) (fm.top - ((float) Math.ceil(d)));
        int floor = (int) (fm.bottom + ((float) Math.floor(d)));
        fm.top = ceil;
        fm.ascent = ceil;
        fm.descent = floor;
        fm.bottom = floor;
    }
}
