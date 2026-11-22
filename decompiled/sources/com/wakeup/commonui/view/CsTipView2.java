package com.wakeup.commonui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.LayoutCsTipBinding;

/* loaded from: classes2.dex */
public class CsTipView2 extends LinearLayout {
    private LayoutCsTipBinding mBinding;

    public CsTipView2(Context context) {
        this(context, null);
    }

    public CsTipView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CsTipView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBinding = LayoutCsTipBinding.inflate(LayoutInflater.from(context), this, true);
        this.mBinding.csTip.setText(context.getString(R.string.heart_des_tip_new));
    }
}
