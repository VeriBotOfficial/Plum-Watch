package com.wakeup.commonui.dialog;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.aigestudio.wheelpicker.WheelPicker;
import com.aigestudio.wheelpicker.widgets.WheelDatePicker;
import com.alipay.sdk.m.c0.d;
import com.bumptech.glide.Glide;
import com.google.android.material.timepicker.TimeModel;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.DialogCustomCommonBinding;
import com.wakeup.commonui.dialog.CustomCommonDialog;
import com.wakeup.commonui.utils.UIHelper;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: CustomCommonDialog.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/wakeup/commonui/dialog/CustomCommonDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/commonui/databinding/DialogCustomCommonBinding;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "Builder", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomCommonDialog extends BaseDialog<DialogCustomCommonBinding> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCommonDialog(Context context) {
        super(context, R.style.BaseDialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* compiled from: CustomCommonDialog.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000eJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eJ\u0016\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0018J$\u0010 \u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"J\u0016\u0010#\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0018J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(J$\u0010)\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010'\u001a\u0004\u0018\u00010,H\u0007J\u001a\u0010-\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010+H\u0007J0\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u000104JD\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\b\b\u0002\u0010:\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u0010;\u001a\u00020\u000eJ \u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u000e2\b\b\u0002\u0010?\u001a\u00020\u0015J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u000eJ\u001f\u0010A\u001a\u0004\u0018\u0001HB\"\b\b\u0000\u0010B*\u00020\n2\u0006\u0010&\u001a\u00020\u000e¢\u0006\u0002\u0010CJ\b\u0010D\u001a\u0004\u0018\u00010\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/wakeup/commonui/dialog/CustomCommonDialog$Builder;", "", "<init>", "()V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "baseCommonDialog", "Lcom/wakeup/commonui/dialog/CustomCommonDialog;", "view", "Landroid/view/View;", "setMarginBottom", "setGravity", "gravityType", "", "setMargin", "setViewAnim", "resId", "btnResId", "setCancelTouchOut", "isOut", "", d.p, "title", "", "titleColor", "setTitleGravity", "gravity", "addContentViewRoot", "setDialogBackground", "setTextContentTitle", "content", "setEditContent", "callback", "Lcom/wakeup/common/base/BaseCallback;", "setDescribeTextContent", "des", "addViewOnclick", "viewRes", "listener", "Landroid/view/View$OnClickListener;", "addViewSeekBarListener", "seekBarHealthPlanCommonBean", "Lcom/wakeup/commonui/dialog/SeekBarHealthPlanCommonBean;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "addViewSeekBarFlag", "addViewSelectTime", "hourViewId", "minuteViewId", "curHour", "curMinute", "handler", "Landroid/os/Handler;", "addViewSelectDate", "dateViewId", "curYear", "curMonth", "curDay", "visibleYear", "visibleItemCount", "setImageView", "imageResId", "imageId", "isGif", "setGifBg", "findView", "T", "(I)Landroid/view/View;", "builder", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class Builder {
        private CustomCommonDialog baseCommonDialog;
        private Context context;
        private View view;

        private Builder() {
        }

        public Builder(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            CustomCommonDialog customCommonDialog = new CustomCommonDialog(context);
            this.baseCommonDialog = customCommonDialog;
            customCommonDialog.setCancelable(true);
            CustomCommonDialog customCommonDialog2 = this.baseCommonDialog;
            if (customCommonDialog2 != null) {
                customCommonDialog2.setGravity(17);
            }
        }

        public final Builder setMarginBottom() {
            CustomCommonDialog customCommonDialog = this.baseCommonDialog;
            Window window = customCommonDialog != null ? customCommonDialog.getWindow() : null;
            WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
            if (attributes != null) {
                attributes.verticalMargin = 0.02f;
            }
            if (window != null) {
                window.setAttributes(attributes);
            }
            return this;
        }

        public final Builder setGravity(int gravityType) {
            CustomCommonDialog customCommonDialog = this.baseCommonDialog;
            if (customCommonDialog != null) {
                customCommonDialog.setGravity(gravityType);
            }
            return this;
        }

        public final Builder setMargin(int gravityType) {
            CustomCommonDialog customCommonDialog = this.baseCommonDialog;
            if (customCommonDialog != null) {
                customCommonDialog.setGravity(gravityType);
            }
            return this;
        }

        public final Builder setViewAnim(int resId, int btnResId) {
            View view = this.view;
            ImageView imageView = view != null ? (ImageView) view.findViewById(resId) : null;
            View view2 = this.view;
            final LinearLayoutCompat linearLayoutCompat = view2 != null ? (LinearLayoutCompat) view2.findViewById(btnResId) : null;
            if (linearLayoutCompat != null) {
                linearLayoutCompat.setVisibility(8);
            }
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(1500L);
            scaleAnimation.setFillAfter(true);
            if (imageView != null) {
                imageView.startAnimation(scaleAnimation);
            }
            scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.wakeup.commonui.dialog.CustomCommonDialog$Builder$setViewAnim$1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    LinearLayoutCompat linearLayoutCompat2 = LinearLayoutCompat.this;
                    if (linearLayoutCompat2 != null) {
                        linearLayoutCompat2.setVisibility(0);
                    }
                }
            });
            return this;
        }

        public final Builder setCancelTouchOut(boolean isOut) {
            CustomCommonDialog customCommonDialog = this.baseCommonDialog;
            if (customCommonDialog != null) {
                customCommonDialog.setCancelable(isOut);
            }
            return this;
        }

        public static /* synthetic */ Builder setTitle$default(Builder builder, String str, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTitle");
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return builder.setTitle(str, i);
        }

        public final Builder setTitle(String title, int titleColor) {
            DialogCustomCommonBinding mBinding;
            AppCompatTextView appCompatTextView;
            DialogCustomCommonBinding mBinding2;
            AppCompatTextView appCompatTextView2;
            CustomCommonDialog customCommonDialog;
            DialogCustomCommonBinding mBinding3;
            AppCompatTextView appCompatTextView3;
            Intrinsics.checkNotNullParameter(title, "title");
            if (titleColor != 0 && (customCommonDialog = this.baseCommonDialog) != null && (mBinding3 = customCommonDialog.getMBinding()) != null && (appCompatTextView3 = mBinding3.dialogCommonTitle) != null) {
                appCompatTextView3.setTextColor(titleColor);
            }
            CustomCommonDialog customCommonDialog2 = this.baseCommonDialog;
            if (customCommonDialog2 != null && (mBinding2 = customCommonDialog2.getMBinding()) != null && (appCompatTextView2 = mBinding2.dialogCommonTitle) != null) {
                appCompatTextView2.setText(title);
            }
            CustomCommonDialog customCommonDialog3 = this.baseCommonDialog;
            if (customCommonDialog3 != null && (mBinding = customCommonDialog3.getMBinding()) != null && (appCompatTextView = mBinding.dialogCommonTitle) != null) {
                appCompatTextView.setVisibility(0);
            }
            return this;
        }

        public final Builder setTitleGravity(int gravity) {
            DialogCustomCommonBinding mBinding;
            AppCompatTextView appCompatTextView;
            CustomCommonDialog customCommonDialog = this.baseCommonDialog;
            if (customCommonDialog != null && (mBinding = customCommonDialog.getMBinding()) != null && (appCompatTextView = mBinding.dialogCommonTitle) != null) {
                appCompatTextView.setGravity(gravity);
            }
            return this;
        }

        public final Builder addContentViewRoot(int resId) {
            DialogCustomCommonBinding mBinding;
            LinearLayoutCompat linearLayoutCompat;
            DialogCustomCommonBinding mBinding2;
            LinearLayoutCompat linearLayoutCompat2;
            this.view = LayoutInflater.from(this.context).inflate(resId, (ViewGroup) null);
            CustomCommonDialog customCommonDialog = this.baseCommonDialog;
            if (customCommonDialog != null && (mBinding2 = customCommonDialog.getMBinding()) != null && (linearLayoutCompat2 = mBinding2.commonContentArea) != null) {
                linearLayoutCompat2.removeAllViews();
            }
            CustomCommonDialog customCommonDialog2 = this.baseCommonDialog;
            if (customCommonDialog2 != null && (mBinding = customCommonDialog2.getMBinding()) != null && (linearLayoutCompat = mBinding.commonContentArea) != null) {
                linearLayoutCompat.addView(this.view);
            }
            return this;
        }

        public final Builder setDialogBackground(int resId) {
            CustomCommonDialog customCommonDialog;
            DialogCustomCommonBinding mBinding;
            LinearLayout linearLayout;
            Context context = this.context;
            if (context != null && (customCommonDialog = this.baseCommonDialog) != null && (mBinding = customCommonDialog.getMBinding()) != null && (linearLayout = mBinding.dialogCommonLayout) != null) {
                linearLayout.setBackgroundColor(context.getColor(resId));
            }
            return this;
        }

        public final Builder setTextContentTitle(int resId, String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            View view = this.view;
            TextView textView = view != null ? (TextView) view.findViewById(resId) : null;
            String str = content;
            if (!TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setText(str);
                }
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
            return this;
        }

        public final Builder setEditContent(int resId, String content, final BaseCallback<String> callback) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(callback, "callback");
            View view = this.view;
            AppCompatEditText appCompatEditText = view != null ? (AppCompatEditText) view.findViewById(resId) : null;
            String str = content;
            if (!TextUtils.isEmpty(str)) {
                if (appCompatEditText != null) {
                    appCompatEditText.setText(str);
                }
                if (appCompatEditText != null) {
                    appCompatEditText.setVisibility(0);
                }
            }
            if (appCompatEditText != null) {
                appCompatEditText.addTextChangedListener(new TextWatcher() { // from class: com.wakeup.commonui.dialog.CustomCommonDialog$Builder$setEditContent$1
                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                    }

                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable s) {
                        callback.callback(0, String.valueOf(s));
                    }
                });
            }
            return this;
        }

        public final Builder setDescribeTextContent(int resId, String des) {
            Intrinsics.checkNotNullParameter(des, "des");
            View view = this.view;
            TextView textView = view != null ? (TextView) view.findViewById(resId) : null;
            String str = des;
            if (!TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setText(str);
                }
                if (textView != null) {
                    textView.setVisibility(0);
                }
            }
            return this;
        }

        public final Builder addViewOnclick(int viewRes, View.OnClickListener listener) {
            View findViewById;
            View view = this.view;
            if (view != null && (findViewById = view.findViewById(viewRes)) != null) {
                findViewById.setOnClickListener(listener);
            }
            return this;
        }

        public final Builder addViewSeekBarListener(int viewRes, SeekBarHealthPlanCommonBean seekBarHealthPlanCommonBean, SeekBar.OnSeekBarChangeListener listener) {
            View view = this.view;
            AppCompatSeekBar appCompatSeekBar = view != null ? (AppCompatSeekBar) view.findViewById(viewRes) : null;
            if (appCompatSeekBar != null) {
                appCompatSeekBar.setOnSeekBarChangeListener(listener);
            }
            if (seekBarHealthPlanCommonBean != null) {
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setMax(seekBarHealthPlanCommonBean.getMax());
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setMin(seekBarHealthPlanCommonBean.getMin());
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(seekBarHealthPlanCommonBean.getDefaultProgress());
                }
            }
            return this;
        }

        public final Builder addViewSeekBarFlag(int viewRes, SeekBarHealthPlanCommonBean seekBarHealthPlanCommonBean) {
            TextView textView;
            TextView textView2;
            TextView textView3;
            View view = this.view;
            ConstraintLayout constraintLayout = view != null ? (ConstraintLayout) view.findViewById(viewRes) : null;
            if (seekBarHealthPlanCommonBean != null) {
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(seekBarHealthPlanCommonBean.getProgressFlagVisible());
                }
                if (seekBarHealthPlanCommonBean.getProgressFlagVisible() == 0) {
                    if (!(seekBarHealthPlanCommonBean.getProgressFlagResIds().length == 0)) {
                        View view2 = this.view;
                        if (view2 != null && (textView3 = (TextView) view2.findViewById(seekBarHealthPlanCommonBean.getProgressFlagResIds()[0])) != null) {
                            textView3.setText(String.valueOf(seekBarHealthPlanCommonBean.getProgressFlagMin()));
                        }
                        View view3 = this.view;
                        if (view3 != null && (textView2 = (TextView) view3.findViewById(seekBarHealthPlanCommonBean.getProgressFlagResIds()[1])) != null) {
                            textView2.setText(String.valueOf(seekBarHealthPlanCommonBean.getProgressFlagCenter()));
                        }
                        View view4 = this.view;
                        if (view4 != null && (textView = (TextView) view4.findViewById(seekBarHealthPlanCommonBean.getProgressFlagResIds()[2])) != null) {
                            textView.setText(String.valueOf(seekBarHealthPlanCommonBean.getProgressFlagMax()));
                        }
                    }
                }
            }
            return this;
        }

        public final Builder addViewSelectTime(int hourViewId, int minuteViewId, final int curHour, final int curMinute, Handler handler) {
            View view = this.view;
            final WheelPicker wheelPicker = view != null ? (WheelPicker) view.findViewById(hourViewId) : null;
            if (wheelPicker != null) {
                wheelPicker.setIndicator(false);
            }
            View view2 = this.view;
            final WheelPicker wheelPicker2 = view2 != null ? (WheelPicker) view2.findViewById(minuteViewId) : null;
            if (wheelPicker2 != null) {
                wheelPicker2.setIndicator(false);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 24; i++) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                arrayList.add(format);
            }
            if (wheelPicker != null) {
                wheelPicker.setData(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < 60; i2++) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String format2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                arrayList2.add(format2);
            }
            if (wheelPicker2 != null) {
                wheelPicker2.setData(arrayList2);
            }
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.wakeup.commonui.dialog.CustomCommonDialog$Builder$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomCommonDialog.Builder.addViewSelectTime$lambda$1(WheelPicker.this, curHour, wheelPicker2, curMinute);
                    }
                }, 50L);
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void addViewSelectTime$lambda$1(WheelPicker wheelPicker, int i, WheelPicker wheelPicker2, int i2) {
            if (wheelPicker != null) {
                wheelPicker.setSelectedItemPosition(i);
            }
            if (wheelPicker2 != null) {
                wheelPicker2.setSelectedItemPosition(i2);
            }
        }

        public static /* synthetic */ Builder addViewSelectDate$default(Builder builder, int i, int i2, int i3, int i4, int i5, Handler handler, int i6, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addViewSelectDate");
            }
            if ((i7 & 16) != 0) {
                i5 = 0;
            }
            return builder.addViewSelectDate(i, i2, i3, i4, i5, handler, (i7 & 64) != 0 ? 3 : i6);
        }

        public final Builder addViewSelectDate(int dateViewId, final int curYear, final int curMonth, final int curDay, int visibleYear, Handler handler, int visibleItemCount) {
            View view = this.view;
            final WheelDatePicker wheelDatePicker = view != null ? (WheelDatePicker) view.findViewById(dateViewId) : null;
            if (wheelDatePicker != null) {
                wheelDatePicker.setIndicator(false);
            }
            if (wheelDatePicker != null) {
                wheelDatePicker.setSelectedItemTextColor(Color.parseColor("#ff7300"));
            }
            if (wheelDatePicker != null) {
                wheelDatePicker.setItemTextColor(Color.parseColor("#666666"));
            }
            if (wheelDatePicker != null) {
                wheelDatePicker.setItemTextSize(UIHelper.dp2px(20.0f));
            }
            if (wheelDatePicker != null) {
                wheelDatePicker.setVisibleItemCount(visibleItemCount);
            }
            if (wheelDatePicker != null) {
                wheelDatePicker.setItemSpace(UIHelper.dp2px(40.0f));
            }
            View childAt = wheelDatePicker != null ? wheelDatePicker.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (visibleYear == 8) {
                View childAt2 = viewGroup.getChildAt(0);
                if (childAt2 != null) {
                    childAt2.setVisibility(visibleYear);
                }
                View childAt3 = viewGroup.getChildAt(1);
                if (childAt3 != null) {
                    childAt3.setVisibility(visibleYear);
                }
            }
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.wakeup.commonui.dialog.CustomCommonDialog$Builder$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CustomCommonDialog.Builder.addViewSelectDate$lambda$2(WheelDatePicker.this, curYear, curMonth, curDay);
                    }
                }, 50L);
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void addViewSelectDate$lambda$2(WheelDatePicker wheelDatePicker, int i, int i2, int i3) {
            wheelDatePicker.setYearAndMonth(i, i2);
            wheelDatePicker.setSelectedDay(i3);
        }

        public static /* synthetic */ Builder setImageView$default(Builder builder, int i, int i2, boolean z, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setImageView");
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return builder.setImageView(i, i2, z);
        }

        public final Builder setImageView(int imageResId, int imageId, boolean isGif) {
            View view = this.view;
            ImageView imageView = view != null ? (ImageView) view.findViewById(imageResId) : null;
            if (isGif) {
                Context context = this.context;
                if (context != null && imageView != null) {
                    Glide.with(context).asGif().load(Integer.valueOf(imageId)).into(imageView);
                    return this;
                }
            } else if (imageView != null) {
                Context context2 = this.context;
                imageView.setImageDrawable(context2 != null ? ContextCompat.getDrawable(context2, imageId) : null);
            }
            return this;
        }

        public final Builder setGifBg(int imageId) {
            CustomCommonDialog customCommonDialog;
            DialogCustomCommonBinding mBinding;
            AppCompatImageView appCompatImageView;
            DialogCustomCommonBinding mBinding2;
            FrameLayout frameLayout;
            DialogCustomCommonBinding mBinding3;
            LinearLayout linearLayout;
            CustomCommonDialog customCommonDialog2 = this.baseCommonDialog;
            if (customCommonDialog2 != null && (mBinding3 = customCommonDialog2.getMBinding()) != null && (linearLayout = mBinding3.dialogCommonLayout) != null) {
                linearLayout.setBackground(null);
            }
            CustomCommonDialog customCommonDialog3 = this.baseCommonDialog;
            if (customCommonDialog3 != null && (mBinding2 = customCommonDialog3.getMBinding()) != null && (frameLayout = mBinding2.dialogCommonGifBg) != null) {
                frameLayout.setVisibility(0);
            }
            Context context = this.context;
            if (context != null && (customCommonDialog = this.baseCommonDialog) != null && (mBinding = customCommonDialog.getMBinding()) != null && (appCompatImageView = mBinding.dialogGifBg) != null) {
                Glide.with(context).asGif().load(Integer.valueOf(imageId)).into(appCompatImageView);
            }
            return this;
        }

        public final <T extends View> T findView(int viewRes) {
            View view = this.view;
            if (view != null) {
                return (T) view.findViewById(viewRes);
            }
            return null;
        }

        public final CustomCommonDialog builder() {
            CustomCommonDialog customCommonDialog = this.baseCommonDialog;
            Intrinsics.checkNotNull(customCommonDialog);
            return customCommonDialog;
        }
    }
}
