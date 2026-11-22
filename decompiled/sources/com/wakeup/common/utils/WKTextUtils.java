package com.wakeup.common.utils;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* loaded from: classes2.dex */
public class WKTextUtils {
    public static void toggleEllipsize(final TextView textView, final int maxLines, final String text, final String endText, final int endColor) {
        if (TextUtils.isEmpty(text)) {
            return;
        }
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.wakeup.common.utils.WKTextUtils.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int paddingLeft = textView.getPaddingLeft();
                int paddingRight = textView.getPaddingRight();
                TextPaint paint = textView.getPaint();
                CharSequence ellipsize = TextUtils.ellipsize(text, paint, (((textView.getWidth() - paddingLeft) - paddingRight) * maxLines) - (paint.measureText(endText) + 12.0f), TextUtils.TruncateAt.END);
                if (ellipsize.length() < text.length()) {
                    String str = ((Object) ellipsize) + endText;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(endColor), str.length() - endText.length(), str.length(), 17);
                    textView.setText(spannableStringBuilder);
                } else {
                    textView.setText(text);
                }
                textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }
}
