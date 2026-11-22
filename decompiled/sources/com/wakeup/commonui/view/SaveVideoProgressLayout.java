package com.wakeup.commonui.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.wakeup.commonui.R;
import com.wakeup.commonui.databinding.LayoutSaveVideoProgressBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SaveVideoProgressLayout.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0007J\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u0018\u001a\u00020\u0011J\u0006\u0010\u0019\u001a\u00020\u0011R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/wakeup/commonui/view/SaveVideoProgressLayout;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBinding", "Lcom/wakeup/commonui/databinding/LayoutSaveVideoProgressBinding;", "handler", "Landroid/os/Handler;", "hideRunnable", "Ljava/lang/Runnable;", "initListener", "", "onCancelClick", "Landroid/view/View$OnClickListener;", "onShareClick", "showProgress", "progress", "showComplete", "hideLayoutDelay", "hideLayout", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SaveVideoProgressLayout extends RelativeLayout {
    private final Handler handler;
    private final Runnable hideRunnable;
    private final LayoutSaveVideoProgressBinding mBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SaveVideoProgressLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SaveVideoProgressLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$2(View view) {
    }

    public /* synthetic */ SaveVideoProgressLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveVideoProgressLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.handler = new Handler(Looper.getMainLooper());
        this.hideRunnable = new Runnable() { // from class: com.wakeup.commonui.view.SaveVideoProgressLayout$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SaveVideoProgressLayout.this.setVisibility(8);
            }
        };
        this.mBinding = LayoutSaveVideoProgressBinding.inflate(LayoutInflater.from(context), this, true);
    }

    public final void initListener(final View.OnClickListener onCancelClick, final View.OnClickListener onShareClick) {
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        Intrinsics.checkNotNullParameter(onShareClick, "onShareClick");
        this.mBinding.layoutSaveVideoContainer.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.view.SaveVideoProgressLayout$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SaveVideoProgressLayout.this.hideLayout();
            }
        });
        this.mBinding.layoutSaveVideo.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.view.SaveVideoProgressLayout$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SaveVideoProgressLayout.initListener$lambda$2(view);
            }
        });
        this.mBinding.layoutSaveVideoShare.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.view.SaveVideoProgressLayout$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SaveVideoProgressLayout.initListener$lambda$3(onShareClick, this, view);
            }
        });
        this.mBinding.tvSaveVideoCancel.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.commonui.view.SaveVideoProgressLayout$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SaveVideoProgressLayout.initListener$lambda$4(onCancelClick, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$3(View.OnClickListener onClickListener, SaveVideoProgressLayout saveVideoProgressLayout, View view) {
        onClickListener.onClick(view);
        saveVideoProgressLayout.hideLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$4(View.OnClickListener onClickListener, SaveVideoProgressLayout saveVideoProgressLayout, View view) {
        onClickListener.onClick(view);
        saveVideoProgressLayout.hideLayout();
    }

    public final void showProgress(int progress) {
        this.mBinding.tvSaveVideoProgress.setText(getContext().getString(R.string.string_save_video_progress_saving, Integer.valueOf(progress)));
        this.mBinding.tvSaveVideoProgress.setVisibility(0);
        this.mBinding.pbSaveVideo.setVisibility(0);
        this.mBinding.tvSaveVideoCancel.setVisibility(0);
        this.mBinding.ivSaveVideoSuccess.setVisibility(8);
        this.mBinding.layoutSaveVideoShare.setVisibility(8);
    }

    public final void showComplete() {
        this.mBinding.tvSaveVideoProgress.setText(ContextCompat.getString(getContext(), R.string.save_success));
        this.mBinding.tvSaveVideoProgress.setVisibility(0);
        this.mBinding.pbSaveVideo.setVisibility(8);
        this.mBinding.tvSaveVideoCancel.setVisibility(8);
        this.mBinding.ivSaveVideoSuccess.setVisibility(0);
        this.mBinding.layoutSaveVideoShare.setVisibility(0);
    }

    public final void hideLayoutDelay() {
        this.handler.removeCallbacks(this.hideRunnable);
        this.handler.postDelayed(this.hideRunnable, 3000L);
    }

    public final void hideLayout() {
        this.handler.removeCallbacks(this.hideRunnable);
        setVisibility(8);
    }
}
