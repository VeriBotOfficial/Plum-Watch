package com.necer.painter;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.necer.drawable.TextDrawable;
import org.joda.time.LocalDate;

/* loaded from: classes17.dex */
public class NumBackground implements CalendarBackground {
    private int mAlphaColor;
    private TextDrawable mTextDrawable;

    public NumBackground(float f, int i, int i2) {
        this.mAlphaColor = i2;
        TextDrawable textDrawable = new TextDrawable(f);
        this.mTextDrawable = textDrawable;
        textDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    @Override // com.necer.painter.CalendarBackground
    public Drawable getBackgroundDrawable(LocalDate localDate, int i, int i2) {
        this.mTextDrawable.setAlpha((this.mAlphaColor * i) / i2);
        this.mTextDrawable.setText(String.valueOf(localDate.getMonthOfYear()));
        return this.mTextDrawable;
    }
}
