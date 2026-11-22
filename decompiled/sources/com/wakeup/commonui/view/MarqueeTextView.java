package com.wakeup.commonui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public class MarqueeTextView extends AppCompatTextView {
    private int marqueeNum;

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    public MarqueeTextView(Context context) {
        super(context);
        this.marqueeNum = -1;
        setAttr();
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.marqueeNum = -1;
        setAttr();
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.marqueeNum = -1;
        setAttr();
    }

    public void setMarqueeNum(int i) {
        this.marqueeNum = i;
    }

    private void setAttr() {
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setMarqueeRepeatLimit(this.marqueeNum);
        setSingleLine(true);
    }
}
