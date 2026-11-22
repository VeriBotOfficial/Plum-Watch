package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.am;

/* loaded from: classes11.dex */
public class WrapRoundImageView extends RoundImageView {
    public WrapRoundImageView(Context context) {
        super(context);
    }

    public WrapRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int[] setBitmapAndResize(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        setImageBitmap(bitmap);
        if (i > 0 && i2 > 0) {
            try {
                int[] a2 = am.a(i, i2, bitmap.getWidth() / bitmap.getHeight());
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = a2[0];
                    layoutParams.height = a2[1];
                    setLayoutParams(layoutParams);
                    return a2;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }
}
