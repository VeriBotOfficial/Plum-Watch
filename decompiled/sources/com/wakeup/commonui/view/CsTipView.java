package com.wakeup.commonui.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.LayoutCsTipBinding;

/* loaded from: classes2.dex */
public class CsTipView extends LinearLayout {
    private LayoutCsTipBinding mBinding;

    public CsTipView(Context context) {
        this(context, null);
    }

    public CsTipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CsTipView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBinding = LayoutCsTipBinding.inflate(LayoutInflater.from(context), this, true);
        String string = context.getString(R.string.heart_des_tip);
        String string2 = context.getString(R.string.heart_des_tip2);
        String str = string + string2;
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) str);
        int indexOf = str.indexOf(string2);
        int length = string2.length() + indexOf;
        append.setSpan(new ClickableSpan() { // from class: com.wakeup.commonui.view.CsTipView.1
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName(context, "com.wakeup.howear.view.app.help.EditHelpActivity");
                context.startActivity(intent);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, indexOf, length, 17);
        append.setSpan(new ForegroundColorSpan(Color.parseColor("#1C80C5")) { // from class: com.wakeup.commonui.view.CsTipView.2
        }, indexOf, length, 33);
        this.mBinding.csTip.setMovementMethod(LinkMovementMethod.getInstance());
        this.mBinding.csTip.setText(append);
    }
}
