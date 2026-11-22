package com.wakeup.commonui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.wakeup.commonui.databinding.LayoutMyTitleBarBinding;

/* loaded from: classes2.dex */
public class MyTitleBar extends RelativeLayout {
    private int backImage;
    private OnTopBarCallBack callBack;
    private ImageView ivBack;
    private ImageView ivMenu;
    private ImageView ivRadio;
    private LayoutMyTitleBarBinding mBinding;
    private int menuExpandImage;
    private int menuImage;
    private final float menuImgSize;
    private String menuText;
    private final int menuTextColor;
    private final float menuTextSize;
    private int radioExpandImage;
    private String radioText;
    private int statusBarHeight;
    private int titleColor;
    private final float titleSize;
    private String titleText;
    private final TextView tvMenu;
    private final TextView tvRadio;
    private int tvRadioColor;
    private final TextView tvTitle;

    public interface OnTopBarCallBack {
        void onClickBack();

        default void onClickExpand() {
        }

        default void onClickMenu() {
        }
    }

    public void setStatusBarColor(int i) {
    }

    public MyTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.MyTitleBar, 0, 0);
        this.backImage = obtainStyledAttributes.getResourceId(R.styleable.MyTitleBar_backImage, 0);
        this.titleText = obtainStyledAttributes.getString(R.styleable.MyTitleBar_titleText);
        this.titleColor = obtainStyledAttributes.getColor(R.styleable.MyTitleBar_titleColor, 0);
        this.radioText = obtainStyledAttributes.getString(R.styleable.MyTitleBar_radioText);
        this.tvRadioColor = obtainStyledAttributes.getColor(R.styleable.MyTitleBar_radioTextColor, 0);
        this.radioExpandImage = obtainStyledAttributes.getResourceId(R.styleable.MyTitleBar_radioExpandImage, 0);
        float dimension = obtainStyledAttributes.getDimension(R.styleable.MyTitleBar_titleSize, 20.0f);
        this.titleSize = dimension;
        this.menuText = obtainStyledAttributes.getString(R.styleable.MyTitleBar_menuText);
        int color = obtainStyledAttributes.getColor(R.styleable.MyTitleBar_menuTextColor, getResources().getColor(R.color.color_333333));
        this.menuTextColor = color;
        float dimension2 = obtainStyledAttributes.getDimension(R.styleable.MyTitleBar_menuTextSize, 17.0f);
        this.menuTextSize = dimension2;
        this.menuImage = obtainStyledAttributes.getResourceId(R.styleable.MyTitleBar_menuImage, 0);
        float dimension3 = obtainStyledAttributes.getDimension(R.styleable.MyTitleBar_menuImageSize, 0.0f);
        this.menuImgSize = dimension3;
        this.menuExpandImage = obtainStyledAttributes.getResourceId(R.styleable.MyTitleBar_menuExpandImage, 0);
        obtainStyledAttributes.recycle();
        setPadding(0, getStatusBarHeight(), 0, 0);
        LayoutMyTitleBarBinding inflate = LayoutMyTitleBarBinding.inflate(LayoutInflater.from(context), this, true);
        this.mBinding = inflate;
        AppCompatImageView appCompatImageView = inflate.backImg;
        this.ivBack = appCompatImageView;
        int i = this.backImage;
        if (i != 0) {
            appCompatImageView.setImageResource(i);
        }
        this.mBinding.backImg.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.MyTitleBar$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyTitleBar.this.lambda$new$0(view);
            }
        });
        AppCompatTextView appCompatTextView = this.mBinding.title;
        this.tvTitle = appCompatTextView;
        appCompatTextView.setText(this.titleText);
        int i2 = this.titleColor;
        if (i2 != 0) {
            appCompatTextView.setTextColor(i2);
        }
        appCompatTextView.setTextSize(dimension);
        AppCompatTextView appCompatTextView2 = this.mBinding.tvRadioExpand;
        this.tvRadio = appCompatTextView2;
        appCompatTextView2.setText(this.radioText);
        int i3 = this.tvRadioColor;
        if (i3 != 0) {
            appCompatTextView2.setTextColor(i3);
        }
        AppCompatImageView appCompatImageView2 = this.mBinding.ivRadioExpand;
        this.ivRadio = appCompatImageView2;
        int i4 = this.radioExpandImage;
        if (i4 != 0) {
            appCompatImageView2.setBackgroundResource(i4);
        }
        this.mBinding.layoutRadioExpand.setVisibility(this.radioExpandImage != 0 ? 0 : 8);
        AppCompatTextView appCompatTextView3 = this.mBinding.menuText;
        this.tvMenu = appCompatTextView3;
        appCompatTextView3.setText(this.menuText);
        appCompatTextView3.setTextColor(color);
        appCompatTextView3.setTextSize(dimension2);
        appCompatTextView3.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.MyTitleBar$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyTitleBar.this.lambda$new$1(view);
            }
        });
        appCompatTextView3.setVisibility(!TextUtils.isEmpty(this.menuText) ? 0 : 8);
        AppCompatImageView appCompatImageView3 = this.mBinding.menuImg;
        this.ivMenu = appCompatImageView3;
        if (this.menuImage != 0) {
            if (dimension3 != 0.0f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) appCompatImageView3.getLayoutParams();
                layoutParams.height = (int) dimension3;
                layoutParams.width = (int) dimension3;
                this.ivMenu.setLayoutParams(layoutParams);
            }
            this.ivMenu.setBackgroundResource(this.menuImage);
        }
        this.mBinding.layoutMenuImg.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.MyTitleBar$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyTitleBar.this.lambda$new$2(view);
            }
        });
        this.mBinding.layoutRadioExpand.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.MyTitleBar$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyTitleBar.this.lambda$new$3(view);
            }
        });
        this.mBinding.layoutMenuImg.setVisibility(this.menuImage != 0 ? 0 : 8);
        if (this.menuExpandImage != 0) {
            this.mBinding.menuImgExpand.setBackgroundResource(this.menuExpandImage);
        }
        this.mBinding.layoutMenuExpand.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.MyTitleBar$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyTitleBar.this.lambda$new$4(view);
            }
        });
        this.mBinding.layoutMenuExpand.setVisibility(this.menuExpandImage == 0 ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        OnTopBarCallBack onTopBarCallBack = this.callBack;
        if (onTopBarCallBack != null) {
            onTopBarCallBack.onClickBack();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view) {
        OnTopBarCallBack onTopBarCallBack = this.callBack;
        if (onTopBarCallBack != null) {
            onTopBarCallBack.onClickMenu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(View view) {
        OnTopBarCallBack onTopBarCallBack = this.callBack;
        if (onTopBarCallBack != null) {
            onTopBarCallBack.onClickMenu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(View view) {
        OnTopBarCallBack onTopBarCallBack = this.callBack;
        if (onTopBarCallBack != null) {
            onTopBarCallBack.onClickMenu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(View view) {
        OnTopBarCallBack onTopBarCallBack = this.callBack;
        if (onTopBarCallBack != null) {
            onTopBarCallBack.onClickExpand();
        }
    }

    public void setCallBack(OnTopBarCallBack onTopBarCallBack) {
        this.callBack = onTopBarCallBack;
    }

    public ImageView getIvBack() {
        return this.ivBack;
    }

    public TextView getTvTitle() {
        return this.tvTitle;
    }

    public TextView getTvRadio() {
        return this.tvRadio;
    }

    public TextView getTvMenu() {
        return this.tvMenu;
    }

    public ImageView getIvMenu() {
        return this.ivMenu;
    }

    public ImageView getIvRadio() {
        return this.ivRadio;
    }

    public void setTitleColor(int i) {
        this.titleColor = i;
        this.mBinding.title.setTextColor(this.titleColor);
    }

    public void setIvBack(Drawable drawable) {
        this.mBinding.backImg.setImageDrawable(drawable);
    }

    public void setIvMenu(int i) {
        this.menuImage = i;
        this.mBinding.menuImg.setBackgroundResource(i);
        this.mBinding.menuImg.setVisibility(i == 0 ? 8 : 0);
        this.mBinding.layoutMenuImg.setVisibility(i != 0 ? 0 : 8);
    }

    public void setMenuExpandImage(int i) {
        this.menuExpandImage = i;
        this.mBinding.menuImgExpand.setBackgroundResource(this.menuExpandImage);
        this.mBinding.menuImgExpand.setVisibility(this.menuExpandImage == 0 ? 8 : 0);
    }

    public void setTitle(String str) {
        getTvTitle().setText(str);
    }

    public void setTitleDrawableLeftImg(int i) {
        getTvTitle().setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    public void setbackText(String str) {
        if (TextUtils.isEmpty(str)) {
            getIvBack().setVisibility(0);
            this.mBinding.backTxt.setVisibility(8);
            this.mBinding.backTxt.setText("");
            this.mBinding.backTxt.setOnClickListener(null);
            return;
        }
        getIvBack().setVisibility(4);
        this.mBinding.backTxt.setVisibility(0);
        this.mBinding.backTxt.setText(str);
        this.mBinding.backTxt.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.MyTitleBar$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyTitleBar.this.lambda$setbackText$5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setbackText$5(View view) {
        OnTopBarCallBack onTopBarCallBack = this.callBack;
        if (onTopBarCallBack != null) {
            onTopBarCallBack.onClickBack();
        }
    }

    public void setTitleText(String str) {
        this.titleText = str;
        getTvTitle().setText(this.titleText);
    }

    public void setTextStyleBold() {
        getTvTitle().setTypeface(getTvTitle().getTypeface(), 1);
    }

    public void setMenuText(String str) {
        this.menuText = str;
        getTvMenu().setText(this.menuText);
        getTvMenu().setVisibility(TextUtils.isEmpty(this.menuText) ? 8 : 0);
    }

    public void isShowMenu(boolean z) {
        this.ivMenu.setVisibility(z ? 0 : 4);
        this.tvMenu.setVisibility(z ? 0 : 4);
        this.mBinding.layoutMenuImg.setVisibility(z ? 0 : 4);
    }

    public void isShowMenuOrGone(boolean z) {
        this.ivMenu.setVisibility(z ? 0 : 8);
        this.tvMenu.setVisibility(z ? 0 : 8);
        this.mBinding.layoutMenuImg.setVisibility(z ? 0 : 8);
    }

    public void isShowMenuExpand(boolean z) {
        this.mBinding.layoutMenuExpand.setVisibility(z ? 0 : 4);
    }

    private int getStatusBarHeight() {
        if (this.statusBarHeight == 0) {
            Resources resources = getResources();
            this.statusBarHeight = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        }
        return this.statusBarHeight;
    }
}
