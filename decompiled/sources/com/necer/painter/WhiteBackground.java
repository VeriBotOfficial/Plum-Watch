package com.necer.painter;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.joda.time.LocalDate;

/* loaded from: classes17.dex */
public class WhiteBackground implements CalendarBackground {
    @Override // com.necer.painter.CalendarBackground
    public Drawable getBackgroundDrawable(LocalDate localDate, int i, int i2) {
        return new Drawable() { // from class: com.necer.painter.WhiteBackground.1
            @Override // android.graphics.drawable.Drawable
            public int getOpacity() {
                return 0;
            }

            @Override // android.graphics.drawable.Drawable
            public void setAlpha(int i3) {
            }

            @Override // android.graphics.drawable.Drawable
            public void setColorFilter(ColorFilter colorFilter) {
            }

            @Override // android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
                canvas.drawColor(-1);
            }
        };
    }
}
