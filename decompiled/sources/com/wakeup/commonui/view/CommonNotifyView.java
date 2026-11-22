package com.wakeup.commonui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.LayoutCommonNotifyBinding;

/* loaded from: classes2.dex */
public class CommonNotifyView extends FrameLayout {
    private final LayoutCommonNotifyBinding mBinding;
    private BtnClickListener mClickListener;

    public static abstract class BtnClickListener {
        public void onCloseClick() {
        }

        public void onConfirmClick() {
        }

        public void onIgnoreClick() {
        }
    }

    public CommonNotifyView(Context context) {
        this(context, null);
    }

    public CommonNotifyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CommonNotifyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutCommonNotifyBinding inflate = LayoutCommonNotifyBinding.inflate(LayoutInflater.from(context), this, true);
        this.mBinding = inflate;
        inflate.tvIgnore.setText(context.getString(R.string.btn_ignore));
        inflate.tvClose.setText(context.getString(R.string.btn_no_remind));
        inflate.tvConfirm.setText(context.getString(R.string.btn_setting));
        inflate.tvIgnore.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.view.CommonNotifyView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonNotifyView.this.lambda$new$0(view);
            }
        });
        inflate.tvClose.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.view.CommonNotifyView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonNotifyView.this.lambda$new$1(view);
            }
        });
        inflate.tvConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.view.CommonNotifyView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonNotifyView.this.lambda$new$2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        setVisibility(8);
        BtnClickListener btnClickListener = this.mClickListener;
        if (btnClickListener != null) {
            btnClickListener.onIgnoreClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view) {
        setVisibility(8);
        BtnClickListener btnClickListener = this.mClickListener;
        if (btnClickListener != null) {
            btnClickListener.onCloseClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(View view) {
        BtnClickListener btnClickListener = this.mClickListener;
        if (btnClickListener != null) {
            btnClickListener.onConfirmClick();
        }
    }

    public CommonNotifyView setTitle(String str) {
        this.mBinding.tvTitle.setText(str);
        return this;
    }

    public CommonNotifyView setTitle(int i) {
        this.mBinding.tvTitle.setText(i);
        return this;
    }

    public CommonNotifyView setContent(String str) {
        this.mBinding.tvContent.setText(str);
        return this;
    }

    public CommonNotifyView setContent(int i) {
        this.mBinding.tvContent.setText(i);
        return this;
    }

    public CommonNotifyView setConfirm(String str) {
        this.mBinding.tvConfirm.setText(str);
        return this;
    }

    public CommonNotifyView setConfirm(int i) {
        this.mBinding.tvConfirm.setText(i);
        return this;
    }

    public CommonNotifyView setBtnClickListener(BtnClickListener btnClickListener) {
        this.mClickListener = btnClickListener;
        return this;
    }

    public CommonNotifyView setSportNotifyType() {
        this.mBinding.tvIgnore.setVisibility(8);
        this.mBinding.tvHint.setVisibility(8);
        this.mBinding.tvContent.setVisibility(0);
        return this;
    }

    public CommonNotifyView setContentHint(String str) {
        this.mBinding.tvHint.setText(str);
        return this;
    }

    public CommonNotifyView setContentHint(int i) {
        this.mBinding.tvHint.setText(i);
        return this;
    }

    public CommonNotifyView setContentVisible(int i) {
        this.mBinding.tvContent.setVisibility(i);
        return this;
    }

    public CommonNotifyView setContentHintSize() {
        this.mBinding.tvHint.setTextSize(12.0f);
        return this;
    }
}
