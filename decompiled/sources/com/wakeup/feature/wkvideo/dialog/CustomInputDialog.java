package com.wakeup.feature.wkvideo.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.lifecycle.Observer;
import com.wakeup.common.utils.ToastUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.dialog.BaseDialog;
import com.wakeup.feature.wkvideo.databinding.DialogInputWindowBinding;
import com.wakeup.module.record.Constants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: CustomInputDialog.kt */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/wakeup/feature/wkvideo/dialog/CustomInputDialog;", "Lcom/wakeup/commonui/dialog/BaseDialog;", "Lcom/wakeup/feature/wkvideo/databinding/DialogInputWindowBinding;", "context", "Landroid/content/Context;", "observer", "Landroidx/lifecycle/Observer;", "", "hint", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/Observer;Ljava/lang/String;)V", "inputManager", "Landroid/view/inputmethod/InputMethodManager;", "countShowStr", "textWatcher", "com/wakeup/feature/wkvideo/dialog/CustomInputDialog$textWatcher$1", "Lcom/wakeup/feature/wkvideo/dialog/CustomInputDialog$textWatcher$1;", "initViews", "", "initData", Constants.ON_START_KEY, "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomInputDialog extends BaseDialog<DialogInputWindowBinding> {
    private String countShowStr;
    private final String hint;
    private InputMethodManager inputManager;
    private final Observer<String> observer;
    private final CustomInputDialog$textWatcher$1 textWatcher;

    public /* synthetic */ CustomInputDialog(Context context, Observer observer, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, observer, (i & 4) != 0 ? context.getString(R.string.input_window_edit_hint) : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.wakeup.feature.wkvideo.dialog.CustomInputDialog$textWatcher$1] */
    public CustomInputDialog(final Context context, Observer<String> observer, String hint) {
        super(context, R.style.fullDialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.observer = observer;
        this.hint = hint;
        this.textWatcher = new TextWatcher() { // from class: com.wakeup.feature.wkvideo.dialog.CustomInputDialog$textWatcher$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str;
                Intrinsics.checkNotNullParameter(s, "s");
                TextView textView = CustomInputDialog.this.getMBinding().tvShowCount;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = CustomInputDialog.this.countShowStr;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("countShowStr");
                    str = null;
                }
                String format = String.format(str, Arrays.copyOf(new Object[]{Integer.valueOf(s.length())}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                textView.setText(format);
                if (s.length() >= 300) {
                    ToastUtils.showToast(context.getResources().getString(R.string.toast_hint_max_count));
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Intrinsics.checkNotNullParameter(s, "s");
                boolean z = s.length() == 0;
                CustomInputDialog.this.getMBinding().tvShowCount.setVisibility(z ? 8 : 0);
                CustomInputDialog.this.getMBinding().tvSend.setClickable(!z);
                CustomInputDialog.this.getMBinding().tvSend.setBackgroundResource(z ? com.wakeup.feature.wkvideo.R.drawable.shape_comment_un_send_bg : com.wakeup.feature.wkvideo.R.drawable.shape_comment_send_bg);
                int dimension = (int) context.getResources().getDimension(z ? R.dimen.dp_8 : R.dimen.dp_40);
                EditText editText = CustomInputDialog.this.getMBinding().etInput;
                Context context2 = context;
                editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), editText.getPaddingRight(), dimension);
                editText.setGravity(z ? 16 : GravityCompat.START);
                Drawable background = editText.getBackground();
                Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) background).setCornerRadius(context2.getResources().getDimension(z ? R.dimen.dp_40 : R.dimen.dp_20));
            }
        };
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initViews() {
        getMBinding().etInput.setFocusable(1);
        getMBinding().etInput.setHint(this.hint);
        getMBinding().etInput.postDelayed(new Runnable() { // from class: com.wakeup.feature.wkvideo.dialog.CustomInputDialog$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CustomInputDialog.initViews$lambda$0(CustomInputDialog.this);
            }
        }, 200L);
        getMBinding().etInput.addTextChangedListener(this.textWatcher);
        getMBinding().tvSend.setOnClickListener(new View.OnClickListener() { // from class: com.wakeup.feature.wkvideo.dialog.CustomInputDialog$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomInputDialog.initViews$lambda$1(CustomInputDialog.this, view);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.wakeup.feature.wkvideo.dialog.CustomInputDialog$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CustomInputDialog.initViews$lambda$2(CustomInputDialog.this, dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(CustomInputDialog customInputDialog) {
        customInputDialog.getMBinding().etInput.requestFocus();
        InputMethodManager inputMethodManager = customInputDialog.inputManager;
        if (inputMethodManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inputManager");
            inputMethodManager = null;
        }
        inputMethodManager.showSoftInput(customInputDialog.getMBinding().etInput, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(CustomInputDialog customInputDialog, View view) {
        Editable text = customInputDialog.getMBinding().etInput.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() > 0) {
            customInputDialog.observer.onChanged(customInputDialog.getMBinding().etInput.getText().toString());
            customInputDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(CustomInputDialog customInputDialog, DialogInterface dialogInterface) {
        customInputDialog.getMBinding().etInput.removeTextChangedListener(customInputDialog.textWatcher);
    }

    @Override // com.wakeup.commonui.dialog.BaseDialog
    public void initData() {
        Object systemService = getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.inputManager = (InputMethodManager) systemService;
        this.countShowStr = getContext().getResources().getString(R.string.input_window_count_show);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }
}
