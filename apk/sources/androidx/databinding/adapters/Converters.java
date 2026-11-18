package androidx.databinding.adapters;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes8.dex */
public class Converters {
    public static ColorDrawable convertColorToDrawable(int r1) {
        return new ColorDrawable(r1);
    }

    public static ColorStateList convertColorToColorStateList(int r0) {
        return ColorStateList.valueOf(r0);
    }
}
